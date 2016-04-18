import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock; 
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/**
 * A <code>CrabCritter</code> looks at a limited set of neighbors when it eats and moves.
 * <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RockHound extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
    for (Actor a : actors)
    {
        if (a instanceof Rock)
        {
            a.removeSelfFromGrid();
        }
        
    }
    }
}
