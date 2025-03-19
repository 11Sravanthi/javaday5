public class Diceroll {
    public void rollDice() {
        int rollDice = (int)(Math.random() * 6) + 1;
        System.out.println("dice rolled: " + rollDice);
    }

    public static void main(String[] args) {
        Diceroll dr = new Diceroll();
        dr.rollDice();
        dr.rollDice();
    }
}
