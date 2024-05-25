// Written by Maggie Jiang Jian0886
//Written by Jake O'Shaughnessy oshau033

import java.awt.Color;

public class Circle {
    private double xpostion;
    private double ypostion;
    private double radius;
    private Color color;

    public Circle(double initXpos, double initYpos, double initRadius) {        
        this.xpostion = initXpos;
        this.ypostion = initYpos;
        this.radius = initRadius;
    }
    
    public double calculatePerimeter() {
        return 2* Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setColor(Color inputcolor) {
        color = inputcolor;
    }

    public void setPos(double xinput, double yinput) {
        xpostion = xinput;
        ypostion = yinput;
    }

    public void setRadius(double rinput) {
        radius = rinput;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xpostion;
    }

    public double getYPos() {
        return ypostion;
    }

    public double getRadius() {
        return radius;
    }
    
    public static void main(String[] args){
    
    }
}

