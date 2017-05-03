package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 03.05.2017.
 */
public class Podrazdelenie extends PatternPrototype{
    PatternPrototype patternPrototype = new PatternPrototype(5,0,0) ;
    List<PatternPrototype> list = new ArrayList<>();

    public Podrazdelenie(int boec, int patron, int technika) {
        super(boec, patron, technika);
    }
}
