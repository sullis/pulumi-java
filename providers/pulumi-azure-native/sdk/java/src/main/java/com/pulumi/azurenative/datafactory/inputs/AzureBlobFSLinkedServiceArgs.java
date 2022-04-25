// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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
 * Azure Data Lake Storage Gen2 linked service.
 * 
 */
public final class AzureBlobFSLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSLinkedServiceArgs Empty = new AzureBlobFSLinkedServiceArgs();

    /**
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<Object> accountKey;

    /**
     * @return Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> accountKey() {
        return Optional.ofNullable(this.accountKey);
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
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
    private @Nullable Output<Object> azureCloudType;

    /**
     * @return Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> azureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
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
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    /**
     * @return The credential reference containing authentication information.
     * 
     */
    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
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
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;

    /**
     * @return The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalCredential() {
        return Optional.ofNullable(this.servicePrincipalCredential);
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
    private @Nullable Output<Object> servicePrincipalCredentialType;

    /**
     * @return The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> servicePrincipalCredentialType() {
        return Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    /**
     * @return The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    /**
     * @return The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<Object> tenant;

    /**
     * @return The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureBlobFS&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureBlobFS&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    /**
     * @return Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> url() {
        return this.url;
    }

    private AzureBlobFSLinkedServiceArgs() {}

    private AzureBlobFSLinkedServiceArgs(AzureBlobFSLinkedServiceArgs $) {
        this.accountKey = $.accountKey;
        this.annotations = $.annotations;
        this.azureCloudType = $.azureCloudType;
        this.connectVia = $.connectVia;
        this.credential = $.credential;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.servicePrincipalCredential = $.servicePrincipalCredential;
        this.servicePrincipalCredentialType = $.servicePrincipalCredentialType;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobFSLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobFSLinkedServiceArgs $;

        public Builder() {
            $ = new AzureBlobFSLinkedServiceArgs();
        }

        public Builder(AzureBlobFSLinkedServiceArgs defaults) {
            $ = new AzureBlobFSLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<Object> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder accountKey(Object accountKey) {
            return accountKey(Output.of(accountKey));
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
         * @param azureCloudType Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            $.azureCloudType = azureCloudType;
            return this;
        }

        /**
         * @param azureCloudType Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder azureCloudType(Object azureCloudType) {
            return azureCloudType(Output.of(azureCloudType));
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
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
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
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential) {
            $.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalCredential) {
            return servicePrincipalCredential(Output.of(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(AzureKeyVaultSecretReferenceArgs servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofLeft(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredential The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredential(SecureStringArgs servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofRight(servicePrincipalCredential));
        }

        /**
         * @param servicePrincipalCredentialType The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredentialType(@Nullable Output<Object> servicePrincipalCredentialType) {
            $.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        /**
         * @param servicePrincipalCredentialType The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalCredentialType(Object servicePrincipalCredentialType) {
            return servicePrincipalCredentialType(Output.of(servicePrincipalCredentialType));
        }

        /**
         * @param servicePrincipalId The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        /**
         * @param tenant The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AzureBlobFS&#39;.
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
         * Expected value is &#39;AzureBlobFS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(Object url) {
            return url(Output.of(url));
        }

        public AzureBlobFSLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
