package lesson2.cats;

public class Plate {

    private int food;


    public Plate(int food) {
        this.food = food;

    }




    @Override
    public String toString() {
        return "Миска{" +
                "еды = " + food +
                '}';
    }



    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount){
        food -= amount;
    }


}
