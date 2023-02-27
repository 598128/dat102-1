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

    @Override
    public boolean erBalansert(String s) {
        Stabel<Character> stabel = new TabellStabel<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (erParentes(c)) {
                if (erVenstreparentes(c)) {
                    stabel.leggInn(c);
                } else {
                    if (stabel.erTom() || !erPar(stabel.taUt(), c)) {
                        return false;
                    }
                }
            }
        }
        return stabel.erTom();
    }

}
