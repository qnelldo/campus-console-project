
public class exam6Model {
    private int dan;

    public exam6Model(int dan) {
        this.dan = dan;
    }

    public int getDan() {
        return dan;
    }

    public int getResult(int multiplier) {
        return dan * multiplier;
    }
}