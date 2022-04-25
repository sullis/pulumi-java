// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterVpcConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterVpcConfigGetArgs Empty = new ClusterVpcConfigGetArgs();

    /**
     * Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    @Import(name="clusterSecurityGroupId")
    private @Nullable Output<String> clusterSecurityGroupId;

    /**
     * @return Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    public Optional<Output<String>> clusterSecurityGroupId() {
        return Optional.ofNullable(this.clusterSecurityGroupId);
    }

    /**
     * Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    @Import(name="endpointPrivateAccess")
    private @Nullable Output<Boolean> endpointPrivateAccess;

    /**
     * @return Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> endpointPrivateAccess() {
        return Optional.ofNullable(this.endpointPrivateAccess);
    }

    /**
     * Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    @Import(name="endpointPublicAccess")
    private @Nullable Output<Boolean> endpointPublicAccess;

    /**
     * @return Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    public Optional<Output<Boolean>> endpointPublicAccess() {
        return Optional.ofNullable(this.endpointPublicAccess);
    }

    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="publicAccessCidrs")
    private @Nullable Output<List<String>> publicAccessCidrs;

    /**
     * @return List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Optional<Output<List<String>>> publicAccessCidrs() {
        return Optional.ofNullable(this.publicAccessCidrs);
    }

    /**
     * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * ID of the VPC associated with your cluster.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return ID of the VPC associated with your cluster.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ClusterVpcConfigGetArgs() {}

    private ClusterVpcConfigGetArgs(ClusterVpcConfigGetArgs $) {
        this.clusterSecurityGroupId = $.clusterSecurityGroupId;
        this.endpointPrivateAccess = $.endpointPrivateAccess;
        this.endpointPublicAccess = $.endpointPublicAccess;
        this.publicAccessCidrs = $.publicAccessCidrs;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterVpcConfigGetArgs $;

        public Builder() {
            $ = new ClusterVpcConfigGetArgs();
        }

        public Builder(ClusterVpcConfigGetArgs defaults) {
            $ = new ClusterVpcConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterSecurityGroupId Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecurityGroupId(@Nullable Output<String> clusterSecurityGroupId) {
            $.clusterSecurityGroupId = clusterSecurityGroupId;
            return this;
        }

        /**
         * @param clusterSecurityGroupId Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecurityGroupId(String clusterSecurityGroupId) {
            return clusterSecurityGroupId(Output.of(clusterSecurityGroupId));
        }

        /**
         * @param endpointPrivateAccess Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder endpointPrivateAccess(@Nullable Output<Boolean> endpointPrivateAccess) {
            $.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        /**
         * @param endpointPrivateAccess Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder endpointPrivateAccess(Boolean endpointPrivateAccess) {
            return endpointPrivateAccess(Output.of(endpointPrivateAccess));
        }

        /**
         * @param endpointPublicAccess Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder endpointPublicAccess(@Nullable Output<Boolean> endpointPublicAccess) {
            $.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * @param endpointPublicAccess Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            return endpointPublicAccess(Output.of(endpointPublicAccess));
        }

        /**
         * @param publicAccessCidrs List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(@Nullable Output<List<String>> publicAccessCidrs) {
            $.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        /**
         * @param publicAccessCidrs List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(List<String> publicAccessCidrs) {
            return publicAccessCidrs(Output.of(publicAccessCidrs));
        }

        /**
         * @param publicAccessCidrs List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(String... publicAccessCidrs) {
            return publicAccessCidrs(List.of(publicAccessCidrs));
        }

        /**
         * @param securityGroupIds List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param vpcId ID of the VPC associated with your cluster.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId ID of the VPC associated with your cluster.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ClusterVpcConfigGetArgs build() {
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
