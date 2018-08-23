package com.star.sud.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.star.sud.dao.EmployeeDao;
import com.star.sud.emp.EmployeeRequest;
import com.star.sud.emp.EmployeeResponse;
import com.star.sud.emp.Message;

@Controller
/* @RequestMapping(value = "/employee") */
public class SpringRestfullWebServiceController {

	@RequestMapping(value = "/list-employees", method = RequestMethod.GET)
	public @ResponseBody List<EmployeeResponse> getListOfEmployees() {

		return new EmployeeDao().getEmployees();

	}

	@RequestMapping(value = "/save-emp", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody EmployeeResponse getExistingProducts(@RequestBody EmployeeRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request != null && request.getEmpName() != null) {

			// Business logic to capture data
			response.setMessage(new Message("Successfully don!!", Boolean.TRUE, "NA"));
			return response;
		} else {
			response.setMessage(new Message("Failed to perform!!", Boolean.FALSE, "ERROR01"));

		}

		return response;
	}

}
