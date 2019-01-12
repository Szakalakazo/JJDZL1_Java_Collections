package com.infoshare.academy.data.structures.generics;

class Point<E extends Number> {
    private E x, y;

    public Point(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public void setX(E x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }
    void show(){
        System.out.println("");
    }

}

public class GenericsTask {

    public static void main(String[] args) {
        Point<Integer> p1 = new Point<>(77,4);

        Point<Double> p2 = new Point<>(5.5,4.3);



    }
}
