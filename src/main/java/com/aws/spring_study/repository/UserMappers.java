package com.aws.spring_study.repository;

import com.aws.spring_study.controller.dto.RegisterUserReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMappers {
	public Integer saveUser(RegisterUserReqDto registerUserReqDto);

}