/*
 *
 *  * Copyright (c) 2021 Vladimir Vishnevsky
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Eclipse Public License 2.0 which is available at
 *  * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 *  * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *
 */

package io.vertx.clickhousenativeclient.alltypes;

import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.sqlclient.Tuple;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(VertxUnitRunner.class)
public class Int8Test extends AllTypesBase<Byte> {
  public Int8Test() {
    super("int8", new MyColumnChecker<>(Byte.class, null, null, null, null));
  }

  @Override
  public List<Tuple> createBatch() {
    Byte v1 = 10;
    Byte v2 = Byte.MIN_VALUE / 3;
    Byte v3 = Byte.MAX_VALUE / 3;
    Byte v4 = Byte.MIN_VALUE / 2;
    Byte v5 = Byte.MAX_VALUE / 2;
    Byte v6 = -70;
    Byte nv = 0;
    Byte mn = Byte.MIN_VALUE;
    Byte mx = Byte.MAX_VALUE;

    return Arrays.asList(
      //            id    simple_t    nullable_t   array_t                                           array3_t                                                                                                                nullable_array_t                                        nullable_array3_t                                                                                        simple_lc_t  nullable_lc_t   array_lc_t                                        array3_lc_t                                                                                                      nullable_array_lc_t                                      nullable_array3_lc_t
      Tuple.of((byte)1,        mn,      mn,        new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, mn},                                   new Byte[][][]{{{mn, null, mn}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},           mn,        mn,      new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, mn},                                    new Byte[][][]{{{mn, null, mn}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}            ),
      Tuple.of((byte)2,        mn,      mn,        new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, mn},                                   new Byte[][][]{{{mn, null, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},     mn,        mn,      new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, mn},                                    new Byte[][][]{{{mn, null, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}      ),
      Tuple.of((byte)3,        mn,      mn,        new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, null, mn},                             new Byte[][][]{{{mn, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},           mn,        mn,      new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, null, mn},                              new Byte[][][]{{{mn, mn, null}, {mn, mn, null}, {null}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}            ),
      Tuple.of((byte)4,        mn,      mn,        new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, null, mn},                             new Byte[][][]{{{mn, null, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},                     mn,        mn,      new Byte[]{mn, mn},                             new Byte[][][]{{{mn, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, null, mn},                              new Byte[][][]{{{mn, null, mn}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}                      ),
      Tuple.of((byte)5,        mx,      mx,        new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mx, mx},                                   new Byte[][][]{{{mx, null, mx}, {mx, mx, null}, {}}, {{mn, mn}, {mn, null, mn}, {}}, {{}, {null}, {}}},         mx,        mx,      new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mx, null, mx},                              new Byte[][][]{{{mx, null, mx}, {mx, mx, null}, {}}, {{mn, mn}, {mn, null, mn}, {}}, {{}, {null}, {}}}          ),
      Tuple.of((byte)6,        mn,      mn,        new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mx, mx},                                   new Byte[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{null}, {}, {}}},                     mn,        mn,      new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mx, null, mx},                              new Byte[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{null}, {}, {}}}                      ),
      Tuple.of((byte)7,        mx,      mx,        new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mx, null, mx},                             new Byte[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         mx,        mx,      new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mx, null, mx},                              new Byte[][][]{{{mx, mx}, {mx, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                          ),
      Tuple.of((byte)8,        mn,      mn,        new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mx, null, mx},                             new Byte[][][]{{{mx, mx}, {mx, null, mx, null}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}},               mn,        mn,      new Byte[]{mx, mx},                             new Byte[][][]{{{mx, mx}, {mx, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mx, null, mx},                              new Byte[][][]{{{mx, mx}, {mx, null, mx, null}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {null}, {}}}                ),
      Tuple.of((byte)9,        mx,      mx,        new Byte[]{mn, mx},                             new Byte[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, null, mx},                             new Byte[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                   mx,        mx,      new Byte[]{mn, mx},                             new Byte[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, null, mx},                              new Byte[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                    ),
      Tuple.of((byte)10,       mn,      mn,        new Byte[]{mn, mx},                             new Byte[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{mn, null, mx},                             new Byte[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                   mn,        mn,      new Byte[]{mn, mx},                             new Byte[][][]{{{mn, mx}, {mn, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{mn, null, mx},                              new Byte[][][]{{{mn, mx, null}, {mn, null, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                    ),
      Tuple.of((byte)11,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                                 new Byte[]{},                                         new Byte[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}},                                                       v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                          new Byte[]{},                                          new Byte[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}}                                                        ),
      Tuple.of((byte)12,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                                 new Byte[]{},                                         new Byte[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}},                                                       v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}, {}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                          new Byte[]{},                                          new Byte[][][]{{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}}                                                        ),
      Tuple.of((byte)13,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                                 new Byte[]{},                                         new Byte[][][]{{{}}},                                                                                           v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                          new Byte[]{},                                          new Byte[][][]{{{}}}                                                                                            ),
      Tuple.of((byte)14,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                                 new Byte[]{},                                         new Byte[][][]{{{}}},                                                                                           v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                          new Byte[]{},                                          new Byte[][][]{{{}}}                                                                                            ),
      Tuple.of((byte)15,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                                 new Byte[]{null},                                     new Byte[][][]{{{null}}},                                                                                       v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                          new Byte[]{null},                                      new Byte[][][]{{{null}}}                                                                                            ),
      Tuple.of((byte)16,       v2,      v3,        new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                                 new Byte[]{null},                                     new Byte[][][]{{{null}}},                                                                                       v2,        v3,      new Byte[]{},                                   new Byte[][][]{{{}}},                                                                                          new Byte[]{null},                                      new Byte[][][]{{{null}}}                                                                                            ),
      Tuple.of((byte)17,       v2,      v3,        new Byte[]{nv},                                 new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{nv},                                       new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                               v2,        v3,      new Byte[]{nv},                                 new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{nv},                                        new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                                ),
      Tuple.of((byte)18,       v2,      v3,        new Byte[]{nv},                                 new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                                     new Byte[]{nv},                                       new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                               v2,        v3,      new Byte[]{nv},                                 new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                              new Byte[]{nv},                                        new Byte[][][]{{{nv, nv}, {nv, nv}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}                                ),
      Tuple.of((byte)19,       v2,      v3,        new Byte[]{nv, mn, mx},                         new Byte[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         new Byte[]{nv, mn, null, mx},                         new Byte[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}},       v2,        v3,      new Byte[]{nv, mn, mx},                         new Byte[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                  new Byte[]{nv},                                        new Byte[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}}        ),
      Tuple.of((byte)20,       v2,      v3,        new Byte[]{nv, mn, mx},                         new Byte[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                         new Byte[]{nv, mn, null, mx},                         new Byte[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}},       v2,        v3,      new Byte[]{nv, mn, mx},                         new Byte[][][]{{{v2, nv, mn}, {v3, mn, nv, mx}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},                  new Byte[]{nv},                                        new Byte[][][]{{{v2, nv, mn, null}, {v3, mn, nv, mx}, {}}, {{mn, mn, null}, {mn, mn}, {}}, {{}, {}, {}}}        ),
      Tuple.of((byte)21,       v2,      v3,        new Byte[]{nv, mn, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{nv, mn, null, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v2,        v3,      new Byte[]{nv, mn, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{nv, mn, null, mx},                          new Byte[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)22,       v2,      v3,        new Byte[]{nv, mn, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{nv, mn, null, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, null, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v2,        v3,      new Byte[]{nv, mn, mx},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{nv, mn, null, mx},                          new Byte[][][]{{{nv, mn, mx, v1, v2, v3, null, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)23, nv,    null,        new Byte[]{v3, v1, nv, mx, v4},                 new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v3, v1, null, nv, mx, v3},                 new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5, null}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,      null,      new Byte[]{v3, v1, nv, mx, v4},                 new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{nv, v2, null, v3, v2},                       new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5, null}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}} ),
      Tuple.of((byte)24, nv,    null,        new Byte[]{v3, v1, nv, mx, v4},                 new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v3, v1, null, nv, mx, v3},                 new Byte[][][]{{{nv, mn, mx, null, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,      null,      new Byte[]{v3, v1, nv, mx, v4},                 new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{nv, v2, null, v3, v2},                       new Byte[][][]{{{nv, mn, mx, null, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}} ),
      Tuple.of((byte)25,       v1,      v1,        new Byte[]{v1, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v3, nv, null},                             new Byte[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v1,        v1,      new Byte[]{v1, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{v2, nv, null},                              new Byte[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)26,       nv,      nv,        new Byte[]{nv, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{nv, null, v4},                             new Byte[][][]{{{nv, null, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, nv,        nv,      new Byte[]{nv, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{nv, null, nv},                              new Byte[][][]{{{nv, null, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)27,       v6,      v5,        new Byte[]{v4, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v3, nv, null},                             new Byte[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Byte[]{v4, nv, nv},                         new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{v2, nv, null},                              new Byte[][][]{{{nv, mn, null, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)28,       v6,      v5,        new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null}, new Byte[][][]{{{nv, mn, mx, v1, null, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null},  new Byte[][][]{{{nv, mn, mx, v1, null, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  ),
      Tuple.of((byte)29,       v6,      v5,        new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},             new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null}, new Byte[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}, v6,        v5,      new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6}, new Byte[][][]{{{nv, mn, mx, v1, v2, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}},      new Byte[]{v1, nv, mn, mx, v2, v3, v4, v5, v6, null},  new Byte[][][]{{{nv, mn, mx, v1, v2, null, v3, v4, v5}, {mn, mn}, {}}, {{mn, mn}, {mn, mn}, {}}, {{}, {}, {}}}  )
    );
  }
}
