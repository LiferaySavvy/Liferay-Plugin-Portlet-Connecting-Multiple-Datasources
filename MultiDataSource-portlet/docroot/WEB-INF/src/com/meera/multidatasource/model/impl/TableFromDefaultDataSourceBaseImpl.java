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

package com.meera.multidatasource.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.meera.multidatasource.model.TableFromDefaultDataSource;
import com.meera.multidatasource.service.TableFromDefaultDataSourceLocalServiceUtil;

/**
 * The extended model base implementation for the TableFromDefaultDataSource service. Represents a row in the &quot;meera_TableFromDefaultDataSource&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TableFromDefaultDataSourceImpl}.
 * </p>
 *
 * @author E5410
 * @see TableFromDefaultDataSourceImpl
 * @see com.meera.multidatasource.model.TableFromDefaultDataSource
 * @generated
 */
public abstract class TableFromDefaultDataSourceBaseImpl
	extends TableFromDefaultDataSourceModelImpl
	implements TableFromDefaultDataSource {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a table from default data source model instance should use the {@link TableFromDefaultDataSource} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			TableFromDefaultDataSourceLocalServiceUtil.addTableFromDefaultDataSource(this);
		}
		else {
			TableFromDefaultDataSourceLocalServiceUtil.updateTableFromDefaultDataSource(this);
		}
	}
}