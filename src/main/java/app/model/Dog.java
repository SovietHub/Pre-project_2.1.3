package app.model;

import org.springframework.stereotype.Component;
//Создайте бин Dog, унаследуйте его от Animal.
// Создайте на основе этого класса компонент.

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Who let the dogs out?";
    }
}