// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthorizedNetworksConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthorizedNetworksConfigGetArgs Empty = new ClusterMasterAuthorizedNetworksConfigGetArgs();

    /**
     * External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    @Import(name="cidrBlocks")
      private final @Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

    public Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> getCidrBlocks() {
        return this.cidrBlocks == null ? Output.empty() : this.cidrBlocks;
    }

    public ClusterMasterAuthorizedNetworksConfigGetArgs(@Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }

    private ClusterMasterAuthorizedNetworksConfigGetArgs() {
        this.cidrBlocks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
        }

        public Builder cidrBlocks(@Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(@Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs> cidrBlocks) {
            this.cidrBlocks = Output.ofNullable(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }        public ClusterMasterAuthorizedNetworksConfigGetArgs build() {
            return new ClusterMasterAuthorizedNetworksConfigGetArgs(cidrBlocks);
        }
    }
}
