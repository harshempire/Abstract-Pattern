package Pizzafm;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name="Chicago Style Clam Pizza";
        dough="Extra Thick Crust Pizza";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("frozen Clams From Chesapeake Bay");
    }
    void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
