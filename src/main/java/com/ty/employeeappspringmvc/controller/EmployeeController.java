package com.ty.employeeappspringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.employeeappspringmvc.bean.Employee;
import com.ty.employeeappspringmvc.service.EmployeeDto;
import com.ty.employeeappspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@GetMapping("/home")
	public ModelAndView getHomePage(ModelAndView view)
	{
		view.setViewName("homepage");
		return view;
	}

	@GetMapping("/addemp")
	public ModelAndView getAddEmployeesPage(ModelAndView view)
	{
		view.setViewName("add-employee-form");
		return view;
	}

	@PostMapping("/employees")
	public String addEmp(Employee employee,Model model)
	{
		System.out.println(employee);
		EmployeeDto empdto=empservice.saveEmployee(employee);

		if(empdto!=null)
		{
			model.addAttribute("msg","Employee Added");
			return "display";
		}
		else
			return "redirect:/addemp";
	}

	@GetMapping("/viewall")
	public ModelAndView getViewAllPage(ModelAndView view,Model model)
	{
		List<EmployeeDto> allemps= empservice.getAllEmp();
		System.out.println(allemps);
		model.addAttribute("emp", allemps);
		view.setViewName("displayAllPage");
		return view;
	}

	@GetMapping("/searchPage")
	public ModelAndView getSearchPage(ModelAndView view)
	{
		view.setViewName("search-employee-page");
		return view;
	}

	@GetMapping("/search-emp")
	public ModelAndView searchEmployee(@RequestParam("id") int empid,Model model,ModelAndView view)
	{
		EmployeeDto searchedemp=empservice.searchEmp(empid);
		if(searchedemp!=null){
		model.addAttribute("msg", searchedemp);
		}
		else{
		model.addAttribute("msg","Employee not found for the given Emp_id" +empid);
		}
		view.setViewName("display");
		return view;	
	}

	@GetMapping("/edit/{empid}")
	public ModelAndView getEditPage(@PathVariable("empid") int empid,Model model,ModelAndView view)
	{
		EmployeeDto searchedemp=empservice.searchEmp(empid);
		if(searchedemp==null) {
		model.addAttribute("msg","Changes Cannot be done because employee record not found for the given Empid "+empid);
			view.setViewName("display");
		}
		else{
		model.addAttribute("emp", searchedemp);
			view.setViewName("edit-emp-form");	
		}
		return view;
	}

	@PostMapping("/update")
	public ModelAndView editEmployee(Employee employee,@RequestParam("id") int empid,ModelAndView view,Model model) {
		System.out.println(employee);
		EmployeeDto empdto= empservice.updateEmp(employee,empid);
		System.out.println(empdto);
		model.addAttribute("msg", empdto);
		view.setViewName("display");
		return view;

	}

	@GetMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam("id") int empid,Model model,ModelAndView view)
	{
		EmployeeDto empdto=empservice.deleteEmp(empid);
		if(empdto==null) {
			model.addAttribute("msg","Deleting the record cannot be done because employee record not found for the given Empid"+empid);	
		}else {
			model.addAttribute("msg", empdto);
		}
		view.setViewName("display");
		return view;
	}







}
