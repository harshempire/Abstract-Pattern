package Pizzafm;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum tomato sauce";
        toppings.add("Shredded Mozzarella cheese");
    }
    void  cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
