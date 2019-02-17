import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AminoAcidTest {
    AminoAcid aminoAcid1;
    AminoAcid aminoAcid2;
    Base baseA;
    Base baseC;
    Base baseG;
    Base baseU;

    @Before
    public void before(){
        aminoAcid1 = new AminoAcid();
        aminoAcid2 = new AminoAcid();
        baseA = new Base(BaseType.ADENINE);
        baseC = new Base(BaseType.CYTOSINE);
        baseG = new Base(BaseType.GUANINE);
        baseU = new Base(BaseType.URACIL);
    }

    @Test
    public void AminoAcidArrayStartsEmpty(){
      assertEquals(0, aminoAcid1.checkLength());
    }

    @Test
    public void canAddBase(){
        aminoAcid1.addBase(baseA);
        assertEquals(1, aminoAcid1.checkLength());
    }


    @Test
    public void canGetBaseType(){
        assertEquals("U", aminoAcid2.getBaseType(baseU));
    }

    @Test
    public void canAddBaseType(){
        aminoAcid2.addBaseType(baseA);
        assertEquals(1, aminoAcid2.checkLength());
    }


    @Test
    public void cannotAddMoreThanThreeBases(){
        aminoAcid1.addBase(baseA);
        aminoAcid1.addBase(baseU);
        aminoAcid1.addBase(baseG);
        aminoAcid1.addBase(baseG);
        assertEquals(3, aminoAcid1.checkLength());

    }

    @Test
    public void canChangeArrayTostring(){
        aminoAcid1.addBase(baseA).toString();
        aminoAcid1.addBase(baseU).toString();
        aminoAcid1.addBase(baseG).toString();
        assertEquals("AUG", aminoAcid1.toString());
    }


}
