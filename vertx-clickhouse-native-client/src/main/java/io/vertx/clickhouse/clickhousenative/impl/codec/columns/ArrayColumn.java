package io.vertx.clickhouse.clickhousenative.impl.codec.columns;

import io.vertx.clickhouse.clickhousenative.impl.ClickhouseNativeDatabaseMetadata;
import io.vertx.clickhouse.clickhousenative.impl.codec.ClickhouseNativeColumnDescriptor;
import io.vertx.sqlclient.Tuple;

import java.util.List;

public class ArrayColumn extends ClickhouseColumn {
  private final ClickhouseNativeDatabaseMetadata md;

  public ArrayColumn(ClickhouseNativeColumnDescriptor descriptor, ClickhouseNativeDatabaseMetadata md) {
    super(descriptor);
    this.md = md;
  }

  private static ClickhouseNativeColumnDescriptor elementaryDescr(ClickhouseNativeColumnDescriptor descr) {
    ClickhouseNativeColumnDescriptor tmp = descr;
    while (tmp.isArray()) {
      tmp = tmp.getNestedDescr();
    }
    return tmp;
  }

    @Override
  public ClickhouseColumnReader reader(int nRows) {
    return new ArrayColumnReader(nRows, descriptor, md);
  }

  @Override
  public ClickhouseColumnWriter writer(List<Tuple> data, int columnIndex) {
    return new ArrayColumnWriter(data, descriptor, md, columnIndex);
  }

  @Override
  public Object nullValue() {
    throw new IllegalArgumentException("arrays are not nullable");
  }
}