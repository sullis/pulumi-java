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
 * Square Service linked service.
 * 
 */
public final class SquareLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SquareLinkedServiceResponse Empty = new SquareLinkedServiceResponse();

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
     * The client ID associated with your Square application.
     * 
     */
    @InputImport(name="clientId")
    private final @Nullable Object clientId;

    public Optional<Object> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret associated with your Square application.
     * 
     */
    @InputImport(name="clientSecret")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getClientSecret() {
        return this.clientSecret == null ? null : this.clientSecret;
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
     * Properties used to connect to Square. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @InputImport(name="connectionProperties")
    private final @Nullable Object connectionProperties;

    public Optional<Object> getConnectionProperties() {
        return this.connectionProperties == null ? Optional.empty() : Optional.ofNullable(this.connectionProperties);
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
     * The URL of the Square instance. (i.e. mystore.mysquare.com)
     * 
     */
    @InputImport(name="host")
    private final @Nullable Object host;

    public Optional<Object> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
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
     * The redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500)
     * 
     */
    @InputImport(name="redirectUri")
    private final @Nullable Object redirectUri;

    public Optional<Object> getRedirectUri() {
        return this.redirectUri == null ? Optional.empty() : Optional.ofNullable(this.redirectUri);
    }

    /**
     * Type of linked service.
     * Expected value is 'Square'.
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

    public SquareLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object clientId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionProperties,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object redirectUri,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.redirectUri = redirectUri;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private SquareLinkedServiceResponse() {
        this.annotations = List.of();
        this.clientId = null;
        this.clientSecret = null;
        this.connectVia = null;
        this.connectionProperties = null;
        this.description = null;
        this.encryptedCredential = null;
        this.host = null;
        this.parameters = Map.of();
        this.redirectUri = null;
        this.type = null;
        this.useEncryptedEndpoints = null;
        this.useHostVerification = null;
        this.usePeerVerification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SquareLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionProperties;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object redirectUri;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(SquareLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.redirectUri = defaults.redirectUri;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = connectionProperties;
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

        public Builder setHost(@Nullable Object host) {
            this.host = host;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRedirectUri(@Nullable Object redirectUri) {
            this.redirectUri = redirectUri;
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

        public SquareLinkedServiceResponse build() {
            return new SquareLinkedServiceResponse(annotations, clientId, clientSecret, connectVia, connectionProperties, description, encryptedCredential, host, parameters, redirectUri, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
