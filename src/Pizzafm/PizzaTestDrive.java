package Pizzafm;


public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nypizzastore=new NYPizzaStore();
        PizzaStore chicagopizzastore=new ChicagoPizzaStore();
        Pizza pizza=nypizzastore.orderPizza("cheese");
        System.out.println(pizza.getName());
        Pizza pizza1=chicagopizzastore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza=nypizzastore.orderPizza("clam");
        System.out.println(pizza.getName());
        pizza=chicagopizzastore.orderPizza("clam");
        System.out.println(pizza.getName());
        pizza=nypizzastore.orderPizza("pepperoni");
        System.out.println(pizza.getName());
        pizza=chicagopizzastore.orderPizza("pepperoni");
        System.out.println(pizza.getName());
        pizza=nypizzastore.orderPizza("veggie");
        System.out.println(pizza.getName());
        pizza=chicagopizzastore.orderPizza("veggie");
        System.out.println(pizza.getName());

    }
}
