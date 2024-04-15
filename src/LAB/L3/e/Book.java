package LAB.L3.e;
public class Book
{
    String Title;
    String Author;
    String ISBN;
    String PublicationDate;
    String Publisher;
    boolean Available;

    void showDetails()
    {
        System.out.println(Title+"\n"+Author+"\n"+ISBN+"\n"+PublicationDate+"\n"+Publisher+"\n"+Available);
    }
    void borrow()
    {
        if(Available)
        {
            Available=false;
        }
        else
        {
            System.out.println("Not Available");
        }
    }
    void returnBook()
    {
        if(!Available) {Available=true;}
    }
    Book()
    {
        ;
    }
    Book(String title, String author, String isbn, String publicationdate, String publisher)
    {
        Title=title;
        Author=author;
        ISBN=isbn;
        PublicationDate=publicationdate;
        Publisher=publisher;
        Available= true;
    }



}
