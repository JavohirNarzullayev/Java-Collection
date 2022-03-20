public class HashMap {


    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(1,"Salyut");
    }

    private void put(int key, String value) {
        putVal(hash(key), key, value, false, true);
    }

    private void putVal(int hash, int key, String value, boolean ifAbsent, boolean evict) {

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
