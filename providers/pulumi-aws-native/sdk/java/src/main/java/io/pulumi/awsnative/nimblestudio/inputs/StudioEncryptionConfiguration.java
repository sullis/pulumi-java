// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.StudioEncryptionConfigurationKeyType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Configuration of the encryption method that is used for the studio.</p>
 * 
 */
public final class StudioEncryptionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StudioEncryptionConfiguration Empty = new StudioEncryptionConfiguration();

    /**
     * <p>The ARN for a KMS key that is used to encrypt studio data.</p>
     * 
     */
    @InputImport(name="keyArn")
    private final @Nullable String keyArn;

    public Optional<String> getKeyArn() {
        return this.keyArn == null ? Optional.empty() : Optional.ofNullable(this.keyArn);
    }

    @InputImport(name="keyType", required=true)
    private final StudioEncryptionConfigurationKeyType keyType;

    public StudioEncryptionConfigurationKeyType getKeyType() {
        return this.keyType;
    }

    public StudioEncryptionConfiguration(
        @Nullable String keyArn,
        StudioEncryptionConfigurationKeyType keyType) {
        this.keyArn = keyArn;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private StudioEncryptionConfiguration() {
        this.keyArn = null;
        this.keyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyArn;
        private StudioEncryptionConfigurationKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder setKeyArn(@Nullable String keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder setKeyType(StudioEncryptionConfigurationKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public StudioEncryptionConfiguration build() {
            return new StudioEncryptionConfiguration(keyArn, keyType);
        }
    }
}
