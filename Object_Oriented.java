public class Object_Oriented {

    public static void main(String[] args) {


        Car car_1 = new Car();

        car_1.color ="Beyaz";
        car_1.doors = 4;
        car_1.engine = 130;
        car_1.model = 2022;

        System.out.println("arabanın rengi = " + car_1.color);
        System.out.println("arabanın kapısı = "+ car_1.doors);
        System.out.println("arabanın motoru = "+ car_1.engine);
        System.out.println("arabanın modeli = "+ car_1.model);
    }

}
