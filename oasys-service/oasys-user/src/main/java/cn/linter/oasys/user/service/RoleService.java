package cn.linter.oasys.user.service;

import cn.linter.oasys.user.entity.Role;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 角色服务接口
 *
 * @author wangxiaoyang
 * @since 2020/12/20
 */
public interface RoleService {

    /**
     * 通过ID查询单个角色
     *
     * @param id 角色ID
     * @return 单个角色
     */
    Role queryById(Integer id);

    /**
     * 分页查询所有角色
     *
     * @param pageNumber 页号
     * @param pageSize   页大小
     * @return 角色列表
     */
    PageInfo<Role> list(int pageNumber, int pageSize);

    /**
     * 通过用户名查询所有角色
     *
     * @param username 用户名
     * @return 角色列表
     */
    List<Role> listByUsername(String username);

    /**
     * 新增角色
     *
     * @param role 角色实例
     * @return 角色实例
     */
    Role create(Role role);

    /**
     * 更新角色
     *
     * @param role 角色实例
     * @return 角色实例
     */
    Role update(Role role);

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return 是否成功
     */
    boolean delete(Integer id);

}