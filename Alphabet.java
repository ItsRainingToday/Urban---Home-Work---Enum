public class Alphabet {
    Word word;
    public Alphabet(Word world){
        this.word = word;
    }
    @Override
    public String toString() {
        return "Alphabet{" +
                "position=" + (word.ordinal()+1)+
                ", world=" + word.getWord() +
                '}';
    }
    enum Word {
        A("A"),
        B("B"),
        C("C"),
        D("D"),
        E("E"),
        F("F"),
        G("G"),
        H("H"),
        I("I"),
        J("J"),
        K("K"),
        L("L"),
        M("M"),
        N("N"),
        O("O"),
        P("P"),
        Q("Q"),
        R("R"),
        S("S"),
        T("T"),
        U("U"),
        V("V"),
        W("W"),
        X("X"),
        Y("Y"),
        Z("Z");
        private String word;
        Word(String word){
            this.word = word;
        }
        public String getWord(){
            return word;
        }
    }
}
