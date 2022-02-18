// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Enable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs based on log types. By default, cluster control plane logs aren't exported to CloudWatch Logs.
 * 
 */
public final class ClusterLogging extends io.pulumi.resources.InvokeArgs {

    public static final ClusterLogging Empty = new ClusterLogging();

    /**
     * The cluster control plane logging configuration for your cluster.
     * 
     */
    @InputImport(name="clusterLogging")
    private final @Nullable ClusterLogging clusterLogging;

    public Optional<ClusterLogging> getClusterLogging() {
        return this.clusterLogging == null ? Optional.empty() : Optional.ofNullable(this.clusterLogging);
    }

    public ClusterLogging(@Nullable ClusterLogging clusterLogging) {
        this.clusterLogging = clusterLogging;
    }

    private ClusterLogging() {
        this.clusterLogging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterLogging clusterLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLogging = defaults.clusterLogging;
        }

        public Builder setClusterLogging(@Nullable ClusterLogging clusterLogging) {
            this.clusterLogging = clusterLogging;
            return this;
        }

        public ClusterLogging build() {
            return new ClusterLogging(clusterLogging);
        }
    }
}
