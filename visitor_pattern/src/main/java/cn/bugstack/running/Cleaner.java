package cn.bugstack.running;

/**
 * 公司保洁人员
 */
public class Cleaner implements IEmployee{
    @Override
    public void work(ICompanyDispatcher dispatcher) {
        dispatcher.dispatch(this);
    }
}
