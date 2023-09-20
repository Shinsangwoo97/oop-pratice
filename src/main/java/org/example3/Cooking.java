package org.example3;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
        return cook;
//        return new Cook("돈까스", 5000);
    }
}
