package com.example.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
//import com.example.demo.model.EmployeeRepo;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class ConsumerService {
	boolean flag = false;
	
   
	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;
	List<Employee> validEmpdata = new ArrayList<Employee>();
	 HashMap<String, Boolean> hashMap = new HashMap<>();
	@KafkaListener(topics = "kafka-topic", groupId = "kafka-group")
	public void listen(List<Employee> users) throws JsonProcessingException {

		// System.out.println(users + "are list of users");
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		for (int j = 0; j < users.toArray().length; j++) {
			Employee user = users.get(j);
			for (int i = 0; i < user.getTimesheetEntries().size(); i++) {
				String day = LocalDate.parse(user.getTimesheetEntries().get(i).getDate(), formatter).getDayOfWeek()
						.toString();
				if (day.equalsIgnoreCase("Sunday") && user.getTimesheetEntries().get(i).getHoursWorked() != 0) {
					flag = true;
					continue;
				}
				else if(!day.equalsIgnoreCase("Sunday") && (user.getTimesheetEntries().get(i).getHoursWorked() >= 9 || user.getTimesheetEntries().get(i).getHoursWorked() < 0) ) {
					flag = true;
					continue;
				}

			}
			
			hashMap.put(user.getEmployeeName(), !flag);
			if (!flag) {
				
				validEmpdata.add(user);
				flag=false;
				
				
			}
			
			
		}
		System.out.println(validEmpdata + "valid employee");
		
		hashMap.forEach((key, value) -> System.out.println(key + " " + value));
	}

}
