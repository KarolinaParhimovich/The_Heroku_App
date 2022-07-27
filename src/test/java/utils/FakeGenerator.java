package utils;

import com.github.javafaker.Faker;

public class FakeGenerator {
    public static String generateNumber() {
        Faker faker = new Faker();
        return faker.numerify("##");
    }
}
