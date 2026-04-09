package Day_09_Factory_DP_09;

// DarkTheme.java
public class DarkTheme extends Theme {

    public Button createButton() {
        return new DarkButton();
    }
}