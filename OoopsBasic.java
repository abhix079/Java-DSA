public class OoopsBasic {
    public static void main(String args[]){
        Pen p1 = new Pen();  // Here we have created the object of pen 
        System.out.println(p1.color);
        p1.setColor("Blue");
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.setTip(8);
        System.out.println(p1.tip);
    }
    
}
class Pen{
    String color= "Red";
    int tip= 5;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

