package lesson2.cats;

public class Main {

    public static void main(String[] args) {

                Cat[] cats = new Cat[4];

        cats[0] = new Cat("Мурзик", 15, 50);
        cats[1] = new Cat("Васька", 15, 50);
        cats[2] = new Cat("Рыжик", 15, 50);
        cats[3] = new Cat("Черныш", 15, 50);



        Plate plate = new Plate(50);
        System.out.println(plate);


        cats[0].eat(plate);
        cats[0].stop();
        cats[1].eat(plate);
        cats[1].stop();
        cats[2].eat(plate);
        cats[2].stop();
        cats[3].eat(plate);
        cats[3].stop();



        System.out.println(plate);




    }


}
