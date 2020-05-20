package com.practicetest.qiniuyun;

import java.util.concurrent.locks.Lock;

public class BankAccount {
	private long balance;

	public BankAccount(long balance) {
		this.balance = balance;
	}

	static void transferFrom(BankAccount source, BankAccount dest, long amount) {
		synchronized (BankAccount.class) {
			source.balance -= amount;
			dest.balance += amount;
		}
	}

	static void transferFrom1(BankAccount source, BankAccount dest, long amount) {
		
//		synchronized ( source) {
//			while
//			synchronized (dest) {
//				source.balance -= amount;
//				dest.balance += amount;
//				
//			}
//			
//			
//		}
	}

	public synchronized long balance() {
		return balance;
	}
}
