package com.emirates.sharedcab.middleware.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.emirates.sharedcab.middleware.document.RouteInfo;
import com.emirates.sharedcab.middleware.repo.SharedCabRepo;

@EnableMongoRepositories(basePackageClasses = SharedCabRepo.class)
@Configuration
public class MongoDBConfig {
	

    @Bean
    CommandLineRunner commandLineRunner(SharedCabRepo sharedCabRepo) {
//    	MongoClientURI uri = new MongoClientURI(
//				"mongodb://admin:admin@cluster0-shard-00-00-cki4o.mongodb.net:27017,cluster0-shard-00-01-cki4o.mongodb.net:27017,cluster0-shard-00-02-cki4o.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin");
//		MongoClient mongoClient = new MongoClient(uri);
// 			MongoDatabase database = mongoClient.getDatabase("test");
        return strings -> {
       /* sharedCabRepo.save(new RouteInfo("2", "MAA AIRPORT", "T NAGAR", "INNOVA011", "Y", "PNR001", "ARAVIND",
    			"SEP2017", "SEP2017", "TUKANTI")); */
        
         
        	//sharedCabRepo.save(new RouteInfo(2, "Airport", "Chennai", "Toyota01", "Y", "20/11/2017","Siva"));
        };
    }
    
    
   

}
