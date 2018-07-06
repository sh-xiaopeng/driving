package org.driving.school.dal.mapper;

import org.driving.school.dal.model.SchoolUser;

import com.github.pagehelper.Page;

public interface SchoolUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SchoolUser record);

    int insertSelective(SchoolUser record);

    SchoolUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SchoolUser record);

    int updateByPrimaryKey(SchoolUser record);
    
    Page<SchoolUser> querySchoolUserInfo(int pageNum, int pageSize);
    
	public boolean insertSchoolUserInfo(SchoolUser record);

}