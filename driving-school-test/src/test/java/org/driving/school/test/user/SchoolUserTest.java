package org.driving.school.test.user;

import java.util.Date;

import org.driving.school.dal.model.SchoolUser;
import org.driving.school.service.user.SchoolUserService;
import org.driving.school.test.AbstractTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @desc 学员信息相关测试工具类
 * @author apple
 *
 */
public class SchoolUserTest  extends AbstractTest{
	
//	private Logger logger = LoggerFactory.getLogger(SchoolUserTest.class);
	
	@Autowired
	private SchoolUserService schoolUserService;
	
	@Test
	public void inserSchoolUserInfo() {
		SchoolUser record = new SchoolUser();
		record.setUserName("小明");
		record.setEmail("drivingschool@163.com");
		record.setPwd("12345678");
		record.setSex("男");
		record.setCancelFlag("Y");
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
//		logger.info("插入信息日志打印{}",false);
		boolean result = schoolUserService.insertSchoolUserInfo(record);
//		logger.info("插入信息日志打印{}",result);
		System.out.println("+++++++========::::"+result);
	}
	
	@Test
	public void querySchoolUserInfoByUserId() {
//		System.out.println(schoolUserService.querySchoolUserINfoByUserId(1));
	}
}
