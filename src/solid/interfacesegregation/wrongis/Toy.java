package solid.interfacesegregation.wrongis;

// WRONG EXAMPLE because not every toy can fly, there might be a toy like airplane toy that can fly but ToyHouse cannot
public interface Toy {
    void setPrice(double price);
    void fly();
}
