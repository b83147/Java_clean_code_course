package Lesson_1.Animal;

public class Tiger extends Animal{
    private final String teethLength; /* длина клыков */
    public Tiger(String name, int age, String teethLength) {
        super(name, age);
        this.teethLength = teethLength;
    }
    @Override
    public String getSound() {
        return "Рычание!";
    }
    public String teethLength() {
        return teethLength;
    }
}
