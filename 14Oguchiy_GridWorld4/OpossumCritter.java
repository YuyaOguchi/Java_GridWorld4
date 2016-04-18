import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class OpossumCritter extends Critter
{
    private int numStepsDead;  
    public OpossumCritter()
    {
        numStepsDead=0;
        setColor(Color.ORANGE);
    }
    public Location selectMoveLocation( ArrayList<Location> locs)
    {
        if( numStepsDead == 0 )
        {
            return super.selectMoveLocation( locs );
        }
        else if( numStepsDead > 0 && numStepsDead < 3 )
        {
            return getLocation();
        }
        else if( numStepsDead == 3 ) 
        {
            return null;
        }
        return super.selectMoveLocation( locs );
    } 
    public void processActors( ArrayList<Actor> actors)
    {
        int numFriends = 0;
        int numFoes = 0;
        
        for ( Actor a : actors )
        {
            if( isFoe( a ) )
            {
                numFoes++;
            }      
            else if( isFriend( a ) )
            {
                numFriends++;
            }   
            
            if ( numFoes > numFriends )
            {
                numStepsDead++;    
                setColor( Color.BLACK );
            }
            else
            {
               numStepsDead = 0;    
               setColor( Color.ORANGE ); 
            }
        }
    }   
    private boolean isFriend( Actor other)
    {
        if( other instanceof Flower)
            {
                return true;
            }
        else
            {
                return false;
            }
    }
    private boolean isFoe( Actor other)
    {
        if( other instanceof Rock)
            {
                return true;
            }
        else
            {
                return false;
            }
    } 
    public void makeMove(Location loc) 
    { 
        Location oldLoc = getLocation(); 
        setDirection(getLocation().getDirectionToward(loc)); 
        super.makeMove(loc); 
        
        
    } 
}