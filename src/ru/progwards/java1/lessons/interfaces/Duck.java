package ru.progwards.java1.lessons.interfaces;


import static ru.progwards.java1.lessons.interfaces.AnimalKind.DUCK;
import static ru.progwards.java1.lessons.interfaces.FoodKind.CORN;

//утка
public class Duck extends Animal {

    //  double weight;

    public Duck(double weight) {
        super(weight);
    }

    @Override
    //возвращает DUCK
    public AnimalKind getKind() {
        return DUCK;
    }

    //возвращает CORN
    @Override
    public FoodKind getFoodKind() {
        return CORN;
    }

    public double getFoodCoeff() {
        return 0.04;
    }
}
