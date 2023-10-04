import processing.core.*;

public class App extends PApplet{
    Rectangle rect1;
    Rectangle rect2;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        rect1 = new Rectangle(this, 100, 100, 150, 80);
        rect2 = new Rectangle(this, 200, 300, 200, 250);
    }

    public void settings(){
        size(1600, 1000);
    }

    public void draw(){
        background(120);

        rect1.setX(mouseX);
        rect1.setY(mouseY);

        rect1.display();
        rect2.display();

        if(rectCollision()){
            rect2.setFill(random(255), random(255), random(255));
        }

    }

     public boolean rectCollision(){

        if(rect1.getX() + rect1.getWidth() < rect2.getX()){
            return false;
        }
        else if(rect1.getX()> rect2.getX() + rect2.getWidth()){
            return false;
        }
        else if(rect1.getY() + rect1.getHeight() < rect2.getY()){
            return false;
        }
        else if(rect1.getY() > rect2.getY() + rect2.getHeight()){
            return false;
        }
        else{
            return true;
        }
        
    }
   
}
