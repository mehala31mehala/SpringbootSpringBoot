package com.user.security.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.security.dto.SignUpDTO;
import com.user.security.entity.User;
import com.user.security.enumeration.RequestType;
import com.user.security.repository.UserRepository;
import com.user.security.response.ResponseGenerator;
import com.user.security.response.TransactionContext;
import com.user.security.service.MessagePropertyService;
import com.user.security.service.UserService;
import com.user.security.validation.UserValidator;
import com.user.security.validation.ValidationResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Response;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor_ = { @Autowired })
@RequestMapping("/api/user")
@Api(value = "User Rest API's", produces = "application/json", consumes = "application/json")
@RestController

public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	private @NonNull ResponseGenerator responseGenerator; 
	
	private @NonNull MessagePropertyService messagePropertySource;
	
	private @NonNull UserValidator userValidator;
	
	private @NonNull  MessageSource messageSource;
	
	private @NonNull UserService userService;
	
	private @NonNull UserRepository userRepository;
	
	
	

	@ApiOperation(value = "Allows to create new user.", response = Response.class)
	@PostMapping(value = "/create", produces = "application/json")
	public ResponseEntity<?> create(@ApiParam(value = "The user request payload") @RequestBody SignUpDTO request,
			@RequestHeader HttpHeaders httpHeader) throws Exception {
		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
		try {			
			ValidationResult validationResult = userValidator.validate(RequestType.POST, request);
			userService.saveOrUpdate((User) validationResult.getObject());

			return responseGenerator.successResponse(context, "user.create", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
	}
		
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

