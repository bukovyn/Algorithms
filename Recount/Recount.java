import java.util.*;

public class Recount {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> people = new ArrayList<Person>();
		
		while(!scanner.hasNext("...")){
			Person nextPerson = new Person(scanner.nextLine());
			if(!checkList(nextPerson, people))
			{
				getPerson(people, nextPerson).incVotes();
			}
			people.add(nextPerson);
		}
		
		scanner.close();
		
		String winner = calculateWinner(people);
		System.out.println(winner);
	}

public static boolean checkList(Person person, ArrayList<Person> list){
	
	if(list.size() == 0 || list.size() == 1){
		return true;
	}
	
	for(int i = 0; i < list.size(); i++){
	   if(person.getName().equals(list.get(i).getName())){
		   return false;
	   }
   	}
   	return true;
  }

public static Person getPerson(ArrayList<Person> list, Person person){
	for(int i = 0; i < list.size(); i++){
		if(person.getName().equals(list.get(i).getName())){
			return list.get(i);
		}
	}
	return person; //Unreachable line but necessary for return type.
}

public static String calculateWinner(ArrayList<Person> list){
	Person temp = list.get(0);
	for(int i = 1; i < list.size(); i++){
		if(list.get(i).getVotes() > temp.getVotes()){
			temp = list.get(i);
		}
	}
	
	int current = list.indexOf(temp);
	for(int i = 0; i < list.size(); i++){
		if( i != current){
			if(list.get(i).getVotes() == temp.getVotes()){
				return "Runoff!";
			}
		}
	}
	return temp.getName();
}
}






