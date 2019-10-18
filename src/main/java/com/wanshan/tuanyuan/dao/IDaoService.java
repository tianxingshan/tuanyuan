package com.wanshan.tuanyuan.dao;

import com.wanshan.tuanyuan.util.PageBean;
import org.hibernate.Criteria;

import java.util.List;

/**
 * sws
 */
public interface IDaoService {

    public <T> void save(T entity);

    public <T> void saveEntityAll(List<T> entityList);

    public <T> void update(T entity);

    public <T> void updateEntityAll(List<T> entityList);

    public <T> void delete(T entity);

    public <T> void deleteEntityAll(List<T> entityList);

    public <T> void saveOrUpdate(T entitiy);

    /**
     * 根据主键查询
     * @param entityClass
     * @param id
     * @param <T>
     * @return
     */
    public <T> T findById(Class<T> entityClass,String id);

    public <T> Criteria createCriteria(Class<T> entityClass);

    /**
     * 根据实体属性查询唯一记录
     * @param entityClass
     * @param properName
     * @param value
     * @param <T>
     * @return
     */
    public <T> T findUniqueByProperty(Class<T> entityClass,String properName,Object value);

    /**
     * 根据实体徐行查询实体列表
     * @param entityClass
     * @param property
     * @param value
     * @param <T>
     * @return
     */
    public<T> List<T> findListByProperty(Class<T> entityClass,String property,Object value);

    /**
     * 分页查询实体列表
     * @param criteria
     * @param pageBean
     * @param <T>
     * @return
     */
    public <T> List<T> findListWithPagebeanAndCriteria(Criteria criteria, PageBean pageBean);

    /*
    查询总数
     */
    public Long findTotalWithCriteria(Criteria criteria);
}
