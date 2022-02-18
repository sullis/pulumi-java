// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Amazon Marketplace Web Service linked service.
 * 
 */
public final class AmazonMWSLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AmazonMWSLinkedServiceResponse Empty = new AmazonMWSLinkedServiceResponse();

    /**
     * The access key id used to access data.
     * 
     */
    @InputImport(name="accessKeyId", required=true)
    private final Object accessKeyId;

    public Object getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final Object endpoint;

    public Object getEndpoint() {
        return this.endpoint;
    }

    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2)
     * 
     */
    @InputImport(name="marketplaceID", required=true)
    private final Object marketplaceID;

    public Object getMarketplaceID() {
        return this.marketplaceID;
    }

    /**
     * The Amazon MWS authentication token.
     * 
     */
    @InputImport(name="mwsAuthToken")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getMwsAuthToken() {
        return this.mwsAuthToken == null ? null : this.mwsAuthToken;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The secret key used to access data.
     * 
     */
    @InputImport(name="secretKey")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getSecretKey() {
        return this.secretKey == null ? null : this.secretKey;
    }

    /**
     * The Amazon seller ID.
     * 
     */
    @InputImport(name="sellerID", required=true)
    private final Object sellerID;

    public Object getSellerID() {
        return this.sellerID;
    }

    /**
     * Type of linked service.
     * Expected value is 'AmazonMWS'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Object useEncryptedEndpoints;

    public Optional<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Optional.empty() : Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="useHostVerification")
    private final @Nullable Object useHostVerification;

    public Optional<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Optional.empty() : Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="usePeerVerification")
    private final @Nullable Object usePeerVerification;

    public Optional<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Optional.empty() : Optional.ofNullable(this.usePeerVerification);
    }

    public AmazonMWSLinkedServiceResponse(
        Object accessKeyId,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object endpoint,
        Object marketplaceID,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey,
        Object sellerID,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.marketplaceID = Objects.requireNonNull(marketplaceID, "expected parameter 'marketplaceID' to be non-null");
        this.mwsAuthToken = mwsAuthToken;
        this.parameters = parameters;
        this.secretKey = secretKey;
        this.sellerID = Objects.requireNonNull(sellerID, "expected parameter 'sellerID' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private AmazonMWSLinkedServiceResponse() {
        this.accessKeyId = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.endpoint = null;
        this.marketplaceID = null;
        this.mwsAuthToken = null;
        this.parameters = Map.of();
        this.secretKey = null;
        this.sellerID = null;
        this.type = null;
        this.useEncryptedEndpoints = null;
        this.useHostVerification = null;
        this.usePeerVerification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonMWSLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object endpoint;
        private Object marketplaceID;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;
        private Object sellerID;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonMWSLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.marketplaceID = defaults.marketplaceID;
    	      this.mwsAuthToken = defaults.mwsAuthToken;
    	      this.parameters = defaults.parameters;
    	      this.secretKey = defaults.secretKey;
    	      this.sellerID = defaults.sellerID;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAccessKeyId(Object accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEndpoint(Object endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setMarketplaceID(Object marketplaceID) {
            this.marketplaceID = Objects.requireNonNull(marketplaceID);
            return this;
        }

        public Builder setMwsAuthToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken) {
            this.mwsAuthToken = mwsAuthToken;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSecretKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSellerID(Object sellerID) {
            this.sellerID = Objects.requireNonNull(sellerID);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public AmazonMWSLinkedServiceResponse build() {
            return new AmazonMWSLinkedServiceResponse(accessKeyId, annotations, connectVia, description, encryptedCredential, endpoint, marketplaceID, mwsAuthToken, parameters, secretKey, sellerID, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
