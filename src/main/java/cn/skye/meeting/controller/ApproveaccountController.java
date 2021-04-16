package cn.skye.meeting.controller;

import cn.skye.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ApproveaccountController {

    public final static Integer PENDING_APPROVAL = 0;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/approveaccount")
    public String approveaccount(Model model){
        model.addAttribute("emps", employeeService.getAllEmpsByStatus(PENDING_APPROVAL));
        return "approveaccount";
    }

    @RequestMapping("/updatestatus")
    public String updatestatus(Integer employeeid, Integer status){
        Integer result = employeeService.updatestatus(employeeid,status);
        return "redirect:/admin/approveaccount";
    }
}
