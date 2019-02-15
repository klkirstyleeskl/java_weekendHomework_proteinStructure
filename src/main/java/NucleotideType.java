public enum NucleotideType {


    ADENINE("A"),
    CYTOSINE("C"),
    GUANINE("G"),
    THYMINE("T");

    private final String value;

    NucleotideType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }


}
