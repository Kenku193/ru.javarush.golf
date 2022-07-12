package Module2.Lesson18.Example2Anno;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Annotation[] declaredAnnotations = Human.class.getDeclaredAnnotations();
        Arrays.stream(declaredAnnotations).forEach(System.out::println);


    }
}
