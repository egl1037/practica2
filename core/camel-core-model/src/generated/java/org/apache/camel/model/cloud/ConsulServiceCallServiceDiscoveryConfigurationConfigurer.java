/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.cloud;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.cloud.ConsulServiceCallServiceDiscoveryConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class ConsulServiceCallServiceDiscoveryConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AclToken", java.lang.String.class);
        map.put("BlockSeconds", java.lang.String.class);
        map.put("ConnectTimeoutMillis", java.lang.String.class);
        map.put("Datacenter", java.lang.String.class);
        map.put("Id", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("Properties", java.util.List.class);
        map.put("ReadTimeoutMillis", java.lang.String.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("Url", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        map.put("WriteTimeoutMillis", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.cloud.ConsulServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ConsulServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": target.setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": target.setBlockSeconds(property(camelContext, java.lang.String.class, value)); return true;
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": target.setConnectTimeoutMillis(property(camelContext, java.lang.String.class, value)); return true;
        case "datacenter": target.setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "properties": target.setProperties(property(camelContext, java.util.List.class, value)); return true;
        case "readtimeoutmillis":
        case "readTimeoutMillis": target.setReadTimeoutMillis(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": target.setWriteTimeoutMillis(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return java.lang.String.class;
        case "blockseconds":
        case "blockSeconds": return java.lang.String.class;
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": return java.lang.String.class;
        case "datacenter": return java.lang.String.class;
        case "id": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "properties": return java.util.List.class;
        case "readtimeoutmillis":
        case "readTimeoutMillis": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "url": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.cloud.ConsulServiceCallServiceDiscoveryConfiguration target = (org.apache.camel.model.cloud.ConsulServiceCallServiceDiscoveryConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return target.getAclToken();
        case "blockseconds":
        case "blockSeconds": return target.getBlockSeconds();
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": return target.getConnectTimeoutMillis();
        case "datacenter": return target.getDatacenter();
        case "id": return target.getId();
        case "password": return target.getPassword();
        case "properties": return target.getProperties();
        case "readtimeoutmillis":
        case "readTimeoutMillis": return target.getReadTimeoutMillis();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "url": return target.getUrl();
        case "username":
        case "userName": return target.getUserName();
        case "writetimeoutmillis":
        case "writeTimeoutMillis": return target.getWriteTimeoutMillis();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "properties": return org.apache.camel.model.PropertyDefinition.class;
        default: return null;
        }
    }
}
