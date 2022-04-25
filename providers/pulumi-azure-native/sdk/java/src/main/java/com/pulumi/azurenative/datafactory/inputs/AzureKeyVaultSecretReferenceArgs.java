// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Key Vault secret reference.
 * 
 */
public final class AzureKeyVaultSecretReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureKeyVaultSecretReferenceArgs Empty = new AzureKeyVaultSecretReferenceArgs();

    /**
     * The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretName", required=true)
    private Output<Object> secretName;

    /**
     * @return The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> secretName() {
        return this.secretName;
    }

    /**
     * The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretVersion")
    private @Nullable Output<Object> secretVersion;

    /**
     * @return The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    /**
     * The Azure Key Vault linked service reference.
     * 
     */
    @Import(name="store", required=true)
    private Output<LinkedServiceReferenceArgs> store;

    /**
     * @return The Azure Key Vault linked service reference.
     * 
     */
    public Output<LinkedServiceReferenceArgs> store() {
        return this.store;
    }

    /**
     * Type of the secret.
     * Expected value is &#39;AzureKeyVaultSecret&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the secret.
     * Expected value is &#39;AzureKeyVaultSecret&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureKeyVaultSecretReferenceArgs() {}

    private AzureKeyVaultSecretReferenceArgs(AzureKeyVaultSecretReferenceArgs $) {
        this.secretName = $.secretName;
        this.secretVersion = $.secretVersion;
        this.store = $.store;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureKeyVaultSecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureKeyVaultSecretReferenceArgs $;

        public Builder() {
            $ = new AzureKeyVaultSecretReferenceArgs();
        }

        public Builder(AzureKeyVaultSecretReferenceArgs defaults) {
            $ = new AzureKeyVaultSecretReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretName The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<Object> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder secretName(Object secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param secretVersion The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(@Nullable Output<Object> secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        /**
         * @param secretVersion The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(Object secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        /**
         * @param store The Azure Key Vault linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder store(Output<LinkedServiceReferenceArgs> store) {
            $.store = store;
            return this;
        }

        /**
         * @param store The Azure Key Vault linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder store(LinkedServiceReferenceArgs store) {
            return store(Output.of(store));
        }

        /**
         * @param type Type of the secret.
         * Expected value is &#39;AzureKeyVaultSecret&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the secret.
         * Expected value is &#39;AzureKeyVaultSecret&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureKeyVaultSecretReferenceArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.store = Objects.requireNonNull($.store, "expected parameter 'store' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
