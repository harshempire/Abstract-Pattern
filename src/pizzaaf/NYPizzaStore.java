package pizzaaf;

import pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientsFactory();
        if(item.equals("cheese")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("new york Style Cheese Pizza");
        }
        else if(item.equals("veggie")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NEw York style veggie pizza");
        }
        else if(item.equals("clam")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if(item.equals("pepperoni")){
            pizza=new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
