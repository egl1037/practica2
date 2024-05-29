/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.jooq.JooqComponent;

/**
 * Store and retrieve Java objects from an SQL database using JOOQ.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JooqComponentBuilderFactory {

    /**
     * JOOQ (camel-jooq)
     * Store and retrieve Java objects from an SQL database using JOOQ.
     * 
     * Category: database
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-jooq
     * 
     * @return the dsl builder
     */
    static JooqComponentBuilder jooq() {
        return new JooqComponentBuilderImpl();
    }

    /**
     * Builder for the JOOQ component.
     */
    interface JooqComponentBuilder extends ComponentBuilder<JooqComponent> {
    
        /**
         * Component configuration (database connection, database entity type,
         * etc.).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jooq.JooqConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder configuration(org.apache.camel.component.jooq.JooqConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        /**
         * To use a specific database configuration.
         * 
         * The option is a: &lt;code&gt;org.jooq.Configuration&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param databaseConfiguration the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder databaseConfiguration(org.jooq.Configuration databaseConfiguration) {
            doSetProperty("databaseConfiguration", databaseConfiguration);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * Delete entity after it is consumed.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param consumeDelete the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder consumeDelete(boolean consumeDelete) {
            doSetProperty("consumeDelete", consumeDelete);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Type of operation to execute on query.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jooq.JooqOperation&lt;/code&gt; type.
         * 
         * Default: NONE
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder operation(org.apache.camel.component.jooq.JooqOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
    
        /**
         * To execute plain SQL query.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder query(java.lang.String query) {
            doSetProperty("query", query);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default JooqComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class JooqComponentBuilderImpl
            extends AbstractComponentBuilder<JooqComponent>
            implements JooqComponentBuilder {
        @Override
        protected JooqComponent buildConcreteComponent() {
            return new JooqComponent();
        }
        private org.apache.camel.component.jooq.JooqConfiguration getOrCreateConfiguration(JooqComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.jooq.JooqConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((JooqComponent) component).setConfiguration((org.apache.camel.component.jooq.JooqConfiguration) value); return true;
            case "databaseConfiguration": getOrCreateConfiguration((JooqComponent) component).setDatabaseConfiguration((org.jooq.Configuration) value); return true;
            case "bridgeErrorHandler": ((JooqComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "consumeDelete": getOrCreateConfiguration((JooqComponent) component).setConsumeDelete((boolean) value); return true;
            case "lazyStartProducer": ((JooqComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((JooqComponent) component).setOperation((org.apache.camel.component.jooq.JooqOperation) value); return true;
            case "query": getOrCreateConfiguration((JooqComponent) component).setQuery((java.lang.String) value); return true;
            case "autowiredEnabled": ((JooqComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((JooqComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((JooqComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}