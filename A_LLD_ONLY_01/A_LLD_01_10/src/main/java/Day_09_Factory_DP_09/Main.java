package Day_09_Factory_DP_09;

public class Main {
    //Factory Method
    public static void main(String[] args) {

        // Choose Theme
        Theme theme = new DarkTheme(); // change to LightTheme()

        // Factory Method Call
        Button button = theme.createButton();

        // Use Object
        button.render();
    }
}