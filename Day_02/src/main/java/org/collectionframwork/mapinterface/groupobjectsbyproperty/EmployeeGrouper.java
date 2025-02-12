package org.collectionframwork.mapinterface.groupobjectsbyproperty;
import java.util.*;

public class EmployeeGrouper {

    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        // Iterating through each employee
        for (Employee employee : employees) {
            groupedMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return groupedMap;
    }
}
