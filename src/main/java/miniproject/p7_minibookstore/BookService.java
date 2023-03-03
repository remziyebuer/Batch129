package miniproject.p7_minibookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {

    List<Book>books=new ArrayList<>();

    public BookService(){
    Book book1=new Book("Fareler ve İnsanlar","120 Lira",15,"J.Steinbeck","Penguin","A111");
    Book book2=new Book("Sefiller","150 Lira",5,"V.Hugo","Penguin","A222");
    Book book3=new Book("Suç ve Ceza","120 Lira",15,"Dostoyevski","Dream","A333");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
}
    Scanner inp = new Scanner(System.in);


    @Override
    public void processMenu() {

        int choice;
        do {
            System.out.println("___________________________");
            System.out.println("1-Kitaplari Listele");
            System.out.println("2-Kitap Ekle");
            System.out.println("3-Kitap Sil");
            System.out.println("4-Yayinevine Göre Filtrele ");
            System.out.println("0-Geri Dön");
            System.out.println("Seciminiz: ");
            choice = inp.nextInt();

            switch (choice){
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Yayınevi :");
                    String publisher=inp.nextLine();
                    filterProducts(publisher);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!");
                    break;
            }

        }while (choice!=0);
    }
    @Override
    public void listProduct() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
