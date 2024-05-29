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
import org.apache.camel.component.google.functions.GoogleCloudFunctionsComponent;

/**
 * Manage and invoke Google Cloud Functions
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleFunctionsComponentBuilderFactory {

    /**
     * Google Cloud Functions (camel-google-functions)
     * Manage and invoke Google Cloud Functions
     * 
     * Category: cloud
     * Since: 3.9
     * Maven coordinates: org.apache.camel:camel-google-functions
     * 
     * @return the dsl builder
     */
    static GoogleFunctionsComponentBuilder googleFunctions() {
        return new GoogleFunctionsComponentBuilderImpl();
    }

    /**
     * Builder for the Google Cloud Functions component.
     */
    interface GoogleFunctionsComponentBuilder extends ComponentBuilder<GoogleCloudFunctionsComponent> {
    
        
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
        default GoogleFunctionsComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default GoogleFunctionsComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class GoogleFunctionsComponentBuilderImpl
            extends AbstractComponentBuilder<GoogleCloudFunctionsComponent>
            implements GoogleFunctionsComponentBuilder {
        @Override
        protected GoogleCloudFunctionsComponent buildConcreteComponent() {
            return new GoogleCloudFunctionsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((GoogleCloudFunctionsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((GoogleCloudFunctionsComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}