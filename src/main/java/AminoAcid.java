import java.util.ArrayList;

public class AminoAcid {
    private ArrayList<Base> bases;
    private String baseType;

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


    public String getBaseType(Base base){
        String baseType = base.getValueFromEnum();
        return baseType;

    }

//    public String addBaseType(Base base){
//       return this.bases.add(baseType);
//    }







}
