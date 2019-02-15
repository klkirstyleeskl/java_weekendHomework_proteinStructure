import java.util.ArrayList;

public class AminoAcid {

    private NucleotideType nucleotide;
    private ArrayList<AminoAcid> aminoAcids;

    public AminoAcid(NucleotideType nucleotide){
        this.nucleotide = nucleotide;
    }

    public NucleotideType getNucleotide(){
        return this.nucleotide;
    }




}
