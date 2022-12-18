package solid.dependencyinversion.wrongdi;


/*
    WRONG EXAMPLE because everytime we add new menu, we have change food menu class, add variables, methods, etc
 */
public class FoodMenu {
    Pasta pasta;

    void addMenu(Pasta pasta) {}
}
