package Lesson_1.Animal;
public class Dog extends Animal{
    private final String breed; /* Порода */
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String getSound() {
        return "Лай!";
    }
    public String breed() {
        return breed;
    }
}