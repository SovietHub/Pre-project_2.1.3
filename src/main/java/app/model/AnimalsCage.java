package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    //Прочитайте о связывании бинов по имени и свяжите
    // AnimalCage c бином Dog через абстрактный класс Animal.
    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(Timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return null;
    }
}
