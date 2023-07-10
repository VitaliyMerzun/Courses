import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sounding> animalList = new ArrayList<>();

        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Sounding() {
        public void sound() {
            System.out.println("Croak");
        }});
        animalList.add(() -> System.out.println("Quack"));
        animalList.add(OtherAnimalSounding::soundOwl);
        animalList.add(OtherAnimalSounding::soundDolphin);

        animalList.forEach(Sounding::sound);

    }
}