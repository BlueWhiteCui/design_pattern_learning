package cn.bugstack.running;

import java.util.ArrayList;
import java.util.List;

/**
 * 此为公司类，数据结构基本不变
 */
public class Company {
    private List<IEmployee> employeeList = new ArrayList<>();

    /**
     * 假设公司只有三类人，人员恒定不变
     */
    public Company(){
        employeeList.add(new Programmer());
        employeeList.add(new Cleaner());
        employeeList.add(new Tester());
    }

    /**
     * 公司所有人员开始工作
     * @param dispatcher
     */
    public void startWork(ICompanyDispatcher dispatcher) {
        for (IEmployee employee : employeeList) {
            employee.work(dispatcher);
        }
    }
}
