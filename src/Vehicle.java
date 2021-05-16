public class Vehicle {
    private String type;
    private String slot;
    private Boolean isAvailable;
    private int rent;

    public Vehicle(String type,int rent,String slot){
        this.type = type;
        this.rent = rent;
        this.slot = slot;
        this.isAvailable = true;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getSlot(){
        return this.slot;
    }

    public void setSlot(String slot){
        this.slot = slot;
    }

    public Boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public int getRent(){
        return this.rent;
    }
    
    public void setRent(int rent){
        this.rent = rent;
    }
}
