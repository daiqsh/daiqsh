package mock;

public class PowerMockTest {

    private  int private_method(int a) {
        System.out.println("private a");
        return a;
    }

    public  int test_private_method(int a) {
       return    this.private_method(a);
    }


    public static int static_method() {
        return 1;
    }

}
