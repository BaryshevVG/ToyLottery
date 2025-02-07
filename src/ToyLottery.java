import java.util.PriorityQueue;
import java.io.FileWriter;
import java.io.IOException;

public class ToyLottery {
    private PriorityQueue<Toy> queue;

    public ToyLottery() {
        queue = new PriorityQueue<>((t1, t2) -> t2.getWeight() - t1.getWeight());
    }

    public void addToy(Toy toy) {
        queue.add(toy);
    }

    public Toy getToy() {
        return queue.poll();
    }

    public void runLottery(int attempts, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < attempts; i++) {
                Toy toy = getToy();
                if (toy != null) {
                    writer.write(toy.toString() + "\n");
                }
            }
            System.out.println("Results saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
