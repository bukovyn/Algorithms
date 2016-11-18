Public class Person()
{
	public Person(String name, int count)
	{
		this.name = name;
		this.count = count;
	}
	
	public int getVotes(Person person)
	{
		return person.count;
	}
	
	public String getName(Person person)
	{
		return Person.name;
	}
	
	public String getInfo(Person person)
	{
		return Person.name + " has " + Person.count + " votes.";
	}
}