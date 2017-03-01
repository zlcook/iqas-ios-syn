package com.zlcook.iqas.ios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlcook.iqas.ios.model.User;

/**
* @author 周亮 
* @version 创建时间：2017年2月27日 下午1:33:09
* 
*/
public interface UserRepository extends JpaRepository<User, Integer> {

}
