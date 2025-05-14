
package com.test.Transaction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record Transaction(int transactionId, LocalDateTime date, int amount, String accountId, String bankId) {
	
	// Non-canonical constructor
	public Transaction(int transactionId, String timestamp, int amount, String accountId, String bankId) {
       
		 this(transactionId, LocalDateTime.parse(timestamp,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), amount, accountId, bankId);

    }
}
