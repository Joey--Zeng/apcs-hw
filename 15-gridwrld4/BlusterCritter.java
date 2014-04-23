import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.awt.Color;
import java.util.ArrayList;


public class BlusterCritter extends Critter{
    int c;

    public BlusterCritter(int a){
	super();
	c = a;
    }

    public ArrayList<Actor> getActors(){
	ArrayList<Actor> actors = new ArrayList<Actor>();
	Location loc = getLocation();
	int r = loc.getRow();
	int c = loc.getCol();
        int[] rows = {r-2, r-1, r, r+1, r+2};
	int[] cols = {c-2, c-1, c, c+1, c+2};
	for (int rr : rows){
	    for (int cc : cols){
		Location point = new Location(rr,cc);
		if (getGrid().isValid(point))
		    if (getGrid().get(point) != null)
			actors.add(getGrid().get(point));
	    }
	}
	return actors;
    }

    public void processActors(ArrayList<Actor> actors){
	int crit = 0;
	for (Actor a : actors){
	    if (a instanceof Critter)
		crit++;
	}
	
	if (crit < c){
	    Color c = getColor();
	    int red = (int) (c.getRed() / (1 - .05));
	    int green = (int) (c.getGreen() / (1 - .05));
	    int blue = (int) (c.getBlue() / (1 - .05));
	    setColor(new Color(red, green, blue));
	 
	}
	
	else{
	    Color c = getColor();
	    int red = (int) (c.getRed() * (1 - .05));
	    int green = (int) (c.getGreen() * (1 - .05));
	    int blue = (int) (c.getBlue() * (1 - .05));
	    setColor(new Color(red, green, blue));

	}
	    
    }
}
