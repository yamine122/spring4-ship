package com.ship.web.domains;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Component
public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String uId, uName, uPw, 
	mgr, hireDate, sal, comm, deptno, dname, loc;
}
