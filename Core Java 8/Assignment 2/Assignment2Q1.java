 class SingletonInheritanceCheck
{
	static SingletonInheritanceCheck obj = new SingletonInheritanceCheck();
	private SingletonInheritanceCheck()
	{
		
	}
	public static SingletonInheritanceCheck getObjectInstance()
	{
		return obj;
	}
}
public class Assignment2Q1 {

	public static void main(String[] args) {
		SingletonInheritanceCheck ob = SingletonInheritanceCheck.getObjectInstance();

	}

}
