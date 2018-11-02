package Second;

public class Main {
    public static void main(String[] args) {
        Queues<Integer> q = new Queues<Integer>();



        q.enque(5);
        q.enque(7);
        q.enque(10);


        q.print();

        q.deque();
        System.out.println("===");

        q.print();






    }

}
