package oop.parcial2.shapes;

public abstract class Shape {
    private String name;

    private int sidesCount;
    public Shape(String name, int sidesCount) {

        this.name = name;
        this.sidesCount = sidesCount;
    }
    public final String getName(){
        return name;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
    public int getSidesCount() {
        return sidesCount;
    }
}

