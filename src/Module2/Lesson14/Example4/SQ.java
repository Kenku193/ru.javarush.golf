package Module2.Lesson14.Example4;

import java.util.concurrent.SynchronousQueue;

public class SQ{ public static void main(String args[])
{
    // СОЗДАЛИ СИНХРОНИЗИРОВАННУЮ ОЧЕРЕДЬ
    final SynchronousQueue<String> queue = new SynchronousQueue<>();

    // СОЗДАЛИ ПОТОК ПРОИЗВОДИТЕЛЬ
    Thread producer = new Thread("ПРОИЗВОДИТЕЛЬ")
    {
        public void run() {
            String event = "СОБЫТИЕ";
            try
            {
                queue.put(event); // ТРЭД ЗАБЛОКИРУЕТСЯ В ЭТОЙ ТОЧКЕ
                System.out.printf("[%s] опубликованное событие : %s %n", Thread .currentThread()
                        .getName(), event);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    producer.start(); // ЗАПУСКАЕМ ТРЕД ПРОИЗВОДИТЕЛЬ

    // СОЗДАЛИ ПОТОК ПОТРЕБИТЕЛЬ
    Thread consumer = new Thread("ПОТРЕБИТЕЛЬ") {
        public void run() {
            try
            {
                String event = queue.take(); // ТРЭД ЗАБЛОКИРУЕТСЯ В ЭТОЙ ТОЧКЕ
                System.out.printf("[%s] потребленное событие : %s %n", Thread .currentThread()
                        .getName(), event);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

  consumer.start(); // ЗАПУСКАЕМ ТРЕД ПОТРЕБИТЕЛЬ

}
}
