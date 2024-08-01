package pack;
import java.util.*;
public class ProjectMarket {

	
		

			
			    public static void main( String[] args )
			    {
			    	//System.out.println("he");
			    	SortedMap<String, String> marketProjects = new TreeMap<String,String>();

			        // Add some markets and their associated projects
			        marketProjects.put("US", "Project A");
			        marketProjects.put("EU", "Project B");
			        marketProjects.put("ASIA", "Project C");
			        System.out.println(marketProjects.entrySet());

			        // Display the mappings
			       // System.out.println("Markets and their Projects:");
			        /* (Map.Entry<String, String> entry : marketProjects.entrySet()) {
			            System.out.println("Market: " + entry.getKey() + ", Project: " + entry.getValue());
			        }

			        // Example operations
			        System.out.println("\nFirst Market: " + marketProjects.firstKey());
			        System.out.println("Last Market: " + marketProjects.lastKey());
			    	*/
			    }
			



	

}
