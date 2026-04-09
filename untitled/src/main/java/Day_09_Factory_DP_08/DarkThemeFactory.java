package Day_09_Factory_DP_08;

public class DarkThemeFactory implements ThemeComponentFactory {

    public Button createButton() {
        return new DarkButton();
    }

    public Menu createMenu() {
        return new DarkMenu();
    }

    public Dropdown createDropdown() {
        return new DarkDropdown();
    }
}