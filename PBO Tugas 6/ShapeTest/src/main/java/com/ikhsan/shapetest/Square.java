package com.ikhsan.shapetest;

class Square extends Rectangle {
    private double side;
    
    public Square(){
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, boolean filled, String color) {
        super(color,filled,side,side);
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
