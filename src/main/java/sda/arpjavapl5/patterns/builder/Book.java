package sda.arpjavapl5.patterns.builder;

public class Book {
    final String title;
    final String author;
    final String isbn;
    final String description;
    final int releaseYear;

    //przykładowe konstruktory teleskopowe
    public Book(String title){
        this(title, null, null, null, -1);
    }

    public Book(String title, String author){
        this(title, author, null, null, -1);
    }

    private Book(String title, String author, String isbn, String description, int releaseYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public static RequireTitle builder(){
        return new BookBuilder();
    }

    //Interfejs drugiego parametru obowiązkowego
    public interface RequireAuthor{
        BookBuilder author(String author);
    }
    //Interfejs pierwszego parametru obowiązkowego
    public interface RequireTitle{
        RequireAuthor title(String title);
    }

    //klasa budowniczego implementuje oba interfejsy parametru obowiązkowego
    public static class BookBuilder implements RequireTitle, RequireAuthor{
        static final String DEFAULT_AUTHOR = "autor nieznany";
        static final String DEFAULT_DESCRIPTION = "brak opisu";
        public static final int DEFAULT_RELEASE_YEAR = -1;
        String title;
        String author = DEFAULT_AUTHOR;
        String isbn;
        String description = DEFAULT_DESCRIPTION;
        int releaseYear = DEFAULT_RELEASE_YEAR;

        private BookBuilder(){
        }

        public BookBuilder title(String title){
            this.title = title;
            return this;
        }
        public BookBuilder author(String author){
            this.author = author;
            return this;
        }

        public BookBuilder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder description(String description){
            this.description = description;
            return this;
        }

        public BookBuilder releaseYear(int releaseYear){
            this.releaseYear = releaseYear;
            return this;
        }

        public Book build(){
            return new Book(this.title, this.author, this.isbn, this.description, this.releaseYear);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
