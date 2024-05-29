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
package org.apache.camel.test.main.junit5.annotation;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.main.junit5.CamelMainTest;
import org.apache.camel.test.main.junit5.common.MyMainClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test class ensuring that a repeated test is supported.
 */
@CamelMainTest(mainClass = MyMainClass.class)
class SupportRepeatedTest {

    @EndpointInject("mock:echo")
    MockEndpoint mock;

    @EndpointInject("direct:echo")
    ProducerTemplate template;

    @AfterEach
    void reset() {
        mock.reset();
    }

    @RepeatedTest(5)
    void shouldSupportMultipleCalls(RepetitionInfo repetitionInfo) throws Exception {
        assertEquals(5, repetitionInfo.getTotalRepetitions());
        mock.expectedBodiesReceived(repetitionInfo.getCurrentRepetition());
        int result = template.requestBody(repetitionInfo.getCurrentRepetition(), Integer.class);
        mock.assertIsSatisfied();
        assertEquals(repetitionInfo.getCurrentRepetition(), result);
    }

    @Nested
    class NestedTest {

        @RepeatedTest(5)
        void shouldSupportNestedTest(RepetitionInfo repetitionInfo) throws Exception {
            shouldSupportMultipleCalls(repetitionInfo);
        }
    }
}
