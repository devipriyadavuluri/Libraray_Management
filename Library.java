package book_library_management;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private Book b;
	ArrayList<Book> book=new ArrayList<Book>();
	public void AddBook(Book b)
	{
		book.add(b);
	}
	public void showBook()
	{
		if(book.isEmpty())
			throw new NoSuchBookException();
		else
		{
			for(Book b:book)
				b.displayDetails();
		}
	}
	public void searchBookByID(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
			throw new NoSuchBookException();
		else
		{
			for(Book b:book)
			{
				if(b.getBookID()==id)
				{
					System.out.println(" Book is found:");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		throw new Invalid_BookId();
	}
	public void searchBookbyAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
			throw new NoSuchBookException();
		else
		{
			for(Book b:book)
			{
				if(b.getAuthorName().equalsIgnoreCase(author))
				{
					System.out.println(b.getBookTitle()+"book is written by"+b.getAuthorName());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new Invalid_AuthorException();
		}
	}
	public void updateBookCost(String title,int newcost)
	{
		boolean isFound=false;
		if(book.isEmpty())
		System.out.println("Books are not Added yet.....");
		else
		{
			for(Book b:book)
			{
				if(b.getBookTitle().equalsIgnoreCase(title))
				{
					b.setBookCost(newcost);
					System.out.println("book updated is suceefully...");
					isFound=true;
				}
			}
		}
		if(isFound==false)
			throw new Invalid_TitleException(); 
	
		
	}
	public void removeBookById(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
			throw new NoSuchBookException();
		else
		{
			Iterator<Book>itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				{
					if(b.getBookID()==id)
					{
						itr.remove();
						System.out.println("removed the element is sucessfullu");
						isFound=true;
					}
				}
			}
		}
		if(isFound==false)
			throw new Invalid_BookId();
	}
	

}
