package Module2.Lesson13.Example3;


import java.util.concurrent.Callable;

public class MyCall implements Callable<String> {

    String s;

    public MyCall(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        return s + " My dear JR friend!";
    }
}

class go{
    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall("Hello!");
        System.out.println(myCall.call());
    }
}

