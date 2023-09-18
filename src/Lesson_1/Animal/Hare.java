package Lesson_1.Animal;

public class Hare extends Animal{
    private final String earLength; /* длина ушей */
    public Hare(String name, int age, String earLength) {
        super(name, age);
        this.earLength = earLength;
    }
    @Override
    public String getSound() {
        return "Крик!";
    }
    public String earLength() {
        return earLength;
    }
}
