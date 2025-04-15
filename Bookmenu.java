import java.util.Scanner;

class Publisher
{
	String pname;
	int pyear;
	
	Publisher(String name,int year)
	{
		pname=name;
		pyear=year;
	}
	
	void display()
	{
		System.out.println("Publisher:" +pname);
		System.out.println("Year of publishing:" +pyear);
	}
}

class Book extends Publisher
{
	String btitle,bauthor;
	
	Book(String name,int year,String title,String author)
	{
		super(name,year);
		btitle=title;
		bauthor=author;
	}
	
	void display()
	{
		super.display();
		System.out.println("Title:" +btitle);
		System.out.println("Author:" +bauthor);
	}
}

class Literature extends Book
{
	String lgenre;
	
	Literature(String name,int year,String title,String author,String genre)
	{
		super(name,year,title,author);
		lgenre=genre;
	}
	
	void display()
	{
		System.out.println("\n--- Literature Book ---");
		super.display();
		System.out.println("Genre:" +lgenre);
	}
}

class Fiction extends Book
{
	String ftheme;
	
	Fiction(String name,int year,String title,String author,String theme)
	{
		super(name,year,title,author);
		ftheme=theme;
	}
	
	void display()
	{
		System.out.println("\n--- Fiction Book ---");
		super.display();
		System.out.println("Theme:" +ftheme);
	}
}

public class Bookmenu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Book[] books=new Book[100];
		int count=0;
		
		while(true)
		{
			System.out.println("\n........Book Menu........");
			System.out.println("1. Add literature Book");
			System.out.println("2. Add Fiction Book");
			System.out.println("3. Display all Books");
			System.out.println("4. Exit");
			System.out.println("Choose an option:");
			int choice=sc.nextInt();
			
			if(choice == 1 || choice == 2)
			{
				System.out.println("Enter Publisher:");
				String publisher=sc.next();
				
				System.out.println("Enter year of publishing:");
				int year=sc.nextInt();
				
				System.out.println("Enter Title:");
				String title=sc.next();
				
				System.out.println("Enter Author:");
				String author=sc.next();
				
				if(choice == 1)
				{
					System.out.println("Enter Genre:");
					String genre=sc.next();
					books[count++]=new Literature(publisher,year,title,author,genre);
				}
				else
				{
					System.out.println("Enter Theme:");
					String theme=sc.next();
					books[count++]=new Fiction(publisher,year,title,author,theme);
				}
			}
			else if(choice==3)
			{
				if(count==0)
				{
					System.out.println("No books to display");
				}
				else
				{
					for(int i=0;i<count;i++)
					{
						books[i].display();
					}
				}
			}
			else if(choice==4)
			{
				System.out.println("Exiting...");
				break;
			}
			else
			{
				System.out.println("Invalid choice!");
			}
		}
	}
}


