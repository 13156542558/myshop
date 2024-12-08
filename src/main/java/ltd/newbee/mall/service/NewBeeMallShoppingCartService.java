package ltd.newbee.mall.service;

import ltd.newbee.mall.controller.vo.NewBeeMallShoppingCartItemVO;
import ltd.newbee.mall.entity.NewBeeMallShoppingCartItem;

import java.util.List;

public interface NewBeeMallShoppingCartService {

    /**
     * 保存商品至购物车中
     * @param newBeeMallShoppingCartItem
     */
    String saveNewBeeMallCartItem(NewBeeMallShoppingCartItem newBeeMallShoppingCartItem);

    /**
     * 修改购物车中的属性
     * @param newBeeMallShoppingCartItem
     */
    String updateNewBeeMallCartItem(NewBeeMallShoppingCartItem newBeeMallShoppingCartItem);

    /**
     * 获取购物项详情
     * @param newBeeMallShoppingCartItemId
     */
    NewBeeMallShoppingCartItem getNewBeeMallCartItemById(Long newBeeMallShoppingCartItemId);

    /**
     * 删除购物车中的商品
     * @param newBeeMallShoppingCartItemId
     */
    Boolean deleteById(Long newBeeMallShoppingCartItemId);

    /**
     * 获取我的购物车中的列表数据
     * @param newBeeMallUserId
     */
    List<NewBeeMallShoppingCartItemVO> getMyShoppingCartItems(Long newBeeMallUserId);
}
