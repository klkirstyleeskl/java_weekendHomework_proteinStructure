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
    

    public String getBaseType(Base base){
        String baseType = base.getValueFromEnum();
        return baseType;
    }

    public ArrayList addBaseType(){
        String bannanas = bases.add(String baseType);
        reuturn bannanas;

    }







}
