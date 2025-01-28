import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {

        ArrayList<MenuItem> items = new ArrayList<>();
        double totalCost = 0;

        System.out.println("Welcome to Just App");
        System.out.println("You ordered...");

        //Add some items burgers, pizzas, fires salad

        Burger cheeseBurger = new Burger("CheeseBurger", 1.99,"tasty");

        Pizza tunaPizza = new Pizza("TunaPizza", 8.99,"Weird");
        Pizza  classic = new Pizza("plain", 8.99, "Normal");
        Fries curry = new Fries("Curry Fries", 3.99,"Saucy");
        Dessert pie = new Dessert("Apple Pie", 5.99,"Just like grandmas");



        //Add all the orders to a collection(arraylist)

        items.add(cheeseBurger);
        items.add(tunaPizza);
        items.add(curry);
        items.add(pie);




        //Display all the orders
        for(MenuItem item: items) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
        }

        for(MenuItem item: items) {

             totalCost += item.getPrice();

        }
        System.out.println("\nTotal cost is : "+totalCost);

        //Find the total cost of whole order
    }
}
