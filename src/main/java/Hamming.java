
class Hamming

{

    static int hammingDist(String str1, String str2)
    {
        int i = 0, count = 0;
        while (i < str1.length())
        {
            if (str1.charAt(i) != str2.charAt(i))
                count++;
            i++;
        }
        return count;
    }

    // Driver code
    public static void main (String[] args)
    {
        String str1 = "AGC";
        String str2 = "GCU";

        // function call
        System.out.println(hammingDist (str1, str2));
    }
}