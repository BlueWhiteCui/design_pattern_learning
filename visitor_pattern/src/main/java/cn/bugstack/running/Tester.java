package cn.bugstack.running;

/**
 * 公司测试人员
 */
public class Tester implements IEmployee{
    @Override
    public void work(ICompanyDispatcher dispatcher) {
        dispatcher.dispatch(this);
    }
}
