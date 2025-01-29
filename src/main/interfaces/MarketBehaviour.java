package main.interfaces;

import main.market.Person;

public interface MarketBehaviour {
    void acceptPerson(Person person);  // Человек заходит в магазин
    void removePerson(Person person);  // Человек покидает магазин
}
