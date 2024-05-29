/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.knative;

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
public class KnativeComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.knative.KnativeConfiguration getOrCreateConfiguration(KnativeComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.knative.KnativeConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KnativeComponent target = (KnativeComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": getOrCreateConfiguration(target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "ceoverride":
        case "ceOverride": getOrCreateConfiguration(target).setCeOverride(property(camelContext, java.util.Map.class, value)); return true;
        case "cloudeventsspecversion":
        case "cloudEventsSpecVersion": getOrCreateConfiguration(target).setCloudEventsSpecVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "cloudeventstype":
        case "cloudEventsType": getOrCreateConfiguration(target).setCloudEventsType(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.knative.KnativeConfiguration.class, value)); return true;
        case "consumerfactory":
        case "consumerFactory": target.setConsumerFactory(property(camelContext, org.apache.camel.component.knative.spi.KnativeConsumerFactory.class, value)); return true;
        case "environment": getOrCreateConfiguration(target).setEnvironment(property(camelContext, org.apache.camel.component.knative.spi.KnativeEnvironment.class, value)); return true;
        case "environmentpath":
        case "environmentPath": target.setEnvironmentPath(property(camelContext, java.lang.String.class, value)); return true;
        case "filters": getOrCreateConfiguration(target).setFilters(property(camelContext, java.util.Map.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "kind": getOrCreateConfiguration(target).setKind(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "name": getOrCreateConfiguration(target).setName(property(camelContext, java.lang.String.class, value)); return true;
        case "producerfactory":
        case "producerFactory": target.setProducerFactory(property(camelContext, org.apache.camel.component.knative.spi.KnativeProducerFactory.class, value)); return true;
        case "reply": getOrCreateConfiguration(target).setReply(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "replywithcloudevent":
        case "replyWithCloudEvent": getOrCreateConfiguration(target).setReplyWithCloudEvent(property(camelContext, boolean.class, value)); return true;
        case "sinkbinding":
        case "sinkBinding": getOrCreateConfiguration(target).setSinkBinding(property(camelContext, org.apache.camel.component.knative.spi.KnativeSinkBinding.class, value)); return true;
        case "transportoptions":
        case "transportOptions": getOrCreateConfiguration(target).setTransportOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "typeid":
        case "typeId": getOrCreateConfiguration(target).setTypeId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "ceoverride":
        case "ceOverride": return java.util.Map.class;
        case "cloudeventsspecversion":
        case "cloudEventsSpecVersion": return java.lang.String.class;
        case "cloudeventstype":
        case "cloudEventsType": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.knative.KnativeConfiguration.class;
        case "consumerfactory":
        case "consumerFactory": return org.apache.camel.component.knative.spi.KnativeConsumerFactory.class;
        case "environment": return org.apache.camel.component.knative.spi.KnativeEnvironment.class;
        case "environmentpath":
        case "environmentPath": return java.lang.String.class;
        case "filters": return java.util.Map.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "kind": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "name": return java.lang.String.class;
        case "producerfactory":
        case "producerFactory": return org.apache.camel.component.knative.spi.KnativeProducerFactory.class;
        case "reply": return java.lang.Boolean.class;
        case "replywithcloudevent":
        case "replyWithCloudEvent": return boolean.class;
        case "sinkbinding":
        case "sinkBinding": return org.apache.camel.component.knative.spi.KnativeSinkBinding.class;
        case "transportoptions":
        case "transportOptions": return java.util.Map.class;
        case "typeid":
        case "typeId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KnativeComponent target = (KnativeComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return getOrCreateConfiguration(target).getApiVersion();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "ceoverride":
        case "ceOverride": return getOrCreateConfiguration(target).getCeOverride();
        case "cloudeventsspecversion":
        case "cloudEventsSpecVersion": return getOrCreateConfiguration(target).getCloudEventsSpecVersion();
        case "cloudeventstype":
        case "cloudEventsType": return getOrCreateConfiguration(target).getCloudEventsType();
        case "configuration": return target.getConfiguration();
        case "consumerfactory":
        case "consumerFactory": return target.getConsumerFactory();
        case "environment": return getOrCreateConfiguration(target).getEnvironment();
        case "environmentpath":
        case "environmentPath": return target.getEnvironmentPath();
        case "filters": return getOrCreateConfiguration(target).getFilters();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "kind": return getOrCreateConfiguration(target).getKind();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "name": return getOrCreateConfiguration(target).getName();
        case "producerfactory":
        case "producerFactory": return target.getProducerFactory();
        case "reply": return getOrCreateConfiguration(target).getReply();
        case "replywithcloudevent":
        case "replyWithCloudEvent": return getOrCreateConfiguration(target).isReplyWithCloudEvent();
        case "sinkbinding":
        case "sinkBinding": return getOrCreateConfiguration(target).getSinkBinding();
        case "transportoptions":
        case "transportOptions": return getOrCreateConfiguration(target).getTransportOptions();
        case "typeid":
        case "typeId": return getOrCreateConfiguration(target).getTypeId();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ceoverride":
        case "ceOverride": return java.lang.String.class;
        case "filters": return java.lang.String.class;
        case "transportoptions":
        case "transportOptions": return java.lang.Object.class;
        default: return null;
        }
    }
}
