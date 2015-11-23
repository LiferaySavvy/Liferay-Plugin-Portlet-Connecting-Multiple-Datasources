/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.multidatasource.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException;
import com.meera.multidatasource.model.TableFromDefaultDataSource;
import com.meera.multidatasource.model.impl.TableFromDefaultDataSourceImpl;
import com.meera.multidatasource.model.impl.TableFromDefaultDataSourceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the table from default data source service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see TableFromDefaultDataSourcePersistence
 * @see TableFromDefaultDataSourceUtil
 * @generated
 */
public class TableFromDefaultDataSourcePersistenceImpl
	extends BasePersistenceImpl<TableFromDefaultDataSource>
	implements TableFromDefaultDataSourcePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TableFromDefaultDataSourceUtil} to access the table from default data source persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TableFromDefaultDataSourceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceModelImpl.FINDER_CACHE_ENABLED,
			TableFromDefaultDataSourceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceModelImpl.FINDER_CACHE_ENABLED,
			TableFromDefaultDataSourceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the table from default data source in the entity cache if it is enabled.
	 *
	 * @param tableFromDefaultDataSource the table from default data source
	 */
	public void cacheResult(
		TableFromDefaultDataSource tableFromDefaultDataSource) {
		EntityCacheUtil.putResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceImpl.class,
			tableFromDefaultDataSource.getPrimaryKey(),
			tableFromDefaultDataSource);

		tableFromDefaultDataSource.resetOriginalValues();
	}

	/**
	 * Caches the table from default data sources in the entity cache if it is enabled.
	 *
	 * @param tableFromDefaultDataSources the table from default data sources
	 */
	public void cacheResult(
		List<TableFromDefaultDataSource> tableFromDefaultDataSources) {
		for (TableFromDefaultDataSource tableFromDefaultDataSource : tableFromDefaultDataSources) {
			if (EntityCacheUtil.getResult(
						TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
						TableFromDefaultDataSourceImpl.class,
						tableFromDefaultDataSource.getPrimaryKey()) == null) {
				cacheResult(tableFromDefaultDataSource);
			}
			else {
				tableFromDefaultDataSource.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all table from default data sources.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TableFromDefaultDataSourceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TableFromDefaultDataSourceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the table from default data source.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TableFromDefaultDataSource tableFromDefaultDataSource) {
		EntityCacheUtil.removeResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceImpl.class,
			tableFromDefaultDataSource.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TableFromDefaultDataSource> tableFromDefaultDataSources) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TableFromDefaultDataSource tableFromDefaultDataSource : tableFromDefaultDataSources) {
			EntityCacheUtil.removeResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
				TableFromDefaultDataSourceImpl.class,
				tableFromDefaultDataSource.getPrimaryKey());
		}
	}

	/**
	 * Creates a new table from default data source with the primary key. Does not add the table from default data source to the database.
	 *
	 * @param IFDDSId the primary key for the new table from default data source
	 * @return the new table from default data source
	 */
	public TableFromDefaultDataSource create(long IFDDSId) {
		TableFromDefaultDataSource tableFromDefaultDataSource = new TableFromDefaultDataSourceImpl();

		tableFromDefaultDataSource.setNew(true);
		tableFromDefaultDataSource.setPrimaryKey(IFDDSId);

		return tableFromDefaultDataSource;
	}

	/**
	 * Removes the table from default data source with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IFDDSId the primary key of the table from default data source
	 * @return the table from default data source that was removed
	 * @throws com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromDefaultDataSource remove(long IFDDSId)
		throws NoSuchTableFromDefaultDataSourceException, SystemException {
		return remove(Long.valueOf(IFDDSId));
	}

	/**
	 * Removes the table from default data source with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the table from default data source
	 * @return the table from default data source that was removed
	 * @throws com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromDefaultDataSource remove(Serializable primaryKey)
		throws NoSuchTableFromDefaultDataSourceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TableFromDefaultDataSource tableFromDefaultDataSource = (TableFromDefaultDataSource)session.get(TableFromDefaultDataSourceImpl.class,
					primaryKey);

			if (tableFromDefaultDataSource == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTableFromDefaultDataSourceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tableFromDefaultDataSource);
		}
		catch (NoSuchTableFromDefaultDataSourceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TableFromDefaultDataSource removeImpl(
		TableFromDefaultDataSource tableFromDefaultDataSource)
		throws SystemException {
		tableFromDefaultDataSource = toUnwrappedModel(tableFromDefaultDataSource);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tableFromDefaultDataSource);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tableFromDefaultDataSource);

		return tableFromDefaultDataSource;
	}

	@Override
	public TableFromDefaultDataSource updateImpl(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource,
		boolean merge) throws SystemException {
		tableFromDefaultDataSource = toUnwrappedModel(tableFromDefaultDataSource);

		boolean isNew = tableFromDefaultDataSource.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tableFromDefaultDataSource, merge);

			tableFromDefaultDataSource.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromDefaultDataSourceImpl.class,
			tableFromDefaultDataSource.getPrimaryKey(),
			tableFromDefaultDataSource);

		return tableFromDefaultDataSource;
	}

	protected TableFromDefaultDataSource toUnwrappedModel(
		TableFromDefaultDataSource tableFromDefaultDataSource) {
		if (tableFromDefaultDataSource instanceof TableFromDefaultDataSourceImpl) {
			return tableFromDefaultDataSource;
		}

		TableFromDefaultDataSourceImpl tableFromDefaultDataSourceImpl = new TableFromDefaultDataSourceImpl();

		tableFromDefaultDataSourceImpl.setNew(tableFromDefaultDataSource.isNew());
		tableFromDefaultDataSourceImpl.setPrimaryKey(tableFromDefaultDataSource.getPrimaryKey());

		tableFromDefaultDataSourceImpl.setIFDDSId(tableFromDefaultDataSource.getIFDDSId());
		tableFromDefaultDataSourceImpl.setDescription(tableFromDefaultDataSource.getDescription());

		return tableFromDefaultDataSourceImpl;
	}

	/**
	 * Returns the table from default data source with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the table from default data source
	 * @return the table from default data source
	 * @throws com.liferay.portal.NoSuchModelException if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromDefaultDataSource findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the table from default data source with the primary key or throws a {@link com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException} if it could not be found.
	 *
	 * @param IFDDSId the primary key of the table from default data source
	 * @return the table from default data source
	 * @throws com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromDefaultDataSource findByPrimaryKey(long IFDDSId)
		throws NoSuchTableFromDefaultDataSourceException, SystemException {
		TableFromDefaultDataSource tableFromDefaultDataSource = fetchByPrimaryKey(IFDDSId);

		if (tableFromDefaultDataSource == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + IFDDSId);
			}

			throw new NoSuchTableFromDefaultDataSourceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				IFDDSId);
		}

		return tableFromDefaultDataSource;
	}

	/**
	 * Returns the table from default data source with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the table from default data source
	 * @return the table from default data source, or <code>null</code> if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromDefaultDataSource fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the table from default data source with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IFDDSId the primary key of the table from default data source
	 * @return the table from default data source, or <code>null</code> if a table from default data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromDefaultDataSource fetchByPrimaryKey(long IFDDSId)
		throws SystemException {
		TableFromDefaultDataSource tableFromDefaultDataSource = (TableFromDefaultDataSource)EntityCacheUtil.getResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
				TableFromDefaultDataSourceImpl.class, IFDDSId);

		if (tableFromDefaultDataSource == _nullTableFromDefaultDataSource) {
			return null;
		}

		if (tableFromDefaultDataSource == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tableFromDefaultDataSource = (TableFromDefaultDataSource)session.get(TableFromDefaultDataSourceImpl.class,
						Long.valueOf(IFDDSId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tableFromDefaultDataSource != null) {
					cacheResult(tableFromDefaultDataSource);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TableFromDefaultDataSourceModelImpl.ENTITY_CACHE_ENABLED,
						TableFromDefaultDataSourceImpl.class, IFDDSId,
						_nullTableFromDefaultDataSource);
				}

				closeSession(session);
			}
		}

		return tableFromDefaultDataSource;
	}

	/**
	 * Returns all the table from default data sources.
	 *
	 * @return the table from default data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromDefaultDataSource> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the table from default data sources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of table from default data sources
	 * @param end the upper bound of the range of table from default data sources (not inclusive)
	 * @return the range of table from default data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromDefaultDataSource> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the table from default data sources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of table from default data sources
	 * @param end the upper bound of the range of table from default data sources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of table from default data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromDefaultDataSource> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TableFromDefaultDataSource> list = (List<TableFromDefaultDataSource>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TABLEFROMDEFAULTDATASOURCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TABLEFROMDEFAULTDATASOURCE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TableFromDefaultDataSource>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TableFromDefaultDataSource>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the table from default data sources from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TableFromDefaultDataSource tableFromDefaultDataSource : findAll()) {
			remove(tableFromDefaultDataSource);
		}
	}

	/**
	 * Returns the number of table from default data sources.
	 *
	 * @return the number of table from default data sources
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TABLEFROMDEFAULTDATASOURCE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the table from default data source persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.meera.multidatasource.model.TableFromDefaultDataSource")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TableFromDefaultDataSource>> listenersList = new ArrayList<ModelListener<TableFromDefaultDataSource>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TableFromDefaultDataSource>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TableFromDefaultDataSourceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = TableFromAnotherDataSourcePersistence.class)
	protected TableFromAnotherDataSourcePersistence tableFromAnotherDataSourcePersistence;
	@BeanReference(type = TableFromDefaultDataSourcePersistence.class)
	protected TableFromDefaultDataSourcePersistence tableFromDefaultDataSourcePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TABLEFROMDEFAULTDATASOURCE = "SELECT tableFromDefaultDataSource FROM TableFromDefaultDataSource tableFromDefaultDataSource";
	private static final String _SQL_COUNT_TABLEFROMDEFAULTDATASOURCE = "SELECT COUNT(tableFromDefaultDataSource) FROM TableFromDefaultDataSource tableFromDefaultDataSource";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tableFromDefaultDataSource.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TableFromDefaultDataSource exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TableFromDefaultDataSourcePersistenceImpl.class);
	private static TableFromDefaultDataSource _nullTableFromDefaultDataSource = new TableFromDefaultDataSourceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TableFromDefaultDataSource> toCacheModel() {
				return _nullTableFromDefaultDataSourceCacheModel;
			}
		};

	private static CacheModel<TableFromDefaultDataSource> _nullTableFromDefaultDataSourceCacheModel =
		new CacheModel<TableFromDefaultDataSource>() {
			public TableFromDefaultDataSource toEntityModel() {
				return _nullTableFromDefaultDataSource;
			}
		};
}