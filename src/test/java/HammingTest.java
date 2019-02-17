import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingTest {
    Hamming hamming;
    String str1;
    String str2;

    public static void main (String[] args) {
    }


    @Test
    public void noChangesInString() {
        String str1 = "AGU";
        String str2 = "AGG";
        assertEquals(1, hamming.hammingDist(str1, str2));
    }



}
