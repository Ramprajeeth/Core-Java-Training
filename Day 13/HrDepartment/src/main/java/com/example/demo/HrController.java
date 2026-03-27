package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrController {

	private boolean isLeaveAllowed = false;
	
	@GetMapping("/leave")
	public boolean getLeave() {
		return isLeaveAllowed;
	}
}
