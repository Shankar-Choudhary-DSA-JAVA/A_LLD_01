package Day_09_Factory_DP_08;

public interface ThemeComponentFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();
}