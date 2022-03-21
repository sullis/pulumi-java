// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupUpdateConfig {
    /**
     * Desired max number of unavailable worker nodes during node group update.
     * 
     */
    private final @Nullable Integer maxUnavailable;
    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    private final @Nullable Integer maxUnavailablePercentage;

    @CustomType.Constructor
    private NodeGroupUpdateConfig(
        @CustomType.Parameter("maxUnavailable") @Nullable Integer maxUnavailable,
        @CustomType.Parameter("maxUnavailablePercentage") @Nullable Integer maxUnavailablePercentage) {
        this.maxUnavailable = maxUnavailable;
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    /**
     * Desired max number of unavailable worker nodes during node group update.
     * 
    */
    public Optional<Integer> getMaxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }
    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     * 
    */
    public Optional<Integer> getMaxUnavailablePercentage() {
        return Optional.ofNullable(this.maxUnavailablePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupUpdateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxUnavailable;
        private @Nullable Integer maxUnavailablePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupUpdateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Integer maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }        public NodeGroupUpdateConfig build() {
            return new NodeGroupUpdateConfig(maxUnavailable, maxUnavailablePercentage);
        }
    }
}
