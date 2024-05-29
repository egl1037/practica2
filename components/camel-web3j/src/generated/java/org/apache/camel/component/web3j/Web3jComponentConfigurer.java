/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

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
public class Web3jComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.web3j.Web3jConfiguration getOrCreateConfiguration(Web3jComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.web3j.Web3jConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Web3jComponent target = (Web3jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": getOrCreateConfiguration(target).setAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "addresses": getOrCreateConfiguration(target).setAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "atblock":
        case "atBlock": getOrCreateConfiguration(target).setAtBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "blockhash":
        case "blockHash": getOrCreateConfiguration(target).setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.web3j.Web3jConfiguration.class, value)); return true;
        case "data": getOrCreateConfiguration(target).setData(property(camelContext, java.lang.String.class, value)); return true;
        case "databasename":
        case "databaseName": getOrCreateConfiguration(target).setDatabaseName(property(camelContext, java.lang.String.class, value)); return true;
        case "filterid":
        case "filterId": getOrCreateConfiguration(target).setFilterId(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "fromaddress":
        case "fromAddress": getOrCreateConfiguration(target).setFromAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "fromblock":
        case "fromBlock": getOrCreateConfiguration(target).setFromBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "fulltransactionobjects":
        case "fullTransactionObjects": getOrCreateConfiguration(target).setFullTransactionObjects(property(camelContext, boolean.class, value)); return true;
        case "gaslimit":
        case "gasLimit": getOrCreateConfiguration(target).setGasLimit(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "gasprice":
        case "gasPrice": getOrCreateConfiguration(target).setGasPrice(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "hashrate": getOrCreateConfiguration(target).setHashrate(property(camelContext, java.lang.String.class, value)); return true;
        case "headerpowhash":
        case "headerPowHash": getOrCreateConfiguration(target).setHeaderPowHash(property(camelContext, java.lang.String.class, value)); return true;
        case "index": getOrCreateConfiguration(target).setIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mixdigest":
        case "mixDigest": getOrCreateConfiguration(target).setMixDigest(property(camelContext, java.lang.String.class, value)); return true;
        case "nonce": getOrCreateConfiguration(target).setNonce(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "position": getOrCreateConfiguration(target).setPosition(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "priority": getOrCreateConfiguration(target).setPriority(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "privatefor":
        case "privateFor": getOrCreateConfiguration(target).setPrivateFor(property(camelContext, java.util.List.class, value)); return true;
        case "quorumapi":
        case "quorumAPI": getOrCreateConfiguration(target).setQuorumAPI(property(camelContext, boolean.class, value)); return true;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": getOrCreateConfiguration(target).setSha3HashOfDataToSign(property(camelContext, java.lang.String.class, value)); return true;
        case "signedtransactiondata":
        case "signedTransactionData": getOrCreateConfiguration(target).setSignedTransactionData(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcecode":
        case "sourceCode": getOrCreateConfiguration(target).setSourceCode(property(camelContext, java.lang.String.class, value)); return true;
        case "toaddress":
        case "toAddress": getOrCreateConfiguration(target).setToAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "toblock":
        case "toBlock": getOrCreateConfiguration(target).setToBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "topics": getOrCreateConfiguration(target).setTopics(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionhash":
        case "transactionHash": getOrCreateConfiguration(target).setTransactionHash(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": getOrCreateConfiguration(target).setTtl(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "value": getOrCreateConfiguration(target).setValue(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "web3j": getOrCreateConfiguration(target).setWeb3j(property(camelContext, org.web3j.protocol.Web3j.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": return java.lang.String.class;
        case "addresses": return java.util.List.class;
        case "atblock":
        case "atBlock": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "blockhash":
        case "blockHash": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.web3j.Web3jConfiguration.class;
        case "data": return java.lang.String.class;
        case "databasename":
        case "databaseName": return java.lang.String.class;
        case "filterid":
        case "filterId": return java.math.BigInteger.class;
        case "fromaddress":
        case "fromAddress": return java.lang.String.class;
        case "fromblock":
        case "fromBlock": return java.lang.String.class;
        case "fulltransactionobjects":
        case "fullTransactionObjects": return boolean.class;
        case "gaslimit":
        case "gasLimit": return java.math.BigInteger.class;
        case "gasprice":
        case "gasPrice": return java.math.BigInteger.class;
        case "hashrate": return java.lang.String.class;
        case "headerpowhash":
        case "headerPowHash": return java.lang.String.class;
        case "index": return java.math.BigInteger.class;
        case "keyname":
        case "keyName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mixdigest":
        case "mixDigest": return java.lang.String.class;
        case "nonce": return java.lang.String.class;
        case "operation": return java.lang.String.class;
        case "position": return java.math.BigInteger.class;
        case "priority": return java.math.BigInteger.class;
        case "privatefor":
        case "privateFor": return java.util.List.class;
        case "quorumapi":
        case "quorumAPI": return boolean.class;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": return java.lang.String.class;
        case "signedtransactiondata":
        case "signedTransactionData": return java.lang.String.class;
        case "sourcecode":
        case "sourceCode": return java.lang.String.class;
        case "toaddress":
        case "toAddress": return java.lang.String.class;
        case "toblock":
        case "toBlock": return java.lang.String.class;
        case "topics": return java.lang.String.class;
        case "transactionhash":
        case "transactionHash": return java.lang.String.class;
        case "ttl": return java.math.BigInteger.class;
        case "value": return java.math.BigInteger.class;
        case "web3j": return org.web3j.protocol.Web3j.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Web3jComponent target = (Web3jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": return getOrCreateConfiguration(target).getAddress();
        case "addresses": return getOrCreateConfiguration(target).getAddresses();
        case "atblock":
        case "atBlock": return getOrCreateConfiguration(target).getAtBlock();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "blockhash":
        case "blockHash": return getOrCreateConfiguration(target).getBlockHash();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "configuration": return target.getConfiguration();
        case "data": return getOrCreateConfiguration(target).getData();
        case "databasename":
        case "databaseName": return getOrCreateConfiguration(target).getDatabaseName();
        case "filterid":
        case "filterId": return getOrCreateConfiguration(target).getFilterId();
        case "fromaddress":
        case "fromAddress": return getOrCreateConfiguration(target).getFromAddress();
        case "fromblock":
        case "fromBlock": return getOrCreateConfiguration(target).getFromBlock();
        case "fulltransactionobjects":
        case "fullTransactionObjects": return getOrCreateConfiguration(target).isFullTransactionObjects();
        case "gaslimit":
        case "gasLimit": return getOrCreateConfiguration(target).getGasLimit();
        case "gasprice":
        case "gasPrice": return getOrCreateConfiguration(target).getGasPrice();
        case "hashrate": return getOrCreateConfiguration(target).getHashrate();
        case "headerpowhash":
        case "headerPowHash": return getOrCreateConfiguration(target).getHeaderPowHash();
        case "index": return getOrCreateConfiguration(target).getIndex();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mixdigest":
        case "mixDigest": return getOrCreateConfiguration(target).getMixDigest();
        case "nonce": return getOrCreateConfiguration(target).getNonce();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "position": return getOrCreateConfiguration(target).getPosition();
        case "priority": return getOrCreateConfiguration(target).getPriority();
        case "privatefor":
        case "privateFor": return getOrCreateConfiguration(target).getPrivateFor();
        case "quorumapi":
        case "quorumAPI": return getOrCreateConfiguration(target).isQuorumAPI();
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": return getOrCreateConfiguration(target).getSha3HashOfDataToSign();
        case "signedtransactiondata":
        case "signedTransactionData": return getOrCreateConfiguration(target).getSignedTransactionData();
        case "sourcecode":
        case "sourceCode": return getOrCreateConfiguration(target).getSourceCode();
        case "toaddress":
        case "toAddress": return getOrCreateConfiguration(target).getToAddress();
        case "toblock":
        case "toBlock": return getOrCreateConfiguration(target).getToBlock();
        case "topics": return getOrCreateConfiguration(target).getTopics();
        case "transactionhash":
        case "transactionHash": return getOrCreateConfiguration(target).getTransactionHash();
        case "ttl": return getOrCreateConfiguration(target).getTtl();
        case "value": return getOrCreateConfiguration(target).getValue();
        case "web3j": return getOrCreateConfiguration(target).getWeb3j();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addresses": return java.lang.String.class;
        case "privatefor":
        case "privateFor": return java.lang.String.class;
        default: return null;
        }
    }
}

