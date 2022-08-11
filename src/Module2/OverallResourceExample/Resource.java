package Module2.OverallResourceExample;

public class Resource {
    int x = 0;

    public void doSomething(){
        for (int i = 0; i < 100; i++) {
            x = ++x;
            System.out.println(x);
        }
    }

    public void doBad(){
        x = ++x;
        System.out.println(x);
    }
}
