package com.dz;

public class Rectangle{
    Point p1,p2;
    protected double width;
    protected double length;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point (x2, y2);
        this.width = Math.abs(x2-x1);
        this.length = Math.abs(y2-y1);
    }

    public Rectangle() {
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(int x, int y) {
        this.p1.setX(x);
        this.p1.setY(y);
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(int x, int y) {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
