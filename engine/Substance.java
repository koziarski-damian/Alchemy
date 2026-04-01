public abstract class Substance {
    private String name;
    private int color; // Using Hex or RGB
    private double density;

    public Substance(String name, int color, double density) {
        this.name = name;
        this.color = color;
        this.density = density;
    }

    // Getters and basic logic
    public String getName() { return name; }
}