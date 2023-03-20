public class BOOK {
    private String author_name ;
    private String book_name;
    private int book_page;
    private String release_date;

    public BOOK(String book_name ,int book_page, String author_name , String release_date) {
        this.author_name = author_name;
        this.book_name = book_name;
        this.book_page = book_page;
        this.release_date = release_date;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_page() {
        return book_page;
    }

    public void setBook_page(int book_page) {
        this.book_page = book_page;
    }
    public String getRelease_date(){
        return this.release_date;
    }
    public void setRelease_date(String release_date){
        this.release_date=release_date;
    }
}
