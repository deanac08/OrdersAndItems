import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.

        Item item1 = new Item();
        item1.name = "Capuccino";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "Drip Coffee";
        item2.price = 2.75;

        
        Item item3 = new Item();
        item3.name = "Latte";
        item3.price = 3;
        
        Item item4 = new Item();
        item4.name = "Mocha";
        item4.price = 4.5;

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Noah";
        order2.items.add(item1);
        order2.total += item1.price;  // is this how you want it to be done?

        Order order3 = new Order();
        order3.name = "Sam";
        order3.items.add(item1);
        order3.items.add(item3);
        order3.items.add(item3);
        order3.total += item1.price;  // is this how you want it to be done?
        order3.total += item3.price*2;  // is this how you want it to be done?

        Order order4 = new Order();
        order4.name = "Jimmy";
        order4.items.add(item3);
        order4.ready = true;
        order4.total += item3.price;  // is this how you want it to be done?

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
