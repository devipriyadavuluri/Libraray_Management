package book_library_management;

public class Book {
	private String bookTitle;
	private String authorName;
	private int bookID;
	private int bookCost;
	private int bookNop;
	public Book()
	{
		
	}
	public Book(String bookTitle, String authorName, int bookID, int bookCost, int bookNop) {
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.bookID = bookID;
		this.bookCost = bookCost;
		this.bookNop = bookNop;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	public int getBookNop() {
		return bookNop;
	}
	public void setBookNop(int bookNop) {
		this.bookNop = bookNop;
	}
	public void displayDetails()
	{
		System.out.println("BookTitle:"+getBookTitle());
		System.out.println("book Author:"+getAuthorName());
		System.out.println("book cost:"+getBookCost());
		System.out.println("book id:"+getBookID());
		System.out.println("book  number of pages:"+getBookNop());
		System.out.println("--------------------------------------------");
	}
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + "\n authorName=" + authorName + ", bookID=" + bookID + "\n bookCost="
				+ bookCost + "\n  bookNop=" + bookNop + "]";
	}
	
	

}
