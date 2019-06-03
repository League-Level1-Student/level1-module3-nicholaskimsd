import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World hi = new World();
		hi.show();
		
		Bug bye = new Bug();
		Bug sai = new Bug();
		Random randy = new Random();
				int r = randy.nextInt(10);
				int p = randy.nextInt(10);
		Location row = new Location(r, p);
		hi.add(row, bye);
		Location wor = new Location(r,p);
		hi.add(wor, sai);
		
		
		
	}
}





