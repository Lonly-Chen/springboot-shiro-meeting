package com.qf.meeting.dao;

import com.qf.pojo.Delegation;
import tk.mybatis.mapper.common.*;

public interface DelegationDao extends MySqlMapper<Delegation>, ExampleMapper<Delegation> , BaseMapper<Delegation>, IdsMapper<Delegation>, ConditionMapper<Delegation> {

}
