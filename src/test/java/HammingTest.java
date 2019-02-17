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
        String str2 = "AGU";
        assertEquals(0, hamming.hammingDist(str1, str2));
    }

    @Test
    public void oneChangeInString(){
        String str1 = "AGG";
        String str2 = "AGU";
        assertEquals(1, hamming.hammingDist(str1, str2));
    }

    @Test
    public void moreThanOneChangeInString(){
        String str1 = "ACA";
        String str2 = "AGU";
        assertEquals(2, hamming.hammingDist(str1, str2));
    }
    



}
