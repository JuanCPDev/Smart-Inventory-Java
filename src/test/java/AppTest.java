import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void productWasAddedWithCorrectParameters() {
        String name= "Pokeball";
        double price = 23;
    App.addProduct(name, price);
        Assertions.assertEquals("Pokeball", App.productList.get(0).getName());
    }
}