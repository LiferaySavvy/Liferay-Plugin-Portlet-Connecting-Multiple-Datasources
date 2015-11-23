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

import com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException;
import com.meera.multidatasource.model.TableFromAnotherDataSource;
import com.meera.multidatasource.model.impl.TableFromAnotherDataSourceImpl;
import com.meera.multidatasource.model.impl.TableFromAnotherDataSourceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the table from another data source service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see TableFromAnotherDataSourcePersistence
 * @see TableFromAnotherDataSourceUtil
 * @generated
 */
public class TableFromAnotherDataSourcePersistenceImpl
	extends BasePersistenceImpl<TableFromAnotherDataSource>
	implements TableFromAnotherDataSourcePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TableFromAnotherDataSourceUtil} to access the table from another data source persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TableFromAnotherDataSourceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceModelImpl.FINDER_CACHE_ENABLED,
			TableFromAnotherDataSourceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceModelImpl.FINDER_CACHE_ENABLED,
			TableFromAnotherDataSourceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the table from another data source in the entity cache if it is enabled.
	 *
	 * @param tableFromAnotherDataSource the table from another data source
	 */
	public void cacheResult(
		TableFromAnotherDataSource tableFromAnotherDataSource) {
		EntityCacheUtil.putResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceImpl.class,
			tableFromAnotherDataSource.getPrimaryKey(),
			tableFromAnotherDataSource);

		tableFromAnotherDataSource.resetOriginalValues();
	}

	/**
	 * Caches the table from another data sources in the entity cache if it is enabled.
	 *
	 * @param tableFromAnotherDataSources the table from another data sources
	 */
	public void cacheResult(
		List<TableFromAnotherDataSource> tableFromAnotherDataSources) {
		for (TableFromAnotherDataSource tableFromAnotherDataSource : tableFromAnotherDataSources) {
			if (EntityCacheUtil.getResult(
						TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
						TableFromAnotherDataSourceImpl.class,
						tableFromAnotherDataSource.getPrimaryKey()) == null) {
				cacheResult(tableFromAnotherDataSource);
			}
			else {
				tableFromAnotherDataSource.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all table from another data sources.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TableFromAnotherDataSourceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TableFromAnotherDataSourceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the table from another data source.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TableFromAnotherDataSource tableFromAnotherDataSource) {
		EntityCacheUtil.removeResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceImpl.class,
			tableFromAnotherDataSource.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TableFromAnotherDataSource> tableFromAnotherDataSources) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TableFromAnotherDataSource tableFromAnotherDataSource : tableFromAnotherDataSources) {
			EntityCacheUtil.removeResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
				TableFromAnotherDataSourceImpl.class,
				tableFromAnotherDataSource.getPrimaryKey());
		}
	}

	/**
	 * Creates a new table from another data source with the primary key. Does not add the table from another data source to the database.
	 *
	 * @param IFADSId the primary key for the new table from another data source
	 * @return the new table from another data source
	 */
	public TableFromAnotherDataSource create(long IFADSId) {
		TableFromAnotherDataSource tableFromAnotherDataSource = new TableFromAnotherDataSourceImpl();

		tableFromAnotherDataSource.setNew(true);
		tableFromAnotherDataSource.setPrimaryKey(IFADSId);

		return tableFromAnotherDataSource;
	}

	/**
	 * Removes the table from another data source with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IFADSId the primary key of the table from another data source
	 * @return the table from another data source that was removed
	 * @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromAnotherDataSource remove(long IFADSId)
		throws NoSuchTableFromAnotherDataSourceException, SystemException {
		return remove(Long.valueOf(IFADSId));
	}

	/**
	 * Removes the table from another data source with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the table from another data source
	 * @return the table from another data source that was removed
	 * @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromAnotherDataSource remove(Serializable primaryKey)
		throws NoSuchTableFromAnotherDataSourceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TableFromAnotherDataSource tableFromAnotherDataSource = (TableFromAnotherDataSource)session.get(TableFromAnotherDataSourceImpl.class,
					primaryKey);

			if (tableFromAnotherDataSource == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTableFromAnotherDataSourceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tableFromAnotherDataSource);
		}
		catch (NoSuchTableFromAnotherDataSourceException nsee) {
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
	protected TableFromAnotherDataSource removeImpl(
		TableFromAnotherDataSource tableFromAnotherDataSource)
		throws SystemException {
		tableFromAnotherDataSource = toUnwrappedModel(tableFromAnotherDataSource);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tableFromAnotherDataSource);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tableFromAnotherDataSource);

		return tableFromAnotherDataSource;
	}

	@Override
	public TableFromAnotherDataSource updateImpl(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource,
		boolean merge) throws SystemException {
		tableFromAnotherDataSource = toUnwrappedModel(tableFromAnotherDataSource);

		boolean isNew = tableFromAnotherDataSource.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tableFromAnotherDataSource, merge);

			tableFromAnotherDataSource.setNew(false);
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

		EntityCacheUtil.putResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
			TableFromAnotherDataSourceImpl.class,
			tableFromAnotherDataSource.getPrimaryKey(),
			tableFromAnotherDataSource);

		return tableFromAnotherDataSource;
	}

	protected TableFromAnotherDataSource toUnwrappedModel(
		TableFromAnotherDataSource tableFromAnotherDataSource) {
		if (tableFromAnotherDataSource instanceof TableFromAnotherDataSourceImpl) {
			return tableFromAnotherDataSource;
		}

		TableFromAnotherDataSourceImpl tableFromAnotherDataSourceImpl = new TableFromAnotherDataSourceImpl();

		tableFromAnotherDataSourceImpl.setNew(tableFromAnotherDataSource.isNew());
		tableFromAnotherDataSourceImpl.setPrimaryKey(tableFromAnotherDataSource.getPrimaryKey());

		tableFromAnotherDataSourceImpl.setIFADSId(tableFromAnotherDataSource.getIFADSId());
		tableFromAnotherDataSourceImpl.setDescription(tableFromAnotherDataSource.getDescription());

		return tableFromAnotherDataSourceImpl;
	}

	/**
	 * Returns the table from another data source with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the table from another data source
	 * @return the table from another data source
	 * @throws com.liferay.portal.NoSuchModelException if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromAnotherDataSource findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the table from another data source with the primary key or throws a {@link com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException} if it could not be found.
	 *
	 * @param IFADSId the primary key of the table from another data source
	 * @return the table from another data source
	 * @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromAnotherDataSource findByPrimaryKey(long IFADSId)
		throws NoSuchTableFromAnotherDataSourceException, SystemException {
		TableFromAnotherDataSource tableFromAnotherDataSource = fetchByPrimaryKey(IFADSId);

		if (tableFromAnotherDataSource == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + IFADSId);
			}

			throw new NoSuchTableFromAnotherDataSourceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				IFADSId);
		}

		return tableFromAnotherDataSource;
	}

	/**
	 * Returns the table from another data source with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the table from another data source
	 * @return the table from another data source, or <code>null</code> if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TableFromAnotherDataSource fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the table from another data source with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IFADSId the primary key of the table from another data source
	 * @return the table from another data source, or <code>null</code> if a table from another data source with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TableFromAnotherDataSource fetchByPrimaryKey(long IFADSId)
		throws SystemException {
		TableFromAnotherDataSource tableFromAnotherDataSource = (TableFromAnotherDataSource)EntityCacheUtil.getResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
				TableFromAnotherDataSourceImpl.class, IFADSId);

		if (tableFromAnotherDataSource == _nullTableFromAnotherDataSource) {
			return null;
		}

		if (tableFromAnotherDataSource == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tableFromAnotherDataSource = (TableFromAnotherDataSource)session.get(TableFromAnotherDataSourceImpl.class,
						Long.valueOf(IFADSId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tableFromAnotherDataSource != null) {
					cacheResult(tableFromAnotherDataSource);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(TableFromAnotherDataSourceModelImpl.ENTITY_CACHE_ENABLED,
						TableFromAnotherDataSourceImpl.class, IFADSId,
						_nullTableFromAnotherDataSource);
				}

				closeSession(session);
			}
		}

		return tableFromAnotherDataSource;
	}

	/**
	 * Returns all the table from another data sources.
	 *
	 * @return the table from another data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromAnotherDataSource> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the table from another data sources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of table from another data sources
	 * @param end the upper bound of the range of table from another data sources (not inclusive)
	 * @return the range of table from another data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromAnotherDataSource> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the table from another data sources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of table from another data sources
	 * @param end the upper bound of the range of table from another data sources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of table from another data sources
	 * @throws SystemException if a system exception occurred
	 */
	public List<TableFromAnotherDataSource> findAll(int start, int end,
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

		List<TableFromAnotherDataSource> list = (List<TableFromAnotherDataSource>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TABLEFROMANOTHERDATASOURCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TABLEFROMANOTHERDATASOURCE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TableFromAnotherDataSource>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TableFromAnotherDataSource>)QueryUtil.list(q,
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
	 * Removes all the table from another data sources from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TableFromAnotherDataSource tableFromAnotherDataSource : findAll()) {
			remove(tableFromAnotherDataSource);
		}
	}

	/**
	 * Returns the number of table from another data sources.
	 *
	 * @return the number of table from another data sources
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TABLEFROMANOTHERDATASOURCE);

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
	 * Initializes the table from another data source persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.meera.multidatasource.model.TableFromAnotherDataSource")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TableFromAnotherDataSource>> listenersList = new ArrayList<ModelListener<TableFromAnotherDataSource>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TableFromAnotherDataSource>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TableFromAnotherDataSourceImpl.class.getName());
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
	private static final String _SQL_SELECT_TABLEFROMANOTHERDATASOURCE = "SELECT tableFromAnotherDataSource FROM TableFromAnotherDataSource tableFromAnotherDataSource";
	private static final String _SQL_COUNT_TABLEFROMANOTHERDATASOURCE = "SELECT COUNT(tableFromAnotherDataSource) FROM TableFromAnotherDataSource tableFromAnotherDataSource";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tableFromAnotherDataSource.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TableFromAnotherDataSource exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TableFromAnotherDataSourcePersistenceImpl.class);
	private static TableFromAnotherDataSource _nullTableFromAnotherDataSource = new TableFromAnotherDataSourceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TableFromAnotherDataSource> toCacheModel() {
				return _nullTableFromAnotherDataSourceCacheModel;
			}
		};

	private static CacheModel<TableFromAnotherDataSource> _nullTableFromAnotherDataSourceCacheModel =
		new CacheModel<TableFromAnotherDataSource>() {
			public TableFromAnotherDataSource toEntityModel() {
				return _nullTableFromAnotherDataSource;
			}
		};
}