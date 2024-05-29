/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

/**
 * Transform messages using a Thymeleaf template.
 */
public fun UriDsl.thymeleaf(i: ThymeleafUriDsl.() -> Unit) {
  ThymeleafUriDsl(this).apply(i)
}

@CamelDslMarker
public class ThymeleafUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("thymeleaf")
  }

  private var resourceUri: String = ""

  /**
   * Path to the resource. You can prefix with: classpath, file, http, ref, or bean. classpath, file
   * and http loads the resource using these protocols (classpath is default). ref will lookup the
   * resource in the registry. bean will call a method on a bean to be used as the resource. For bean
   * you can specify the method name after dot, eg bean:myBean.myMethod.
   */
  public fun resourceUri(resourceUri: String) {
    this.resourceUri = resourceUri
    it.url("$resourceUri")
  }

  /**
   * Sets whether the context map should allow access to all details. By default only the message
   * body and headers can be accessed. This option can be enabled for full access to the current
   * Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the
   * full power of CamelContext API.
   */
  public fun allowContextMapAll(allowContextMapAll: String) {
    it.property("allowContextMapAll", allowContextMapAll)
  }

  /**
   * Sets whether the context map should allow access to all details. By default only the message
   * body and headers can be accessed. This option can be enabled for full access to the current
   * Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the
   * full power of CamelContext API.
   */
  public fun allowContextMapAll(allowContextMapAll: Boolean) {
    it.property("allowContextMapAll", allowContextMapAll.toString())
  }

  /**
   * Whether templates have to be considered cacheable or not.
   */
  public fun cacheable(cacheable: String) {
    it.property("cacheable", cacheable)
  }

  /**
   * Whether templates have to be considered cacheable or not.
   */
  public fun cacheable(cacheable: Boolean) {
    it.property("cacheable", cacheable.toString())
  }

  /**
   * The cache Time To Live for templates, expressed in milliseconds.
   */
  public fun cacheTimeToLive(cacheTimeToLive: String) {
    it.property("cacheTimeToLive", cacheTimeToLive)
  }

  /**
   * The cache Time To Live for templates, expressed in milliseconds.
   */
  public fun cacheTimeToLive(cacheTimeToLive: Int) {
    it.property("cacheTimeToLive", cacheTimeToLive.toString())
  }

  /**
   * Whether a template resources will be checked for existence before being returned.
   */
  public fun checkExistence(checkExistence: String) {
    it.property("checkExistence", checkExistence)
  }

  /**
   * Whether a template resources will be checked for existence before being returned.
   */
  public fun checkExistence(checkExistence: Boolean) {
    it.property("checkExistence", checkExistence.toString())
  }

  /**
   * Sets whether to use resource content cache or not
   */
  public fun contentCache(contentCache: String) {
    it.property("contentCache", contentCache)
  }

  /**
   * Sets whether to use resource content cache or not
   */
  public fun contentCache(contentCache: Boolean) {
    it.property("contentCache", contentCache.toString())
  }

  /**
   * The template mode to be applied to templates.
   */
  public fun templateMode(templateMode: String) {
    it.property("templateMode", templateMode)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }

  /**
   * The character encoding to be used for reading template resources.
   */
  public fun encoding(encoding: String) {
    it.property("encoding", encoding)
  }

  /**
   * The order in which this template will be resolved as part of the resolver chain.
   */
  public fun order(order: String) {
    it.property("order", order)
  }

  /**
   * The order in which this template will be resolved as part of the resolver chain.
   */
  public fun order(order: Int) {
    it.property("order", order.toString())
  }

  /**
   * An optional prefix added to template names to convert them into resource names.
   */
  public fun prefix(prefix: String) {
    it.property("prefix", prefix)
  }

  /**
   * The type of resolver to be used by the template engine.
   */
  public fun resolver(resolver: String) {
    it.property("resolver", resolver)
  }

  /**
   * An optional suffix added to template names to convert them into resource names.
   */
  public fun suffix(suffix: String) {
    it.property("suffix", suffix)
  }
}
