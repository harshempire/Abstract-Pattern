package pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(simplePizzaFactory);
        Pizza pizza=pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

        pizza=pizzaStore.orderPizza("veggie");
        System.out.println(pizza);
    }
}
