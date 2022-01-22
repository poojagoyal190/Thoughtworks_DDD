package org.example;

public class ShoppingCartTest {
    public static void main(String[] args)
    {
        // creates new items with product name, quantity and unit price
        Item i1 = new Item("IPad Pro", 1);
        Item i2 = new Item("Hero Ink Pen", 1);
        Item i3 = new Item("GM Cricket Bat", 2);

        ShoppingCart cart = new ShoppingCart();
        /* add the item to the cart */
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.addToCart(i3);

        cart.showCart();
        /* remove the item sent as argument from the cart */
        cart.removeFromCart(i1);
        System.out.println("Product removed from cart: "+ i1);
      //  cart.addToCart(new Item("prod",2));

    }
}
