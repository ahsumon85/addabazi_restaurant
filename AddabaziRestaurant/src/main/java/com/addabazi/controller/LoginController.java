package com.addabazi.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.addabazi.dto.SignUpAttemptDTO;
import com.addabazi.dto.UserBasicInfoDTO;
import com.addabazi.dto.UsersDTO;
import com.addabazi.entity.UserBasicInfo;
import com.addabazi.entity.Users;
import com.addabazi.service.SignUpAttemptService;
import com.addabazi.service.UserBasicInfoService;
import com.addabazi.service.UserService;


@Controller
@ManagedBean
@Scope("session")
public class LoginController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SignUpAttemptService signUpAttemptService;
	
	@Autowired
	private UserBasicInfoService userBasicInfoService;
	
	private SignUpAttemptDTO signUpAttemptDTO;
	private UserBasicInfo userBasicInfo;
	private UserBasicInfoDTO userBasicInfoDTO;
	private String password;
	private String erroMsg;
	private String activation;
	
	private boolean userInValidaity;

	
	
	public String signUp(){
		FacesContext mass=FacesContext.getCurrentInstance();
		String user="code001A";
	
		UsersDTO usersDTO=new UsersDTO();
		SignUpAttemptDTO signUpAttemptDTO=new SignUpAttemptDTO();
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		try{
			if(user.equals(activation)){
			signUpAttemptService.deleteExtraObject(userBasicInfoDTO.getEmail());
			signUpAttemptDTO=new SignUpAttemptDTO();
			signUpAttemptDTO.setDate(new Date());
			signUpAttemptDTO.setStatus(1);
			signUpAttemptDTO.setEmail(userBasicInfoDTO.getEmail());
			signUpAttemptService.createSignUpAttempt(signUpAttemptDTO);
		
			
			userBasicInfoService.saveUserBasicInfo(userBasicInfoDTO);
						
			usersDTO.setUserName(userBasicInfoDTO.getEmail());
			usersDTO.setEnabled(true);
			usersDTO.setPassword(userBasicInfoDTO.getPassword());
			userBasicInfo=userBasicInfoService.findByEmail(userBasicInfoDTO.getEmail());
			usersDTO.setUserBasicInfo(userBasicInfo);
			userService.saveUser(usersDTO);
			password=null;
			userBasicInfoDTO=null;
			mass.addMessage(null, new FacesMessage("Registration Successfully!"));   
			}else {
				mass.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sorry Activation Code is Worng.! ",""));
				return "signUp.xhtml?faces-redirect=true";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "login.xhtml?faces-redirect=true";
		
		
	}
	
	public boolean checkUserValidity(){
		
		boolean userExistence=false;
		try{
		userExistence=userService.isUserExist(userBasicInfoDTO.getEmail());
		}catch (Exception e) {
			System.out.println(e);
		}
		return userExistence;
		
		
	}
	
	public String login(){
		FacesContext context=FacesContext.getCurrentInstance();
		if(checkUserValidity()){
			Users users=new Users();
			users=userService.findByUserName(userBasicInfoDTO.getEmail());
			if(users.getPassword().equals(password)){
				userInValidaity=false;
				return "addabaziHome.xhtml?face-redirect=true";
			}else {
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sorry! User Name or Password is not valid",""));
				return "login.xhtml?face-redirect=true";
			}
			
		}else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sorry! you are not registered",""));
			
		}
		return "login.xhtml?faces-redirect=true";
		
	}
	
	public void logout(){
		userInValidaity=true;
	}
	
	
	public SignUpAttemptDTO getSignUpAttemptDTO() {
		if(signUpAttemptDTO==null) signUpAttemptDTO=new SignUpAttemptDTO();
		
		return signUpAttemptDTO;
	}
	public void setSignUpAttemptDTO(SignUpAttemptDTO signUpAttemptDTO) {
		this.signUpAttemptDTO = signUpAttemptDTO;
	}
	
	public UserBasicInfo getUserBasicInfo() {
		
		if(userBasicInfo==null){
			userBasicInfo=new UserBasicInfo();
		}
		
		return userBasicInfo;
	}
	public void setUserBasicInfo(UserBasicInfo userBasicInfo) {
		this.userBasicInfo = userBasicInfo;
	}
	
	
	public UserBasicInfoDTO getUserBasicInfoDTO() {
		if(userBasicInfoDTO==null){ 
			userBasicInfoDTO=new UserBasicInfoDTO();
		}
		return userBasicInfoDTO;
	}
	public void setUserBasicInfoDTO(UserBasicInfoDTO userBasicInfoDTO) {
		this.userBasicInfoDTO = userBasicInfoDTO;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getErroMsg() {
		return erroMsg;
	}

	public void setErroMsg(String erroMsg) {
		this.erroMsg = erroMsg;
	}

	public boolean isUserInValidaity() {
		return userInValidaity;
	}

	public void setUserInValidaity(boolean userInValidaity) {
		this.userInValidaity = userInValidaity;
	}

	public String getActivation() {
		return activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	
	
	
	
}
	
	
	

