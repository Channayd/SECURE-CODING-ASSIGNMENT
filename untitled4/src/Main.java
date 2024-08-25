//rufaro channayd musvuurwa
//secure coding assignment
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }

        // 1. Create a class Bank with fields accountType and accountBalance
        class Bank {
            private String accountType;
            private double accountBalance;

            // 4. Create a parameterized constructor that sets the accountType and the accountBalance
            public Bank(String accountType, double accountBalance) {
                this.accountType = accountType;
                this.accountBalance = accountBalance;
            }

            // 2. Create a method deposit that adds to the accountBalance and returns the value
            public double deposit(double amount) {
                accountBalance += amount;
                return accountBalance;
            }

            // 3. Create a method withdrawal that subtracts from the accountBalance and returns the value
            public double withdrawal(double amount) {
                accountBalance -= amount;
                return accountBalance;
            }

            // 5. Create a method display to print "The account type is (accountType) and the balance is (accountBalance)"
            public void display() {
                System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
            }
        }

        // 6. Create a class Insurance that inherits from the Bank class
        class Insurance extends Bank {
            // 7. Create a method cover that prints "You are covered"
            public void cover() {
                System.out.println("You are covered.");
            }

            // 4. Create a parameterized constructor that sets the accountType and the accountBalance
            public Insurance(String accountType, double accountBalance) {
                super(accountType, accountBalance);
            }
        }

        // 8. Create an instance of the Bank class. For the parameters use YOUR INITIALS as the accountType
        // and YOUR REG NUMBER (without the characters) as the accountBalance
        String accountType = "RCM";
        double accountBalance = 230768;

        Bank myAccount = new Bank(accountType, accountBalance);

        // 9. Invoke display method
        myAccount.display();
    }
}