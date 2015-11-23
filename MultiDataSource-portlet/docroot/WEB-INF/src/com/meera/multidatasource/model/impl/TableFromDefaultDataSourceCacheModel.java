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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.multidatasource.model.TableFromDefaultDataSource;

import java.io.Serializable;

/**
 * The cache model class for representing TableFromDefaultDataSource in entity cache.
 *
 * @author E5410
 * @see TableFromDefaultDataSource
 * @generated
 */
public class TableFromDefaultDataSourceCacheModel implements CacheModel<TableFromDefaultDataSource>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{IFDDSId=");
		sb.append(IFDDSId);
		sb.append(", Description=");
		sb.append(Description);
		sb.append("}");

		return sb.toString();
	}

	public TableFromDefaultDataSource toEntityModel() {
		TableFromDefaultDataSourceImpl tableFromDefaultDataSourceImpl = new TableFromDefaultDataSourceImpl();

		tableFromDefaultDataSourceImpl.setIFDDSId(IFDDSId);

		if (Description == null) {
			tableFromDefaultDataSourceImpl.setDescription(StringPool.BLANK);
		}
		else {
			tableFromDefaultDataSourceImpl.setDescription(Description);
		}

		tableFromDefaultDataSourceImpl.resetOriginalValues();

		return tableFromDefaultDataSourceImpl;
	}

	public long IFDDSId;
	public String Description;
}