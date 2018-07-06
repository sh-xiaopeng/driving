package org.driving.school.service.user.impl;

import org.driving.school.biz.user.SchoolUserBiz;
import org.driving.school.dal.model.SchoolUser;
import org.driving.school.service.user.SchoolUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;

/**
 * 
 * @author pengcheng.yang
 *
 */
@Service
public class SchoolUserServiceImpl implements SchoolUserService {
	
	@Autowired
	private SchoolUserBiz schoolUserBiz;
	
	/**
	 * @author pengcheng.yang
	 * @desc 分页查询学员信息
	 * @param record
	 * @return
	 */
	@Override
	public Page<SchoolUser> querySchoolUserInfo(int pageNum, int pageSize, SchoolUser record) {
		return schoolUserBiz.querySchoolUserInfo(pageNum, pageSize, record);
	}
	
	/**
	 * @author pengcheng.yang
	 * @desc 根据userId查询用户信息
	 * @param userId
	 * @return
	 */
	@Override
	public SchoolUser querySchoolUserINfoByUserId(Integer userId) {
		return schoolUserBiz.selectByPrimaryKey(userId);
	}
	
	/**
	 * @author yangpengcheng
	 * @desc 新增学员信息
	 * @param record
	 * @return
	 */
	@Override
	public boolean insertSchoolUserInfo(SchoolUser record) {
		int result = schoolUserBiz.insertSelective(record);
		if (result == 1) {
			return true;
		}
		return false;
	}
	
}
