package com.company;


public class ExecutionManagerImplementation implements ExecutionManager {

    @Override
    public Context execute(Runnable callback, Runnable... runnables) {
        Context context = new ContextImplementation(runnables.length);
        for (Runnable runnable : runnables) {
            Runnable r = new RunnableContext(context, runnable);
            Thread thread = new Thread(r);
            thread.start();
        }
        return context;
    }
}
