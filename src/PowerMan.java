import java.util.List;
import java.util.Map;

public class PowerMan extends Human{
    private String name;
    private String preName;
    private int age;
    private boolean Jok;
    private int sizeOfJok;

    public PowerMan(int weight, int heigh, String name, String preName, int age, boolean jok) {
        super(weight, heigh);
        this.name = name;
        this.preName = preName;
        this.age = age;
        Jok = jok;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isJok() {
        return Jok;
    }

    public void setJok(boolean jok) {
        Jok = jok;
    }

    public int getSizeOfJok() {
        return sizeOfJok;
    }

    public void setSizeOfJok(int sizeOfJok) {
        this.sizeOfJok = sizeOfJok;
    }

    @Override
    public String toString() {
        return  "Превеликого депутата звати " + name +
                " " + preName +
                ", йому " + age + " лочків " +
                ", штам хабарника - " + Jok +
                ". За увесь час було взято " + sizeOfJok +
                " гривень хабару.\n";
    }
}
