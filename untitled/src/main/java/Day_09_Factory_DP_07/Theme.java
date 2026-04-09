package Day_09_Factory_DP_07;
//Step 1. Create abstract Parent class Theme

//Step 4 :- Add Factory method in abstract Theme class

public abstract class Theme {
    private String name;
    private String primaryColour;

    private String authorName;

    //Factory of Factories
    protected abstract ThemeComponentFactory createComponentFactory();

}
