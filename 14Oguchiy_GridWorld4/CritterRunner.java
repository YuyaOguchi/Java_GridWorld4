import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(5, 5), new Flower(Color.BLUE));
        world.add(new Location(3, 8), new Flower(Color.GREEN));
        world.add(new Location(1, 5), new Flower(Color.RED));
        world.add(new Location(6, 2), new Flower(Color.YELLOW));
        world.add(new Location(2, 8), new Rock());
        world.add(new Location(3, 3), new OpossumCritter());
        world.add(new Location(1, 2), new RockHound());
        world.add(new Location(5, 6), new BlusterCritter(2));
        world.add(new Location(9, 9), new RockHound());
        world.show();
    }
}