
public class PersonalInformationTestClass 
{
	public static void main(String[] args)
	{
		PersonalInformation me = createMyClass();
		PersonalInformation friend = createMyClass();
		PersonalInformation familyMember = createMyClass();
	}
	
	public static PersonalInformation createMyClass() 
	{
	    return new PersonalInformation();
	}
}
