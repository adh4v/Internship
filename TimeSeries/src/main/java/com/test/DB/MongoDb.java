package com.test.DB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import com.test.Transaction.Transaction;

public class MongoDb {
	
	
	String uri = "mongodb://localhost:27017";
    String databaseName = "Transaction";
    String collectionName = "T";
    
    MongoClient mongoClient = MongoClients.create(uri);
    MongoDatabase database = mongoClient.getDatabase(databaseName);
    MongoCollection<Document> collection = database.getCollection(collectionName);
    
    List<Transaction> transaction = new ArrayList();
    
    public List<Transaction> getTransactions()
    {
    	
    	MongoCursor<Document> cursor = collection.find().iterator();
    try{
    	while(cursor.hasNext())
    	{
    		Document doc = cursor.next();
            int transactionId = doc.getInteger("transactionId");
            String timestamp = doc.getString("date");
            int amount = doc.getInteger("amount");
            String accountId = doc.getString("accountId");
            String bankId = doc.getString("bankId");

            transaction.add(new Transaction(transactionId, timestamp, amount, accountId, bankId));
    	}
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
    return transaction;
    }
    
}
