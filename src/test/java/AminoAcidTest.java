import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AminoAcidTest {
    AminoAcid aminoAcid;
    Base baseA;
    Base baseC;
    Base baseG;
    Base baseU;

    @Before
    public void before(){
        aminoAcid = new AminoAcid();
        baseA = new Base(BaseType.ADENINE);
        baseC = new Base(BaseType.CYTOSINE);
        baseG = new Base(BaseType.GUANINE);
        baseU = new Base(BaseType.URACIL);
    }

    @Test
    public void AminoAcidArrayStartsEmpty(){
      assertEquals(0, aminoAcid.checkLength());
    }

    @Test
    public void canAddBase(){
        aminoAcid.addBase(baseA);
        assertEquals(1, aminoAcid.checkLength());
    }

    @Test
    public void cannotAddMoreThanThreeBases(){
        aminoAcid.addBase(baseA);
        aminoAcid.addBase(baseU);
        aminoAcid.addBase(baseG);
        aminoAcid.addBase(baseG);
        assertEquals(3, aminoAcid.checkLength());

    }


}
