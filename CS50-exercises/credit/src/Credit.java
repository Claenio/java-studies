public class Credit {
    long cardNumber = 4003600000000014L;
    long tempCard = cardNumber;
    int sumN;
    int sumMult;
    int position = 1;

    public void cardValidation(){
        while (tempCard > 0){
            int lastDigit = (int) (tempCard % 10);

            if (position % 2 == 1) {
                sumN += lastDigit;
            } else {
                int multiplied = lastDigit * 2;
                sumMult += (multiplied % 10) + (multiplied / 10);
            }
            tempCard /= 10;
            position++;

        }
        int totalSum = sumN + sumMult;
        if (totalSum % 10 == 0){
            System.out.println("Valid credit card");
        } else {
            System.out.println("Invalid credit card");
        }
    }
}
