// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption provider for the cluster.
 * 
 */
public final class ClusterEncryptionConfigProviderPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigProviderPropertiesArgs Empty = new ClusterEncryptionConfigProviderPropertiesArgs();

    /**
     * Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
     * 
     */
    @Import(name="keyArn")
      private final @Nullable Output<String> keyArn;

    public Output<String> getKeyArn() {
        return this.keyArn == null ? Output.empty() : this.keyArn;
    }

    public ClusterEncryptionConfigProviderPropertiesArgs(@Nullable Output<String> keyArn) {
        this.keyArn = keyArn;
    }

    private ClusterEncryptionConfigProviderPropertiesArgs() {
        this.keyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder keyArn(@Nullable Output<String> keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public Builder keyArn(@Nullable String keyArn) {
            this.keyArn = Output.ofNullable(keyArn);
            return this;
        }        public ClusterEncryptionConfigProviderPropertiesArgs build() {
            return new ClusterEncryptionConfigProviderPropertiesArgs(keyArn);
        }
    }
}
