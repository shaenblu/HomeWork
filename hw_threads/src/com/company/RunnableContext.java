package com.company;


public class RunnableContext implements Runnable {
    private Context context;
    private Runnable runnable;

    public RunnableContext(Context context, Runnable runnable) {
        this.context = context;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            runnable.run();
            context.TaskIsSuccessed();
        }
        catch (Exception e) {
            context.TaskIsFailed();
        }
    }
}
