package com.emirates.sharedcab.middleware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.sharedcab.middleware.document.RouteInfo;
import com.emirates.sharedcab.middleware.repo.SharedCabRepo;

@RestController
@RequestMapping("/rest/sharedcab")
public class SharedCabsResource {

	 @Autowired
    private SharedCabRepo sharedCabRepo;  
	
	
	   
	//Fetch All Records 
    @GetMapping("/all")
    public List<RouteInfo> getAll() {
    	System.out.println("Hitting Get getAll method - Siva Tukanti");
        return sharedCabRepo.findAll();
    }
    
    //Fetch Based on ID
    @RequestMapping(value = "/{id}") 
    public RouteInfo read(@PathVariable String id) {
        return sharedCabRepo.findOne(id);
    }
    
 // update
 	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
 	public void update(@RequestBody RouteInfo routeInfo) {
 		sharedCabRepo.save(routeInfo);
 		sharedCabRepo.findByPnr(routeInfo.getPnr());
 	}
    
    
 @GetMapping("/allbypnr/{pnr}")
    public List<RouteInfo> getAllByPNR(@PathVariable String pnr) {
    	System.out.println("Hitting Get getAllByPNR method - Siva Tukanti");
        return sharedCabRepo.findByPnr(pnr);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody RouteInfo routeInfo) {
    	System.out.println("Hitting Get create method - Siva Tukanti");
    	sharedCabRepo.save(routeInfo);
    }
    
    
    @GetMapping("/routesbyto/{toCoordinates}")
    public List<RouteInfo> getAllRoutesByTO(@PathVariable String toCoordinates) {
    	System.out.println("Hitting Get routesbyto method - Siva Tukanti"+toCoordinates);
        return sharedCabRepo.findByToCoordinates(toCoordinates);
    }
    
    @GetMapping("/routesbyfrom/{fromCoordinates}")
    public List<RouteInfo> getAllRoutesByFrom(@PathVariable String fromCoordinates) {
    	System.out.println("Hitting Get routesbyfrom method - Siva Tukanti"+fromCoordinates);
        return sharedCabRepo.findByFromCoordinates(fromCoordinates);
    }
    
  
}
