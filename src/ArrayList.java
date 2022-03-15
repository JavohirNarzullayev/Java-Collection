import java.util.Arrays;

public class ArrayList<T> {
    private Object[] elementData=new Object[0];


    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Bir");
        arrayList.add("Ikki");
        arrayList.add("Uch");
        arrayList.add("To'rt",2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.remove(1);

        System.out.println(arrayList);
    }



    public void add(T value,int index){
        checkIndex(index);
        elementData[index]=value;
    }

    private void checkIndex(int index) {
        if (isNotValid(index)){
            throw new IllegalArgumentException();
        }
    }

    private boolean isNotValid(int index) {
        return elementData.length < index || index < -1;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        checkIndex(index);
        return (T) elementData[index];
    }
    public boolean remove(int index){
        checkIndex(index);
        fastRemove(index);
        return true;
    }

    private void fastRemove(int index) {
        final int newSize;
        if ((newSize=elementData.length-1)>index){
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        }
        elementData[newSize] = null;
    }
    public boolean hasIndex(int index){
        return !isNotValid(index) && get(index) != null;
    }


    @SuppressWarnings("unchecked")
    public void add(T value) {
        int size = elementData.length;
        add(value, (T[]) elementData.clone(),size+1);
    }
    private void add(T newValue,T[] arr,Integer size){
        elementData = Arrays.copyOf(arr, size);
        elementData[size-1] = newValue;
    }

    @Override
    public String toString(){
        if (elementData == null)
            return "null";

        int iMax = elementData.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            String s = elementData[i] != null ? String.valueOf(elementData[i]) : null;
            if (s!=null) b.append(s);
            if (i == iMax) {
                return b.append(']').toString();
            }
            if (hasIndex(i+1)) {
                b.append(", ");
            }

        }
    }


}
