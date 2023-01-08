package Exercises2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(9, "Trang", 'm');
        System.out.println(customer1);
        Account account1 = new Account(2, customer1, 10);
        System.out.println(account1);
        Customer customer2 = new Customer(12, "Teck", 'm');
        Account account2 = new Account(3, customer2);
        System.out.println(account2);
        account1.setBalance(15);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("Customer name is: " +account1.getCustomerName());
        System.out.println("deposit is: " + account1.deposit(13));
        System.out.println("withdraw is: " + account1.withdraw(12));
    }
}
