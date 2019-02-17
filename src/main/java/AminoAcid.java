import java.util.ArrayList;

public class AminoAcid {
    private ArrayList<Base> bases;

    public AminoAcid(){
        bases = new ArrayList<>();
    }

    public int checkLength(){
        return this.bases.size();
    }

    public Base addBase(Base base){
        if(this.checkLength() < 3) {
            this.bases.add(base);
        }
        return base;
    }
//
//    public String getAminoAcidSeq(){
//        if(this.addBase() = BaseType.URACIL){
//            return "Phe";
//        }
//    }


}
