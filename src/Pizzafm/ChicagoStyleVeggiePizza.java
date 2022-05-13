package Pizzafm;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name="Chicago Deep Dish Veggie Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");

    }
    void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
