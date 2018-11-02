package First;

public class MyLinkedList<T> {
    Node<T> head;

    public void addToFirst(T data){
        Node<T> newNode=new Node<T>();
        newNode.data=data;

        newNode.next=head;
        head=newNode;
    }
    public void deleteTheFirst(){
        head=head.next;
    }
    public void deleteTheLastNode(){
        Node curren=head;

        while(curren.next.next!=null){
            curren=curren.next;
        }
        curren.next=null;

    }
    public void print (){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }


    }
    //First Question
    public void convertString(String words){

        MyLinkedList<Character> myList=new MyLinkedList<Character>();

        for(int i=0;i<words.length();i++){
            myList.addToFirst(words.charAt(i));
        }

        myList.print();

    }

}
