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
package org.apache.camel.component.pulsar.integration;

import org.apache.camel.CamelContext;
import org.apache.camel.component.pulsar.PulsarComponent;
import org.apache.camel.component.pulsar.utils.AutoConfiguration;
import org.apache.camel.spi.Registry;
import org.apache.camel.test.infra.pulsar.services.PulsarService;
import org.apache.camel.test.infra.pulsar.services.PulsarServiceFactory;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.pulsar.client.api.PulsarClient;
import org.junit.jupiter.api.extension.RegisterExtension;

public class PulsarITSupport extends CamelTestSupport {
    @RegisterExtension
    static PulsarService service = PulsarServiceFactory.createSingletonService();

    public String getPulsarBrokerUrl() {
        return service.getPulsarBrokerUrl();
    }

    public String getPulsarAdminUrl() {
        return service.getPulsarAdminUrl();
    }

    protected static void registerPulsarBeans(Registry registry, PulsarClient pulsarClient, CamelContext context) {
        AutoConfiguration autoConfiguration = new AutoConfiguration(null, null);

        registry.bind("pulsarClient", pulsarClient);
        PulsarComponent comp = new PulsarComponent(context);
        comp.setAutoConfiguration(autoConfiguration);
        comp.setPulsarClient(pulsarClient);
        registry.bind("pulsar", comp);
    }
}
