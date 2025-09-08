package book_library_management;

public class Invalid_BookId extends RuntimeException 
{
	@Override
	public String toString()
	{
		return getClass()+"your entrer id:";
		
	}

}
