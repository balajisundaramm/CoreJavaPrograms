package com.inheritance;

/**
 * Created by Balaji on 18/10/17.
 */
public class Item {
        String name;
        double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    class Pen extends com.inheritance.Item {
        public Pen(String name, double price) {
            super(name, price);
        }
    }
    class Lipstick extends com.inheritance.Item {
        public Lipstick(String name, double price) {
            super(name, price);
        }
    }
    class  Cap extends com.inheritance.Item {
        public Cap(String name, double price) {
            super(name, price);
        }
    }
    class NoteBook extends com.inheritance.Item {
        public NoteBook(String name, double price) {
            super(name, price);
        }
    }


