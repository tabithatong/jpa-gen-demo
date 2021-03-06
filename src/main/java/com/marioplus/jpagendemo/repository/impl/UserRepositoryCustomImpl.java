package com.marioplus.jpagendemo.repository.impl;

import com.marioplus.jpagendemo.repository.UserRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * User 自定义Repository实现层
 *
 * @author auto generated
 * @date 2020-03-20 17:51:30
 */
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
