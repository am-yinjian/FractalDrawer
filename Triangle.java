
import java.awt.Color;

public class Triangle{
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    
    public Triangle(double initX, double initY, double initWidth, double initHeight){
        this.x = initX;
        this.y = initY;
        this.width = initWidth;
        this.height = initHeight;
    }
    
    public double calculatePerimeter(){
        double perimeter = width+width+width;
        return perimeter;
    }
    
    public double calculateArea(){
        double area = (width * height) / 2;
        return area;
    }
    
    public void setColor(Color newColor){
        color = newColor;
    }
    
    public void setPos(double newX, double newY){
        x = newX;
        y = newY;
    }
    
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    public void setWidth(double newWidth){
        width = newWidth;
    }
    
    public Color getColor(){
        return color;
    }
    
    public double getXPos(){
        return x;
    }
    
    public double getYPos(){
        return y;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
}
