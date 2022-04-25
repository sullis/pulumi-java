// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.outputs;

import com.pulumi.azurenative.datalakestore.outputs.KeyVaultMetaInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionConfigResponse {
    /**
     * @return The Key Vault information for connecting to user managed encryption keys.
     * 
     */
    private final @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo;
    /**
     * @return The type of encryption configuration being used. Currently the only supported types are &#39;UserManaged&#39; and &#39;ServiceManaged&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EncryptionConfigResponse(
        @CustomType.Parameter("keyVaultMetaInfo") @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo,
        @CustomType.Parameter("type") String type) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        this.type = type;
    }

    /**
     * @return The Key Vault information for connecting to user managed encryption keys.
     * 
     */
    public Optional<KeyVaultMetaInfoResponse> keyVaultMetaInfo() {
        return Optional.ofNullable(this.keyVaultMetaInfo);
    }
    /**
     * @return The type of encryption configuration being used. Currently the only supported types are &#39;UserManaged&#39; and &#39;ServiceManaged&#39;.
     * 
     */
    public String type() {
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

        public Builder keyVaultMetaInfo(@Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo) {
            this.keyVaultMetaInfo = keyVaultMetaInfo;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(keyVaultMetaInfo, type);
        }
    }
}
