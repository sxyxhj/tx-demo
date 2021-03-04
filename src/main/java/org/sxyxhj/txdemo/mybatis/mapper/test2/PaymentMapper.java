package org.sxyxhj.txdemo.mybatis.mapper.test2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface PaymentMapper {
    @Update("update payment set money = money - #{money} where id = #{id}")
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateCost(@Param("id") int id, @Param("money")int money);
}
