package org.driving.school.service.user;

import org.driving.school.dal.model.SchoolUser;
import com.github.pagehelper.Page;

public interface SchoolUserService {
	/**
	 * @author pengcheng.yang
	 * @desc 分页查询学员信息
	 * @param record
	 * @return
	 */
	public Page<SchoolUser> querySchoolUserInfo(int pageNum,int pageSize,SchoolUser record);
	
	/**
	 * @author pengcheng.yang
	 * @desc 根据userId查询用户信息
	 * @param userId
	 * @return
	 */
	public SchoolUser querySchoolUserINfoByUserId(Integer userId);
	
	/**
	 * @author yangpengcheng
	 * @desc 新增学员信息
	 * @param record
	 * @return
	 */
	public boolean insertSchoolUserInfo(SchoolUser record);
}
