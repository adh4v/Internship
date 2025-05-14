package com.test.Main;


import com.test.DB.MongoDb;
import com.test.Stream.Stream;
;

public class Main {
	
	public static void main(String[] args) {
		
		Stream stream = new Stream();
        stream.categoriseDateNWrite();
		
		
	}

}
