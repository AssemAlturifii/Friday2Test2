package First;

public class Main {

    public static void main(String[] args) {

        MyLinkedList mylist=new MyLinkedList();

        mylist.addToFirst("Apple");
        mylist.addToFirst("BAnana");
        mylist.addToFirst("Iphone");
        mylist.addToFirst("sterberry");

        mylist.print();

        mylist.deleteTheFirst();
        System.out.println("====");

        mylist.print();

        mylist.deleteTheLastNode();
        System.out.println("===");

        mylist.print();

//        String word="assem Alturifi";
//
//        mylist.convertString(word);
//        mylist.print();
//


    }

}
