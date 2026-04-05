package Day_09_Factory_DP_08;

public class LightThemeFactory implements ThemeComponentFactory {

    public Button createButton() {
        return new LightButton();
    }

    public Menu createMenu() {
        return new LightMenu();
    }

    public Dropdown createDropdown() {
        return new LightDropdown();
    }
}