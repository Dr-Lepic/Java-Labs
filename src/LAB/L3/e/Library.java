package LAB.L3.e;
public class Library
{
    Book book;
    Member member;

    Library(Book book, Member member)
    {
        this.book= book;
        this.member=member;
    }
    void borrowBook(Book book)
    {
        book.borrow();
    }
    void returnBook(Book book)
    {
        book.returnBook();
    }
}
