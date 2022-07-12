package Module2.Lesson18.Example1ReflectionSummary;

public class ReflectionSummary {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c; // ПЕРЕМЕННАЯ ДЛЯ СТРУКТУРЫ

        // 1. Object.getClass()
        c = "foo".getClass();           // java.Lang.String
        c = System.out.getClass();      // java.io.PrintStream
        byte[] bytes = new byte[1024];
        c = bytes.getClass();           // [b

        System.out.println(c);

        // 2. .class syntax
        boolean b;                      // c = b.getClass();  - compile-time error
        c = boolean.class;              // boolean
        c = void.class;                 // void
        c = java.io.PrintStream.class;  // java.io.PrintStream
        c = int[][][].class;            // [[[I

        // 3. Class.forName()
        c = Class.forName("java.lang.Object");
        c = Class.forName("java.lang.String");

        // 4. TYPE field for Primitive Type Wrappers
        c = Double.TYPE;                // double
        c = Void.TYPE;                  // void





    }
}
