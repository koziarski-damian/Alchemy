

public class Reaction {
    private String ingredientA;
    private String ingredientB;
    private String result;

    public Reaction(String a, String b, String res) {
        this.ingredientA = a;
        this.ingredientB = b;
        this.result = res;
    }
    public String getResult() {
        return result;
    }
    public boolean matches(String a, String b) {
        return (ingredientA.equals(a) && ingredientB.equals(b)) ||
                (ingredientA.equals(b) && ingredientB.equals(a));
    }
}