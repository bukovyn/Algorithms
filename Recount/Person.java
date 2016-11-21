public class Person {

	String name;
	int votes;
	
	public Person(String name){
		this.name = name;
		this.votes = 1;
	}
	
	public int getVotes(){
		return this.votes;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void incVotes(){
		this.votes += 1;
	}			
}
