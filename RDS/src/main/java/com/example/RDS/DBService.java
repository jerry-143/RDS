package com.example.RDS;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBService {
	
	@Autowired
	Helper helper;
	
	@PostMapping("/db/{name}/{uid}/{pass}")
	public void connectDB(@PathVariable("name")String name,@PathVariable("uid")String uid,@PathVariable("pass")String pass) throws ClassNotFoundException, SQLException
	{
		
		helper.dbConnect(name,uid,pass);		
		
	}

}
