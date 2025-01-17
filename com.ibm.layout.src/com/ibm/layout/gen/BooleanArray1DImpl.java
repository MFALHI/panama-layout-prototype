/*******************************************************************************
 *  Copyright (c) 2014, 2015 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.ibm.layout.gen;

import com.ibm.layout.BooleanArray1D;
import com.ibm.layout.LayoutTypeImpl;
import com.ibm.layout.Location;
import com.ibm.layout.UnsafeHelper;

import sun.misc.Unsafe;

/**
 * Generated implementation of BooleanArray1D
 */
final class BooleanArray1DImpl extends LayoutTypeImpl implements BooleanArray1D {
	private static final Unsafe unsafe = UnsafeHelper.getUnsafe();
	protected final long length;
	
	protected BooleanArray1DImpl(long length) {
		this.length = length;
	}

	@Override
	public boolean at(long index) {
		return unsafe.getBoolean(this.location.getData(), this.location.getOffset() + index);
	}

	@Override
	public void put(long index, boolean value) {
		unsafe.putBoolean(this.location.getData(), this.location.getOffset() + index, value);
	}

	@Override
	public BooleanArray1D range(long startIdx, long length) {
		BooleanArray1DImpl b = new BooleanArray1DImpl(length);
		Location loc = new Location(this.location, startIdx);
		b.bindLocation(loc);
		return b;
	}

	@Override
	public long getLength() {
		return length;
	}

	@Override
	public long sizeof() {
		return length;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for (long i = 0; i < length; i++) {
			sb.append(" " + at(i));
		}
		sb.append(" ]");
		return sb.toString();
	}
}
