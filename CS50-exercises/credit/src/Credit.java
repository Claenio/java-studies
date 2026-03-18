public class Credit {
private long cardNumber;
private long tempCard;
private int sumN;
private int sumMult;
private int position = 1;
private int count = 0;

public void setCardNumber(long cardNumber){
    this.cardNumber = cardNumber;
}

public void cardValidation(){
    this.tempCard = this.cardNumber;
    this.sumN = 0;
    this.sumMult = 0;
    this.position = 1;
    this.count = 0;
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
        count++;

    }
    int totalSum = sumN + sumMult;

    if (totalSum % 10 == 0){
        long firstDigits = cardNumber;

        while (firstDigits >= 100) {
            firstDigits /= 10;
        }
        long firstDigit = firstDigits / 10;

        if (count == 15 && (firstDigits == 34 || firstDigits == 37)){
            System.out.println("AMEX");
        } else if (count == 16 && (firstDigits >= 51 && firstDigits <= 55)){
            System.out.println("MASTERCARD");
        } else if (firstDigit == 4 && (count == 13 || count == 16)){
            System.out.println("VISA");
        } else {
            System.out.println("Invalid!");
        }



    } else {
        System.out.println("Invalid credit card");
    }
}
}