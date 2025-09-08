package book_library_management;

import java.util.Scanner;

public class LibraryMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start)
		{
			System.out.println("enter your choice: \n 1.AddbookByI \n 2.showBook \n 3.searchBookById \n 4. updateBookById \n 5.updateBookByCost \n 6.removeBookById \n 7.exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter title:");
				String title=sc.next();
				System.out.println("enter author:");
				String author=sc.next();
				System.out.println("enter id:");
				int id=sc.nextInt();
				System.out.println("enter cost:");
				int cost=sc.nextInt();
				System.out.println("enter Nop pages:");
				int NOP=sc.nextInt();
				l.AddBook(new Book(title,author,id,cost,NOP));
			}
			break;
			case 2:
			{
				l.showBook();
				
			}
			break;
			case 3:
			{
				System.out.println("enter book id to search book:");
				while(true)
				try
				{
				
					int id=sc.nextInt();
					l.searchBookByID(id);
					break;
				}
				catch(Invalid_BookId e)
				{
					System.out.println("enter valid book id:");
					
				}
			
			}
			break;	
			case 4:
			{
				System.out.println("enter author name search for book: ");
				while(true)
				try
				{
				String name=sc.next();
				l.searchBookbyAuthor(name);
				break;
				}
				catch(Invalid_AuthorException e)
				{
					System.out.println("enter valid author name:");
				}
			}
			break;
			case 5:
			{
				System.out.println("enter title name search for book:");
				while(true)
				try
				{
				String title=sc.next();
				System.out.println("enter cost:");
				int cost=sc.nextInt();
				l.updateBookCost(title, cost);
				break;
				}
				catch(Invalid_TitleException  e)
				{
					System.out.println("enter valid title name:");
				}
			
			}
			break;
			case 6:
			{
				System.out.println("enter book id to remove book:");
				while(true)
				try
				{
					int id=sc.nextInt();
					l.removeBookById(id);
					break;
				}
				catch(Invalid_BookId e)
				{
					System.out.println("enter valid bookID");
				}
			}
			break;
			case 7:
			{
				start=false;
			}
			default:System.out.println("thank you........................................");
			}
			
		}
		
	}

}
