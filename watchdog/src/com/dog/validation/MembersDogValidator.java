package com.dog.validation;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.dog.dao.MembersDog;
/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class MembersDogValidator implements Validator of Spring MVC
 * validate username,password and email see below 
 * 
 * */
public class MembersDogValidator  implements Validator{
	

	public boolean supports(Class arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(MembersDog.class);
	}

	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		
		 MembersDog mDog = (MembersDog)obj;
		if (!StringUtils.hasLength(mDog.getUsername())) {
			errors.rejectValue("username", "required", "required");
		}
		
		if(!StringUtils.hasLength(mDog.getPassword()))
		{
			errors.rejectValue("password", "required", "required");
		}
		
		
		if(!StringUtils.hasLength(mDog.getEmail()))
		{
			errors.rejectValue("email", "required", "required");
		}
		else
		{
			  Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		      Matcher m = p.matcher(mDog.getEmail());
		     
		      //check  whether any match is found
		      boolean matchFound = m.matches();
		     
		      if (!matchFound)
		      {
		    	  errors.rejectValue("email", "required", "required");
		      }
		}
	}

}
