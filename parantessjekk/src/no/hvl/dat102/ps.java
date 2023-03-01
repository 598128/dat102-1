package no.hvl.dat102;

import java.util.Stack;

public class ps implements Parentessjekker {
    @Override
    public boolean erVenstreparentes(char p){
        if((p=='(')||(p=='{')||(p=='[')){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean erHogreparentes(char p){
        if((p==')')||(p=='}')||(p==']')){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean erParentes(char p){
        if(erHogreparentes(p)||erVenstreparentes(p)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean erPar(char venstre, char hogre){
        char[] parenteser = new char[]{'{','}','[',']','(',')','P'};
        int index = -1;
        for (int i = 0; i < parenteser.length; i += 2) {
            if(venstre == parenteser[i]){
                if(hogre == parenteser[i+1]){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    @Override
    public boolean erBalansert(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (erParentes(c)) {
                if (erVenstreparentes(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !erPar(stack.pop(), c)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] strings = {
                "[...(...)...]",
                "[...(...]...)",
                "(((())))",
                "(){}[]",
                "[()]{}",
                "([{}])",
                "(()])",
                "{[}]",
                "({[}])"
        };
        ps sjekker = new ps();
        for (String s : strings) {
            if (sjekker.erBalansert(s)) {
                System.out.println(s + " er gyldig.");
            } else {
                System.out.println(s + " er ugyldig.");
            }
        }
    }
}
