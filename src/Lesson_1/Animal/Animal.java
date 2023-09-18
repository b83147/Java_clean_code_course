package Lesson_1.Animal;
abstract class Animal {  //базовый абстрактный класс Animal, который будет содержать общие свойства для всех животных
    private String name; // Имя
    private int age; // Возраст
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public abstract String getSound(); // абстрактные методы, потому что реализация этих методов будет зависеть от конкретного вида животного
}