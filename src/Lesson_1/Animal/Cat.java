package Lesson_1.Animal;
public class Cat extends Animal{
    private final String furColor; /* Окрас */
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public String getSound() {
        return "Мяуканье!";
    }
    public String furColor() {
        return furColor;
    }
}