/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.service_accounts;

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
public class KubernetesServiceAccountsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KubernetesServiceAccountsEndpoint target = (KubernetesServiceAccountsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertdata":
        case "caCertData": target.getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile":
        case "caCertFile": target.getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata":
        case "clientCertData": target.getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile":
        case "clientCertFile": target.getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo":
        case "clientKeyAlgo": target.getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata":
        case "clientKeyData": target.getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile":
        case "clientKeyFile": target.getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase":
        case "clientKeyPassphrase": target.getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "dnsdomain":
        case "dnsDomain": target.getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient":
        case "kubernetesClient": target.getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namespace": target.getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken":
        case "oauthToken": target.getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "portname":
        case "portName": target.getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol":
        case "portProtocol": target.getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts":
        case "trustCerts": target.getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return java.lang.String.class;
        case "cacertdata":
        case "caCertData": return java.lang.String.class;
        case "cacertfile":
        case "caCertFile": return java.lang.String.class;
        case "clientcertdata":
        case "clientCertData": return java.lang.String.class;
        case "clientcertfile":
        case "clientCertFile": return java.lang.String.class;
        case "clientkeyalgo":
        case "clientKeyAlgo": return java.lang.String.class;
        case "clientkeydata":
        case "clientKeyData": return java.lang.String.class;
        case "clientkeyfile":
        case "clientKeyFile": return java.lang.String.class;
        case "clientkeypassphrase":
        case "clientKeyPassphrase": return java.lang.String.class;
        case "connectiontimeout":
        case "connectionTimeout": return java.lang.Integer.class;
        case "dnsdomain":
        case "dnsDomain": return java.lang.String.class;
        case "kubernetesclient":
        case "kubernetesClient": return io.fabric8.kubernetes.client.KubernetesClient.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "namespace": return java.lang.String.class;
        case "oauthtoken":
        case "oauthToken": return java.lang.String.class;
        case "operation": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "portname":
        case "portName": return java.lang.String.class;
        case "portprotocol":
        case "portProtocol": return java.lang.String.class;
        case "trustcerts":
        case "trustCerts": return java.lang.Boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KubernetesServiceAccountsEndpoint target = (KubernetesServiceAccountsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "cacertdata":
        case "caCertData": return target.getConfiguration().getCaCertData();
        case "cacertfile":
        case "caCertFile": return target.getConfiguration().getCaCertFile();
        case "clientcertdata":
        case "clientCertData": return target.getConfiguration().getClientCertData();
        case "clientcertfile":
        case "clientCertFile": return target.getConfiguration().getClientCertFile();
        case "clientkeyalgo":
        case "clientKeyAlgo": return target.getConfiguration().getClientKeyAlgo();
        case "clientkeydata":
        case "clientKeyData": return target.getConfiguration().getClientKeyData();
        case "clientkeyfile":
        case "clientKeyFile": return target.getConfiguration().getClientKeyFile();
        case "clientkeypassphrase":
        case "clientKeyPassphrase": return target.getConfiguration().getClientKeyPassphrase();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "dnsdomain":
        case "dnsDomain": return target.getConfiguration().getDnsDomain();
        case "kubernetesclient":
        case "kubernetesClient": return target.getConfiguration().getKubernetesClient();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "namespace": return target.getConfiguration().getNamespace();
        case "oauthtoken":
        case "oauthToken": return target.getConfiguration().getOauthToken();
        case "operation": return target.getConfiguration().getOperation();
        case "password": return target.getConfiguration().getPassword();
        case "portname":
        case "portName": return target.getConfiguration().getPortName();
        case "portprotocol":
        case "portProtocol": return target.getConfiguration().getPortProtocol();
        case "trustcerts":
        case "trustCerts": return target.getConfiguration().getTrustCerts();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}

