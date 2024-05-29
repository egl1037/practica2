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
import org.apache.camel.component.google.storage.GoogleCloudStorageComponent;

/**
 * Store and retrieve objects from Google Cloud Storage Service using the
 * google-cloud-storage library.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleStorageComponentBuilderFactory {

    /**
     * Google Storage (camel-google-storage)
     * Store and retrieve objects from Google Cloud Storage Service using the
     * google-cloud-storage library.
     * 
     * Category: cloud
     * Since: 3.9
     * Maven coordinates: org.apache.camel:camel-google-storage
     * 
     * @return the dsl builder
     */
    static GoogleStorageComponentBuilder googleStorage() {
        return new GoogleStorageComponentBuilderImpl();
    }

    /**
     * Builder for the Google Storage component.
     */
    interface GoogleStorageComponentBuilder extends ComponentBuilder<GoogleCloudStorageComponent> {
    
        
        /**
         * Setting the autocreation of the bucket bucketName.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoCreateBucket the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder autoCreateBucket(boolean autoCreateBucket) {
            doSetProperty("autoCreateBucket", autoCreateBucket);
            return this;
        }
    
        /**
         * The component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder configuration(org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        /**
         * The Service account key that can be used as credentials for the
         * Storage client. It can be loaded by default from classpath, but you
         * can prefix with classpath:, file:, or http: to load the resource from
         * different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder serviceAccountKey(java.lang.String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    
        
        /**
         * The Cloud Storage class to use when creating the new buckets.
         * 
         * The option is a:
         * &lt;code&gt;com.google.cloud.storage.StorageClass&lt;/code&gt; type.
         * 
         * Default: STANDARD
         * Group: common
         * 
         * @param storageClass the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder storageClass(com.google.cloud.storage.StorageClass storageClass) {
            doSetProperty("storageClass", storageClass);
            return this;
        }
    
        /**
         * The storage client.
         * 
         * The option is a:
         * &lt;code&gt;com.google.cloud.storage.Storage&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param storageClient the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder storageClient(com.google.cloud.storage.Storage storageClient) {
            doSetProperty("storageClient", storageClient);
            return this;
        }
    
        
        /**
         * The Cloud Storage location to use when creating the new buckets.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: US-EAST1
         * Group: common
         * 
         * @param storageLocation the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder storageLocation(java.lang.String storageLocation) {
            doSetProperty("storageLocation", storageLocation);
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
        default GoogleStorageComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * Delete objects from the bucket after they have been retrieved. The
         * delete is only performed if the Exchange is committed. If a rollback
         * occurs, the object is not deleted. If this option is false, then the
         * same objects will be retrieve over and over again on the polls.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deleteAfterRead the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
    
        /**
         * Define the destination bucket where an object must be moved when
         * moveAfterRead is set to true.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param destinationBucket the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder destinationBucket(java.lang.String destinationBucket) {
            doSetProperty("destinationBucket", destinationBucket);
            return this;
        }
    
        /**
         * The folder or filename to use when downloading the blob. By default,
         * this specifies the folder name, and the name of the file is the blob
         * name. For example, setting this to mydownload will be the same as
         * setting mydownload/${file:name}. You can use dynamic expressions for
         * fine-grained control. For example, you can specify
         * ${date:now:yyyyMMdd}/${file:name} to store the blob in sub folders
         * based on today's day. Only ${file:name} and ${file:name.noext} is
         * supported as dynamic tokens for the blob name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param downloadFileName the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder downloadFileName(java.lang.String downloadFileName) {
            doSetProperty("downloadFileName", downloadFileName);
            return this;
        }
    
        /**
         * A regular expression to include only blobs with name matching it.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param filter the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder filter(java.lang.String filter) {
            doSetProperty("filter", filter);
            return this;
        }
    
        
        /**
         * If it is true, the Object exchange will be consumed and put into the
         * body. If false the Object stream will be put raw into the body and
         * the headers will be set with the object metadata.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param includeBody the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder includeBody(boolean includeBody) {
            doSetProperty("includeBody", includeBody);
            return this;
        }
    
        
        /**
         * If it is true, the folders/directories will be consumed. If it is
         * false, they will be ignored, and Exchanges will not be created for
         * those.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param includeFolders the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder includeFolders(boolean includeFolders) {
            doSetProperty("includeFolders", includeFolders);
            return this;
        }
    
        
        /**
         * Move objects from the origin bucket to a different bucket after they
         * have been retrieved. To accomplish the operation the
         * destinationBucket option must be set. The copy bucket operation is
         * only performed if the Exchange is committed. If a rollback occurs,
         * the object is not moved.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param moveAfterRead the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder moveAfterRead(boolean moveAfterRead) {
            doSetProperty("moveAfterRead", moveAfterRead);
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
        default GoogleStorageComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        /**
         * The Object name inside the bucket.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param objectName the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder objectName(java.lang.String objectName) {
            doSetProperty("objectName", objectName);
            return this;
        }
    
        /**
         * Set the operation for the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.google.storage.GoogleCloudStorageOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default GoogleStorageComponentBuilder operation(org.apache.camel.component.google.storage.GoogleCloudStorageOperations operation) {
            doSetProperty("operation", operation);
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
        default GoogleStorageComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
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
        default GoogleStorageComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
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
        default GoogleStorageComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class GoogleStorageComponentBuilderImpl
            extends AbstractComponentBuilder<GoogleCloudStorageComponent>
            implements GoogleStorageComponentBuilder {
        @Override
        protected GoogleCloudStorageComponent buildConcreteComponent() {
            return new GoogleCloudStorageComponent();
        }
        private org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration getOrCreateConfiguration(GoogleCloudStorageComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoCreateBucket": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setAutoCreateBucket((boolean) value); return true;
            case "configuration": ((GoogleCloudStorageComponent) component).setConfiguration((org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration) value); return true;
            case "serviceAccountKey": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setServiceAccountKey((java.lang.String) value); return true;
            case "storageClass": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setStorageClass((com.google.cloud.storage.StorageClass) value); return true;
            case "storageClient": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setStorageClient((com.google.cloud.storage.Storage) value); return true;
            case "storageLocation": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setStorageLocation((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((GoogleCloudStorageComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setDeleteAfterRead((boolean) value); return true;
            case "destinationBucket": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setDestinationBucket((java.lang.String) value); return true;
            case "downloadFileName": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setDownloadFileName((java.lang.String) value); return true;
            case "filter": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setFilter((java.lang.String) value); return true;
            case "includeBody": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setIncludeBody((boolean) value); return true;
            case "includeFolders": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setIncludeFolders((boolean) value); return true;
            case "moveAfterRead": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setMoveAfterRead((boolean) value); return true;
            case "lazyStartProducer": ((GoogleCloudStorageComponent) component).setLazyStartProducer((boolean) value); return true;
            case "objectName": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setObjectName((java.lang.String) value); return true;
            case "operation": getOrCreateConfiguration((GoogleCloudStorageComponent) component).setOperation((org.apache.camel.component.google.storage.GoogleCloudStorageOperations) value); return true;
            case "autowiredEnabled": ((GoogleCloudStorageComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((GoogleCloudStorageComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((GoogleCloudStorageComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}