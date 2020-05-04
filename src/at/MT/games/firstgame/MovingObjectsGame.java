package at.MT.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovingObjectsGame extends BasicGame {
    private List<Actor> actors;
    // private List<Oval> ovals;
    // private List<Circle> circles;
    //private Rectangle rectangle;
    //private Oval oval;
    //private Circle round;

    public MovingObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        Random random = new Random();
        this.actors = new ArrayList<>();
        //this.ovals = new ArrayList<>();
        //this.circles = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(1200), random.nextInt(800), random.nextInt(50));
            actors.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Oval oval = new Oval(random.nextInt(1200), random.nextInt(800), random.nextInt(50));
            actors.add(oval);
        }

        for(int i = 0;i < 50; i++){
        Circle circle = new Circle(random.nextInt(1200), random.nextInt(800), random.nextInt(50));
        actors.add(circle);
    }
    }
        /*this.rectangle = new Rectangle(100, 100, 5);
        this.oval = new Oval(0, 100, 5);
        this.round = new Circle(0, 0, 5);*/


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
        /*for (Oval oval : this.ovals) {
            oval.update(delta);
        }
        for (Circle circle : this.circles) {
            circle.update(delta);
        }
        this.rectangle.update(delta);
        this.oval.update(delta);
        this.round.update(delta);*/
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);

        }
       /* for (Oval oval : this.ovals) {
            oval.render(graphics);
        }
        for (Circle circle : this.circles) {
            circle.render(graphics);
        }
        /*this.rectangle.render(graphics);
        this.oval.render(graphics);
        this.round.render(graphics);*/

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MovingObjectsGame("MovingObjectsGame"));
            container.setDisplayMode(1200, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
