public class Person {

	String name;
	int votes;
	
	public Person(String name){
		this.name = name;
		this.votes = 1;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getVotes(){
		return this.votes;
	}
	
	public void incVotes(){
		this.votes += 1;
	}			
}
