package Day_09_Factory_DP_08;

public class DarkTheme extends Theme {

    public DarkTheme() {
        super("Dark");
    }

    @Override
    public ThemeComponentFactory createComponentFactory() {
        return new DarkThemeFactory();
    }
}