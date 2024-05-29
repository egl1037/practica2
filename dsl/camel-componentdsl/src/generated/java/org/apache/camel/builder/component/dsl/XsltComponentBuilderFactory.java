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
import org.apache.camel.component.xslt.XsltComponent;

/**
 * Transforms XML payload using an XSLT template.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface XsltComponentBuilderFactory {

    /**
     * XSLT (camel-xslt)
     * Transforms XML payload using an XSLT template.
     * 
     * Category: core,transformation
     * Since: 1.3
     * Maven coordinates: org.apache.camel:camel-xslt
     * 
     * @return the dsl builder
     */
    static XsltComponentBuilder xslt() {
        return new XsltComponentBuilderImpl();
    }

    /**
     * Builder for the XSLT component.
     */
    interface XsltComponentBuilder extends ComponentBuilder<XsltComponent> {
    
        
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder allowTemplateFromHeader(boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
    
        
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
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
        default XsltComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default XsltComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryClass the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder transformerFactoryClass(java.lang.String transformerFactoryClass) {
            doSetProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
    
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryConfigurationStrategy the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder transformerFactoryConfigurationStrategy(org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
    
        /**
         * To use a custom UriResolver. Should not be used together with the
         * option 'uriResolverFactory'.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.URIResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolver the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder uriResolver(javax.xml.transform.URIResolver uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
    
        /**
         * To use a custom UriResolver which depends on a dynamic endpoint
         * resource URI. Should not be used together with the option
         * 'uriResolver'.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.XsltUriResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolverFactory the value to set
         * @return the dsl builder
         */
        default XsltComponentBuilder uriResolverFactory(org.apache.camel.component.xslt.XsltUriResolverFactory uriResolverFactory) {
            doSetProperty("uriResolverFactory", uriResolverFactory);
            return this;
        }
    }

    class XsltComponentBuilderImpl
            extends AbstractComponentBuilder<XsltComponent>
            implements XsltComponentBuilder {
        @Override
        protected XsltComponent buildConcreteComponent() {
            return new XsltComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "allowTemplateFromHeader": ((XsltComponent) component).setAllowTemplateFromHeader((boolean) value); return true;
            case "contentCache": ((XsltComponent) component).setContentCache((boolean) value); return true;
            case "lazyStartProducer": ((XsltComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((XsltComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "transformerFactoryClass": ((XsltComponent) component).setTransformerFactoryClass((java.lang.String) value); return true;
            case "transformerFactoryConfigurationStrategy": ((XsltComponent) component).setTransformerFactoryConfigurationStrategy((org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy) value); return true;
            case "uriResolver": ((XsltComponent) component).setUriResolver((javax.xml.transform.URIResolver) value); return true;
            case "uriResolverFactory": ((XsltComponent) component).setUriResolverFactory((org.apache.camel.component.xslt.XsltUriResolverFactory) value); return true;
            default: return false;
            }
        }
    }
}