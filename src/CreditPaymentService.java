public class CreditPaymentService {


    public static double calculate (double percent, int amount, int time) {
        double monthlyPercent = percent / (100 * 12);
        return amount * (monthlyPercent * Math.pow(1 + monthlyPercent, time))
                / ((Math.pow(1 + monthlyPercent , time) - 1));



    }


    }