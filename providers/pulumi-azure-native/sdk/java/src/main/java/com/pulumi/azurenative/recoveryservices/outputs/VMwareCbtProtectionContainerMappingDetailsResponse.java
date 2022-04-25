// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VMwareCbtProtectionContainerMappingDetailsResponse {
    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The target key vault ARM Id.
     * 
     */
    private final String keyVaultId;
    /**
     * @return The target key vault URI.
     * 
     */
    private final String keyVaultUri;
    /**
     * @return The secret name of the service bus connection string.
     * 
     */
    private final String serviceBusConnectionStringSecretName;
    /**
     * @return The storage account ARM Id.
     * 
     */
    private final String storageAccountId;
    /**
     * @return The secret name of the storage account.
     * 
     */
    private final String storageAccountSasSecretName;
    /**
     * @return The target location.
     * 
     */
    private final String targetLocation;

    @CustomType.Constructor
    private VMwareCbtProtectionContainerMappingDetailsResponse(
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("keyVaultId") String keyVaultId,
        @CustomType.Parameter("keyVaultUri") String keyVaultUri,
        @CustomType.Parameter("serviceBusConnectionStringSecretName") String serviceBusConnectionStringSecretName,
        @CustomType.Parameter("storageAccountId") String storageAccountId,
        @CustomType.Parameter("storageAccountSasSecretName") String storageAccountSasSecretName,
        @CustomType.Parameter("targetLocation") String targetLocation) {
        this.instanceType = instanceType;
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
        this.serviceBusConnectionStringSecretName = serviceBusConnectionStringSecretName;
        this.storageAccountId = storageAccountId;
        this.storageAccountSasSecretName = storageAccountSasSecretName;
        this.targetLocation = targetLocation;
    }

    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The target key vault ARM Id.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return The target key vault URI.
     * 
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }
    /**
     * @return The secret name of the service bus connection string.
     * 
     */
    public String serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }
    /**
     * @return The storage account ARM Id.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }
    /**
     * @return The secret name of the storage account.
     * 
     */
    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }
    /**
     * @return The target location.
     * 
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtProtectionContainerMappingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private String keyVaultId;
        private String keyVaultUri;
        private String serviceBusConnectionStringSecretName;
        private String storageAccountId;
        private String storageAccountSasSecretName;
        private String targetLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtProtectionContainerMappingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.serviceBusConnectionStringSecretName = defaults.serviceBusConnectionStringSecretName;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageAccountSasSecretName = defaults.storageAccountSasSecretName;
    	      this.targetLocation = defaults.targetLocation;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        public Builder keyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }
        public Builder serviceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
            this.serviceBusConnectionStringSecretName = Objects.requireNonNull(serviceBusConnectionStringSecretName);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public Builder storageAccountSasSecretName(String storageAccountSasSecretName) {
            this.storageAccountSasSecretName = Objects.requireNonNull(storageAccountSasSecretName);
            return this;
        }
        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }        public VMwareCbtProtectionContainerMappingDetailsResponse build() {
            return new VMwareCbtProtectionContainerMappingDetailsResponse(instanceType, keyVaultId, keyVaultUri, serviceBusConnectionStringSecretName, storageAccountId, storageAccountSasSecretName, targetLocation);
        }
    }
}
