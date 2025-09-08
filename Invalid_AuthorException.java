package book_library_management;

public class Invalid_AuthorException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+"invalid author name:";
	}

}
