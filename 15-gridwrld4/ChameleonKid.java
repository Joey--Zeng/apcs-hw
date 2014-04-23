import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;

import java.util.ArrayList;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonKid extends ChameleonCritter
{
    /**
     * Randomly selects a neighbor and changes this critter's color to be the
     * same as that neighbor's. If there are no neighbors, no action is taken.
     */
    
    
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
	int[] dirs = {getDirection(), getDirection()+180};
	for (int x : dirs){	    
	    Location asd = getLocation().getAdjacentLocation(x);
	    if (getGrid().isValid(asd)){
		Actor a = getGrid().get(asd);
		if (a != null)
		    actors.add(a);
	    }
	}
	return actors;
    }
}
