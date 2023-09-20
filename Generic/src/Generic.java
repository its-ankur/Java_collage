//int[] arr;

class CQArrayList<T>{
    private int size;
    private Object[] elements;
    public CQArrayList(){
        elements=new Object[10];
        size=0;
    }
    public void add(T obj){
        if(size< elements.length){
            elements[size]=obj;
        }
        else{

        }
        ++size;
    }
    public Object get(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        return elements[index];
    }
    public int size(){
        return size;
    }
}

public class Generic {
    public static void main(String[] args) {
        CQArrayList<String> list1=new CQArrayList<>();
        list1.add("Code");
        list1.add("Quotient");
        for(int i=0;i< list1.size();++i) {
            System.out.println((String) list1.get(i));
        }
        //list1.add(Integer.valueOf(12));
        for(int i=0;i< list1.size();++i){
            System.out.println((String) list1.get(i));
        }
    }
}
