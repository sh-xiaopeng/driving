package org.driving.school.web.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pengcheng.yang
 * @date 2018-07-06
 *
 */
@Controller
public class StudentController {
	
	@RequestMapping("/queryStudentInfoList")
	public String queryStudentInfoList(Model model) {
		
		return "/home/right";
	}

}
