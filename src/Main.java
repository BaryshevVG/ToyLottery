public class Main {
    public static void main(String[] args) {
        ToyLottery lottery = new ToyLottery();
        lottery.addToy(new Toy(1, "Машинка", 5));
        lottery.addToy(new Toy(2, "Кукла", 3));
        lottery.addToy(new Toy(3, "Мяч", 2));
        lottery.addToy(new Toy(4, "Робот", 4));

        lottery.runLottery(10, "results.txt");
    }
}
