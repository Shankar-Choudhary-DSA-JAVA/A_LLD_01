package Day_09_Factory_DP_07;

import Day_09_Factory_DP_07.PrimaryLight.PrimaryTheme;

// Abstract factory implementations
public class MainClient {

    public static void main(String[] args) {
        Theme primaryTheme = new PrimaryTheme();

        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();

        Button button = componentFactory.createButton();
        Menu menu= componentFactory.createMenu();

    }
}
