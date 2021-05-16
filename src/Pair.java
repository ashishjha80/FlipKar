

public class Pair {
    private int rent;
    private String slot;
    public Pair(int rent, String slot){
        this.rent = rent;
        this.slot = slot;
    }
    public int getRent(){
        return this.rent;
    }
    public void setRent(int rent){
        this.rent = rent;
    }
    public String getSlot(){
        return this.slot;
    }
    public void setSlot(String slot){
        this.slot = slot;
    }
}
