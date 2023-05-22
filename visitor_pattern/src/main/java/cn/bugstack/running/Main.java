package cn.bugstack.running;

public class Main {
    static class Dispather01 implements ICompanyDispatcher{

        @Override
        public void dispatch(Programmer programmer) {
            System.out.println("programmer 01");
        }

        @Override
        public void dispatch(Tester tester) {
            System.out.println("tester 01");
        }

        @Override
        public void dispatch(Cleaner cleaner) {
            System.out.println("cleaner 01");
        }
    }

    static class Dispather02 implements ICompanyDispatcher{

        @Override
        public void dispatch(Programmer programmer) {
            System.out.println("programmer 02");
        }

        @Override
        public void dispatch(Tester tester) {
            System.out.println("tester 02");
        }

        @Override
        public void dispatch(Cleaner cleaner) {
            System.out.println("cleaner 02");
        }
    }


    /**
     * 测试是否成功
     * @param args
     */
    public static void main(String[] args) {
        Company company = new Company();
        company.startWork(new Dispather01());
        System.out.println("-------------------------");
        company.startWork(new Dispather02());
    }
}