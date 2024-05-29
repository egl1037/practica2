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
package org.apache.camel.component.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * This bean has both a default no-arg and a autowired constructor
 */
public class AutowireConstructorTwoBean {

    private final MyBeanCounter counter;

    public AutowireConstructorTwoBean() {
        this.counter = null;
    }

    public AutowireConstructorTwoBean(@Autowired MyBeanCounter counter) {
        this.counter = counter;
    }

    public String hello(String name) {
        return "Hello " + name + " at " + counter.count();
    }
}
