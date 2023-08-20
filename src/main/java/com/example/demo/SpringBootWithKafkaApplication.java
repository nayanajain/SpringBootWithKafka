package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithKafkaApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithKafkaApplication.class, args);
	}
	
	 
//	 @KafkaListener(topics = "kafka-topic", groupId = "kafka-group")
//	    public void listen(Employee[] users) throws JsonProcessingException {
//		    
//		 System.out.println(users + "are listr of users" +users.length);
//		    List<Employee> validEmpdata = new ArrayList<Employee>();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
//         for(int j =0 ;j < users.length; j++)
//         {
//         	Employee user =  users[0];
//         for(int i=0; i<user.getTimesheetEntries().size();i++)
//         {
//         String day = LocalDate.parse(user.getTimesheetEntries().get(i).getDate(), formatter).getDayOfWeek().toString();
//         if(day ==  "Sunday" && user.getTimesheetEntries().get(i).getHoursWorked()!= 0)
//         {
//         	flag =true;
//                
//         }
//       
//         }
//         if(!flag)
//         validEmpdata.add(user);
//         }
//         System.out.print(validEmpdata + "valid employee");
//	       // System.out.println("Received User information : " + user.getEmployeeName().toString()+ " "+ user.getTimesheetEntries().toString());
//	    }


}
