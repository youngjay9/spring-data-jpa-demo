package com.jay;

import com.jay.dao.BankAccountDao;
import com.jay.dao.FixedDepositDao;
import com.jay.domain.BankAccountDetails;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
        SpringApplication.run(Application.class, args);

    BankAccountDao bankAccountDao = context.getBean(BankAccountDao.class);

    BankAccountDetails bankAccountDetails = new BankAccountDetails();
    bankAccountDetails.setBalanceAmount(1000);
    bankAccountDetails.setLastTransactionTimestamp(new Date());

    bankAccountDao.save(bankAccountDetails);

  }
}
