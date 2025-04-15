import java.util.Scanner;

interface Student
{
	void getAcademicScore(int score);
	void showAcademicScore();
}

interface Sports
{
	void getSportsScore(int score);
	void showSportsScore();
}

class Result implements Student,Sports
{
	private int academicScore;
	private int sportsScore;
	
	public void getAcademicScore(int score)
	{
		academicScore=score;
	}
	
	public void showAcademicScore()
	{
		System.out.println("Academic Score:" +academicScore);
	}
	
	public void getSportsScore(int score)
	{
		sportsScore=score;
	}
	
	public void showSportsScore()
	{
		System.out.println("Sports Score:" +sportsScore);
	}
	
	public void displayResult()
	{
		showAcademicScore();
		showSportsScore();
	}
}

public class Studentresult
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Result result=new Result();
		
		System.out.println("Enter Academic Score:");
		int academic=sc.nextInt();
		result.getAcademicScore(academic);
		
		System.out.println("Enter Sports score:");
		int sports=sc.nextInt();
		result.getSportsScore(sports);
		
		System.out.println("\n--- Student Result ---");
		result.displayResult();
		
		sc.close();
	}
}

		
		
