package at.MT.games.firstgame;

import org.newdawn.slick.Graphics;

public class Oval implements Actor{
    private enum MovingDirection {RIGHT, DOWN, LEFT, UP}

    private float x;
    private float y;
    private float speed;
    private Oval.MovingDirection objectDirection;


    public Oval(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.objectDirection = MovingDirection.DOWN;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 100, 65);

    }


    public void update(int delta) {
        if (objectDirection == MovingDirection.DOWN) {
            this.y += (float) delta / this.speed;
            if (this.y > 800) {
                this.objectDirection = MovingDirection.UP;
            }
        } else {
            this.y -= (float) delta / this.speed;
            if (this.y < 50) {
                this.objectDirection = MovingDirection.DOWN;
            }
        }
    }
}

