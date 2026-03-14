public class Cash {
    private int m25 = 25;
    private int m10 = 10;
    private int m05 = 5;
    private int m01 = 1;
    private int cash;
    private int counter;


    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash){
        this.cash = cash;
        if (cash <= 0){
            System.out.println("Invalid value");
        }
    }

    public void count(){
        while (cash >= m25){
            cash -= m25;
            counter++;
        } while (cash >= m10) {
            cash -= m10;
            counter++;
        } while (cash >= m05){
            cash -= m05;
            counter++;
        } while (cash >= m01){
            cash -= m01;
            counter++;
        }
        System.out.println("Cash: " + cash);
        System.out.println("Counter: " + counter);
    }
}
