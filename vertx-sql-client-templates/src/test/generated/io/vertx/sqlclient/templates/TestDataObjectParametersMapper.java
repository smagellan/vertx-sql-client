package io.vertx.sqlclient.templates;

/**
 * Mapper for {@link TestDataObject}.
 * NOTE: This class has been automatically generated from the {@link TestDataObject} original class using Vert.x codegen.
 */
@io.vertx.codegen.annotations.VertxGen
public interface TestDataObjectParametersMapper extends io.vertx.sqlclient.templates.TupleMapper<TestDataObject> {

  TestDataObjectParametersMapper INSTANCE = new TestDataObjectParametersMapper() {};

  default io.vertx.sqlclient.Tuple map(java.util.function.Function<Integer, String> mapping, int size, TestDataObject params) {
    java.util.Map<String, Object> args = map(params);
    Object[] array = new Object[size];
    for (int i = 0;i < array.length;i++) {
      String column = mapping.apply(i);
      array[i] = args.get(column);
    }
    return io.vertx.sqlclient.Tuple.wrap(array);
  }

  default java.util.Map<String, Object> map(TestDataObject obj) {
    java.util.Map<String, Object> params = new java.util.HashMap<>();
    params.put("addedBooleanMethodMappedDataObjects", obj.getAddedBooleanMethodMappedDataObjects());
    params.put("addedBooleans", obj.getAddedBooleans());
    params.put("addedBuffers", obj.getAddedBuffers());
    params.put("addedDoubleMethodMappedDataObjects", obj.getAddedDoubleMethodMappedDataObjects());
    params.put("addedDoubles", obj.getAddedDoubles());
    params.put("addedFloatMethodMappedDataObjects", obj.getAddedFloatMethodMappedDataObjects());
    params.put("addedFloats", obj.getAddedFloats());
    params.put("addedIntegerMethodMappedDataObjects", obj.getAddedIntegerMethodMappedDataObjects());
    params.put("addedIntegers", obj.getAddedIntegers());
    params.put("addedJsonArrayMethodMappedDataObjects", obj.getAddedJsonArrayMethodMappedDataObjects());
    params.put("addedJsonArrays", obj.getAddedJsonArrays());
    params.put("addedJsonObjectDataObjects", obj.getAddedJsonObjectDataObjects());
    params.put("addedJsonObjectMethodMappedDataObjects", obj.getAddedJsonObjectMethodMappedDataObjects());
    params.put("addedJsonObjects", obj.getAddedJsonObjects());
    params.put("addedLocalDateTimes", obj.getAddedLocalDateTimes());
    params.put("addedLocalDates", obj.getAddedLocalDates());
    params.put("addedLocalTimes", obj.getAddedLocalTimes());
    params.put("addedLongMethodMappedDataObjects", obj.getAddedLongMethodMappedDataObjects());
    params.put("addedLongs", obj.getAddedLongs());
    params.put("addedOffsetDateTimes", obj.getAddedOffsetDateTimes());
    params.put("addedOffsetTimes", obj.getAddedOffsetTimes());
    params.put("addedShortMethodMappedDataObjects", obj.getAddedShortMethodMappedDataObjects());
    params.put("addedShorts", obj.getAddedShorts());
    params.put("addedStringMethodMappedDataObjects", obj.getAddedStringMethodMappedDataObjects());
    params.put("addedStrings", obj.getAddedStrings());
    params.put("addedTemporals", obj.getAddedTemporals());
    params.put("addedTimeUnits", obj.getAddedTimeUnits());
    params.put("addedUUIDs", obj.getAddedUUIDs());
    params.put("booleanList", obj.getBooleanList());
    params.put("booleanMethodMappedDataObject", obj.getBooleanMethodMappedDataObject());
    params.put("booleanMethodMappedDataObjectList", obj.getBooleanMethodMappedDataObjectList());
    params.put("booleanMethodMappedDataObjectSet", obj.getBooleanMethodMappedDataObjectSet());
    params.put("booleanSet", obj.getBooleanSet());
    params.put("boxedBoolean", obj.isBoxedBoolean());
    params.put("boxedDouble", obj.getBoxedDouble());
    params.put("boxedFloat", obj.getBoxedFloat());
    params.put("boxedInteger", obj.getBoxedInteger());
    params.put("boxedLong", obj.getBoxedLong());
    params.put("boxedShort", obj.getBoxedShort());
    params.put("buffer", obj.getBuffer());
    params.put("bufferList", obj.getBufferList());
    params.put("bufferSet", obj.getBufferSet());
    params.put("doubleList", obj.getDoubleList());
    params.put("doubleMethodMappedDataObject", obj.getDoubleMethodMappedDataObject());
    params.put("doubleMethodMappedDataObjectList", obj.getDoubleMethodMappedDataObjectList());
    params.put("doubleMethodMappedDataObjectSet", obj.getDoubleMethodMappedDataObjectSet());
    params.put("doubleSet", obj.getDoubleSet());
    params.put("floatList", obj.getFloatList());
    params.put("floatMethodMappedDataObject", obj.getFloatMethodMappedDataObject());
    params.put("floatMethodMappedDataObjectList", obj.getFloatMethodMappedDataObjectList());
    params.put("floatMethodMappedDataObjectSet", obj.getFloatMethodMappedDataObjectSet());
    params.put("floatSet", obj.getFloatSet());
    params.put("integerList", obj.getIntegerList());
    params.put("integerMethodMappedDataObject", obj.getIntegerMethodMappedDataObject());
    params.put("integerMethodMappedDataObjectList", obj.getIntegerMethodMappedDataObjectList());
    params.put("integerMethodMappedDataObjectSet", obj.getIntegerMethodMappedDataObjectSet());
    params.put("integerSet", obj.getIntegerSet());
    params.put("jsonArray", obj.getJsonArray());
    params.put("jsonArrayList", obj.getJsonArrayList());
    params.put("jsonArrayMethodMappedDataObject", obj.getJsonArrayMethodMappedDataObject());
    params.put("jsonArrayMethodMappedDataObjectList", obj.getJsonArrayMethodMappedDataObjectList());
    params.put("jsonArrayMethodMappedDataObjectSet", obj.getJsonArrayMethodMappedDataObjectSet());
    params.put("jsonArraySet", obj.getJsonArraySet());
    params.put("jsonObject", obj.getJsonObject());
    params.put("jsonObjectDataObject", obj.getJsonObjectDataObject());
    params.put("jsonObjectDataObjectList", obj.getJsonObjectDataObjectList());
    params.put("jsonObjectDataObjectSet", obj.getJsonObjectDataObjectSet());
    params.put("jsonObjectList", obj.getJsonObjectList());
    params.put("jsonObjectMethodMappedDataObject", obj.getJsonObjectMethodMappedDataObject());
    params.put("jsonObjectMethodMappedDataObjectList", obj.getJsonObjectMethodMappedDataObjectList());
    params.put("jsonObjectMethodMappedDataObjectSet", obj.getJsonObjectMethodMappedDataObjectSet());
    params.put("jsonObjectSet", obj.getJsonObjectSet());
    params.put("localDate", obj.getLocalDate());
    params.put("localDateList", obj.getLocalDateList());
    params.put("localDateSet", obj.getLocalDateSet());
    params.put("localDateTime", obj.getLocalDateTime());
    params.put("localDateTimeList", obj.getLocalDateTimeList());
    params.put("localDateTimeSet", obj.getLocalDateTimeSet());
    params.put("localTime", obj.getLocalTime());
    params.put("localTimeList", obj.getLocalTimeList());
    params.put("localTimeSet", obj.getLocalTimeSet());
    params.put("longList", obj.getLongList());
    params.put("longMethodMappedDataObject", obj.getLongMethodMappedDataObject());
    params.put("longMethodMappedDataObjectList", obj.getLongMethodMappedDataObjectList());
    params.put("longMethodMappedDataObjectSet", obj.getLongMethodMappedDataObjectSet());
    params.put("longSet", obj.getLongSet());
    params.put("offsetDateTime", obj.getOffsetDateTime());
    params.put("offsetDateTimeList", obj.getOffsetDateTimeList());
    params.put("offsetDateTimeSet", obj.getOffsetDateTimeSet());
    params.put("offsetTime", obj.getOffsetTime());
    params.put("offsetTimeList", obj.getOffsetTimeList());
    params.put("offsetTimeSet", obj.getOffsetTimeSet());
    params.put("primitiveBoolean", obj.isPrimitiveBoolean());
    params.put("primitiveDouble", obj.getPrimitiveDouble());
    params.put("primitiveFloat", obj.getPrimitiveFloat());
    params.put("primitiveInt", obj.getPrimitiveInt());
    params.put("primitiveLong", obj.getPrimitiveLong());
    params.put("primitiveShort", obj.getPrimitiveShort());
    params.put("shortList", obj.getShortList());
    params.put("shortMethodMappedDataObject", obj.getShortMethodMappedDataObject());
    params.put("shortMethodMappedDataObjectList", obj.getShortMethodMappedDataObjectList());
    params.put("shortMethodMappedDataObjectSet", obj.getShortMethodMappedDataObjectSet());
    params.put("shortSet", obj.getShortSet());
    params.put("the_string", obj.getString());
    params.put("stringList", obj.getStringList());
    params.put("stringMethodMappedDataObject", obj.getStringMethodMappedDataObject());
    params.put("stringMethodMappedDataObjectList", obj.getStringMethodMappedDataObjectList());
    params.put("stringMethodMappedDataObjectSet", obj.getStringMethodMappedDataObjectSet());
    params.put("stringSet", obj.getStringSet());
    params.put("temporal", obj.getTemporal());
    params.put("temporalList", obj.getTemporalList());
    params.put("temporalSet", obj.getTemporalSet());
    params.put("timeUnit", obj.getTimeUnit());
    params.put("timeUnitList", obj.getTimeUnitList());
    params.put("timeUnitSet", obj.getTimeUnitSet());
    params.put("uuid", obj.getUUID());
    params.put("uuidList", obj.getUUIDList());
    params.put("uuidSet", obj.getUUIDSet());
    return params;
  }
}
