package Module2.Lesson16.Example1;

import java.io.Serializable;

public class Standart implements Serializable{

    private int a = 5;
    private String s1 = "hello world";
    private static String s2 = "1234567890";


    @Override
    public String toString() {
        return "Standart" +
                "a=" + a +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' ;
    }
}
