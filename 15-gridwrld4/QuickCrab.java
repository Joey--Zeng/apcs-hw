import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter{

    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        int[] dirs =
            { Location.LEFT, Location.RIGHT };
        for (Location loc : getLocationsInDirections2(dirs))
            if (getGrid().get(loc) == null)
                locs.add(loc);
	if (locs.size() != 0)
	    return locs;
	else 
	    return super.getMoveLocations();
    }
    
    
    public ArrayList<Location> getLocationsInDirections2(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
	
        for (int d : directions)
	    {
		Location neighborLoc = loc.getAdjacentLocation(getDirection() + d).getAdjacentLocation(getDirection() + d);
		if (gr.isValid(neighborLoc))
                locs.add(neighborLoc);
	    }
        return locs;		
    }
}
