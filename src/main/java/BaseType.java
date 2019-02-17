public enum BaseType {


    ADENINE("A"),
    CYTOSINE("C"),
    GUANINE("G"),
    URACIL("U");

    private final String value;

    BaseType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }




}
