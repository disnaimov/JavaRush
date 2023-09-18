package lesson15;

public abstract class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public abstract Book getBook();

    public abstract String getName();


    public String getOutputByAuthor() {
        String agataCristiOutput = "AK";
        String markTwainOutput = "MT";

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

    }
}

