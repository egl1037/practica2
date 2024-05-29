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
import org.apache.camel.component.aws2.ec2.AWS2EC2Component;

/**
 * Manage AWS EC2 instances.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2Ec2ComponentBuilderFactory {

    /**
     * AWS Elastic Compute Cloud (EC2) (camel-aws2-ec2)
     * Manage AWS EC2 instances.
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ec2
     * 
     * @return the dsl builder
     */
    static Aws2Ec2ComponentBuilder aws2Ec2() {
        return new Aws2Ec2ComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Elastic Compute Cloud (EC2) component.
     */
    interface Aws2Ec2ComponentBuilder extends ComponentBuilder<AWS2EC2Component> {
    
        /**
         * To use an existing configured AmazonEC2Client client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.ec2.Ec2Client&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonEc2Client the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder amazonEc2Client(software.amazon.awssdk.services.ec2.Ec2Client amazonEc2Client) {
            doSetProperty("amazonEc2Client", amazonEc2Client);
            return this;
        }
    
        /**
         * The component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ec2.AWS2EC2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder configuration(org.apache.camel.component.aws2.ec2.AWS2EC2Configuration configuration) {
            doSetProperty("configuration", configuration);
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
        default Aws2Ec2ComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        /**
         * The operation to perform. It can be createAndRunInstances,
         * startInstances, stopInstances, terminateInstances, describeInstances,
         * describeInstancesStatus, rebootInstances, monitorInstances,
         * unmonitorInstances, createTags or deleteTags.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ec2.AWS2EC2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder operation(org.apache.camel.component.aws2.ec2.AWS2EC2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
    
        
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
    
        
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
    
        /**
         * The region in which EC2 client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example, ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
    
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder uriEndpointOverride(java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
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
        default Aws2Ec2ComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
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
        default Aws2Ec2ComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
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
        default Aws2Ec2ComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    
        /**
         * To define a proxy host when instantiating the EC2 client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
    
        /**
         * To define a proxy port when instantiating the EC2 client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
    
        
        /**
         * To define a proxy protocol when instantiating the EC2 client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder proxyProtocol(software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
    
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
    
        /**
         * If using a profile credentials provider, this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder profileCredentialsName(java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
    
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    
        /**
         * Amazon AWS Session Token used when the user needs to assume an IAM
         * role.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sessionToken the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder sessionToken(java.lang.String sessionToken) {
            doSetProperty("sessionToken", sessionToken);
            return this;
        }
    
        
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder trustAllCertificates(boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
    
        
        /**
         * Set whether the EC2 client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder useDefaultCredentialsProvider(boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
    
        
        /**
         * Set whether the EC2 client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder useProfileCredentialsProvider(boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    
        
        /**
         * Set whether the EC2 client should expect to use Session Credentials.
         * This is useful in a situation in which the user needs to assume an
         * IAM role for doing operations in EC2.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useSessionCredentials the value to set
         * @return the dsl builder
         */
        default Aws2Ec2ComponentBuilder useSessionCredentials(boolean useSessionCredentials) {
            doSetProperty("useSessionCredentials", useSessionCredentials);
            return this;
        }
    }

    class Aws2Ec2ComponentBuilderImpl
            extends AbstractComponentBuilder<AWS2EC2Component>
            implements Aws2Ec2ComponentBuilder {
        @Override
        protected AWS2EC2Component buildConcreteComponent() {
            return new AWS2EC2Component();
        }
        private org.apache.camel.component.aws2.ec2.AWS2EC2Configuration getOrCreateConfiguration(AWS2EC2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ec2.AWS2EC2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonEc2Client": getOrCreateConfiguration((AWS2EC2Component) component).setAmazonEc2Client((software.amazon.awssdk.services.ec2.Ec2Client) value); return true;
            case "configuration": ((AWS2EC2Component) component).setConfiguration((org.apache.camel.component.aws2.ec2.AWS2EC2Configuration) value); return true;
            case "lazyStartProducer": ((AWS2EC2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((AWS2EC2Component) component).setOperation((org.apache.camel.component.aws2.ec2.AWS2EC2Operations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((AWS2EC2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "pojoRequest": getOrCreateConfiguration((AWS2EC2Component) component).setPojoRequest((boolean) value); return true;
            case "region": getOrCreateConfiguration((AWS2EC2Component) component).setRegion((java.lang.String) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((AWS2EC2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "autowiredEnabled": ((AWS2EC2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((AWS2EC2Component) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((AWS2EC2Component) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((AWS2EC2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((AWS2EC2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((AWS2EC2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((AWS2EC2Component) component).setAccessKey((java.lang.String) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((AWS2EC2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((AWS2EC2Component) component).setSecretKey((java.lang.String) value); return true;
            case "sessionToken": getOrCreateConfiguration((AWS2EC2Component) component).setSessionToken((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((AWS2EC2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((AWS2EC2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((AWS2EC2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            case "useSessionCredentials": getOrCreateConfiguration((AWS2EC2Component) component).setUseSessionCredentials((boolean) value); return true;
            default: return false;
            }
        }
    }
}