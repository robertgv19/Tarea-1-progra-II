package edu.usmp.demo.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import edu.usmp.demo.domain.*;
import java.util.ArrayList;
import java.util.List;
import edu.usmp.demo.domain.Employee;

@RestController
public class HelloController{

    @RequestMapping("/")
    public String index(){
        return "Saludos CPP";
    }

    @RequestMapping("/employees")
    public List<Employee> employees(){
     List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Robert","Gutierrez"));
         return employees;
    }


}
