package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class PatternPrototype implements Cloneable{
   private int boec;
    private int patron;
    private int technika;

    public int getBoec() {
        return boec;
    }

    public void setBoec(int boec) {
        this.boec = boec;
    }

    public int getPatron() {
        return patron;
    }

    public void setPatron(int patron) {
        this.patron = patron;
    }

    public int getTechnika() {
        return technika;
    }

    public void setTechnika(int technika) {
        this.technika = technika;
    }

    public PatternPrototype(int boec, int patron, int technika) {
        this.boec = boec;
        this.patron = patron;
        this.technika = technika;
    }

    @Override
    protected PatternPrototype clone() throws CloneNotSupportedException {
        return (PatternPrototype)super.clone();
    }
}
