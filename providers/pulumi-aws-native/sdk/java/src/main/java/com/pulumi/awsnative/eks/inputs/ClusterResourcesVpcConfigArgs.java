// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
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
public final class ClusterResourcesVpcConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterResourcesVpcConfigArgs Empty = new ClusterResourcesVpcConfigArgs();

    /**
     * Set this value to true to enable private access for your cluster&#39;s Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster&#39;s VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
     * 
     */
    @Import(name="endpointPrivateAccess")
    private @Nullable Output<Boolean> endpointPrivateAccess;

    /**
     * @return Set this value to true to enable private access for your cluster&#39;s Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster&#39;s VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
     * 
     */
    public Optional<Output<Boolean>> endpointPrivateAccess() {
        return Optional.ofNullable(this.endpointPrivateAccess);
    }

    /**
     * Set this value to false to disable public access to your cluster&#39;s Kubernetes API server endpoint. If you disable public access, your cluster&#39;s Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
     * 
     */
    @Import(name="endpointPublicAccess")
    private @Nullable Output<Boolean> endpointPublicAccess;

    /**
     * @return Set this value to false to disable public access to your cluster&#39;s Kubernetes API server endpoint. If you disable public access, your cluster&#39;s Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
     * 
     */
    public Optional<Output<Boolean>> endpointPublicAccess() {
        return Optional.ofNullable(this.endpointPublicAccess);
    }

    /**
     * The CIDR blocks that are allowed access to your cluster&#39;s public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you&#39;ve disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
     * 
     */
    @Import(name="publicAccessCidrs")
    private @Nullable Output<List<String>> publicAccessCidrs;

    /**
     * @return The CIDR blocks that are allowed access to your cluster&#39;s public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you&#39;ve disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> publicAccessCidrs() {
        return Optional.ofNullable(this.publicAccessCidrs);
    }

    /**
     * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don&#39;t specify a security group, the default security group for your VPC is used.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don&#39;t specify a security group, the default security group for your VPC is used.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    private ClusterResourcesVpcConfigArgs() {}

    private ClusterResourcesVpcConfigArgs(ClusterResourcesVpcConfigArgs $) {
        this.endpointPrivateAccess = $.endpointPrivateAccess;
        this.endpointPublicAccess = $.endpointPublicAccess;
        this.publicAccessCidrs = $.publicAccessCidrs;
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterResourcesVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterResourcesVpcConfigArgs $;

        public Builder() {
            $ = new ClusterResourcesVpcConfigArgs();
        }

        public Builder(ClusterResourcesVpcConfigArgs defaults) {
            $ = new ClusterResourcesVpcConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointPrivateAccess Set this value to true to enable private access for your cluster&#39;s Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster&#39;s VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
         * 
         * @return builder
         * 
         */
        public Builder endpointPrivateAccess(@Nullable Output<Boolean> endpointPrivateAccess) {
            $.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        /**
         * @param endpointPrivateAccess Set this value to true to enable private access for your cluster&#39;s Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster&#39;s VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods.
         * 
         * @return builder
         * 
         */
        public Builder endpointPrivateAccess(Boolean endpointPrivateAccess) {
            return endpointPrivateAccess(Output.of(endpointPrivateAccess));
        }

        /**
         * @param endpointPublicAccess Set this value to false to disable public access to your cluster&#39;s Kubernetes API server endpoint. If you disable public access, your cluster&#39;s Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder endpointPublicAccess(@Nullable Output<Boolean> endpointPublicAccess) {
            $.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * @param endpointPublicAccess Set this value to false to disable public access to your cluster&#39;s Kubernetes API server endpoint. If you disable public access, your cluster&#39;s Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            return endpointPublicAccess(Output.of(endpointPublicAccess));
        }

        /**
         * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster&#39;s public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you&#39;ve disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(@Nullable Output<List<String>> publicAccessCidrs) {
            $.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        /**
         * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster&#39;s public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you&#39;ve disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(List<String> publicAccessCidrs) {
            return publicAccessCidrs(Output.of(publicAccessCidrs));
        }

        /**
         * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster&#39;s public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you&#39;ve disabled private endpoint access and you have nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(String... publicAccessCidrs) {
            return publicAccessCidrs(List.of(publicAccessCidrs));
        }

        /**
         * @param securityGroupIds Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don&#39;t specify a security group, the default security group for your VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don&#39;t specify a security group, the default security group for your VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don&#39;t specify a security group, the default security group for your VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public ClusterResourcesVpcConfigArgs build() {
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
