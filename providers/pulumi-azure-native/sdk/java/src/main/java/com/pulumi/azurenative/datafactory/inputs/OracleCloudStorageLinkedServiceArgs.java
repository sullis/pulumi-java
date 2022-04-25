// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
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
 * Linked service for Oracle Cloud Storage.
 * 
 */
public final class OracleCloudStorageLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleCloudStorageLinkedServiceArgs Empty = new OracleCloudStorageLinkedServiceArgs();

    /**
     * The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<Object> accessKeyId;

    /**
     * @return The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;

    /**
     * @return The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    /**
     * This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
    private @Nullable Output<Object> serviceUrl;

    /**
     * @return This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;OracleCloudStorage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;OracleCloudStorage&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private OracleCloudStorageLinkedServiceArgs() {}

    private OracleCloudStorageLinkedServiceArgs(OracleCloudStorageLinkedServiceArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.secretAccessKey = $.secretAccessKey;
        this.serviceUrl = $.serviceUrl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleCloudStorageLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleCloudStorageLinkedServiceArgs $;

        public Builder() {
            $ = new OracleCloudStorageLinkedServiceArgs();
        }

        public Builder(OracleCloudStorageLinkedServiceArgs defaults) {
            $ = new OracleCloudStorageLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<Object> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(Object accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
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
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param secretAccessKey The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * @param secretAccessKey The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        /**
         * @param secretAccessKey The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(AzureKeyVaultSecretReferenceArgs secretAccessKey) {
            return secretAccessKey(Either.ofLeft(secretAccessKey));
        }

        /**
         * @param secretAccessKey The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
         * 
         * @return builder
         * 
         */
        public Builder secretAccessKey(SecureStringArgs secretAccessKey) {
            return secretAccessKey(Either.ofRight(secretAccessKey));
        }

        /**
         * @param serviceUrl This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serviceUrl(@Nullable Output<Object> serviceUrl) {
            $.serviceUrl = serviceUrl;
            return this;
        }

        /**
         * @param serviceUrl This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serviceUrl(Object serviceUrl) {
            return serviceUrl(Output.of(serviceUrl));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;OracleCloudStorage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;OracleCloudStorage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OracleCloudStorageLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
