import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Конструктор", 2);
        Toy toy2 = new Toy(2, "Робот", 2);
        Toy toy3 = new Toy(3, "Кукла", 6);

        ToyList toyList = new ToyList();
        toyList.addToQue(toy1);
        toyList.addToQue(toy2);
        toyList.addToQue(toy3);

        Lottery lottery = new Lottery();
        Toy toy = lottery.win(toyList.toyList);
        System.out.println("Победитель: " + toy);

        LoginToFile loginToFile = new LoginToFile();
        try {
            loginToFile.writeToFile(toy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
