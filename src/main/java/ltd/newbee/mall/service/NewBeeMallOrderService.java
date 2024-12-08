package ltd.newbee.mall.service;

import ltd.newbee.mall.controller.vo.NewBeeMallOrderDetailVO;
import ltd.newbee.mall.controller.vo.NewBeeMallOrderItemVO;
import ltd.newbee.mall.controller.vo.NewBeeMallShoppingCartItemVO;
import ltd.newbee.mall.controller.vo.NewBeeMallUserVO;
import ltd.newbee.mall.entity.NewBeeMallOrder;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;

import java.util.List;

public interface NewBeeMallOrderService {
    /**
     * 后台分页
     * @param pageUtil
     */
    PageResult getNewBeeMallOrdersPage(PageQueryUtil pageUtil);

    /**
     * 订单信息修改
     * * @param newBeeMallOrder
     */
    String updateOrderInfo(NewBeeMallOrder newBeeMallOrder);

    /**
     * 配货
     * @param ids
     */
    String checkDone(Long[] ids);

    /**
     * 出库
     * @param ids
     */
    String checkOut(Long[] ids);

    /**
     * 关闭订单
     * @param ids
     */
    String closeOrder(Long[] ids);

    /**
     * 保存订单
     * @param myShoppingCartItems
     */
    String saveOrder(NewBeeMallUserVO user, List<NewBeeMallShoppingCartItemVO> myShoppingCartItems);

    /**
     * 获取订单详情
     * @param orderNo
     * @param userId
     */
    NewBeeMallOrderDetailVO getOrderDetailByOrderNo(String orderNo, Long userId);

    /**
     * 获取订单详情
     * @param orderNo
     */
    NewBeeMallOrder getNewBeeMallOrderByOrderNo(String orderNo);

    /**
     * 我的订单列表
     * @param pageUtil
     */
    PageResult getMyOrders(PageQueryUtil pageUtil);

    /**
     * 手动取消订单
     * @param orderNo
     * @param userId
     */
    String cancelOrder(String orderNo, Long userId);

    /**
     * 确认收货
     * @param orderNo
     * @param userId
     */
    String finishOrder(String orderNo, Long userId);

    String paySuccess(String orderNo, int payType);

    List<NewBeeMallOrderItemVO> getOrderItems(Long id);
}
