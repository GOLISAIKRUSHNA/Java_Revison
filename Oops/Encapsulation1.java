

class Encap { // data and member in single unit.hide the internal state to outside world
    private String name;
    private int y;


    public String getName() {  // security
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    

    void hii(){
        this.name="hii";
        y=32;
        System.out.println("Display");
        System.out.println(name);
        System.out.println(y);
    }

    
}
public class Encapsulation1 {
    
    public static void main(String[] args) {
        Encap e = new Encap();
        // e.hii();

        e.setName("Goli");
        e.setY(32);

        System.out.println(e.getName());
        System.out.println(e.getY());

        
    }
}
