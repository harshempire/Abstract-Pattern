package pizzaaf;

import pizzas.CheesePizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new ChicagoPizzaIngredientsFactory();
        if(item.equals("cheese")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(item.equals("veggie")){
            pizza=new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if(item.equals("clam")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if(item.equals("pepperoni")){
            pizza=new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
