package com.test.Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.test.DB.MongoDb;

import com.test.Transaction.*;
import com.test.WriteTransaction.TransactionFileWriter;

public class Stream {
	
	private MongoDb mongo;
	
	public Stream() {
        this.mongo = new MongoDb();  // Initialize MongoDb instance
    }
	
	public void categoriseDateNWrite()
	{
		Map<LocalDateTime, List<Transaction>> groupedByDate = mongo.getTransactions().stream().collect(Collectors.groupingBy(tx->tx.date(),TreeMap::new,Collectors.toList()));

		groupedByDate.forEach((date, transactionList) -> {
            // Generate a filename based on the date
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
			String fileName = "transactions_" + date.format(formatter) + ".txt";
            try 
            {
                // Write to the file with the generated filename
                TransactionFileWriter.writeToFile(transactionList, fileName);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        });
	}
	

}
