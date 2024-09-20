package com.model;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentEmployeeMap {

 	    public static void main(String[] args) {
 	        HashMap<String, List<String>> departmentMap = new HashMap<>();

 	        departmentMap.put("HR", List.of("Alice", "Bob"));
	        departmentMap.put("IT", List.of("Charlie", "David"));
	        departmentMap.put("Finance", List.of("Eve", "Frank"));

 	        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
	            String department = entry.getKey();
	            List<String> employees = entry.getValue();

	            System.out.println("Department: " + department);
	            for (String employee : employees) {
	                System.out.println("Employee: " + employee);
	            }
	            System.out.println();  
	        }
	    }
	}


