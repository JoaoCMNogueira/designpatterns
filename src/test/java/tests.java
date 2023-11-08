import com.JoaoCMNogueira.designpatterns.StringCaseChanger;
import com.JoaoCMNogueira.designpatterns.StringDrink;
import com.JoaoCMNogueira.designpatterns.StringInverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    @Test
    public void StringDrink(){
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }

    @Test
    public void StringInverter(){
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA",drink.getText());
    }

    @Test
    public void StringCaseChanger(){
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
