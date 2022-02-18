// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.EncryptionStatus;
import io.pulumi.azurenative.machinelearningservices.inputs.IdentityForCmkArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPropertyArgs Empty = new EncryptionPropertyArgs();

    /**
     * The identity that will be used to access the key vault for encryption at rest.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<IdentityForCmkArgs> identity;

    public Input<IdentityForCmkArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Customer Key vault properties.
     * 
     */
    @InputImport(name="keyVaultProperties", required=true)
    private final Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Indicates whether or not the encryption is enabled for the workspace.
     * 
     */
    @InputImport(name="status", required=true)
    private final Input<Either<String,EncryptionStatus>> status;

    public Input<Either<String,EncryptionStatus>> getStatus() {
        return this.status;
    }

    public EncryptionPropertyArgs(
        @Nullable Input<IdentityForCmkArgs> identity,
        Input<KeyVaultPropertiesArgs> keyVaultProperties,
        Input<Either<String,EncryptionStatus>> status) {
        this.identity = identity;
        this.keyVaultProperties = Objects.requireNonNull(keyVaultProperties, "expected parameter 'keyVaultProperties' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private EncryptionPropertyArgs() {
        this.identity = Input.empty();
        this.keyVaultProperties = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityForCmkArgs> identity;
        private Input<KeyVaultPropertiesArgs> keyVaultProperties;
        private Input<Either<String,EncryptionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
        }

        public Builder setIdentity(@Nullable Input<IdentityForCmkArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityForCmkArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKeyVaultProperties(Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = Objects.requireNonNull(keyVaultProperties);
            return this;
        }

        public Builder setKeyVaultProperties(KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.of(Objects.requireNonNull(keyVaultProperties));
            return this;
        }

        public Builder setStatus(Input<Either<String,EncryptionStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(Either<String,EncryptionStatus> status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public EncryptionPropertyArgs build() {
            return new EncryptionPropertyArgs(identity, keyVaultProperties, status);
        }
    }
}
