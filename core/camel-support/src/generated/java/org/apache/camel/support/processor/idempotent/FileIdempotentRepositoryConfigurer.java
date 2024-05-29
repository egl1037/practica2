/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.support.processor.idempotent;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class FileIdempotentRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.support.processor.idempotent.FileIdempotentRepository target = (org.apache.camel.support.processor.idempotent.FileIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachesize":
        case "cacheSize": target.setCacheSize(property(camelContext, int.class, value)); return true;
        case "dropoldestfilestore":
        case "dropOldestFileStore": target.setDropOldestFileStore(property(camelContext, long.class, value)); return true;
        case "filestore":
        case "fileStore": target.setFileStore(property(camelContext, java.io.File.class, value)); return true;
        case "maxfilestoresize":
        case "maxFileStoreSize": target.setMaxFileStoreSize(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachesize":
        case "cacheSize": return int.class;
        case "dropoldestfilestore":
        case "dropOldestFileStore": return long.class;
        case "filestore":
        case "fileStore": return java.io.File.class;
        case "maxfilestoresize":
        case "maxFileStoreSize": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.support.processor.idempotent.FileIdempotentRepository target = (org.apache.camel.support.processor.idempotent.FileIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachesize":
        case "cacheSize": return target.getCacheSize();
        case "dropoldestfilestore":
        case "dropOldestFileStore": return target.getDropOldestFileStore();
        case "filestore":
        case "fileStore": return target.getFileStore();
        case "maxfilestoresize":
        case "maxFileStoreSize": return target.getMaxFileStoreSize();
        default: return null;
        }
    }
}
