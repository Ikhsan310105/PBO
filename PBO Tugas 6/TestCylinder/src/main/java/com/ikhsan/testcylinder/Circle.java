package com.ikhsan.testcylinder;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class

    public double radius;
    private String color;
    // Constructors (overloaded)

    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     * @param r
     */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }
    
    //constructor Circle dengan parameter radius dan color
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }
    
    //Setter Color
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    //Getter color
    public String getColor(){
        return color;
    }
    /**
     * Returns the radius
     * @return 
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Returns the area of this Circle instance
     * @return 
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
