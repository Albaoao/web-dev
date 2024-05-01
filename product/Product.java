abstract class Product {
    int barcode;
    int regularPrice;

    public Product(int barcode, int regularPrice) {
        this.barcode = barcode;
        this.regularPrice = regularPrice;
    }

    public abstract double computeSalePrice();
}

class TV extends Product {
    String typeTV;
    double screenSize;

    public TV(int barcode, int regularPrice, String typeTV, double screenSize) {
        super(barcode, regularPrice);
        this.typeTV = typeTV;
        this.screenSize = screenSize;
    }

    @Override
    public double computeSalePrice() {
        return regularPrice * 1.2;
    }

    @Override
    public String toString() {
        return "TV [barcode=" + barcode + ", regularPrice=" + regularPrice + ", typeTV=" + typeTV + ", screenSize="
                + screenSize + "]";
    }
}

class Book extends Product {
    String title;
    String publisher;
    int yearPublished;

    public Book(int barcode, int regularPrice, String title, String publisher, int yearPublished) {
        super(barcode, regularPrice);
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice() {
        return regularPrice * 0.5;
    }

    @Override
    public String toString() {
        return "Book [barcode=" + barcode + ", regularPrice=" + regularPrice + ", title=" + title + ", publisher="
                + publisher + ", yearPublished=" + yearPublished + "]";
    }
}

class ChildrenBook extends Book {
    int age;

    public ChildrenBook(int barcode, int regularPrice, String title, String publisher, int yearPublished, int age) {
        super(barcode, regularPrice, title, publisher, yearPublished);
        this.age = age;
    }

    @Override
    public double computeSalePrice() {
        return regularPrice * 0.25;
    }

    @Override
    public String toString() {
        return "ChildrenBook [barcode=" + barcode + ", regularPrice=" + regularPrice + ", title=" + title
                + ", publisher=" + publisher + ", yearPublished=" + yearPublished + ", age=" + age + "]";
    }
}

