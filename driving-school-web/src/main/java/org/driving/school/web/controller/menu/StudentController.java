package org.driving.school.web.controller.menu;

import org.driving.school.dal.model.SchoolUser;
import org.driving.school.service.user.SchoolUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;

/**
 * @author pengcheng.yang
 * @date 2018-07-06
 *
 */
@Controller
public class StudentController {
	
	@Autowired
	private SchoolUserService schoolUserService;
	
	@RequestMapping("/queryStudentInfoList")
	public String queryStudentInfoList(Model model,Integer pageNum,Integer pageSize,SchoolUser record) {
		Page<SchoolUser> schoolUser = schoolUserService.querySchoolUserInfo(pageNum, pageSize,record);
		model.addAttribute("schoolUserList", schoolUser.toPageInfo());
		return "/home/right";
	}
	
	@RequestMapping("/querStudentInfoByUserId")
	public String querStudentInfoByUserId(Model model,Integer userId) {
		SchoolUser schoolUser = schoolUserService.querySchoolUserINfoByUserId(userId);
		model.addAttribute("schoolUser", schoolUser);
		return "";
	}

}
