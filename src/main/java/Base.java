

public class Base {
    private BaseType base;


    public Base(BaseType base){
        this.base = base;
    }

    public BaseType getBaseType(){
        return this.base;
    }

    public String getValueFromEnum(){
        return this.base.getValue();
    }







}
