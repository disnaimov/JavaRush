package lesson15;

public abstract class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public abstract Book getBook();

    public abstract String getName();


    public String getOutputByAuthor() {
        String agataCristiOutput = "AKO";
        String markTwainOutput = "MTO";

        if (this instanceof MarkTwainBook) {
            return markTwainOutput;
        } else return agataCristiOutput;
    }

    public static class MarkTwainBook extends Book {
        String bookName;
        public MarkTwainBook(String bookName) {
            super("Mark Twain");
            this.bookName = bookName;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public static class AgataCristiBook extends Book {
        String bookName;
        public AgataCristiBook(String bookName) {
            super("Agata Kristi");
            this.bookName = bookName;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public static void main(String[] args) {
        Book book = new AgataCristiBook("AK book");
        Book book1 = new MarkTwainBook("MT book");
        System.out.println(book.getBook());
        System.out.println(book.getName());
        System.out.println(book.getOutputByAuthor());

        System.out.println(book1.getBook());
        System.out.println(book1.getName());
        System.out.println(book1.getOutputByAuthor());
    }
}

