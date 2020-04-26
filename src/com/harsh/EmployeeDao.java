package com.harsh;  
import org.springframework.jdbc.core.JdbcTemplate;  
  
public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
   
public int saveEmployee(Employee e){  
    return jdbcTemplate.update("insert into employee values(?,?,?)",e.getId(),e.getName(),e.getSalary());  
}  
public int updateEmployee(Employee e){  
    return jdbcTemplate.update("update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"'");  
}  
public int deleteEmployee(Employee e){  
    return jdbcTemplate.update("delete from employee where id='"+e.getId()+"' ");  
}  
  
}  