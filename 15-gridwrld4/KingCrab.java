import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.util.ArrayList;


public class KingCrab extends CrabCritter{
    
    public void processActors(ArrayList<Actor> actors){
	for (Actor a: actors){
	    int diraway = getLocation().getDirectionToward(a.getLocation());
	    Location to = a.getLocation().getAdjacentLocation(diraway);
	    
	    if (getGrid().isValid(to) &&
		!(getGrid().get(to) instanceof Rock))
		a.moveTo(to);
	    else
		a.removeSelfFromGrid();
	}
    }
}
