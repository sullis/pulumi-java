// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.azurenative.datalakestore.outputs.KeyVaultMetaInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionConfigResponse {
    /**
     * The Key Vault information for connecting to user managed encryption keys.
     * 
     */
    private final @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo;
    /**
     * The type of encryption configuration being used. Currently the only supported types are 'UserManaged' and 'ServiceManaged'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"keyVaultMetaInfo","type"})
    private EncryptionConfigResponse(
        @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo,
        String type) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Key Vault information for connecting to user managed encryption keys.
     * 
    */
    public Optional<KeyVaultMetaInfoResponse> getKeyVaultMetaInfo() {
        return Optional.ofNullable(this.keyVaultMetaInfo);
    }
    /**
     * The type of encryption configuration being used. Currently the only supported types are 'UserManaged' and 'ServiceManaged'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultMetaInfo = defaults.keyVaultMetaInfo;
    	      this.type = defaults.type;
        }

        public Builder setKeyVaultMetaInfo(@Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo) {
            this.keyVaultMetaInfo = keyVaultMetaInfo;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(keyVaultMetaInfo, type);
        }
    }
}