package book_library_management;

public class NoSuchBookException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+" no books are not added yet:";
	}

}
