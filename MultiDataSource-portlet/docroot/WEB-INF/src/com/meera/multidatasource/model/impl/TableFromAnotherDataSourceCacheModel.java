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

import com.meera.multidatasource.model.TableFromAnotherDataSource;

import java.io.Serializable;

/**
 * The cache model class for representing TableFromAnotherDataSource in entity cache.
 *
 * @author E5410
 * @see TableFromAnotherDataSource
 * @generated
 */
public class TableFromAnotherDataSourceCacheModel implements CacheModel<TableFromAnotherDataSource>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{IFADSId=");
		sb.append(IFADSId);
		sb.append(", Description=");
		sb.append(Description);
		sb.append("}");

		return sb.toString();
	}

	public TableFromAnotherDataSource toEntityModel() {
		TableFromAnotherDataSourceImpl tableFromAnotherDataSourceImpl = new TableFromAnotherDataSourceImpl();

		tableFromAnotherDataSourceImpl.setIFADSId(IFADSId);

		if (Description == null) {
			tableFromAnotherDataSourceImpl.setDescription(StringPool.BLANK);
		}
		else {
			tableFromAnotherDataSourceImpl.setDescription(Description);
		}

		tableFromAnotherDataSourceImpl.resetOriginalValues();

		return tableFromAnotherDataSourceImpl;
	}

	public long IFADSId;
	public String Description;
}