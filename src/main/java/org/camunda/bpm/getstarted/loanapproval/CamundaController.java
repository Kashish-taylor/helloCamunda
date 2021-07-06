package org.camunda.bpm.getstarted.loanapproval;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CamundaController {
	
	@Autowired
	CamundaService camundaService;
	@GetMapping("/{processKey}")
	public void print(@PathVariable String processKey) {
		System.out.println(processKey);
		camundaService.getOutput(processKey);
	}
}
