import java.io.Serializable;

public class Singleton  implements Serializable {
    private static final long serialVersionUID = 1L;

    private static volatile Singleton INSTANCE=null;

    @SuppressWarnings("unused")
    private Singleton readResolve() {
        return INSTANCE;
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (INSTANCE == null) INSTANCE=new Singleton();
        }
        return INSTANCE;
    }
    private String fio;
    private Integer age;

    private Singleton(){
        if (INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }




    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cannot clone instance of this class");
    }

    @Override
    public String toString(){
        return this.age + this.fio;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Singleton singleton=Singleton.getInstance();
            singleton.setAge(9);

            System.out.println(singleton);
            singleton.setAge(10);
            singleton.setFio("Bla");
            System.out.println(singleton);
        }

    }


}
