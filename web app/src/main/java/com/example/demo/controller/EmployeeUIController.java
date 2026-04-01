package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ui/employees")
public class EmployeeUIController {

    private final EmployeeService employeeService;

    public EmployeeUIController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // List all employees
    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "employee-list";
    }

    // Show Add Form
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    // Save Employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/ui/employees";
    }

    // Show Raise Salary Form
    @GetMapping("/raise/{id}")
    public String showRaiseForm(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        return "raise-salary";
    }

    // Process Raise Salary
    @PostMapping("/raise")
    public String processRaise(@RequestParam int id, @RequestParam int percentage) {
        try {
            employeeService.raiseSalary(id, percentage);
        } catch (Exception e) {
            // Handle error (optional)
        }
        return "redirect:/ui/employees";
    }

    // Delete Employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        try {
            employeeService.deleteEmployee(id);
        } catch (Exception e) {
            // Handle error
        }
        return "redirect:/ui/employees";
    }
}
