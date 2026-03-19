public class Population {
    private int startSizePopulation = 0;
    private int endSizePopulation = 0;
    private int years = 0;

    public void setStartSizePopulation(int startSizePopulation) {
        this.startSizePopulation = startSizePopulation;

    }
    public void setEndSizePopulation(int endSizePopulation) {
        this.endSizePopulation = endSizePopulation;
    }
    public int getStartSizePopulation() {
        return  startSizePopulation;
    }
    public int getEndSizePopulation() {
        return endSizePopulation;
    }

    public void calculateYears(){
        while (startSizePopulation < endSizePopulation) {
            startSizePopulation = startSizePopulation + (startSizePopulation / 3) - (startSizePopulation / 4);
            years++;
        }
        System.out.println("Years: " + years);
    }
}
