import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World hi = new World();
		hi.show();
		
		Bug bye = new Bug();
		Bug sai = new Bug();
		Bug ill = new Bug(Color.BLUE );
		Flower kai = new Flower();
		Flower bai = new Flower();
		Random randy = new Random();
				int r = randy.nextInt(8);
				int p = randy.nextInt(8);
		Random joe = new Random();
		int lo = joe.nextInt(8);
		int ko = joe.nextInt(8);
		Location row = new Location(r, p);
		Location go = new Location(r+1, p);
		Location mo = new Location(r-1, p);
		Location no = new Location(lo+1, ko);
		Location bo = new Location(lo-1, ko);
		hi.add(row, bye);
		Location wor = new Location(lo,ko);
		hi.add(wor, sai);
		bye.setColor(Color.ORANGE);
		sai.setColor(Color.ORANGE);
		bye.turn();
		bye.turn();
		sai.turn();
		sai.turn();
		hi.add(go, kai);
		hi.add(mo, kai);
		hi.add(no, bai);
		hi.add(bo, bai);
		for(int i = 0; i <10; i++) {
			
			for (int l = 0; l < 10; l++) {
				hi.add(new Location (i, l), new Flower());
			}
			
			
		}
		
		
		
		
	}
}





