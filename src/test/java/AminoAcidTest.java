import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AminoAcidTest {
    AminoAcid aminoAcid;
    Base base;

    @Before
    public void before(){
        aminoAcid = new AminoAcid();
    }

    @Test
    public void AminoAcidArrayStartsEmpty(){
      assertEquals(0, aminoAcid.checkLength());
    }

}
