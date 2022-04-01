/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


import javafx.scene.shape.Rectangle;
import javafx.scene.canvas.*;
public class Snake {
    
    private int x, y, xSpeed, ySpeed;
    public Snake() {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 1;
        this.ySpeed = 0;
        
    }
    public void update() {
        this.x = this.x + this.xSpeed;
        this.y = this.y + this.ySpeed;
    }
    
    public void show() {
        
        Rectangle rect1 = new Rectangle(this.x, this.y, 10, 10);
        rect1.setFill(Color.WHITE);
        
    }
}
