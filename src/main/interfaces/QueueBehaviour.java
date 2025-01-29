package main.interfaces;

import main.market.Person;

public interface QueueBehaviour {
    void takeInQueue(Person person);  // Добавление человека в очередь
    void releaseFromQueue();          // Удаление человека из очереди
    void processOrders();             // Обработка заказов
    void deliverOrders();             // Выдача заказов
}
