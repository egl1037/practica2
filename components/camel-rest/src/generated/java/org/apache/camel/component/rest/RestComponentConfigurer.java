/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class RestComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestComponent target = (RestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": target.setApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercomponentname":
        case "consumerComponentName": target.setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "producercomponentname":
        case "producerComponentName": target.setProducerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumercomponentname":
        case "consumerComponentName": return java.lang.String.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "producercomponentname":
        case "producerComponentName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RestComponent target = (RestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": return target.getApiDoc();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumercomponentname":
        case "consumerComponentName": return target.getConsumerComponentName();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "producercomponentname":
        case "producerComponentName": return target.getProducerComponentName();
        default: return null;
        }
    }
}
