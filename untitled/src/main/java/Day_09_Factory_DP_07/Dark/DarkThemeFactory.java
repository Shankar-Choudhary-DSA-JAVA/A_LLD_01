package Day_09_Factory_DP_07.Dark;

import Day_09_Factory_DP_07.Button;
import Day_09_Factory_DP_07.Menu;
import Day_09_Factory_DP_07.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
