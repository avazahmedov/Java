import java.util.PriorityQueue;
import java.util.Queue;

public class ToyList {
    PriorityQueue<Toy> toyList = new PriorityQueue<>();

    public void addToQue(Toy toy){
        toyList.add(toy);
    }

}
