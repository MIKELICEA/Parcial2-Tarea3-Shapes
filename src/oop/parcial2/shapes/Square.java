package oop.parcial2.shapes;

import oop.parcial2.shapes.Shape;

public class Square extends Shape {
    private float side;
    public Square(float side)
    {
        super("Square", 4);
        this.side=side;
    }

    public float getArea(){
        return side*side;
    }
    public float getPerimeter(){
        return (4*side);
    }

    @Override
    public String toString() {
        return "■";
    }

}
