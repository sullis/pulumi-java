// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hubspot Service linked service.
 * 
 */
public final class HubspotLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final HubspotLinkedServiceResponse Empty = new HubspotLinkedServiceResponse();

    /**
     * The access token obtained when initially authenticating your OAuth integration.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;

    /**
     * @return The access token obtained when initially authenticating your OAuth integration.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The client ID associated with your Hubspot application.
     * 
     */
    @Import(name="clientId", required=true)
    private Object clientId;

    /**
     * @return The client ID associated with your Hubspot application.
     * 
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * The client secret associated with your Hubspot application.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;

    /**
     * @return The client secret associated with your Hubspot application.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The refresh token obtained when initially authenticating your OAuth integration.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;

    /**
     * @return The refresh token obtained when initially authenticating your OAuth integration.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Hubspot&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;Hubspot&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Object useEncryptedEndpoints;

    /**
     * @return Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    public Optional<Object> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Object useHostVerification;

    /**
     * @return Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Object> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Object usePeerVerification;

    /**
     * @return Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    public Optional<Object> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    private HubspotLinkedServiceResponse() {}

    private HubspotLinkedServiceResponse(HubspotLinkedServiceResponse $) {
        this.accessToken = $.accessToken;
        this.annotations = $.annotations;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.refreshToken = $.refreshToken;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubspotLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubspotLinkedServiceResponse $;

        public Builder() {
            $ = new HubspotLinkedServiceResponse();
        }

        public Builder(HubspotLinkedServiceResponse defaults) {
            $ = new HubspotLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The access token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The access token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(AzureKeyVaultSecretReferenceResponse accessToken) {
            return accessToken(Either.ofLeft(accessToken));
        }

        /**
         * @param accessToken The access token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(SecureStringResponse accessToken) {
            return accessToken(Either.ofRight(accessToken));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param clientId The client ID associated with your Hubspot application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Object clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientSecret The client secret associated with your Hubspot application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret associated with your Hubspot application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(AzureKeyVaultSecretReferenceResponse clientSecret) {
            return clientSecret(Either.ofLeft(clientSecret));
        }

        /**
         * @param clientSecret The client secret associated with your Hubspot application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(SecureStringResponse clientSecret) {
            return clientSecret(Either.ofRight(clientSecret));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param refreshToken The refresh token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        /**
         * @param refreshToken The refresh token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(AzureKeyVaultSecretReferenceResponse refreshToken) {
            return refreshToken(Either.ofLeft(refreshToken));
        }

        /**
         * @param refreshToken The refresh token obtained when initially authenticating your OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder refreshToken(SecureStringResponse refreshToken) {
            return refreshToken(Either.ofRight(refreshToken));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;Hubspot&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param useEncryptedEndpoints Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        /**
         * @param useHostVerification Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        /**
         * @param usePeerVerification Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public HubspotLinkedServiceResponse build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
