package ltd.newbee.mall.service;

import ltd.newbee.mall.controller.vo.NewBeeMallUserVO;
import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;

import javax.servlet.http.HttpSession;

public interface NewBeeMallUserService {
    /**
     * 后台分页
     */
    PageResult getNewBeeMallUsersPage(PageQueryUtil pageUtil);

    /**
     * 用户注册
     */
    String register(String loginName, String password);

    /**
     * 登录
     */
    String login(String loginName, String passwordMD5, HttpSession httpSession);

    /**
     * 用户信息修改并返回最新的用户信息
     */
    NewBeeMallUserVO updateUserInfo(MallUser mallUser, HttpSession httpSession);

    /**
     * 用户禁用与解除禁用(0-未锁定 1-已锁定)
     */
    Boolean lockUsers(Integer[] ids, int lockStatus);
}
