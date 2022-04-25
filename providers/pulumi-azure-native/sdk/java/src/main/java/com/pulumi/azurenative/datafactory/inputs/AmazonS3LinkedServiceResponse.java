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
 * Linked service for Amazon S3.
 * 
 */
public final class AmazonS3LinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmazonS3LinkedServiceResponse Empty = new AmazonS3LinkedServiceResponse();

    /**
     * The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Object accessKeyId;

    /**
     * @return The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
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
     * The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Object authenticationType;

    /**
     * @return The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
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
     * The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;

    /**
     * @return The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    /**
     * This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
    private @Nullable Object serviceUrl;

    /**
     * @return This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }

    /**
     * The session token for the S3 temporary security credential.
     * 
     */
    @Import(name="sessionToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken;

    /**
     * @return The session token for the S3 temporary security credential.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonS3&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;AmazonS3&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AmazonS3LinkedServiceResponse() {}

    private AmazonS3LinkedServiceResponse(AmazonS3LinkedServiceResponse $) {
        this.accessKeyId = $.accessKeyId;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.secretAccessKey = $.secretAccessKey;
        this.serviceUrl = $.serviceUrl;
        this.sessionToken = $.sessionToken;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonS3LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonS3LinkedServiceResponse $;

        public Builder() {
            $ = new AmazonS3LinkedServiceResponse();
        }

        public Builder(AmazonS3LinkedServiceResponse defaults) {
            $ = new AmazonS3LinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Object accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
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
         * @param authenticationType The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Object authenticationType) {
            $.authenticationType = authenticationType;
            return this;
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
         * @param secretAccessKey The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(AzureKeyVaultSecretReferenceResponse secretAccessKey) {
            return secretAccessKey(Either.ofLeft(secretAccessKey));
        }

        /**
         * @param secretAccessKey The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(SecureStringResponse secretAccessKey) {
            return secretAccessKey(Either.ofRight(secretAccessKey));
        }

        /**
         * @param serviceUrl This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            $.serviceUrl = serviceUrl;
            return this;
        }

        /**
         * @param sessionToken The session token for the S3 temporary security credential.
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken) {
            $.sessionToken = sessionToken;
            return this;
        }

        /**
         * @param sessionToken The session token for the S3 temporary security credential.
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(AzureKeyVaultSecretReferenceResponse sessionToken) {
            return sessionToken(Either.ofLeft(sessionToken));
        }

        /**
         * @param sessionToken The session token for the S3 temporary security credential.
         * 
         * @return builder
         * 
         */
        public Builder sessionToken(SecureStringResponse sessionToken) {
            return sessionToken(Either.ofRight(sessionToken));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AmazonS3&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AmazonS3LinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
