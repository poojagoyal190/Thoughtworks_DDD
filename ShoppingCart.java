package org.example;
import java.util.ArrayList;
import java.util.ListIterator;
public class ShoppingCart {

        ArrayList<Item> item;
        ShoppingCart() {
            this.item = new ArrayList<Item>();
        }
        public void addToCart(Item item) {
            this.item.add(item);
        }
        public void showCart() {
            ListIterator<Item> iterator = item.listIterator();
            while(iterator.hasNext()) {
                Item item1 = iterator.next();
                System.out.println(item1);
            }
        }
        public void removeFromCart(Item i) {
            ListIterator<Item> iterator1 = item.listIterator();
            while(iterator1.hasNext()) {
                Item item2 = iterator1.next();
                if (item2.getProductName().equals(i.getProductName())) {
                    this.item.remove(i);
                    break;
                }
            }
        }


}
