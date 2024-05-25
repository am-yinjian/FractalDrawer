
import java.awt.Color;

public class Rectangle {
    private double xpostion;
    private double ypostion;
    private double width;
    private double height;
    private Color color;
    
    public Rectangle(double initXpos, double initYpos, double initW, double initH) {
        this.xpostion = initXpos;
        this.ypostion = initYpos;
        this.width = initW;
        this.height = initH;
    }

    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    public double calculateArea() {
        return width * height;
    }

    public void setColor(Color inputcolor) {
        color = inputcolor;
    }

    public void setPos(double xinput, double yinput) {
        xpostion = xinput;
        ypostion = yinput;
    }

    public void setHeight(double hinput) {
        height = hinput;
    }

    public void setWidth(double winput) {
        width = winput;
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

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    public static void main(String[] args){
        
    }
}
