package cn.skye.meeting.mapper;

import cn.skye.meeting.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    Employee loadEmpByUsername(String username);

    Integer doReg(Employee employee);

    List<Employee> getAllEmpsByStatus(Integer status);

    Integer updatestatus(@Param("employeeid") Integer employeeid,@Param("status") Integer status);

    List<Employee> getAllEmps(@Param("emp") Employee employee, @Param("start") Integer start,@Param("pagesize") Integer pageSize);

    Long getTotal(Employee employee);

    List<Employee> getEmpsByDepId(Integer depId);
}
