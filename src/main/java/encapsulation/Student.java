package encapsulation;

public class Student {
    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
