
import java.util.ArrayList;
import java.util.List;

public class ReactionManager {
    // This is our 'Recipe Book'
    private List<Reaction> recipes;

    public ReactionManager() {
        this.recipes = new ArrayList<>();
        setupDefaultRecipes();
    }

    private void setupDefaultRecipes() {
        // You can add your notebook sketches here!
        recipes.add(new Reaction("Water", "Fire Salt", "Steam"));
        recipes.add(new Reaction("Mercury", "Sulfur", "Philosopher's Base"));
        recipes.add(new Reaction("Lead", "Strange Oil", "Gold?"));
    }

    /**
     * The core logic: Takes two ingredients and returns the result.
     */
    public String combine(String a, String b) {
        for (Reaction recipe : recipes) {
            if (recipe.matches(a, b)) {
                return "Success! You created: " + recipe.getResult();
            }
        }
        return "The mixture fizzles... Nothing happens.";
    }

    // Helper to add recipes from outside (like from a JSON file later)
    public void addRecipe(Reaction r) {
        recipes.add(r);
    }
}