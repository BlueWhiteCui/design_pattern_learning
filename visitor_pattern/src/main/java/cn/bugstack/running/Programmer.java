package cn.bugstack.running;

/**
 * 公司的编程人员
 */
public class Programmer implements IEmployee{

    @Override
    public void work(ICompanyDispatcher dispatcher) {
        //从dispatcher那里获取自己的任务,执行任务
        dispatcher.dispatch(this);
    }
}
