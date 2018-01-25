package com.demo.mapper.commons.mapper;

import com.demo.bean.utils.Sequence;

public interface SequenceMapper {
	int updateCurrentValue(String name);
	Sequence selectByName(String name);
}
