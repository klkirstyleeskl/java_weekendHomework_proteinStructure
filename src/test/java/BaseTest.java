import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BaseTest {
    Base baseA;
    Base baseC;
    Base baseG;
    Base baseU;


    @Before
    public void before(){
        baseA = new Base(BaseType.ADENINE);
        baseC = new Base(BaseType.CYTOSINE);
        baseG = new Base(BaseType.GUANINE);
        baseU = new Base(BaseType.URACIL);
    }

    @Test
    public void canGetBase(){
      assertEquals(BaseType.ADENINE, baseA.getBaseType());
    }


//
    @Test
    public void UracilHasValueU(){
        assertEquals("U", baseU.getValueFromEnum());
    }


}
