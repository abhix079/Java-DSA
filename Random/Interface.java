/*
 *     INTERFACE:..........
 *           interface is a blueprint of a class
 *          defined with interface keyword
 *         we use " implements" instead of extend to inherit 
 * 
 *        all methods are public ,abstract
 *       variable in the interface are final, public and static 
 * 
 *    used to implement multiple inheritance
 *    used to achieve total abstraction
 */

 /*    Interface are used to implement multiple inheritance
  *     
     interface Carnivore{

     }

     interface Herbivore{
     
     }

     class Animal implements Herbivore,Carnivore{
     
     }

  */

public class Interface {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();

    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){  //we have to recreate the function with implementation
        // we also use public keyword , if we not write public it become the default type
        System.out.println("up,down,left,right, and diagonal in all direction");

    }
}
class Rook implements ChessPlayer{
    public void moves(){  
        System.out.println("up,down,left,right");

    }
}
class King implements ChessPlayer{
    public void moves(){  
        System.out.println("up,down,left,right");

    }
}


