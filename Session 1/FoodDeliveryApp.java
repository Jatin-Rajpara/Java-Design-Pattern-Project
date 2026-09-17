interface Food {
    void order();
}

class Pizza implements Food {

    public void order() {
        System.out.println("Pizza ordered successfully!");
    }
}

class Burger implements Food {

    public void order() {
        System.out.println("Burger ordered successfully!");
    }
}

class Biryani implements Food {

    public void order() {
        System.out.println("Biryani ordered successfully!");
    }
}

class FoodFactory {

    public Food getFood(String type) {

        if (type.equals("pizza")) {
            return new Pizza();
        }
        else if (type.equals("burger")) {
            return new Burger();
        }
        else if (type.equals("biryani")) {
            return new Biryani();
        }

        return null;
    }
}

public class FoodDeliveryApp {

    public static void main(String[] args) {

        FoodFactory factory = new FoodFactory();

        Food food1 = factory.getFood("pizza");
        food1.order();

        Food food2 = factory.getFood("burger");
        food2.order();

        Food food3 = factory.getFood("biryani");
        food3.order();
    }
}