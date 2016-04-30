package com.camnter.androidutils.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于网络请求字段，排除字段
 */
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.FIELD) public @interface Exclude {}