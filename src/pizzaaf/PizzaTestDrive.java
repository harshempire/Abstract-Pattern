package pizzaaf;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nypizzastore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();
        Pizza pizza=nypizzastore.createPizza("cheese");
        System.out.println("Ethan Ordered a "+pizza);
        pizza=chicagoStore.createPizza("cheese");
        System.out.println("Joel ordered "+pizza);
        pizza=nypizzastore.createPizza("clam");
        System.out.println("Ethan ordered "+pizza);
        pizza=chicagoStore.createPizza("clam");
        System.out.println("Harsh ordered "+pizza);
        pizza=chicagoStore.createPizza("pepperoni");
        System.out.println("Joel Ordered "+pizza);
        pizza=nypizzastore.orderPizza("veggie");
        System.out.println("Ethan Ordered "+pizza);
    }
}
