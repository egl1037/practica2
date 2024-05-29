/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class BoxFilesManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Access", com.box.sdk.BoxSharedLink.Access.class);
        map.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        map.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        map.put("AuthenticationType", java.lang.String.class);
        map.put("Check", java.lang.Boolean.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("Content", java.io.InputStream.class);
        map.put("Created", java.util.Date.class);
        map.put("DestinationFolderId", java.lang.String.class);
        map.put("EncryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        map.put("EnterpriseId", java.lang.String.class);
        map.put("Fields", java.lang.String[].class);
        map.put("FileContent", java.io.InputStream.class);
        map.put("FileId", java.lang.String.class);
        map.put("FileName", java.lang.String.class);
        map.put("FileSize", java.lang.Long.class);
        map.put("HttpParams", java.util.Map.class);
        map.put("Info", com.box.sdk.BoxFile.Info.class);
        map.put("Listener", com.box.sdk.ProgressListener.class);
        map.put("MaxCacheEntries", int.class);
        map.put("Metadata", com.box.sdk.Metadata.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Modified", java.util.Date.class);
        map.put("NewFileName", java.lang.String.class);
        map.put("NewName", java.lang.String.class);
        map.put("Output", java.io.OutputStream.class);
        map.put("ParentFolderId", java.lang.String.class);
        map.put("Permissions", com.box.sdk.BoxSharedLink.Permissions.class);
        map.put("PrivateKeyFile", java.lang.String.class);
        map.put("PrivateKeyPassword", java.lang.String.class);
        map.put("PublicKeyId", java.lang.String.class);
        map.put("RangeEnd", java.lang.Long.class);
        map.put("RangeStart", java.lang.Long.class);
        map.put("Size", java.lang.Long.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("TypeName", java.lang.String.class);
        map.put("UnshareDate", java.util.Date.class);
        map.put("UserId", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        map.put("UserPassword", java.lang.String.class);
        map.put("Version", java.lang.Integer.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "access": target.setAccess(property(camelContext, com.box.sdk.BoxSharedLink.Access.class, value)); return true;
        case "accesstokencache":
        case "accessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "authenticationtype":
        case "authenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "check": target.setCheck(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "content": target.setContent(property(camelContext, java.io.InputStream.class, value)); return true;
        case "created": target.setCreated(property(camelContext, java.util.Date.class, value)); return true;
        case "destinationfolderid":
        case "destinationFolderId": target.setDestinationFolderId(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "encryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "enterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "fields": target.setFields(property(camelContext, java.lang.String[].class, value)); return true;
        case "filecontent":
        case "fileContent": target.setFileContent(property(camelContext, java.io.InputStream.class, value)); return true;
        case "fileid":
        case "fileId": target.setFileId(property(camelContext, java.lang.String.class, value)); return true;
        case "filename":
        case "fileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filesize":
        case "fileSize": target.setFileSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "httpparams":
        case "httpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "info": target.setInfo(property(camelContext, com.box.sdk.BoxFile.Info.class, value)); return true;
        case "listener": target.setListener(property(camelContext, com.box.sdk.ProgressListener.class, value)); return true;
        case "maxcacheentries":
        case "maxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "metadata": target.setMetadata(property(camelContext, com.box.sdk.Metadata.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "modified": target.setModified(property(camelContext, java.util.Date.class, value)); return true;
        case "newfilename":
        case "newFileName": target.setNewFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "newname":
        case "newName": target.setNewName(property(camelContext, java.lang.String.class, value)); return true;
        case "output": target.setOutput(property(camelContext, java.io.OutputStream.class, value)); return true;
        case "parentfolderid":
        case "parentFolderId": target.setParentFolderId(property(camelContext, java.lang.String.class, value)); return true;
        case "permissions": target.setPermissions(property(camelContext, com.box.sdk.BoxSharedLink.Permissions.class, value)); return true;
        case "privatekeyfile":
        case "privateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "privateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "publicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "rangeend":
        case "rangeEnd": target.setRangeEnd(property(camelContext, java.lang.Long.class, value)); return true;
        case "rangestart":
        case "rangeStart": target.setRangeStart(property(camelContext, java.lang.Long.class, value)); return true;
        case "size": target.setSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "typename":
        case "typeName": target.setTypeName(property(camelContext, java.lang.String.class, value)); return true;
        case "unsharedate":
        case "unshareDate": target.setUnshareDate(property(camelContext, java.util.Date.class, value)); return true;
        case "userid":
        case "userId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "userPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "version": target.setVersion(property(camelContext, java.lang.Integer.class, value)); return true;
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
        case "access": return com.box.sdk.BoxSharedLink.Access.class;
        case "accesstokencache":
        case "accessTokenCache": return com.box.sdk.IAccessTokenCache.class;
        case "apiname":
        case "apiName": return org.apache.camel.component.box.internal.BoxApiName.class;
        case "authenticationtype":
        case "authenticationType": return java.lang.String.class;
        case "check": return java.lang.Boolean.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "content": return java.io.InputStream.class;
        case "created": return java.util.Date.class;
        case "destinationfolderid":
        case "destinationFolderId": return java.lang.String.class;
        case "encryptionalgorithm":
        case "encryptionAlgorithm": return com.box.sdk.EncryptionAlgorithm.class;
        case "enterpriseid":
        case "enterpriseId": return java.lang.String.class;
        case "fields": return java.lang.String[].class;
        case "filecontent":
        case "fileContent": return java.io.InputStream.class;
        case "fileid":
        case "fileId": return java.lang.String.class;
        case "filename":
        case "fileName": return java.lang.String.class;
        case "filesize":
        case "fileSize": return java.lang.Long.class;
        case "httpparams":
        case "httpParams": return java.util.Map.class;
        case "info": return com.box.sdk.BoxFile.Info.class;
        case "listener": return com.box.sdk.ProgressListener.class;
        case "maxcacheentries":
        case "maxCacheEntries": return int.class;
        case "metadata": return com.box.sdk.Metadata.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "modified": return java.util.Date.class;
        case "newfilename":
        case "newFileName": return java.lang.String.class;
        case "newname":
        case "newName": return java.lang.String.class;
        case "output": return java.io.OutputStream.class;
        case "parentfolderid":
        case "parentFolderId": return java.lang.String.class;
        case "permissions": return com.box.sdk.BoxSharedLink.Permissions.class;
        case "privatekeyfile":
        case "privateKeyFile": return java.lang.String.class;
        case "privatekeypassword":
        case "privateKeyPassword": return java.lang.String.class;
        case "publickeyid":
        case "publicKeyId": return java.lang.String.class;
        case "rangeend":
        case "rangeEnd": return java.lang.Long.class;
        case "rangestart":
        case "rangeStart": return java.lang.Long.class;
        case "size": return java.lang.Long.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "typename":
        case "typeName": return java.lang.String.class;
        case "unsharedate":
        case "unshareDate": return java.util.Date.class;
        case "userid":
        case "userId": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "userpassword":
        case "userPassword": return java.lang.String.class;
        case "version": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "access": return target.getAccess();
        case "accesstokencache":
        case "accessTokenCache": return target.getAccessTokenCache();
        case "apiname":
        case "apiName": return target.getApiName();
        case "authenticationtype":
        case "authenticationType": return target.getAuthenticationType();
        case "check": return target.getCheck();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientsecret":
        case "clientSecret": return target.getClientSecret();
        case "content": return target.getContent();
        case "created": return target.getCreated();
        case "destinationfolderid":
        case "destinationFolderId": return target.getDestinationFolderId();
        case "encryptionalgorithm":
        case "encryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "enterpriseId": return target.getEnterpriseId();
        case "fields": return target.getFields();
        case "filecontent":
        case "fileContent": return target.getFileContent();
        case "fileid":
        case "fileId": return target.getFileId();
        case "filename":
        case "fileName": return target.getFileName();
        case "filesize":
        case "fileSize": return target.getFileSize();
        case "httpparams":
        case "httpParams": return target.getHttpParams();
        case "info": return target.getInfo();
        case "listener": return target.getListener();
        case "maxcacheentries":
        case "maxCacheEntries": return target.getMaxCacheEntries();
        case "metadata": return target.getMetadata();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "modified": return target.getModified();
        case "newfilename":
        case "newFileName": return target.getNewFileName();
        case "newname":
        case "newName": return target.getNewName();
        case "output": return target.getOutput();
        case "parentfolderid":
        case "parentFolderId": return target.getParentFolderId();
        case "permissions": return target.getPermissions();
        case "privatekeyfile":
        case "privateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "privateKeyPassword": return target.getPrivateKeyPassword();
        case "publickeyid":
        case "publicKeyId": return target.getPublicKeyId();
        case "rangeend":
        case "rangeEnd": return target.getRangeEnd();
        case "rangestart":
        case "rangeStart": return target.getRangeStart();
        case "size": return target.getSize();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "typename":
        case "typeName": return target.getTypeName();
        case "unsharedate":
        case "unshareDate": return target.getUnshareDate();
        case "userid":
        case "userId": return target.getUserId();
        case "username":
        case "userName": return target.getUserName();
        case "userpassword":
        case "userPassword": return target.getUserPassword();
        case "version": return target.getVersion();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpparams":
        case "httpParams": return java.lang.Object.class;
        default: return null;
        }
    }
}
