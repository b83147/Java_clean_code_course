package Lesson_1.Animal;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3, "рыжий");
        Dog dog = new Dog("Шарик", 5, "овчарка");
        Elephant elephant = new Elephant("Лари", 15, "150см");
        Hare hare = new Hare("Роджер", 4, "25см");
        Tiger tiger = new Tiger("Рослый", 8, "12см");
        Wolf wolf = new Wolf("Седой", 12, "45см");

        System.out.println("Имя кота: " + cat.getName());
        System.out.println("Возраст кота: " + cat.getAge());
        System.out.println("Звук, издаваемый котом: " + cat.getSound());
        System.out.println("Окрас кота: " + cat.furColor());

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Звук, издаваемый собакой: " + dog.getSound());
        System.out.println("Порода собаки: " + dog.breed());

        System.out.println("Имя слона: " + elephant.getName());
        System.out.println("Возраст слона: " + elephant.getAge());
        System.out.println("Звук, издаваемый слоном: " + elephant.getSound());
        System.out.println("Длина бивня слона: " + elephant.tuskLength());

        System.out.println("Имя зайца: " + hare.getName());
        System.out.println("Возраст зайца: " + hare.getAge());
        System.out.println("Звук, издаваемый зайцем: " + hare.getSound());
        System.out.println("Длина ушей зайца: " + hare.earLength());

        System.out.println("Имя тигра: " + tiger.getName());
        System.out.println("Возраст тигра: " + tiger.getAge());
        System.out.println("Звук, издаваемый тигром: " + tiger.getSound());
        System.out.println("Длина клыков тигра: " + tiger.teethLength());

        System.out.println("Имя волка: " + wolf.getName());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Звук, издаваемый волком: " + wolf.getSound());
        System.out.println("Длина хвоста у волка: " + wolf.tailLength());
    }
}