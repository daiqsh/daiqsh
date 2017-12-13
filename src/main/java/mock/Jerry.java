package mock;

//<editor-fold desc="Description">
public class Jerry {
    private String name;

    public void goHome() {
        this.doSomethingA();
        this.doSomeThingB();
        System.out.println("goHome===");
    }

    public void doSomeThingB() {
        System.out.println("doSomeThingB");
    }

    public void doSomethingA() {
        System.out.println("doSomethingA");
    }

    public boolean go() {
        System.out.println("Go~~~");
        return true;
    }
}
//</editor-fold>
