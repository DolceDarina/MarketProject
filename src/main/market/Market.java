package main.market;

import main.interfaces.QueueBehaviour;
import main.interfaces.MarketBehaviour;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void acceptPerson(Person person) {
        System.out.println(person.getName() + " вошел(а) в магазин.");
        takeInQueue(person);
    }

    @Override
    public void removePerson(Person person) {
        System.out.println(person.getName() + " покинул(а) магазин.");
    }

    @Override
    public void takeInQueue(Person person) {
        queue.add(person);
        System.out.println(person.getName() + " добавлен(а) в очередь.");
    }

    @Override
    public void releaseFromQueue() {
        Person person = queue.poll();
        if (person != null) {
            System.out.println(person.getName() + " покинул(а) очередь.");
        }
    }

    @Override
    public void processOrders() {
        for (Person person : queue) {
            if (!person.hasOrder()) {
                person.setOrder(true);
                System.out.println(person.getName() + " оформил(а) заказ.");
            }
        }
    }

    @Override
    public void deliverOrders() {
        for (Person person : queue) {
            if (person.hasOrder()) {
                System.out.println(person.getName() + " получил(а) заказ.");
                person.setOrder(false);
            }
        }
    }

    public void update() {
        System.out.println("Обновление состояния магазина...");
        processOrders();
        deliverOrders();
        releaseFromQueue();
    }
} 
