package com.vladarsenjtev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatesPerson {

    private static final Random RANDOM = new Random();
    private static final String[] NAME = {"Alex", "Carl", "Bred", "Tom", "Jon"};
    private static final String[] LAST_NAME = {"Martin", "Clark", "Walker", "Johnson", "Morgan"};
    private static final int MAX_PERSONS = 100;
    private static final int MAX_AGE = 100;
    private static final int MAX_WEIGHT = 120;
    private static final int MAX_HEIGHT = 240;
    public static final int MIN_WEIGHT = 5;
    public static final int CONSTANT_HEIGHT = 50;
    public static final int CONSTANT_WEIGHT = 30;

    public static List<Person> generatePersons() {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < MAX_PERSONS; i++) {
            Person person = generateRandomPersons();
            result.add(person);
        }
        return result;
    }

    private static Person generateRandomPersons() {
        String name = NAME[RANDOM.nextInt(NAME.length)];
        String lastName = LAST_NAME[RANDOM.nextInt(LAST_NAME.length)];
        int age = RANDOM.nextInt(MAX_AGE);
        int weight = RANDOM.nextInt(MAX_WEIGHT);
        int height = RANDOM.nextInt(MAX_HEIGHT);


        if (age < 3) {
            height = RANDOM.nextInt(74);
            weight = RANDOM.nextInt(20) + MIN_WEIGHT;
        } else if (age > 3 && age < 10) {
            height = RANDOM.nextInt(120);
            weight = RANDOM.nextInt(30) + MIN_WEIGHT;
        } else if (age > 10 && age < 18) {
            height = RANDOM.nextInt(180) + CONSTANT_HEIGHT;
            weight = RANDOM.nextInt(80) + CONSTANT_WEIGHT;
        } else if (age > 18) {
            height = RANDOM.nextInt(MAX_HEIGHT) + CONSTANT_HEIGHT;
            weight = RANDOM.nextInt(MAX_WEIGHT) + CONSTANT_WEIGHT;
        }
        return new Person(name, lastName, age, weight, height);
    }
}