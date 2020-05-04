package at.MT.games.firstgame;

import org.newdawn.slick.Graphics;

public class Circle {
    private enum MovingDirection {RIGHT, DOWN, LEFT, UP}

    private float x;
    private float y;
    private float speed;
    private Circle.MovingDirection objectDirection;


    public Circle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.objectDirection = MovingDirection.RIGHT;
    }

    public void render(Graphics graphics) {
        graphics.drawRoundRect(this.x,this.y,50,50,25);

    }


    public void update(int delta) {
        if (objectDirection == MovingDirection.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 700) {
                this.objectDirection = MovingDirection.LEFT;
            }
        } else {
            this.x -= (float) delta / this.speed;
            if (this.x < 10) {
                this.objectDirection = MovingDirection.RIGHT;
            }
        }
    }
}
