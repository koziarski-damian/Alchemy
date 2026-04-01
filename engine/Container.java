import java.util.ArrayList;
import java.util.List;

public class Container {
    private String type; // e.g., "Beaker", "Flask"
    private List<String> contents = new ArrayList<>();

    public Container(String type) {
        this.type = type;
    }

    public void addSubstance(String name) {
        contents.add(name);
        System.out.println("Added " + name + " to the " + type);
    }

    public List<String> getContents() {
        return contents;
    }
}