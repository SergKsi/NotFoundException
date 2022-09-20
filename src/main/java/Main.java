public class Main {
    public static void main(String[] args)  {

        ProductRepository repo = new ProductRepository();

        Product items1 = new Book(5, "book1", 1000, "k1");
        Product items3 = new Book(3, "book3", 7000, "k3");
        Product items5 = new Smartphone(9, "Smartphone", 56000, "Samsung");
        Product items6 = new Smartphone(11, "Smartphone", 99000, "Apple");

        try {
//            repo.save(items6);
            repo.removeById(55);
//                        System.out.println("Main.main");
        } catch (NegativeArraySizeException e) {
            System.out.println("111.main");
        }
    }
}
