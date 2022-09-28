package oop.parcial2.shapes;

public class Square extends Shape{
    private float side;
    public Square(float side)
    {
        super("Square");
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

    public float getSidesCount()
    {
        return 4;
    }
}
