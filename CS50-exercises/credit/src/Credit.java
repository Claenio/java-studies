public class Credit {
    long cardNumber = 4222222222222L;
    long tempCard = cardNumber;
    int sumN;
    int sumMult;
    int position = 1;
    int count = 0;

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
            long newCardValidation = cardNumber;
            long firstDigits = cardNumber;
            while (newCardValidation > 0){
                newCardValidation /= 10;
                count++;
            }
            while (firstDigits < 100){
                firstDigits /= 10;
            }
            long firstOneDigit =  firstDigits / 10;

            if ()


        } else {
            System.out.println("Invalid credit card");
        }
    }
}
