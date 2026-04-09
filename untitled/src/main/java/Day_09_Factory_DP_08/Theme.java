package Day_09_Factory_DP_08;

public abstract class Theme {

    protected String themeName;

    public Theme(String themeName) {
        this.themeName = themeName;
    }

    // Factory Method → returns factory
    public abstract ThemeComponentFactory createComponentFactory();
}