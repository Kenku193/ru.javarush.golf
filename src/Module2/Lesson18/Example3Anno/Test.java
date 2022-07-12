package Module2.Lesson18.Example3Anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {


        // СОЗДАЕМ ОБЪЕКТ
        BankClient bankClient = new BankClient();

        // СТАВИМ ЗНАЧЕНИЕ ПОЛЯ
        bankClient.id = 10;

        // СОБИРАЕМ РЕФЛЕКСИЮ СО ВСЕГО ОБЪЕКТА
        Class<?> refl = bankClient.getClass();


        // СОБИРАЕМ ДАННЫЕ О ПОЛЯХ
        Field[] fields = refl.getDeclaredFields();

        // ПЕРЕБИРАЕМ ПОЛЯ
        for (Field field : fields) {
            System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());

        }

        // ЗАБИРАЕМ ЗНАЧЕНИЕ ПОЛЯ id
        Integer gettedId = (Integer) fields[0].get(bankClient);
        System.out.println(gettedId);


        // МЕНЯЕМ ЗНАЧЕНИЕ ПОЛЯ id
        fields[0].set(bankClient, 55);

        // ВЫВОДИМ ЗНАЧЕНИЕ ПОЛЯ id ПОСЛЕ ИЗМЕНЕНИЙ
        System.out.println((Integer) fields[0].get(bankClient));

        // ДАЕМ ДОСТУП К ПОЛЮ delpoy
        fields[1].setAccessible(true);

        // ВЫВОДИМ ЗНАЧЕНИЕ ПРИВАТНОГО ПОЛЯ delploy
        System.out.println(fields[1].get(bankClient));

        // МЕНЯЕМ ЗНАЧЕНИЕ ПРИВАТНОГО ПОЛЯ deploy
        fields[1].setInt(bankClient, 101);
        System.out.println(fields[1].get(bankClient));

        // СОБИРАЕМ ДАННЫЕ ОБ АННОТАЦИЯХ ПОЛЯ id
        Annotation[] declaredAnnotations = fields[0].getDeclaredAnnotations();

        // ПЕРЕЧИСЛЯЕМ И ВЫВОДИМ АННОТАЦИИ ПОЛЯ id
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        // СМОТРИМ ЗНАЧЕНИЕ ПАРАМЕТРА
        for (Field f: bankClient.getClass().getDeclaredFields()) {
            TudaSuda ts = f.getAnnotation(TudaSuda.class);
            if (ts   != null)
                System.out.println(ts.clientType());
        }

        }


    }
