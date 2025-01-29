package main;

import main.market.Market;
import main.market.Person;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        // Создаем клиентов
        Person john = new Person("John");
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        // Клиенты входят в магазин
        market.acceptPerson(john);
        market.acceptPerson(alice);
        market.acceptPerson(bob);

        // Обновляем состояние магазина
        market.update(); // Первое обновление
        market.update(); // Второе обновление
    }
}
