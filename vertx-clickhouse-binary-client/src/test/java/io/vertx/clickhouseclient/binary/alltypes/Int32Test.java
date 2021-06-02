/*
 *
 *  Copyright (c) 2021 Vladimir Vishnevskii
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 *  which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 *  SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *
 */

package io.vertx.clickhouseclient.binary.alltypes;

import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.sqlclient.Row;
import io.vertx.sqlclient.Tuple;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(VertxUnitRunner.class)
public class Int32Test extends AllTypesBase<Integer> {
  public Int32Test() {
    super("int32", new MyColumnChecker<>(Integer.class, Tuple::getInteger, Row::getInteger, Tuple::getArrayOfIntegers, Row::getArrayOfIntegers));
  }

  @Override
  public List<Tuple> createBatch() {
    Integer v1 = 10;
    Integer v2 = Integer.MIN_VALUE / 3;
    Integer v3 = Integer.MAX_VALUE / 3;
    Integer v4 = Integer.MIN_VALUE / 2;
    Integer v5 = Integer.MAX_VALUE / 2;
    Integer v6 = -70;
    Integer nv = 0;
    Integer mn = Integer.MIN_VALUE;
    Integer mx = Integer.MAX_VALUE;

    return Arrays.asList(
      //            id    simple_t    nullable_t   array_t                                           array3_t                                                                                                                nullable_array_t                                        nullable_array3_t                                                                                        simple_lc_t  nullable_lc_t   array_lc_t                                        array3_lc_t                                                                                                      nullable_array_lc_t                                      nullable_array3_lc_t
      Tuple.of((byte)1,        mn,      mn,        new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, mn},                                   new Integer[][][]{{{mn, null, mn}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},           mn,        mn,      new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, mn},                                    new Integer[][][]{{{mn, null, mn}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}            ),
      Tuple.of((byte)2,        mn,      mn,        new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, mn},                                   new Integer[][][]{{{mn, null, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},     mn,        mn,      new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, mn},                                    new Integer[][][]{{{mn, null, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}      ),
      Tuple.of((byte)3,        mn,      mn,        new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, null, mn},                             new Integer[][][]{{{mn, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},           mn,        mn,      new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, null, mn},                              new Integer[][][]{{{mn, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}            ),
      Tuple.of((byte)4,        mn,      mn,        new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, null, mn},                             new Integer[][][]{{{mn, null, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},                     mn,        mn,      new Integer[]{mn, mn},                             new Integer[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, null, mn},                              new Integer[][][]{{{mn, null, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}                      ),
      Tuple.of((byte)5,        mx,      mx,        new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mx, mx},                                   new Integer[][][]{{{mx, null, mx}, {mx, mx, null}, {}}, {{mn, mn}, {mn, null, mn}, {}}, {{}, {null}, {}}},         mx,        mx,      new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mx, null, mx},                              new Integer[][][]{{{mx, null, mx}, {mx, mx, null}, {}}, {{mn, mn}, {mn, null, mn}, {}}, {{}, {null}, {}}}          ),
      Tuple.of((byte)6,        mn,      mn,        new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mx, mx},                                   new Integer[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{null}, {}, {}}},                     mn,        mn,      new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mx, null, mx},                              new Integer[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{null}, {}, {}}}                      ),
      Tuple.of((byte)7,        mx,      mx,        new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mx, null, mx},                             new Integer[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         mx,        mx,      new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mx, null, mx},                              new Integer[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                          ),
      Tuple.of((byte)8,        mn,      mn,        new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mx, null, mx},                             new Integer[][][]{{{mx, mx}, {mx, null, mx, null}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},               mn,        mn,      new Integer[]{mx, mx},                             new Integer[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mx, null, mx},                              new Integer[][][]{{{mx, mx}, {mx, null, mx, null}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}                ),
      Tuple.of((byte)9,        mx,      mx,        new Integer[]{mn, mx},                             new Integer[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, null, mx},                             new Integer[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                   mx,        mx,      new Integer[]{mn, mx},                             new Integer[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, null, mx},                              new Integer[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                    ),
      Tuple.of((byte)10,       mn,      mn,        new Integer[]{mn, mx},                             new Integer[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{mn, null, mx},                             new Integer[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                   mn,        mn,      new Integer[]{mn, mx},                             new Integer[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{mn, null, mx},                              new Integer[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                    ),
      Tuple.of((byte)11,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                                 new Integer[]{},                                         new Integer[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}},                                                       v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                          new Integer[]{},                                          new Integer[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}}                                                        ),
      Tuple.of((byte)12,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                                 new Integer[]{},                                         new Integer[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}},                                                       v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                          new Integer[]{},                                          new Integer[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}}                                                        ),
      Tuple.of((byte)13,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                                 new Integer[]{},                                         new Integer[][][]{{{}}},                                                                                           v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                          new Integer[]{},                                          new Integer[][][]{{{}}}                                                                                            ),
      Tuple.of((byte)14,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                                 new Integer[]{},                                         new Integer[][][]{{{}}},                                                                                           v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                          new Integer[]{},                                          new Integer[][][]{{{}}}                                                                                            ),
      Tuple.of((byte)15,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                                 new Integer[]{null},                                     new Integer[][][]{{{null}}},                                                                                       v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                          new Integer[]{null},                                      new Integer[][][]{{{null}}}                                                                                            ),
      Tuple.of((byte)16,       v2,      v3,        new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                                 new Integer[]{null},                                     new Integer[][][]{{{null}}},                                                                                       v2,        v3,      new Integer[]{},                                   new Integer[][][]{{{}}},                                                                                          new Integer[]{null},                                      new Integer[][][]{{{null}}}                                                                                            ),
      Tuple.of((byte)17,       v2,      v3,        new Integer[]{nv},                                 new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{nv},                                       new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                               v2,        v3,      new Integer[]{nv},                                 new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{nv},                                        new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                                ),
      Tuple.of((byte)18,       v2,      v3,        new Integer[]{nv},                                 new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Integer[]{nv},                                       new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                               v2,        v3,      new Integer[]{nv},                                 new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Integer[]{nv},                                        new Integer[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                                ),
      Tuple.of((byte)19,       v2,      v3,        new Integer[]{nv, mn, mx},                         new Integer[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         new Integer[]{nv, mn, null, mx},                         new Integer[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}},       v2,        v3,      new Integer[]{nv, mn, mx},                         new Integer[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                  new Integer[]{nv},                                        new Integer[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}}        ),
      Tuple.of((byte)20,       v2,      v3,        new Integer[]{nv, mn, mx},                         new Integer[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         new Integer[]{nv, mn, null, mx},                         new Integer[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}},       v2,        v3,      new Integer[]{nv, mn, mx},                         new Integer[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                  new Integer[]{nv},                                        new Integer[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}}        ),
      Tuple.of((byte)21,       v2,      v3,        new Integer[]{nv, mn, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{nv, mn, null, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v2,        v3,      new Integer[]{nv, mn, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{nv, mn, null, mx},                          new Integer[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)22,       v2,      v3,        new Integer[]{nv, mn, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{nv, mn, null, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, null, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v2,        v3,      new Integer[]{nv, mn, mx},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{nv, mn, null, mx},                          new Integer[][][]{{{nv, mn, mx, v1, v2, v3, null, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)23, nv,    null,        new Integer[]{v3, v1, nv, mx, v4},                 new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v3, v1, null, nv, mx, v3},                 new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5, null}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,      null,      new Integer[]{v3, v1, nv, mx, v4},                 new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{nv, v2, null, v3, v2},                       new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5, null}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}} ),
      Tuple.of((byte)24, nv,    null,        new Integer[]{v3, v1, nv, mx, v4},                 new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v3, v1, null, nv, mx, v3},                 new Integer[][][]{{{nv, mn, mx, null, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,      null,      new Integer[]{v3, v1, nv, mx, v4},                 new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{nv, v2, null, v3, v2},                       new Integer[][][]{{{nv, mn, mx, null, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}} ),
      Tuple.of((byte)25,       v1,      v1,        new Integer[]{v1, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v3, nv, null},                             new Integer[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v1,        v1,      new Integer[]{v1, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{v2, nv, null},                              new Integer[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)26,       nv,      nv,        new Integer[]{nv, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{nv, null, v4},                             new Integer[][][]{{{nv, null, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,        nv,      new Integer[]{nv, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{nv, null, nv},                              new Integer[][][]{{{nv, null, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)27,       v6,      v5,        new Integer[]{v4, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v3, nv, null},                             new Integer[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Integer[]{v4, nv, nv},                         new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{v2, nv, null},                              new Integer[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)28,       v6,      v5,        new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null}, new Integer[][][]{{{nv, mn, mx, v1, null, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null},  new Integer[][][]{{{nv, mn, mx, v1, null, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)29,       v6,      v5,        new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null}, new Integer[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Integer[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Integer[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null},  new Integer[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  )
    );
  }
}