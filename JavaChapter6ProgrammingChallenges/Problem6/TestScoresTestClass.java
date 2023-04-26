import java.util.Scanner;

public class TestScoresTestClass 
{
	public static void main(String[] args)
	{
		// Create a new TestScores object
		TestScores scores = createMyClass();
		
		//Get user input for test scores 1 - 3
		double score1 = getScore();
		double score2 = getScore();
		double score3 = getScore();
		
		//Set the test score fields
		scores.setTestScore1(score1);
		scores.setTestScore2(score2);
		scores.setTestScore1(score3);
		
		//Display the test score average
		displayTestScoreAverage(scores);
	}
	
	public static TestScores createMyClass()
	{
		return new TestScores();
	}
	
	public static double getScore() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the test score: ");
		return input.nextDouble();
	}
	
	public static void displayTestScoreAverage(TestScores scores)
	{
		System.out.println("Average test score: " + scores.getAverage());
	}
}
