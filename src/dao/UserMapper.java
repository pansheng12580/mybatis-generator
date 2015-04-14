package dao;

import model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer suId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer suId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}