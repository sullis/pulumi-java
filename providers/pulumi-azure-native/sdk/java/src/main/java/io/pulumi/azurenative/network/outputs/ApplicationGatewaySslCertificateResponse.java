// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewaySslCertificateResponse {
    /**
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     * 
     */
    private final @Nullable String data;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    private final @Nullable String keyVaultSecretId;
    /**
     * Name of the SSL certificate that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Password for the pfx file specified in data. Only applicable in PUT request.
     * 
     */
    private final @Nullable String password;
    /**
     * The provisioning state of the SSL certificate resource.
     * 
     */
    private final String provisioningState;
    /**
     * Base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     * 
     */
    private final String publicCertData;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"data","etag","id","keyVaultSecretId","name","password","provisioningState","publicCertData","type"})
    private ApplicationGatewaySslCertificateResponse(
        @Nullable String data,
        String etag,
        @Nullable String id,
        @Nullable String keyVaultSecretId,
        @Nullable String name,
        @Nullable String password,
        String provisioningState,
        String publicCertData,
        String type) {
        this.data = data;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
        this.password = password;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicCertData = Objects.requireNonNull(publicCertData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     * 
    */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
    */
    public Optional<String> getKeyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }
    /**
     * Name of the SSL certificate that is unique within an Application Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Password for the pfx file specified in data. Only applicable in PUT request.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The provisioning state of the SSL certificate resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     * 
    */
    public String getPublicCertData() {
        return this.publicCertData;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;
        private @Nullable String password;
        private String provisioningState;
        private String publicCertData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicCertData = defaults.publicCertData;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable String data) {
            this.data = data;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKeyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicCertData(String publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewaySslCertificateResponse build() {
            return new ApplicationGatewaySslCertificateResponse(data, etag, id, keyVaultSecretId, name, password, provisioningState, publicCertData, type);
        }
    }
}