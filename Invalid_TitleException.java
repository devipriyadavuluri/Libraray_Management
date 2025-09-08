package book_library_management;

public class Invalid_TitleException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+"invalid title name:";
		
	}

}
