package Module2.Lesson13.Example1;

public class GroupsDemonstration {
    public static void main(String[] args) throws InterruptedException {

        // СОЗДАЛИ ГРУППУ parentGroup
        ThreadGroup parentGroup = new ThreadGroup("parentGroup");

        // СОЗДАЛИ ПОТОК, ПРИСВОИЛИ ГРУППЕ, ЧЕРЕЗ ЛЯМБДУ ЗАКИНУЛИ ОБЪЕКТ Runnable
        //Thread t1 = new Thread(parentGroup, () -> System.out.println("Hello parent!"));

        // СОЗДАЛИ ПОТОК ПО КЛАССИКЕ
        Thread t1 = new Thread(parentGroup, new myTh());

        // СОЗДАЛИ ДОЧЕРНЮЮ ГРУППУ С УКАЗАНИЕМ РОДИТЕЛЬСКОЙ
        ThreadGroup childGroup = new ThreadGroup(parentGroup, "childGroup");
        // Thread t2 = new Thread(childGroup, () -> System.out.println("Hello child!"));
        Thread t2 = new Thread(childGroup, new myTh());


        // СТАРТУЕМ ПОТОКИ
        t1.start();
        t2.start();


        System.out.println("ЗАПРАШИВАЕМ КОЛИЧЕСТВО ЖИВЫХ НИТЕЙ В ГРУППЕ И ПОДГРУППАХ");
        int countAlive = parentGroup.activeCount();
        System.out.println(countAlive);

        System.out.println(childGroup.activeCount());

        System.out.println("ЗАПРАШИВАЕМ КОЛИЧЕСТВО ЖИВЫХ ПОДГРУПП");
        int groupAlive = parentGroup.activeGroupCount();
        System.out.println(groupAlive);

        System.out.println(childGroup.activeGroupCount());


        System.out.println("ЗАПРАШИВАЕМ ИМЯ ГРУППЫ");
        System.out.println(parentGroup.getName());
        System.out.println(childGroup.getName());

        System.out.println("ЗАПРАШИВАЕМ РОДИТЕЛЯ ПОТОКА - ВЗ ThreadGroup!");
        ThreadGroup x = parentGroup.getParent();
        System.out.println(x);

        System.out.println(childGroup.getParent()); // ТО ЖЕ САМОЕ, НО ТУТ СРАБАТЫВАЕТ toString

        System.out.println("ЗАПРАШИВАЕМ DAEMON ИЛИ НЕТ");
        boolean isD = parentGroup.isDaemon();
        System.out.println(isD);

        System.out.println(childGroup.isDaemon());

        childGroup.setMaxPriority(Thread.MAX_PRIORITY);


    }
}

class myTh implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, i'm a thread " + this.getClass().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
