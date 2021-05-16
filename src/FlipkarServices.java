import java.util.List;

public interface FlipkarServices {
    public void add(String type,int rent,String slot);
    public List<Pair> find(String type);
    public void book(String type,String slot);
    public void cancel(String type,String slot);
}
