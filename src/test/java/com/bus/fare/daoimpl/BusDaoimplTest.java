package com.bus.fare.daoimpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.ResponseEntity;

import com.bus.fare.entity.BusModel;
import com.bus.fare.entity.ModelStudent;
import com.bus.fare.repo.BusFairRepo;

/*  @Mock creates a mock, and @InjectMocks creates an instance 
 *  of the class and injects the mocks that are created with the
 *  @Mock annotations into this instance
 *  */

@ExtendWith(MockitoExtension.class)// This is junit5 feature 
@MockitoSettings(strictness = Strictness.LENIENT) // This is used to reduce unused stub-exception
public class BusDaoimplTest {
	@InjectMocks
	private BusDaoimpl bml;
	
	@Mock // This is used to inject the instance to mock @Annatation:
	private BusFairRepo repo;
	BusModel bus_data;
	ModelStudent stu_data;
	List<BusModel> find_all;
	
	@BeforeEach//It will create object for every @Test method annotation 
    public void setUp() {
    bus_data = new BusModel();
    
    bus_data.setId(10);
    bus_data.setAmount(100);
    bus_data.setDistance(5);
    
    stu_data = new ModelStudent();
    stu_data.setStudentId(100);
    stu_data.setStudentName("Alex");
    bus_data.setMsd(stu_data);
    find_all = new ArrayList();
    find_all.add(bus_data);
    }
	
	@AfterEach//It will set null after every each @Test method
	public void destroy() {
		bus_data = null;
		stu_data = null;
		find_all = null;
	}
	
	@Test
	public void getByName() {
		when(repo.getByName("Ashok")).thenReturn(Optional.of(bus_data)); 
		ResponseEntity<BusModel> byName = bml.getByName("Ashok");
		assertEquals(byName.getBody().getMsd().getStudentId(), bus_data.getMsd().getStudentId());
		assertEquals(byName.getBody().getMsd().getStudentName(), bus_data.getMsd().getStudentName());
		assertEquals(byName.getBody().getAmount(), bus_data.getAmount());
		assertEquals(byName.getBody().getDistance(), bus_data.getDistance());
		assertEquals(byName.getBody().getId(), bus_data.getId());
	}
	
	@Test
	public void findAll() {
		when(repo.findAll()).thenReturn(find_all);
		assertEquals(bml.findAll(), find_all);
	}
	
	@Test
	public void save() {
		when(repo.save(bus_data)).thenReturn(bus_data);
		String savebusData = bml.SavebusData(bus_data);
		Class<BusModel> forName;
		try {
			forName = (Class<BusModel>) Class.forName(savebusData);
			assertEquals(forName, bus_data);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
