package Day_09_Factory_DP_08;
//Summary
// This is Abstract Factory
//👉 Abstract Factory = A factory that creates multiple related objects (family) using another factory
//Factory Method creates one object, Abstract Factory creates a family of related objects.
public class Main {
    //Abstract Factory

    public static void main(String[] args) {

        Theme theme = new DarkTheme(); // switch to LightTheme easily

        ThemeComponentFactory factory = theme.createComponentFactory();

        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Dropdown dropdown = factory.createDropdown();

        button.render();
        menu.display();
        dropdown.show();
    }
}