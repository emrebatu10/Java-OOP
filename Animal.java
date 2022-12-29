package OOP;

public class Animal implements Interface{
    @Override
    public void speak() {
        System.out.println("ben konuşabiliyorum");

    }

    @Override
    public void run() {
        System.out.println("ben koşarım");

    }

    @Override
    public void eat() {
        System.out.println("ben yemek yerim");

    }

    @Override
    public void sleep() {
        System.out.println("ben uyurum");

    }


}
