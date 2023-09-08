package com.aws.spring_study.repository;

import com.aws.spring_study.controller.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMappers {
	//Create : 요청받은 값을 DB에 저장
	public Integer saveUser(RegisterUserReqDto registerUserReqDto);

	//Read : 전체 사용자 정보 조회
	public List<User> getUserListAll();
}
