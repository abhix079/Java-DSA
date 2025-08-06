public class GetterSetter {
    public static void main (String args[]){
        Pen p = new Pen();
        System.out.println(p.getColor());
        p.setColor("blue");
        System.out.println(p.getColor());
        System.out.println(p.getTip());
        p.setTip(7);
        System.out.println(p.getTip());        //this keyword is used to refer to the current object
                                               // get : to return the value
                                               // set :  to modify the value

    }
    
}

class Pen{
    private  String color = "Yellow";
    private  int tip = 5;
    void setColor(String newColor){
        this.color= newColor;

    }
     String getColor(){
        return this.color;

     }

     void setTip(int newTip){
        this.tip= newTip;

     }
     int getTip(){
        return this.tip;
     }
}
