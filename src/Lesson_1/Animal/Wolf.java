package Lesson_1.Animal;

public class Wolf extends Animal{
    private final String tailLength; /* длина хвоста */
    public Wolf(String name, int age, String tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }
    @Override
    public String getSound() {
        return "Вой!";
    }
    public String tailLength() {
        return tailLength;
    }
}