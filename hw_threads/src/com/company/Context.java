package com.company;


public interface Context {
    int getCompletedTaskCount();

    int getFailedTaskCount();

    int getInterruptedTaskCount();

    void interrupt();

    boolean isFinished();

    void TaskIsSuccessed();

    void TaskIsFailed();

}
