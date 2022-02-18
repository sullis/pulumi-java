// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allocation configuration used by Batch Service to provision the nodes.
 * 
 */
public final class NodePlacementConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodePlacementConfigurationResponse Empty = new NodePlacementConfigurationResponse();

    /**
     * Allocation policy used by Batch Service to provision the nodes. If not specified, Batch will use the regional policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable String policy;

    public Optional<String> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    public NodePlacementConfigurationResponse(@Nullable String policy) {
        this.policy = policy;
    }

    private NodePlacementConfigurationResponse() {
        this.policy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePlacementConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePlacementConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }

        public NodePlacementConfigurationResponse build() {
            return new NodePlacementConfigurationResponse(policy);
        }
    }
}
