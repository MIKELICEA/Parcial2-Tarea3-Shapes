package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private float base;
    private float height;
    public Rectangle(float base,float height)
    {
        super("Rectangle");
        this.base=base;
        this.height=height;
    }

    public float getArea(){
        return base*height;
    }
    public float getPerimeter(){
        return (2*base+2*height);
    }

    @Override
    public String toString() {
        return "█";
    }

    public float getSidesCount()
    {
        return 4;
    }
}
