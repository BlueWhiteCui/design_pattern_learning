package cn.bugstack.running;

/**
 * 此接口是用来给公司各类人员分派任务的接口
 * 假设公司类Company有固定的3个人员，
 * cleaner,programmer,tester
 */
public interface ICompanyDispatcher {
    //给programmer分派任务
    void dispatch(Programmer programmer);
    //给tester分派任务
    void dispatch(Tester tester);
    //给cleaner分派任务
    void dispatch(Cleaner cleaner);
}
