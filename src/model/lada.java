package model;

public class lada {
    private String anyag, felirat;
    private boolean kincs;

    public lada(String anyag, String felirat) {
        this(anyag,felirat,false);
    }

    
    public lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }
    
    
}
