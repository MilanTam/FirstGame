package at.MT.games.firstgame;

import org.newdawn.slick.Graphics;


public class Rectangle implements Actor{
    //public enum MovingDirection {RIGHT, DOWN, LEFT, UP}

    private float x;
    private float y;
    private float speed;
    //private MovingDirection objectDirection;


    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        //this.objectDirection = objectDirection;

    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 50, 50);

    }


    public void update(int delta) {
        this.x += (float) delta / this.speed;
        if (this.x > 1100) {
            this.x = 0;
        }

       /* if (objectDirection == MovingDirection.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 600) {
                objectDirection = MovingDirection.DOWN;
            }
        } else if (objectDirection == MovingDirection.DOWN) {
            this.y += (float) delta / this.speed;
            if (this.y > 400) {
                objectDirection = MovingDirection.LEFT;
            }
        } else if (objectDirection == MovingDirection.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x < 100) {
                objectDirection = MovingDirection.UP;
            }
        } else {
            this.y -= (float) delta / this.speed;
            if (this.y < 100) {
                this.objectDirection = MovingDirection.RIGHT;
            }
        }*/
    }
}
