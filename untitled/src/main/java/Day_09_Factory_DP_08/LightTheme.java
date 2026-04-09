package Day_09_Factory_DP_08;

public class LightTheme extends Theme {

    public LightTheme() {
        super("Light");
    }

    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new LightThemeFactory();
    }
}