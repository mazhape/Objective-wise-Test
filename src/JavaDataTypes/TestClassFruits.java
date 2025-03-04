package JavaDataTypes;

class Fruit{
    int seeds;
    String taste;
    boolean edible;
}

class TropicalFruit extends Fruit{
    double weight;
    TropicalFruit(){
        seeds = 0;
        taste = "sweet";
        weight = 10.0;
    }
}

class Banana extends TropicalFruit{
    double calories;
    Banana(){
        seeds = 10;
        weight = 20.0;
        calories = 200;
    }
}

public class TestClassFruits {
    public static void main(String[] args) {
        Banana b = new Banana();
        System.out.println(b.edible+" "+b.weight+" "+b.calories);
    }
}

//None of the constructors initialize Fruit's fruit edible.