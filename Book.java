/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int barrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = "";
        barrowed = 0;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void getBarrowed()
    {
        System.out.println(barrowed);
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void barrowed()
    {
        barrowed += 1;
    }
    
    public void getTheDets()
    {
        System.out.println("Title: " + title + 
        " Author: " + author + " Pages: " + pages);
        System.out.println("This book has been barrowed" + barrowed + "times!");
        if (refNumber.length() != 0)
        {
            System.out.println(" Reference number: " + refNumber);
        }
        else
        {
            System.out.println("\nZzz...");
        }
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() > 3)
        {
            System.out.print("ERROR: Input must be 3 Chara or more.");
        }
        else
        {
            refNumber = ref;
        }
    }
    
    
}
