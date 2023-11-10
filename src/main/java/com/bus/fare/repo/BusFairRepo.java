package com.bus.fare.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bus.fare.entity.BusModel;

/*Jdk 8 feature having below features for interface
 * 
 * static methods->1.8
 * default methods1.8
 * private methods->1.9
 *    
 */
/*In java main interface is a protocal to provide 
 * specification/impementation for every seperate classes
 * 
 */
@Repository
public interface BusFairRepo extends JpaRepository<BusModel,Integer>{
	@Query(value = "select * from bus_model where stu_name like :name%",nativeQuery = true)
	 Optional<BusModel> getByName(String name);
}
