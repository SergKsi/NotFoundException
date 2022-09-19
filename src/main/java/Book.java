public class Book extends Product {

    private String authorBook;

//    public String getAuthorBook() {
//        return authorBook;
//    }

//    public void setAuthorBook(String authorBook) {
//        this.authorBook = authorBook;
//    }

    public Book(int id, String nameProduct, int costProduct, String authorBook) {
        super(id, nameProduct, costProduct);
        this.authorBook = authorBook;
    }

//    @Override
//    public boolean matches(String search) {
//        if (!super.matches(search)) {
//            if (getAuthorBook() == search) {
//                return true;
//            }
//        }
//        return false;
//    }

    //
//    @Override
//    public boolean isToExpensive() {
//        if (costProduct > 1_000) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void used() {
//        System.out.println("Книгу " + nameProduct + " читаем");
//    }
//
//    @Override
//    public void save(Product item) {
//        super.save(item);
//    }
}
