import java.util.Arrays;

public class ArrayList {
    private Integer[] elementData=new Integer[0];


    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(400);
        arrayList.add(300,2);

        System.out.println(arrayList.get(2));
        arrayList.remove(1);

        System.out.println(arrayList);
    }



    public void add(int value,int index){
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

    public Integer get(int index){
        checkIndex(index);
        return elementData[index];
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


    public void add(int value) {
        int size = elementData.length;
        add(value,elementData.clone(),size+1);

    }
    private void add(Integer newValue,Integer[] arr,Integer size){
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
