package LAB.L3.e;

public class Main
{
    public static void main(String[] args)
    {
        Book book = new Book("OOC", "Me","1273","29/1","IUT");
        Book book2 = new Book("OOC-2", "Mahbub","12e56","30/1","IUT");
        Member member= new Member(220042148, "Mahbub", "IUT");
        Member member2= new Member(220042148, "Mahbub", "IUT");
        Library first = new Library(book,member);
        Library second = new Library(book2, member2);

        book.showDetails();
        member2.showDetails();
        first.borrowBook(book);
        first.borrowBook(book);
        second.borrowBook(book2);
        first.returnBook(book);

    }

}
