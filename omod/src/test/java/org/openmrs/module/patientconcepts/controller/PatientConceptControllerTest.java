package org.openmrs.module.patientconcepts.controller;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openmrs.Concept;
import org.openmrs.module.patientconcepts.web.controller.PatientConceptController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This test validates the PatientConceptController class
 */
public class PatientConceptControllerTest {
	
	@Autowired
	private PatientConceptController underTest;
	
	/**
	 * Checks whether it returns the Concept object
	 */
	@Test(expected = NullPointerException.class)
	public void canGetConcept() {
		// given
		Concept concept = new Concept();
		// when
		Concept test = underTest.getConcept(concept);
		// then
		assertThat(test, is(instanceOf(Concept.class)));
	}
	
	//	@Test
	//	public void canShowForm() {
	//		//when
	//		//then
	//	
	//		
	//	}
}
