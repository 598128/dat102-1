package no.hvl.dat102;

public class ps implements Parentessjekker {

    public boolean erVenstreparentes(char p){
        if((p=='(')||(p=='{')||(p=='[')){
            return true;
        } else {
            return false;
        }
    }

    public boolean erHogreparentes(char p){
        if((p==')')||(p=='}')||(p==']')){
            return true;
        } else {
            return false;
        }
    }
    public boolean erParentes(char p){
        if(erHogreparentes(p)||erVenstreparentes(p)){
            return true;
        } else {
            return false;
        }
    }

    public boolean erPar(char venstre, char hogre){
        if(erVenstreparentes(venstre)&&erHogreparentes(hogre)){
            return true;
        } else {
            return false;
        }
    }

    public boolean erBalansert(String s){

    }
}
