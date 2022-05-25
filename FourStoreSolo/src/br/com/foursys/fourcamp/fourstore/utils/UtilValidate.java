package br.com.foursys.fourcamp.fourstore.utils;

public class UtilValidate {

	public boolean validateCpfCNPJ(String cpfCNPJ) {
		return (!cpfCNPJ.matches("[0-9]{14}")) ? true : false;
	}
	public boolean validatePhone(String phone) {
		return (!phone.matches("[+]{1}[0-9]{2}[(]{1}[0-9]{2}[)]{1}[0-9]{5}-[0-9]{4}")) ? true : false;
	}
	public boolean validateEmail(String email) {
		return (!email.matches("(?:[a-z0-9]+(?:\\.[a-z0-9!#$%&'*+=?^_`{|}~-]+)*)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) ? true : false;
	}
	
}
