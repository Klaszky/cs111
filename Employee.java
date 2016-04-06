public class Employee
{
	private String name;
	private double acctBal;
	private double hourlyRate;

	public Employee(String name, double acctBal, double hourlyRate)
	{
		this.name = name;
		this.acctBal = acctBal;
		this.hourlyRate = hourlyRate;
	}

	public Employee(double acctBal, double hourlyRate)
	{
		this.acctBal = acctBal;
		this.hourlyRate = hourlyRate;
	}

	public Employee(double hourlyRate)
	{
		this.acctBal = 0;
		this.hourlyRate = hourlyRate;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public double getAcctBal()
	{
		return acctBal;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void work(int hours)
	{
		acctBal += (hourlyRate*hours);
	}

	public void spend(double money)
	{
		acctBal -= money;
	}

	public String toString()
	{
		return "Employee Name: " + name + " \nEmployee Rate: " + hourlyRate + "\nEmployee balance: " + acctBal;
	}
}