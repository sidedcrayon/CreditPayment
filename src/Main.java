public class Main {
    public static void main (String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита: 1.000.000, срок кредита: 12 месяцев, годовой процент = 9.99 , ежемесячный платёж = ");

        System.out.println(service.calculate(9.99, 1_000_000, 12));


        System.out.println("Сумма кредита: 1.000.000, срок кредита: 24 месяцев, годовой процент = 9.99 , ежемесячный платёж = ");

        System.out.println(service.calculate(9.99, 1_000_000, 24));



        System.out.println("Сумма кредита: 1.000.000, срок кредита: 12 месяцев, годовой процент = 9.99 , ежемесячный платёж = ");

        System.out.println(service.calculate(9.99, 1_000_000, 36));
    }
}