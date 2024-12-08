public class Alphabet {
    int position;
    World world;
    public Alphabet(int position, World world){
        this.position = position;
        this.world = world;
    }
    @Override
    public String toString() {
        return "Alphabet{" +
                "position=" + position +
                ", world=" + world.getWorld() +
                '}';
    }
    enum World{
        a("A"),
        b("B"),
        c("C"),
        d("D"),
        e("E"),
        f("F"),
        g("G"),
        h("H"),
        i("I"),
        j("J"),
        k("K"),
        l("L"),
        m("M"),
        n("N"),
        o("O"),
        p("P"),
        q("Q"),
        r("R"),
        s("S"),
        t("T"),
        u("U"),
        v("V"),
        w("W"),
        x("X"),
        y("Y"),
        z("Z");
        private String world;
        World(String world){
            this.world = world;
        }
        public String getWorld(){
            return world;
        }
    }
}

