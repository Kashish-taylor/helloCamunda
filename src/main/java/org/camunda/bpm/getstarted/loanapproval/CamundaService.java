package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamundaService {

	@Autowired
	private RuntimeService runtimeService;

	public void getOutput(String processKey) {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);
	}

}
