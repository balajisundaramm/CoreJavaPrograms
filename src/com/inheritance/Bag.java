package com.inheritance;

/**
 * Created by Balaji on 18/10/17.
 */
public class Bag {
    String name;
    Item [] items;
    static int count;
    int index;


    public Bag(String name, int size) {
        this.name = name;
        this.items=new Item[size];
    }
    public void addItem(Item item){
        if (index<items.length) {
            items[index] = item;
            ++count;
            index++;
        }
        else
            System.out.println("You are trying to add more items than its size..");
    }
    public Item getItem(String name){

        for (Item item:items) {
            if (item!=null) {
                if (item.name.equals(name))
                    return item;
            }
            else
                System.out.println("There is no such an item which you are trying to get");
        }
        return null;
    }

    public boolean searchItem(String name){
        for (Item item:items) {
            if (item.name.equals(name)) {
                return true;
            }
            else
                return false;
        }
        return false;
    }
    public double getItemPrice(String name){
        for (Item item:items) {
            if (item.name.equals(name))
                return item.price;
        }
        return 0.0;
    }
    public double getTotalPrice(){
        double totalPrice=0;
        for (Item item:items) {
            if (item!=null)
                totalPrice=totalPrice+item.price;
        }
        return totalPrice;
    }


}
class TestBag{
    public static void main(String[] args) {
        Bag bag=new Bag("Balaji", 5);
        Pen pen=new Pen("Hero", 10);
        Lipstick lipstick=new Lipstick("KingKong", 45);
        Cap cap = new Cap("Puma", 65);
        NoteBook noteBook=new NoteBook("Tnpl", 45);
        Pen pen1=new Pen("Renolds",15);
        bag.addItem(pen);
        bag.addItem(pen1);
        bag.addItem(lipstick);
        bag.addItem(noteBook);
        bag.addItem(cap);
        System.out.println("Total no of items in the bag is-->"+Bag.count);
        System.out.println("Is there an item named Hero-->"+bag.searchItem("Hero"));
        Item item=(bag.getItem(""));
        if (item != null) {
            System.out.println("Getting an item named.."+item.name);
            System.out.println("Getting an item whose price-->"+item.price);
        }
        System.out.println("Price of the item tnpl-->"+bag.getItemPrice("Tnpl"));
        System.out.println("Total price of the items in the bag is-->"+bag.getTotalPrice());
    }
}