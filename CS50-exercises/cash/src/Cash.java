public class Cash {
    private int[] coins = {25, 10, 5, 1};
    private int cash;


    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash){
        if (cash <= 0){
            System.out.println("Invalid value");
        } else {
            this.cash = cash;
        }
    }

    public void count() {
        int counter = 0;
        for (int coin : coins) {
            int coinCount = 0;
            while (cash >= coin) {
                cash -= coin;
                counter++;
                coinCount++;
            }
            if(coinCount > 0){
                System.out.println("Used " + coinCount + " $0." + coin + " coin");
            }
        }
        System.out.println("Used " + counter + " coins");
    }
}
