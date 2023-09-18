package Lesson_1.Animal;
public class Elephant extends Animal{
    private final String tuskLength; /* длина бивня */
    public Elephant(String name, int age, String tuskLength) {
        super(name, age);
        this.tuskLength = tuskLength;
    }
    @Override
    public String getSound() {
        return "Трубит!";
    }
    public String tuskLength() {
        return tuskLength;
    }
}
