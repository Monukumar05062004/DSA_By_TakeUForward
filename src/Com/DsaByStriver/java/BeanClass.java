package Com.DsaByStriver.java;

public class BeanClass {
    private String name;
    private boolean empty;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public boolean isEmpty(){
        return empty;
    }
    public void setEmpty(boolean empty){
        this.empty=empty;
    }
}
