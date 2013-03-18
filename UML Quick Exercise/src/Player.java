import java.awt.Graphics;
import java.util.ArrayList;


public class Player {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private ArrayList<Navigator> path = new ArrayList<Navigator>(0);
	@SuppressWarnings("unused")
	private ArrayList<Warrior> warriors = new ArrayList<Warrior>(0);
	public void draw (Graphics g){}
	public void travel (Direction whichway, int numSteps){}
}
