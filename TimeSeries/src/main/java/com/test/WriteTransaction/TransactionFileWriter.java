package com.test.WriteTransaction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.test.Transaction.Transaction;

public class TransactionFileWriter {

    // Method to write transactions to a text file
    public static void writeToFile(List<Transaction> transactions, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("Transactions for: " + fileName.replace("transactions_", "").replace(".txt", ""));
            writer.newLine();
            writer.newLine();  

            // Write each transaction in the list
            for (Transaction transaction : transactions) {
                writer.write(" Transaction ID: " + transaction.transactionId() +" "+"Amount: " + transaction.amount() +" "+"Account ID: " + transaction.accountId() +" "+"Bank ID: " + transaction.bankId());
                writer.newLine();
            }
        }
    }
}