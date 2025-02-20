package lessons;

public class ScanExcep extends Exception {
    private String description;

    // Constructor to initialize the exception with a description
    public ScanExcep(String description) {
        super(description);  // Call the parent constructor to set the message
        this.description = description;
    }

    // Getter for the description
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ScanExcep: " + description;
    }
}
