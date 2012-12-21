package com.tightdb;

import java.nio.ByteBuffer;
import java.util.Date;


public interface TableOrView {

	void clear();

	/**
	 * Returns the number of entries of the table/view.
	 * 
	 * @return
	 */
	long size();

	/**
	 * Checks whether the table/view is empty or not.
	 * 
	 * @return true if empty, otherwise false.
	 */
	boolean isEmpty();
	
	/**
	 * Removes a particular row identified by the index from the table/view.
	 * [citation needed] The corresponding row of the table also get deleted for
	 * which the table/view is part of.
	 * 
	 * @param index
	 */
	void remove(long index);
	
	void removeLast();

	/**
	 * Get the long value of a cell of the table/view identified by the
	 * columnIndex and rowIndex.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	long getLong(long columnIndex, long rowIndex);

	/**
	 * Get the boolean value of a cell of the table identified by the
	 * columnIndex and rowIndex.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	boolean getBoolean(long columnIndex, long rowIndex);

	/**
	 * Gets the string value of a cell identified by the columnIndex and
	 * rowIndex of the cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	String getString(long columnIndex, long rowIndex);

	/**
	 * Returns the Date value (java.util.Date) for a particular cell specified
	 * by the columnIndex and rowIndex of the cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	Date getDate(long columnIndex, long rowIndex);
	
	/**
	 * Returns the binary data for a cell identified by the columnIndex
	 * and rowIndex of that cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	ByteBuffer getBinaryByteBuffer(long columnIndex, long rowIndex);
	
	byte[] getBinaryByteArray(long columnIndex, long rowIndex);

	Mixed getMixed(long columnIndex, long rowIndex);
	
	ColumnType getMixedType(long columnIndex, long rowIndex);

	Table getSubTable(long columnIndex, long rowIndex);

	void clearSubTable(long columnIndex, long rowIndex);
	
	long getSubTableSize(long columnIndex, long rowIndex);
	
	/**
	 * Sets the long value for a particular cell identified by columnIndex and
	 * rowIndex of that cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @param value
	 */
	void setLong(long columnIndex, long rowIndex, long value);

	/**
	 * Sets the boolean value of a cell identified by the columnIndex and the
	 * rowIndex of that cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @param value
	 */
	void setBoolean(long columnIndex, long rowIndex, boolean value);

	/**
	 * Sets the string value of a particular cell of the table/view identified
	 * by the columnIndex and the rowIndex of this table/view
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @param value
	 */
	void setString(long columnIndex, long rowIndex, String value);

	/**
	 * Sets the binary value for a particular cell identified by the
	 * rowIndex and columnIndex of the cell.
	 * 
	 * @param columnIndex
	 * @param rowIndex
	 * @param data
	 */
	void setBinaryByteBuffer(long columnIndex, long rowIndex, ByteBuffer data);
	
	void setBinaryByteArray(long columnIndex, long rowIndex, byte[] data);
	
	void setDate(long columnIndex, long rowIndex, Date date);
	
	void setMixed(long columnIndex, long rowIndex, Mixed data);

	void addLong(long columnIndex, long value);
	
	long sum(long columnIndex);
	
	long maximum(long columnIndex);
	
	long minimum(long columnIndex);

	double average(long columnIndex);

	long findFirstLong(long columnIndex, long value);
	
	long findFirstBoolean(long columnIndex, boolean value);
	
	long findFirstDate(long columnIndex, Date value);
	
	long findFirstString(long columnIndex, String value);

	TableView findAllLong(long columnIndex, long value);
	
	TableView findAllBoolean(long columnIndex, boolean value);
	
	TableView findAllDate(long columnIndex, Date value);
	
	TableView findAllString(long columnIndex, String value);

	String toJson();
	
}
