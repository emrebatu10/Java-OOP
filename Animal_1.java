package OOP;

public class Animal_1 extends Animal {

    public String isim;
    public String tür;
    public String renk;

    public Animal_1(String isim, String tür, String renk) {
        this.isim = isim;
        this.tür = tür;
        this.renk = renk;
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {
        System.out.println("ben kediyim ve yemek yerim");
    }

    @Override
    public void sleep() {
        System.out.println("ben kediyim ve uyurum");
    }

    public void showInfos2(){
        System.out.println("Hayvanın adı :"+this.isim);
        System.out.println("Hayvanın türü :"+this.tür);
        System.out.println("Hayvanın rengi :"+this.renk);
    }

}
