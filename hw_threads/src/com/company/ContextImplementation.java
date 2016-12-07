package com.company;

public class ContextImplementation implements Context {
    private int countOfTasks;
    private volatile int success = 0;
    private volatile int failed = 0;
    private volatile int interrupted = 0;
    private volatile boolean isFinished = false;

    public ContextImplementation(int count){
        countOfTasks = count;
    }


    @Override
    public int getCompletedTaskCount() {
        return success;
    }

    @Override
    public int getFailedTaskCount(){
        return failed;
    }

    @Override
    public int getInterruptedTaskCount() {
        return interrupted;
    }

    @Override
    public void interrupt() {
        interrupted += 1;
    }

    @Override
    public boolean isFinished(){
        if ((countOfTasks == success) || (countOfTasks == interrupted)) {
            isFinished = true;
        }
        return isFinished;
    }

    @Override
    public void TaskIsSuccessed(){
        success += 1;
    }

    @Override
    public void TaskIsFailed(){
        failed += 1;
    }

}
