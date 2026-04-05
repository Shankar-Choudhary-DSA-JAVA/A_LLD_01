package Day_09_Factory_DP_07.PrimaryLight;

import Day_09_Factory_DP_07.Button;
import Day_09_Factory_DP_07.Menu;
import Day_09_Factory_DP_07.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
