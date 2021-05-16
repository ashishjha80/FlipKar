import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        FlipkarServices flipkarServices  = new FlipkarServicesImpl();
        while(true){
            String input = br.readLine();
            if(input.equals("Exit")){
                break;
            }
            String[] inputarr = input.split(" ");
            switch(inputarr[0]){
                case "ADD" : {
                    flipkarServices.add(inputarr[1],Integer.parseInt(inputarr[2]),inputarr[3]);
                } break;

                case "FIND" : {
                    List<Pair> available = flipkarServices.find(inputarr[1]);
                    for(Pair aval: available){
                        System.out.println(inputarr[1] + " "  + aval.getRent() + " " + aval.getSlot());
                    }
                } break;

                case "BOOK" : {
                    flipkarServices.book(inputarr[1], inputarr[2]);
                } break;

                case "CANCEL" : {
                    flipkarServices.cancel(inputarr[1],inputarr[2]);
                } break;
            }
            
        }
    }
}
