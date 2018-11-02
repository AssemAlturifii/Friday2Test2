package Third;

public class MyArrayList<T> {
    private Object []elements;
    private int size=0;
    private static final int CAPACITY=10;


    public MyArrayList() {
        this.elements = new Object[CAPACITY];
    }

    public void add(T element){
        if(size==elements.length){

            Object[]temp=new Object[CAPACITY*2];

            for(int i=0;i<elements.length;i++){
                temp[i]=elements[i];

            }
            elements=temp;

        }
        elements[size++]=element;

    }
    public Object getSize(){
        return elements.length;
    }
    public Object get(int index){
        return elements[index];
    }


}