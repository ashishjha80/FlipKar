import java.util.ArrayList;
import java.util.List;




public class FlipkarServicesImpl implements FlipkarServices {
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    @Override
    public void add(String type, int rent, String slot) {
        // TODO Auto-generated method stub
        Vehicle vehicle = new Vehicle(type,rent,slot);
        vehicles.add(vehicle);
        //System.out.println(vehicle);
        
    }

    @Override
    public List<Pair> find(String type) {
        // TODO Auto-generated method stub
        
        List<Pair> allAvailable = new ArrayList<Pair>();
        for(Vehicle vehicle: vehicles){
            if(vehicle.getType().equals(type)){
                if(vehicle.getIsAvailable()){
                    allAvailable.add(new Pair(vehicle.getRent(),vehicle.getSlot()));
                }
            }
        }
        return allAvailable;
    }

    @Override
    public void book(String type, String slot) {
        // TODO Auto-generated method stub
        Vehicle toBeBooked = null;
        for(Vehicle vehicle: vehicles){
            if(vehicle.getType().equals(type) && vehicle.getSlot().equals(slot)){
                if(vehicle.getIsAvailable()){
                    
                    vehicle.setIsAvailable(false);
                    toBeBooked = vehicle;
                    break;
                }               
            }
        }
        if(toBeBooked == null){
            System.out.println("Already Booked");
        }else{
            System.out.println(type + " has been booked for " + slot);
        }
        
        
    }

    @Override
    public void cancel(String type, String slot) {
        // TODO Auto-generated method stub
        Vehicle toBeCancelled  = null;
        for(Vehicle vehicle : vehicles){
            if(vehicle.getType().equals(type) && vehicle.getSlot().equals(slot)){
                if(!vehicle.getIsAvailable()){
                    vehicle.setIsAvailable(true);
                    toBeCancelled = vehicle;
                    break;
                }
            }
        }
        if(toBeCancelled == null){
            System.out.println("Never was Booked");
            
        }else{
            System.out.println(type + " has been cancelled for " + slot);
        }
        
    }
    
}
