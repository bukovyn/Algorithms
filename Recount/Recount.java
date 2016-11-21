/*PSEUDOCODE

	Constructor for Person object with parameters:
													name, votes
													
	ArrayList of arbitruary size
	
	Loop through input and store values in ArrayList
	
	Method to go through ArrayList and retrieve name with most votes or if there is a tie
	
END*/

//TODO Merge two classes together
//main
import java.util.*;

public class Recount{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> people = new ArrayList<String>();
		
		while(scanner.hasNext()){
		 people.add(scanner.nextLine());
		}
	    
	}
	
}

public boolean checkList(ArrayList<String> list)
{
    for(int i = 0; i < list.length; i++)
    {
        String temp = list.indexOf(i);
        for(int j = 1; j < list.length; j++)
        {
            String tempTwo = list.indexOf(j);
            if(temp.equals(tempTwo))
            {
                return false;
                break;
            }
        }
    }
    
    return true;
}
