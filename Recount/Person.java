Public class Person()
{
	public Person(String name, int votes)
	{
		this.name = name;
		this.votes = votes;
	}
	
	public int getVotes(Person person)
	{
		return person.votes;
	}
	
	public String getName(Person person)
	{
		return Person.name;
	}
	
	public String getInfo(Person person)
	{
		return Person.name + " has " + Person.votes + " votes.";
	}
}
