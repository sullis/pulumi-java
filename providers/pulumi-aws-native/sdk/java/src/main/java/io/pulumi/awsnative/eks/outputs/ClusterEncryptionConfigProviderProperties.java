// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEncryptionConfigProviderProperties {
    /**
     * Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
     * 
     */
    private final @Nullable String keyArn;

    @OutputCustomType.Constructor
    private ClusterEncryptionConfigProviderProperties(@OutputCustomType.Parameter("keyArn") @Nullable String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
     * 
    */
    public Optional<String> getKeyArn() {
        return Optional.ofNullable(this.keyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigProviderProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigProviderProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder setKeyArn(@Nullable String keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public ClusterEncryptionConfigProviderProperties build() {
            return new ClusterEncryptionConfigProviderProperties(keyArn);
        }
    }
}
