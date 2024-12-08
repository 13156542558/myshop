package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.NewBeeMallOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewBeeMallOrderItemMapper {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(NewBeeMallOrderItem record);

    int insertSelective(NewBeeMallOrderItem record);

    NewBeeMallOrderItem selectByPrimaryKey(Long orderItemId);

    /**
     * 根据订单id获取订单项列表
     */
    List<NewBeeMallOrderItem> selectByOrderId(Long orderId);

    /**
     * 根据订单ids获取订单项列表

     */
    List<NewBeeMallOrderItem> selectByOrderIds(@Param("orderIds") List<Long> orderIds);

    /**
     * 批量insert订单项数据

     */
    int insertBatch(@Param("orderItems") List<NewBeeMallOrderItem> orderItems);

    int updateByPrimaryKeySelective(NewBeeMallOrderItem record);

    int updateByPrimaryKey(NewBeeMallOrderItem record);
}