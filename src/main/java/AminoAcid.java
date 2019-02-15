import java.util.ArrayList;

public class AminoAcid {
    private ArrayList<Base> bases;

    public AminoAcid(){
        bases = new ArrayList<>();
    }

    public int checkLength(){
        return this.bases.size();
    }
}
