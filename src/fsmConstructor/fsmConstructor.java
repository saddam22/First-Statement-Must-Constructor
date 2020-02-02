
package fsmConstructor;

public class fsmConstructor {
    
    int id;
    String name;
    
    fsmConstructor(int id, String name){
    
        id = id;
        name = name;
        this();//must be the first statement
    }
    void display(){
        System.out.println(id + " " + name);
    }
    
    public static void main(String[] args) {
        
        fsmConstructor s1 = new fsmConstructor(1, "Wan Sornolota IT");
        fsmConstructor s2 = new fsmConstructor(2, "Wan SSC Solve");
        
        s1.display();
        s2.display();
    }
}
