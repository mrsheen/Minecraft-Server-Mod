
import java.util.ArrayList;
/**
 * Portal.java - Contains the stuff for a portal (Name, location, etc.). Based
 * on warps
 * @author mrsheen
 */
public class Portal {

    //private ag portal; // hopefully, not needed, cause we only have one
    private ArrayList<Integer> curtainBlocks = new ArrayList<Integer>();
    private int activeCurtainBlocks = 0;
    private boolean active = false;
    /**
     * Portal ID - Used in database transactions
     */
    public int ID;
    /**
     * Portal name
     */
    /**
     * Portal group
     */
    public String Name, Group;
    /**
     * Portal's location
     */
    public Location loc1, loc2;
    
    public Portal(String name){
        // By default, the portal name is 'Unnamed'
        // It is advisable to use getPortal(x,y,z) unless a name is explicitly set
        // by a plugin
        // Portal.ID is a unique identifier
        this.Name = name;
        
        Location nullBlock = new Location(0,128,0);
        loc1 = loc2 = nullBlock;
    }
    
    public boolean getActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        //System.out.println("portal "+this.Label+" activated");
        this.active = active;
    }
    
    public void setName(String name) {
        this.Name = name;
        etc.getDataSource().changePortal(this);
    }
    
    public void collapseCurtain(int x, int y, int z) {
        // set this block in the portal to removed
        // Check if this location is one of our curtain pieces
        int pt1, pt2, pt3;
        for (int i=0; i<(curtainBlocks.size()/3);i++) {
            pt1 = curtainBlocks.get(i*3);
            pt2 = curtainBlocks.get(i*3+1);
            pt3 = curtainBlocks.get(i*3+2);
            if (x == pt1 && y == pt2 && z == pt3) {
				// Found a valid block in curtain, trigger a full collapse
				curtainBlocks.clear();                
                activeCurtainBlocks = 0;
                break;
            }
        }
        // check if we have removed all, if so, portal is deactivated
        if (activeCurtainBlocks == 0 && this.active) {
            //System.out.println("portal "+this.Label+" deactivated");
            if (!(Boolean)etc.getLoader().callHook(PluginLoader.Hook.PORTALDESTROY, new Object[] {this})) {
                etc.getDataSource().removePortal(this);
                this.active = false;
                
            }
        }
    }
    
    public void addCurtain(int x, int y, int z) {
        // Add this location to our curtain
        
        curtainBlocks.add(x);
        curtainBlocks.add(y);
        curtainBlocks.add(z);
        activeCurtainBlocks++;
        
        // Check for lowest block
        if (y < (int)Math.floor(loc1.y)) {
            loc1 = new Location(x,y,z);
            etc.getDataSource().changePortal(this);
        }
        else if (y < (int)Math.floor(loc2.y)) {
            loc2 = new Location(x,y,z);
            etc.getDataSource().changePortal(this);
        }
        
    }
	
	 public void buildCurtain() {
        
		int i = 0;
		int j = 0;
		
		int x1 = (int)Math.floor(this.loc1.x);
		int y1 = (int)Math.floor(this.loc1.y);
		int z1 = (int)Math.floor(this.loc1.z);
		
		int x2 = (int)Math.floor(this.loc2.x);
		int y2 = (int)Math.floor(this.loc2.y);
		int z2 = (int)Math.floor(this.loc2.z);
		
		if (x1 == x2) j = 1;
		if (z1 == z2) i = 1;

		if (i == j) return;
		//System.out.println(x1+","+ y1+","+ z1);
		for (int k = 0; k < 2; k++) {
		  for (int m = 0; m < 3; m++) {
			addCurtain(x1 + i * k, y1 + m, z1 + j * k); // Set 6 blocks to purple		
			System.out.println((x1 + i * k)+","+ (y1 + m)+","+ (z1 + j * k));
		  }
		}
		
		this.active = true;
    }
    
    public boolean containsLoc(int x, int y, int z) {
        // Check if this location is one of our curtain floor pieces (bottom left, bottom right)
        if (x == (int)Math.floor(loc1.x) && y == (int)Math.floor(loc1.y) && z == (int)Math.floor(loc1.z)) {
            return true;
        }
        else if (x == (int)Math.floor(loc2.x) && y == (int)Math.floor(loc2.y) && z == (int)Math.floor(loc2.z)) {
            return true;
        }
        //System.out.println("no portal found at: "+x+","+y+","+z);
        return false;
    }
	
	 public boolean containsCurtain(int x, int y, int z) {
        // Check if this location is one of our curtain pieces 
		int pt1, pt2, pt3;
		for (int i=0; i<(curtainBlocks.size()/3);i++) {
            pt1 = curtainBlocks.get(i*3);
            pt2 = curtainBlocks.get(i*3+1);
            pt3 = curtainBlocks.get(i*3+2);
            if (x == pt1 && y == pt2 && z == pt3) {
                return true;
            }
        }
        //System.out.println("no portal found at: "+x+","+y+","+z);
        return false;
    }
}
