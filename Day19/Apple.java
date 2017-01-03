public class Apple{
    private Integer weight;
    private String colour;

    // Initilization of veriables
    {
     weight = 160;
     colour = "red";
    }

    public Apple (Integer weight){
        setWeight(weight);
    }
    public Apple (String  colour){
         setColour(colour);       
    }
    public Apple (Integer weight, String  colour){
        setWeight(weight);
        setColour(colour);
    }
    public Apple (){
       // this(150,"red");   
    }
    
    public Integer getWeight(){
        return this.weight;
    }
    public String getColour(){
        return this.colour;
    }
    private void setColour(String colour){
        this.colour = colour;
    }
    private void setWeight(Integer weight){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "colour : " + getColour() + " weight : " + getWeight();
    }

}