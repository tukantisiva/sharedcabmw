package com.emirates.sharedcab.middleware.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.emirates.sharedcab.middleware.document.RouteInfo;

public interface SharedCabRepo extends MongoRepository<RouteInfo, String> {

	
List<RouteInfo> findByPnr(@Param("pnr") String pnr);
List<RouteInfo> findByFrom(@Param("from") String from);
List<RouteInfo> findByTo(@Param("to") String to);
List<RouteInfo> findByToCoordinates(@Param("toCoordinates") String toCoordinates);
List<RouteInfo> findByFromCoordinates(@Param("fromCoordinates") String fromCoordinates);

} 
