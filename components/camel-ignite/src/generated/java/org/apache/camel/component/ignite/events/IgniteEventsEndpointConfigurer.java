/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ignite.events;

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
public class IgniteEventsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteEventsEndpoint target = (IgniteEventsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clustergroupexpression":
        case "clusterGroupExpression": target.setClusterGroupExpression(property(camelContext, org.apache.camel.component.ignite.ClusterGroupExpression.class, value)); return true;
        case "events": target.setEvents(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": target.setPropagateIncomingBodyIfNoReturnValue(property(camelContext, boolean.class, value)); return true;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": target.setTreatCollectionsAsCacheObjects(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clustergroupexpression":
        case "clusterGroupExpression": return org.apache.camel.component.ignite.ClusterGroupExpression.class;
        case "events": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return boolean.class;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteEventsEndpoint target = (IgniteEventsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clustergroupexpression":
        case "clusterGroupExpression": return target.getClusterGroupExpression();
        case "events": return target.getEvents();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return target.isPropagateIncomingBodyIfNoReturnValue();
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return target.isTreatCollectionsAsCacheObjects();
        default: return null;
        }
    }
}
