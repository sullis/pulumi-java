// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object representing the VPC configuration to use for an Amazon EKS cluster.
 * 
 */
public final class ClusterResourcesVpcConfig extends io.pulumi.resources.InvokeArgs {

    public static final ClusterResourcesVpcConfig Empty = new ClusterResourcesVpcConfig();

    /**
     * Set this value to true to enable private access for your cluster's Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
     * 
     */
    @Import(name="endpointPrivateAccess")
      private final @Nullable Boolean endpointPrivateAccess;

    public Optional<Boolean> endpointPrivateAccess() {
        return this.endpointPrivateAccess == null ? Optional.empty() : Optional.ofNullable(this.endpointPrivateAccess);
    }

    /**
     * Set this value to false to disable public access to your cluster's Kubernetes API server endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
     * 
     */
    @Import(name="endpointPublicAccess")
      private final @Nullable Boolean endpointPublicAccess;

    public Optional<Boolean> endpointPublicAccess() {
        return this.endpointPublicAccess == null ? Optional.empty() : Optional.ofNullable(this.endpointPublicAccess);
    }

    /**
     * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
     * 
     */
    @Import(name="publicAccessCidrs")
      private final @Nullable List<String> publicAccessCidrs;

    public List<String> publicAccessCidrs() {
        return this.publicAccessCidrs == null ? List.of() : this.publicAccessCidrs;
    }

    /**
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don't specify a security group, the default security group for your VPC is used.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable List<String> securityGroupIds;

    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }

    /**
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final List<String> subnetIds;

    public List<String> subnetIds() {
        return this.subnetIds;
    }

    public ClusterResourcesVpcConfig(
        @Nullable Boolean endpointPrivateAccess,
        @Nullable Boolean endpointPublicAccess,
        @Nullable List<String> publicAccessCidrs,
        @Nullable List<String> securityGroupIds,
        List<String> subnetIds) {
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
    }

    private ClusterResourcesVpcConfig() {
        this.endpointPrivateAccess = null;
        this.endpointPublicAccess = null;
        this.publicAccessCidrs = List.of();
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcesVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean endpointPrivateAccess;
        private @Nullable Boolean endpointPublicAccess;
        private @Nullable List<String> publicAccessCidrs;
        private @Nullable List<String> securityGroupIds;
        private List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcesVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder endpointPrivateAccess(@Nullable Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }
        public Builder endpointPublicAccess(@Nullable Boolean endpointPublicAccess) {
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }
        public Builder publicAccessCidrs(@Nullable List<String> publicAccessCidrs) {
            this.publicAccessCidrs = publicAccessCidrs;
            return this;
        }
        public Builder publicAccessCidrs(String... publicAccessCidrs) {
            return publicAccessCidrs(List.of(publicAccessCidrs));
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public ClusterResourcesVpcConfig build() {
            return new ClusterResourcesVpcConfig(endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds);
        }
    }
}
