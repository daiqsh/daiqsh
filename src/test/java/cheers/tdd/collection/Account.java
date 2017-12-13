package cheers.tdd.collection;

import java.util.LinkedList;
import java.util.List;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void add(int num) {
        balance = balance + num;
    }

    public void withdraw(int num) {
        balance = balance - num;
    }

    public static void main(String[] args) throws InterruptedException {
//        Account account = new Account(1000);
//        Thread a = new Thread(new AddThread(account, 20), "add");
//        Thread b = new Thread(new WithdrawThread(account, 20), "withdraw");
//        a.start();
//        b.start();
//        a.join();
//        b.join();
//        System.out.println(account.getBalance());

        //
        List link = new LinkedList();
        Thread a = new Thread(new AddThread(link, 1), "add");
        Thread b = new Thread(new WithdrawThread(link, 0), "withdraw");
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(link.size());
    }

    static class AddThread implements Runnable {
        List list;
        int  amount;

        public AddThread(List list, int amount) {
            this.list = list;
            this.amount = amount;
        }

        public void run() {
            for (int i = 0; i < 200000; i++) {
                list.add(amount);
            }
        }
    }

    static class WithdrawThread implements Runnable {
        List list;
        int     amount;

        public WithdrawThread(List account, int amount) {
            this.list = list;
            this.amount = amount;
        }

        public void run() {
            for (int i = 0; i < 100000; i++) {
                list.remove(amount);
            }
        }
    }
}
