// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
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
public final class AzureKeyVaultSecretReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureKeyVaultSecretReferenceResponse Empty = new AzureKeyVaultSecretReferenceResponse();

    /**
     * The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretName", required=true)
      private final Object secretName;

    public Object secretName() {
        return this.secretName;
    }

    /**
     * The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable Object secretVersion;

    public Optional<Object> secretVersion() {
        return this.secretVersion == null ? Optional.empty() : Optional.ofNullable(this.secretVersion);
    }

    /**
     * The Azure Key Vault linked service reference.
     * 
     */
    @Import(name="store", required=true)
      private final LinkedServiceReferenceResponse store;

    public LinkedServiceReferenceResponse store() {
        return this.store;
    }

    /**
     * Type of the secret.
     * Expected value is 'AzureKeyVaultSecret'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureKeyVaultSecretReferenceResponse(
        Object secretName,
        @Nullable Object secretVersion,
        LinkedServiceReferenceResponse store,
        String type) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.secretVersion = secretVersion;
        this.store = Objects.requireNonNull(store, "expected parameter 'store' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AzureKeyVaultSecretReferenceResponse() {
        this.secretName = null;
        this.secretVersion = null;
        this.store = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureKeyVaultSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object secretName;
        private @Nullable Object secretVersion;
        private LinkedServiceReferenceResponse store;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureKeyVaultSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.store = defaults.store;
    	      this.type = defaults.type;
        }

        public Builder secretName(Object secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretVersion(@Nullable Object secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder store(LinkedServiceReferenceResponse store) {
            this.store = Objects.requireNonNull(store);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureKeyVaultSecretReferenceResponse build() {
            return new AzureKeyVaultSecretReferenceResponse(secretName, secretVersion, store, type);
        }
    }
}
