import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {

    @Test
    public void methodToSeeIfWithdrawReduceBalanceAmount(){
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setBalance(100);
        long expectedResult = accountDetails.getBalance();
        Assert.assertEquals(120, accountDetails.getBalance());


    }
}
