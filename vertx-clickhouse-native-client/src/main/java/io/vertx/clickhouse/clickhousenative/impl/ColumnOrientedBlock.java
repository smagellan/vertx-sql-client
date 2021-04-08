package io.vertx.clickhouse.clickhousenative.impl;

import io.vertx.clickhouse.clickhousenative.impl.codec.ClickhouseNativeColumnDescriptor;
import io.vertx.clickhouse.clickhousenative.impl.codec.columns.ClickhouseColumnReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ColumnOrientedBlock extends BaseBlock {
  public ColumnOrientedBlock(Map<String, ClickhouseNativeColumnDescriptor> columnsWithTypes,
                             List<ClickhouseColumnReader> data, BlockInfo blockInfo, ClickhouseNativeDatabaseMetadata md) {
    super(columnsWithTypes, data, blockInfo, md);
  }

  public int numColumns() {
    Collection<ClickhouseColumnReader> dt = getData();
    return dt == null ? 0 : dt.size();
  }

  public int numRows() {
    if (numColumns() > 0) {
      ClickhouseColumnReader firstColumn = getData().iterator().next();
      return firstColumn.nRows();
    } else {
      return 0;
    }
  }

  public List<ClickhouseNativeRowImpl> rows() {
    int numRows = numRows();
    List<ClickhouseNativeRowImpl> ret = new ArrayList<>(numRows);
    for (int i = 0; i < numRows; ++i) {
      ret.add(row(i));
    }
    return ret;
  }

  public ClickhouseNativeRowImpl row(int rowNo) {
    return new ClickhouseNativeRowImpl(rowNo, rowDesc, this, md);
  }
}