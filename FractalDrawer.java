// FractalDrawer class draws a fractal of a shape indicated by user input
//Written by Jake O'Shaughnessy oshau033
//Written by Maggie Jiang Jian0886

import java.awt.Color;
import java.util.Scanner;


import java.awt.Color;
import java.util.Scanner;
import java.util.Random;

import javax.sound.midi.Track;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    private Color blue = Color.BLUE;
    private Random random = new Random();
    
    public FractalDrawer() {}  // contructor

    public double drawFractal(String type) {
        Canvas can =  new Canvas(800, 800);
        if(type.equals("Triangle")){
            drawTriangleFractal(150.0, 150.0, 400.0, 400.0, blue, can, 8);
        }else if(type.equals("Circle")){
            drawCircleFractal(100.0, 300.0, 300.0, blue, can, 8);
        }else{
            drawRectangleFractal(100.0, 100.0, 300.0, 300.0, blue, can, 8);
        }
        return totalArea;
    }


    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if(level > 0){
            Triangle tri = new Triangle(x, y, width, height);
            tri.setColor(c);
            can.drawShape(tri);
            totalArea += tri.calculateArea();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color newColor = new Color(red, green, blue);    // Creates a new color using RGB format by finding random int's for red, green, and blue
            drawTriangleFractal(width/2, height/2, x+width*1.25, y, newColor, can, level-1);  //Draws triangle to the right
            drawTriangleFractal(width/2, height/2, x-width*.75, y, newColor, can, level-1);     //Draws triangle to the left
            drawTriangleFractal(width/2, height/2, x+width*.25, y-height*1.25, newColor, can, level-1);   //Draws triangle below
        }
    }


    
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if(level > 0){
            Circle cir = new Circle(x, y, radius);
            cir.setColor(c);
            can.drawShape(cir);
            totalArea += cir.calculateArea();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color newColor = new Color(red, green, blue);    // Creates a new color using RGB format by finding random int's for red, green, and blue           
            drawCircleFractal(radius/2.0, x, y+(radius*1.5), newColor, can, level-1);        //Draws circle on top
            drawCircleFractal(radius/2.0, x, y-(radius*1.5), newColor, can, level-1);        //Draws circle on the bottom
            drawCircleFractal(radius/2.0, x+(radius*1.5), y, newColor, can, level-1);        //Draws circle to the right
            drawCircleFractal(radius/2.0, x-(radius*1.5), y, newColor, can, level-1);        //Draws circle to the left

        }
    }



    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if(level > 0){
            Rectangle rec = new Rectangle(x, y, width, height);
            rec.setColor(c);
            can.drawShape(rec);
            totalArea += rec.calculateArea();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color newColor = new Color(red, green, blue);    // Creates a new color using RGB format by finding random int's for red, green, and blue
            drawRectangleFractal(width/2.0, height/2.0, x+width*1.5, y+width*1.5, newColor, can, level-1);   //Draws rectangle top right
            drawRectangleFractal(width/2.0, height/2.0, x+width*1.5, y-width, newColor, can, level-1);        //Draws rectangle bottom right
            drawRectangleFractal(width/2.0, height/2.0, x-width, y+width*1.5, newColor, can, level-1);        //Draws rectangle top left
            drawRectangleFractal(width/2.0, height/2.0, x-width, y-width, newColor, can, level-1);            //Draws rectangle bottom left
        }
    }

    public static void main(String[] args){
        Scanner shapeScanner = new Scanner(System.in);
        boolean valid = true;
        String shapeChoice = "";
        while(valid){
            System.out.println("What kind of shape?");
            shapeChoice = shapeScanner.nextLine();
            switch (shapeChoice) {                                    //Checks if input is of valid shape
                case "Triangle":
                    valid = false;
                    break;
                case "Rectangle":
                    valid = false;
                    break;
                case "Circle":
                    valid = false;
                    break;
                default:
                    System.out.println(shapeChoice + "is invalid shape.");
            }
        }
        FractalDrawer frac = new FractalDrawer();
        System.out.println(frac.drawFractal(shapeChoice));
    }
}
