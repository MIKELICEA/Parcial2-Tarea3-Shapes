package oop.parcial2.shapes;

public class Circle extends Shape {
    private float radio;
    public Circle(float radio)
    {
        super("Circle", 1);
        this.radio=radio;
    }
    public float getArea(){
        return (float) (Math.PI*radio*radio);
    }
    public float getPerimeter(){
        return (float)(Math.PI*radio*2);
    }

    @Override
    public String toString() {
        return "○";
    }

}
