package org.lessons.java;

public class Gift {
    // Attributi
    private String description;
    private String recipient;

    // Costruttore
    public Gift(String description, String recipient) {
        this.description = description;
        this.recipient = recipient;
    }

    //Getter e Setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
