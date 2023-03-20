import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<BOOK> books = new ArrayList<>();
        books.add(new BOOK("Sutherland", 219, "Julita Matchell", "9/3/1993"));
        books.add(new BOOK("Crowley", 57, "Benny Gadman", "8/26/2009"));
        books.add(new BOOK("Division", 	92, "Darius Siviter", "9/3/1993"));
        books.add(new BOOK("Bowman", 	230, "Daniel Schlag", "9/3/1993"));
        books.add(new BOOK("Westport", 53, "Conan Grimsdith", "9/3/1993"));
        books.add(new BOOK("Manley", 182, "Julita Matchell", "9/3/1993"));
        books.add(new BOOK("Straubel", 21, "Julita Matchell", "9/3/1993"));
        books.add(new BOOK("Park Meadow", 400, "Julita Matchell", "9/3/1993"));
        books.add(new BOOK("Loftsgordon", 87, "Julita Matchell", "9/3/1993"));
        books.add(new BOOK("International", 214, "Julita Matchell", "9/3/1993"));

        Map<String,String > newlist = new TreeMap<>();

        books.stream().forEach(book->newlist.put(book.getAuthor_name(),book.getBook_name()));

        ArrayList<BOOK> newFiteredBookList = new ArrayList<>();
        books.stream().filter(book-> book.getBook_page()>100).forEach(book -> newFiteredBookList.add(book));
        newFiteredBookList.forEach(book -> System.out.println(book.getBook_name() + " " + book.getBook_page()));
    }
}