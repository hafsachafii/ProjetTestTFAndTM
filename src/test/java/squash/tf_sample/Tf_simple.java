/**
 *     This file is part of the Squashtest platform.
 *     Copyright (C) 2018 - 2019 Henix
 *
 *     See the NOTICE file distributed with this work for additional
 *     information regarding copyright ownership.
 *
 *     This is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     this software is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this software.  If not, see <http://www.gnu.org/licenses />.
 */
package squash.tf_sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class Tf_simple {
	private double member1;
	private double member2;
	
	@Given("first member is {double}")
	public void first_member_is(Double int1) {
		member1 = int1;
	}

	@Given("second member is {double}")
	public void second_member_is(Double int2) {
		member2 = int2;
	}

	@Then("sum should be {double}")
	public void sum_should_be(Double result) {
	    assertEquals(member1 +member2, result.doubleValue());
	}

	@And("give them {int}")
	public void giveThem(int arg0) {
	}
}
