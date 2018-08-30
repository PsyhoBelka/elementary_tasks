package ua.rozhkov;

public class Triangle {

    private float a, b, c;
    private String name;

    @Override
    public String toString() {

        return "[" + this.name + "]: " + String.format("%.2f", this.square());
    }

    public void setA(float a) {

        this.a = a;
    }

    public void setB(float b) {

        this.b = b;
    }

    public void setC(float c) {

        this.c = c;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Triangle() {
    }

    public double square() {

        double perimeter = (a + b + c) / 2;

        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
}
