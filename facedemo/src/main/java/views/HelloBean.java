package views;


import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named
@RequestScoped

public class HelloBean {
    private String userInput;

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getMessage()
    {
        return "Hello," + userInput;
    }

    public String onSubmit() {
        return null;
    }
}
