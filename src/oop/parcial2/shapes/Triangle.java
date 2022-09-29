package oop.parcial2.shapes;

import oop.parcial2.shapes.Shape;

public class Triangle extends Shape {
    private float base;
    private float height;
    public Triangle(float base,float height)
    {
        super("Triangle", 3);
        this.base=base;
        this.height=height;
    }

    public float getArea(){
        return (base*height)/2;
    }
    public float getPerimeter(){
        return (3*base); //Asumiendo que es un triangulo equilatero
    }

    @Override
    public String toString() {
        return "▲";
    }

}

