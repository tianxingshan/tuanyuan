package com.wanshan.tuanyuan.dao.impl;

import com.wanshan.tuanyuan.dao.IDaoService;
import com.wanshan.tuanyuan.util.PageBean;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;
import java.util.List;

public class DaoServiceImpl implements IDaoService {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        if(session==null){
            session=sessionFactory.openSession();
        }
        return session;
    }


    @Override
    public <T> void save(T entity) {
        getSession().save(entity);
        getSession().flush();
    }

    @Override
    public <T> void saveEntityAll(List<T> entityList) {
        for (T t:entityList) {
            getSession().save(t);
        }
        getSession().flush();

    }

    @Override
    public <T> void update(T entity) {
            getSession().update(entity);
            getSession().flush();
    }

    @Override
    public <T> void updateEntityAll(List<T> entityList) {
        for (T t:entityList) {
            getSession().update(t);
        }
        getSession().flush();
    }

    @Override
    public <T> void delete(T entity) {
            getSession().delete(entity);
            getSession().flush();
    }

    @Override
    public <T> void deleteEntityAll(List<T> entityList) {
        for (T t:entityList) {
            getSession().delete(t);
        }
        getSession().flush();
    }

    @Override
    public <T> void saveOrUpdate(T entitiy) {
         getSession().saveOrUpdate(entitiy);
         getSession().flush();
    }

    @Override
    public <T> T findById(Class<T> entityClass, String id) {
        return (T)getSession().get(entityClass, id);
    }

    @Override
    public <T> Criteria createCriteria(Class<T> entityClass) {
        return getSession().createCriteria(entityClass).setCacheable(true).setCacheRegion(entityClass.getName());
    }

    @Override
    public <T> T findUniqueByProperty(Class<T> entityClass, String properName, Object value) {
        return (T) getSession().createCriteria(entityClass).add(Restrictions.eq(properName, value)).uniqueResult();
    }

    @Override
    public <T> List<T> findListByProperty(Class<T> entityClass, String property, Object value) {
        return getSession().createCriteria(entityClass).add(Restrictions.eq(property, value)).list();
    }

    @Override
    public <T> List<T> findListWithPagebeanAndCriteria(Criteria criteria, PageBean pageBean) {
        if(pageBean.getPage()==null || pageBean.getRows()==null){
            pageBean.setPage(1);
            pageBean.setRows(10);
        }
        if (pageBean.getSort() != null) {
            for (int i = 0; i < pageBean.getSort().split(",").length; i++) {
                if (pageBean.getOrder().split(",")[i].equals("asc"))
                    criteria.addOrder(Order.asc(pageBean.getSort().split(",")[i]));
                else
                    criteria.addOrder(Order.desc(pageBean.getSort().split(",")[i]));
            }
        }
        criteria.setFirstResult((pageBean.getPage() - 1) * pageBean.getRows());
        criteria.setMaxResults(pageBean.getRows());
        return criteria.list();
    }

    @Override
    public Long findTotalWithCriteria(Criteria criteria) {
        criteria.setFirstResult(0);
        criteria.setMaxResults(1);
        criteria.setProjection(Projections.rowCount());
        Long total = (Long) criteria.uniqueResult();
        if (total == null || total == 0) {
            return 0L;
        }
        return total;
    }


}
