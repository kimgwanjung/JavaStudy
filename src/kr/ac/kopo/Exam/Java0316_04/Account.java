package kr.ac.kopo.Exam.Java0316_04;

import java.util.Objects;

public class Account {
    String accountNumber;
    int balance;
    
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        return accountNumber.trim().equals(other.accountNumber.trim());
    }
    @Override
    public String toString() {
        return balance + "원" + " (계좌번호 = " + accountNumber + "))";
    }
}
