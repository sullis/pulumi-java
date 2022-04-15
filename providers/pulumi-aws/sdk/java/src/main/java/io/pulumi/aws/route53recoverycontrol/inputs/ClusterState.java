// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.aws.route53recoverycontrol.inputs.ClusterClusterEndpointGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * ARN of the cluster
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     * 
     */
    @Import(name="clusterEndpoints")
      private final @Nullable Output<List<ClusterClusterEndpointGetArgs>> clusterEndpoints;

    public Output<List<ClusterClusterEndpointGetArgs>> clusterEndpoints() {
        return this.clusterEndpoints == null ? Codegen.empty() : this.clusterEndpoints;
    }

    /**
     * Unique name describing the cluster.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Status of cluster. `PENDING` when it is being created, `PENDING_DELETION` when it is being deleted and `DEPLOYED` otherwise.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ClusterState(
        @Nullable Output<String> arn,
        @Nullable Output<List<ClusterClusterEndpointGetArgs>> clusterEndpoints,
        @Nullable Output<String> name,
        @Nullable Output<String> status) {
        this.arn = arn;
        this.clusterEndpoints = clusterEndpoints;
        this.name = name;
        this.status = status;
    }

    private ClusterState() {
        this.arn = Codegen.empty();
        this.clusterEndpoints = Codegen.empty();
        this.name = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<ClusterClusterEndpointGetArgs>> clusterEndpoints;
        private @Nullable Output<String> name;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterEndpoints = defaults.clusterEndpoints;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clusterEndpoints(@Nullable Output<List<ClusterClusterEndpointGetArgs>> clusterEndpoints) {
            this.clusterEndpoints = clusterEndpoints;
            return this;
        }
        public Builder clusterEndpoints(@Nullable List<ClusterClusterEndpointGetArgs> clusterEndpoints) {
            this.clusterEndpoints = Codegen.ofNullable(clusterEndpoints);
            return this;
        }
        public Builder clusterEndpoints(ClusterClusterEndpointGetArgs... clusterEndpoints) {
            return clusterEndpoints(List.of(clusterEndpoints));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ClusterState build() {
            return new ClusterState(arn, clusterEndpoints, name, status);
        }
    }
}
