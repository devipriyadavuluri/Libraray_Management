package book_library_management;

public class InvalidCostException extends RuntimeException{
	@Override
	public String toString()
	{
		return getClass()+" invalid cost:";
	}
}
