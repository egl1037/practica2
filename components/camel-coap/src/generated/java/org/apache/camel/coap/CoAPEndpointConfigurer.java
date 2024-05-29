/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.coap;

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
public class CoAPEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CoAPEndpoint target = (CoAPEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "advancedcertificateverifier":
        case "advancedCertificateVerifier": target.setAdvancedCertificateVerifier(property(camelContext, org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier.class, value)); return true;
        case "advancedpskstore":
        case "advancedPskStore": target.setAdvancedPskStore(property(camelContext, org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore.class, value)); return true;
        case "alias": target.setAlias(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "ciphersuites":
        case "cipherSuites": target.setCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "clientauthentication":
        case "clientAuthentication": target.setClientAuthentication(property(camelContext, org.eclipse.californium.elements.config.CertificateAuthenticationMode.class, value)); return true;
        case "coapmethodrestrict":
        case "coapMethodRestrict": target.setCoapMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "notify": target.setNotify(property(camelContext, boolean.class, value)); return true;
        case "observable": target.setObservable(property(camelContext, boolean.class, value)); return true;
        case "observe": target.setObserve(property(camelContext, boolean.class, value)); return true;
        case "privatekey":
        case "privateKey": target.setPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "publickey":
        case "publicKey": target.setPublicKey(property(camelContext, java.security.PublicKey.class, value)); return true;
        case "recommendedciphersuitesonly":
        case "recommendedCipherSuitesOnly": target.setRecommendedCipherSuitesOnly(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "advancedcertificateverifier":
        case "advancedCertificateVerifier": return org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier.class;
        case "advancedpskstore":
        case "advancedPskStore": return org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore.class;
        case "alias": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "ciphersuites":
        case "cipherSuites": return java.lang.String.class;
        case "clientauthentication":
        case "clientAuthentication": return org.eclipse.californium.elements.config.CertificateAuthenticationMode.class;
        case "coapmethodrestrict":
        case "coapMethodRestrict": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "notify": return boolean.class;
        case "observable": return boolean.class;
        case "observe": return boolean.class;
        case "privatekey":
        case "privateKey": return java.security.PrivateKey.class;
        case "publickey":
        case "publicKey": return java.security.PublicKey.class;
        case "recommendedciphersuitesonly":
        case "recommendedCipherSuitesOnly": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CoAPEndpoint target = (CoAPEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "advancedcertificateverifier":
        case "advancedCertificateVerifier": return target.getAdvancedCertificateVerifier();
        case "advancedpskstore":
        case "advancedPskStore": return target.getAdvancedPskStore();
        case "alias": return target.getAlias();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "ciphersuites":
        case "cipherSuites": return target.getCipherSuites();
        case "clientauthentication":
        case "clientAuthentication": return target.getClientAuthentication();
        case "coapmethodrestrict":
        case "coapMethodRestrict": return target.getCoapMethodRestrict();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "notify": return target.isNotify();
        case "observable": return target.isObservable();
        case "observe": return target.isObserve();
        case "privatekey":
        case "privateKey": return target.getPrivateKey();
        case "publickey":
        case "publicKey": return target.getPublicKey();
        case "recommendedciphersuitesonly":
        case "recommendedCipherSuitesOnly": return target.isRecommendedCipherSuitesOnly();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        default: return null;
        }
    }
}
