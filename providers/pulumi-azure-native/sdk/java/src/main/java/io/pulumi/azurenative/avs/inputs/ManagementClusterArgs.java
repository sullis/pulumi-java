// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * The properties of a default cluster
 * 
 */
public final class ManagementClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementClusterArgs Empty = new ManagementClusterArgs();

    /**
     * The cluster size
     * 
     */
    @InputImport(name="clusterSize", required=true)
    private final Input<Integer> clusterSize;

    public Input<Integer> getClusterSize() {
        return this.clusterSize;
    }

    public ManagementClusterArgs(Input<Integer> clusterSize) {
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
    }

    private ManagementClusterArgs() {
        this.clusterSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> clusterSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSize = defaults.clusterSize;
        }

        public Builder setClusterSize(Input<Integer> clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder setClusterSize(Integer clusterSize) {
            this.clusterSize = Input.of(Objects.requireNonNull(clusterSize));
            return this;
        }

        public ManagementClusterArgs build() {
            return new ManagementClusterArgs(clusterSize);
        }
    }
}
