import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower; 
import info.gridworld.grid.Grid;

public class ChameleonCritter extends Critter
{
    private static final double darker = 0.05;
    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
            Color c = getColor();
            int red = (int) (c.getRed() * (1 - darker));        
            int green = (int) (c.getGreen() * (1 - darker));
            int blue = (int) (c.getBlue() * (1 - darker));
            setColor(new Color(red, green, blue));
            return;
        }
        int r = (int) (Math.random() * n);
        Actor other = actors.get(r);
        setColor(other.getColor());   
    }
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
