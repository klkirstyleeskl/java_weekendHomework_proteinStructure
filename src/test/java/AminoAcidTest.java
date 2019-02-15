import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AminoAcidTest {
    AminoAcid aminoAcid;

    @Before
    public void before(){
        aminoAcid = new AminoAcid(NucleotideType.ADENINE);
    }

    @Test
    public void canGetNucleotide(){
      assertEquals(NucleotideType.ADENINE, aminoAcid.getNucleotide());
    }

    

}
