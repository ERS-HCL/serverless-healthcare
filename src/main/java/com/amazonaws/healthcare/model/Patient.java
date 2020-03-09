/**
 * 
 */
package com.amazonaws.healthcare.model;

import java.util.Base64;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;

/**
 * @author yashvant
 *
 */
@Data
@Builder
public class Patient {

	public String getId() {
		if (email != null) {
			return Base64.getEncoder().encodeToString(email.getBytes());
		}
		return null;
	}

	/*public String getProviderId() {
		if (providerEmail != null) {
			return Base64.getEncoder().encodeToString(providerEmail.getBytes());
		}
		return null;
	}
*/
	@NotEmpty
	String providerId;
	
	@NotEmpty
	String firstname;
	@NotEmpty
	String lastname;
	@Email
	@NotEmpty
	String email;
	/*@Email
	@NotEmpty
	String providerEmail;*/
	@NotEmpty
	String mobileNumber;
	@NotEmpty
	String address;
	@NotEmpty
	Date dateOfBirth;

}
