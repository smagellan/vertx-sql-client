package io.vertx.clickhouse.clickhousenative.impl.codec.columns;

import io.vertx.clickhouse.clickhousenative.impl.codec.ClickhouseNativeColumnDescriptor;
import io.vertx.sqlclient.Tuple;

import java.util.List;
import java.util.Map;

public class Enum8Column extends UInt8Column {
  private final Map<? extends Number, String> enumVals;
  private final EnumResolutionMethod resolutionMethod;

  public Enum8Column(ClickhouseNativeColumnDescriptor descriptor, Map<? extends Number, String> enumVals, EnumResolutionMethod resolutionMethod) {
    super(descriptor);
    this.enumVals = enumVals;
    this.resolutionMethod = resolutionMethod;
  }

  @Override
  public ClickhouseColumnReader reader(int nRows) {
    return new Enum8ColumnReader(nRows, descriptor, enumVals, resolutionMethod);
  }

  @Override
  public ClickhouseColumnWriter writer(List<Tuple> data, int columnIndex) {
    return new Enum8ColumnWriter(data, descriptor, columnIndex, enumVals, resolutionMethod);
  }
}