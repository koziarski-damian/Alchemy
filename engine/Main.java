public class Main {
    public static void main(String[] args) {
        ReactionManager table = new ReactionManager();

        System.out.println("--- Alchemy Table Initialized ---");

        // Test a valid reaction
        System.out.println("Mixing Water and Fire Salt...");
        System.out.println(table.combine("Water", "Fire Salt"));

        // Test a failed reaction
        System.out.println("\nMixing Water and Dirt...");
        System.out.println(table.combine("Water", "Dirt"));
    }
}