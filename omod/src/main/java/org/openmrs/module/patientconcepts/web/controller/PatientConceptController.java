package org.openmrs.module.patientconcepts.web.controller;

import org.openmrs.Concept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientConceptController {
	
	private final String VIEW = "/module/patientconcepts";
	
	@ModelAttribute
	public Concept getConcept(@RequestParam(required = false, value = "conceptId") Concept concept) {
		return concept;
		
	}
	
	@RequestMapping(value = VIEW + "/viewConcept", method = RequestMethod.GET)
	public void showForm() {
		
	}
}
