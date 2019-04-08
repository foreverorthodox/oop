package lesson2.cats;

public class Cat {


    private String name;
    private int satiet;
    private int food;
    Cat[]cats;



    public Cat(String name, int satiet, int food) {
        this.name = name;
        this.satiet = satiet;
        this.food = food;
    }


    public void eat(Plate p) {
        p.decreaseFood(15);
        System.out.println("кот " + name + " ест....");
        if (satiet == 15) {
            System.out.println("кот " + name + " наелся");

        }


    }


    public void stop () {


//        for (int i = 0; i < cats.length; i--) {
//            if (food <= 0) {
//                System.out.println("кот " + name + " остался голодным");
//            }
//            break;
//        }


    }


}









