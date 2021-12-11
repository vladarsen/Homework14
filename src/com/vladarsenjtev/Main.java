package com.vladarsenjtev;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1) В Дз11 был метод который возвращает 100 случайных людей.
Написать метод который который удалит из этого списка добликаты по имени и фамилии.
Т.е. останутся только люди с уникальной комбинайцией имя+фамилия. Остальные поля в расчет не берутся.
 */


public class Main {

    public static void main(String[] args) {
        List<Person> people = CreatesPerson.generatePersons();
        Set<Person> personSet = new HashSet<>(people);

        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}


/*
2*) Написать в чем разница между final, finally и finalize

final - модификатор, применяющийся к классам, методам, переменным. Делает объект своего действия неизменным:
1)От класса нельзя наследоваться;
2) Переменную невозможно изменить;

finally является частью конструкции try-catch-finally, где играет роль блока, который выполняется независимо от событий происходящих в try-catch и выполняется в любом случае.
try {
  // код здесь
} catch (SomeException se) {
  // обрабатываем исключение здесь
} finally {
Пример:
try {
  // код здесь
} catch (SomeException se) {
  // обрабатываем исключение здесь
} finally {
  // всегда выполняем этот кодовый блок
}



finalize - метод класса Object, который помогает при сборке мусора. Метод вызывается перед тем, как объект будет уничтожен сборщиком мусора.
 */

