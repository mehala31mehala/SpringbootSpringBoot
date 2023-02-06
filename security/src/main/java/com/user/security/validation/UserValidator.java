package com.user.security.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.security.advice.ObjectInvalidException;
import com.user.security.dto.SignUpDTO;
import com.user.security.entity.User;
import com.user.security.enumeration.RequestType;
import com.user.security.service.MessagePropertyService;
import com.user.security.service.UserService;
import com.user.security.util.PasswordUtil;
import com.user.security.util.ValidationUtil;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@AllArgsConstructor(onConstructor_ = { @Autowired })
public class UserValidator {

	@Autowired
	MessagePropertyService messageSource;

	private @NonNull UserService userService;

	List<String> errors = null;
	List<String> errorsObj = null;
	Optional<Subject> subject = null;

	/**
	 * method for product type validation Added by Ulaganathan
	 *
	 * @param httpHeader
	 * @return ValidationResult
	 * @throws Exception
	 */

	public ValidationResult validate(RequestType requestType, SignUpDTO request) {

		errors = new ArrayList<>();
		ValidationResult result = new ValidationResult();
		User user = null;

		if (requestType.equals(RequestType.POST)) {
			if (!ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("invalid.request.payload"));
			}
		} else {
			if (ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("invalid.request.payload"));
			}

			Optional<User> userOptional = Optional.empty();
			if (!userOptional.isPresent()) {
				throw new ObjectInvalidException(messageSource.getMessage("user.not.found"));
			}
			user = userOptional.get();
		}

		if (ValidationUtil.isNullOrEmpty(request.getUserName())) {
			throw new ObjectInvalidException("full.name.required");
		}
		if (ValidationUtil.isNullOrEmpty(request.getEmail())) {
			throw new ObjectInvalidException("AddressLine1 required");
		}
		if (ValidationUtil.isNullOrEmpty(request.getPassword())) {
			throw new ObjectInvalidException("Phone no required");
		}
		if (ValidationUtil.isNullOrEmpty(request.getPhoneNumber())) {
			throw new ObjectInvalidException("Whatsapp no required");

		} else {
			request.setEmail(ValidationUtil.getFormattedString(request.getEmail()));
			if (!ValidationUtil.isValidEmailId(request.getEmail())) {
				errors.add(messageSource.getMessage("user.email.invalid"));
			}
		}

		if (ValidationUtil.isNullOrEmpty(request.getUserName())) {
			errors.add(messageSource.getMessage("user.name.required"));
		}
		String encrptPassword = PasswordUtil.getEncryptedPassword(request.getPassword());
		if (errors.size() > 0) {
			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
			throw new ObjectInvalidException(errorMessage);
		}

		if (null == user) {
			user = User.builder().userName(request.getUserName()).email(request.getEmail()).password(encrptPassword)
					.phoneNumber(request.getPhoneNumber()).build();
		} else {
			user.setUserName(request.getUserName());
			user.setEmail(request.getEmail());
			user.setPassword(encrptPassword);
			user.setPhoneNumber(request.getPhoneNumber());
		}
		result.setObject(user);

		return result;

	}
}

