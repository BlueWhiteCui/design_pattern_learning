package cn.bugstack.running;

/**
 * 此接口定义公司人员统一规范
 * 如每个人员必须有工作
 */
public interface IEmployee {
    //从dispatcher里面获取自己的任务并执行任务
    void work(ICompanyDispatcher dispatcher);
}
