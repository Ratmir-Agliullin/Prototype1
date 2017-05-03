package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class Vzvod  {
private PatternPrototype patternPrototype;

    public Vzvod(PatternPrototype patternPrototype) {
        this.patternPrototype = patternPrototype;
    }
    public PatternPrototype pp() throws CloneNotSupportedException{
        return (PatternPrototype)this.patternPrototype.clone();
    }
    PatternPrototype pp1 = null;
    PatternPrototype prot = new Podrazdelenie(10,0,0);
    Vzvod vzvod = new Vzvod(prot);

}
