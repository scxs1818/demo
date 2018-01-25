package com.demo.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.utils.Sequence;
import com.demo.common.service.SequenceService;
import com.demo.mapper.commons.base.BaseSequenceMapper;
import com.demo.mapper.commons.mapper.SequenceMapper;
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
@Service
public class SequenceServiceImpl implements SequenceService {
	
	@Autowired
	BaseSequenceMapper baseMapper;
	@Autowired
	SequenceMapper mapper;
	@Override
	/**
	 * 获取序列号
	 */
	public String getSquenceByName(String name) {
		// TODO Auto-generated method stub
		//Sequence sequence = baseMapper.selectByPrimaryKey(name);
		Sequence record = new Sequence();
		record.setName(name);
		Sequence sequence = mapper. selectByName(name);
		//if(sequenceList!=null&&sequenceList.size()>0){
		//	Sequence sequence = sequenceList.get(0);
			if(sequence!=null){
				int currentValue = sequence.getCurrentValue();
				int increment = sequence.getIncrement();
				return  Integer.toString(currentValue+increment);
			}
	//	}
		return null;
	}
	@Override
	public int update(String name) {
	//	seq.setName("hahha");
	//	System.out.println(seq);
		System.out.println(name);
		int result = mapper.updateCurrentValue(name);
	//	int result = mapper.updateByPrimaryKey(seq);
		//int result = mapper.updateByExampleSelective(seq, "")
		// TODO Auto-generated method stub
		return result;
	}

}
