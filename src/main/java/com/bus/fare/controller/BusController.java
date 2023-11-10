package com.bus.fare.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bus.fare.daoimpl.BusDaoimpl;
import com.bus.fare.entity.BusModel;

/*The @Validated annotation is a class-level annotation that we can use to
tell Spring to validate parameters that are passed into a method of the
annotated class.*/
@Validated
@RestController // it is equal to @ResponseBody + @Controller
@RequestMapping(value = "rest",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BusController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	BusModel model = new BusModel();
	
	@Autowired
	BusDaoimpl impl;

	@PostMapping("/creatd_e_new_charge")
	 public ResponseEntity<String> newCharges(@Valid @RequestBody BusModel create_chrj, BindingResult results)  {
		log.info("Rest Controller Class");
		
//		 List<BusModel> asList = Arrays.asList(create_chrj);
//		 asList.stream().filter(creat_chrj->creat_chrj != null).forEach(x->impl.SavebusData(x));
		 String saveWithId = impl.SavebusData(create_chrj);
		 return new ResponseEntity<String>("User Registered with "+saveWithId+" Successfully",HttpStatus.OK);
	}
	@GetMapping("/all")
	public List<BusModel> find()  {
		log.info("Bus controller find");
		return impl.findAll();
	}
	
	@GetMapping("/fare_details")
	public String fareDetails()
	{
		return "Fare Details";
	}
	
	//fare_details
	//fareDetails()
	
	
	@PutMapping
	public void updateFairCharges()
	{
		System.out.println("updated fair charges");
	}
	
	@PostMapping("file/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file,HttpServletRequest req) {
		try {
			String originalFilename = file.getOriginalFilename();
			String path = req.getServletContext().getRealPath("")+File.separator+originalFilename;
			saveUploadedFile(file.getInputStream(), path);
			return originalFilename;
		}catch(Exception e) {
			System.out.println("uploadFile"+e.getMessage());
		}
		return null;
	}
	
	@GetMapping("/find/{name}")
	public ResponseEntity<BusModel> findByName(@PathVariable String name)  {
		log.info("Bus Controll Class");
		return impl.getByName(name);

	}

	public void saveUploadedFile(InputStream inputSteam ,String pathname) {
		try {
			OutputStream file = new FileOutputStream(new File(pathname));
			int read = 0;
			byte[] bytes = new byte[1024];
			while((read = inputSteam.read()) != 1) {
				file.write(bytes, 0, read);
			}
			file.flush();
			file.close();
			
		}catch(Exception e) {
			System.out.println("saveUploadedFile"+e.getMessage());
		}
	}
	
}

