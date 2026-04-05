package Day_09_Factory_DP_09;

// LightTheme.java
public class LightTheme extends Theme {

    public Button createButton() {
        return new LightButton();
    }
}