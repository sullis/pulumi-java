// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClusterVpcConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterVpcConfig Empty = new GetClusterVpcConfig();

    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     * 
     */
    @Import(name="clusterSecurityGroupId", required=true)
    private String clusterSecurityGroupId;

    /**
     * @return The cluster security group that was created by Amazon EKS for the cluster.
     * 
     */
    public String clusterSecurityGroupId() {
        return this.clusterSecurityGroupId;
    }

    /**
     * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     * 
     */
    @Import(name="endpointPrivateAccess", required=true)
    private Boolean endpointPrivateAccess;

    /**
     * @return Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     * 
     */
    public Boolean endpointPrivateAccess() {
        return this.endpointPrivateAccess;
    }

    /**
     * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     * 
     */
    @Import(name="endpointPublicAccess", required=true)
    private Boolean endpointPublicAccess;

    /**
     * @return Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     * 
     */
    public Boolean endpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     * 
     */
    @Import(name="publicAccessCidrs", required=true)
    private List<String> publicAccessCidrs;

    /**
     * @return List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     * 
     */
    public List<String> publicAccessCidrs() {
        return this.publicAccessCidrs;
    }

    /**
     * List of security group IDs
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private List<String> securityGroupIds;

    /**
     * @return List of security group IDs
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * List of subnet IDs
     * 
     */
    @Import(name="subnetIds", required=true)
    private List<String> subnetIds;

    /**
     * @return List of subnet IDs
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }

    /**
     * The VPC associated with your cluster.
     * 
     */
    @Import(name="vpcId", required=true)
    private String vpcId;

    /**
     * @return The VPC associated with your cluster.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    private GetClusterVpcConfig() {}

    private GetClusterVpcConfig(GetClusterVpcConfig $) {
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
    public static Builder builder(GetClusterVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterVpcConfig $;

        public Builder() {
            $ = new GetClusterVpcConfig();
        }

        public Builder(GetClusterVpcConfig defaults) {
            $ = new GetClusterVpcConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterSecurityGroupId The cluster security group that was created by Amazon EKS for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecurityGroupId(String clusterSecurityGroupId) {
            $.clusterSecurityGroupId = clusterSecurityGroupId;
            return this;
        }

        /**
         * @param endpointPrivateAccess Indicates whether or not the Amazon EKS private API server endpoint is enabled.
         * 
         * @return builder
         * 
         */
        public Builder endpointPrivateAccess(Boolean endpointPrivateAccess) {
            $.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        /**
         * @param endpointPublicAccess Indicates whether or not the Amazon EKS public API server endpoint is enabled.
         * 
         * @return builder
         * 
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            $.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * @param publicAccessCidrs List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(List<String> publicAccessCidrs) {
            $.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        /**
         * @param publicAccessCidrs List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessCidrs(String... publicAccessCidrs) {
            return publicAccessCidrs(List.of(publicAccessCidrs));
        }

        /**
         * @param securityGroupIds List of security group IDs
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds List of security group IDs
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds List of subnet IDs
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds List of subnet IDs
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param vpcId The VPC associated with your cluster.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetClusterVpcConfig build() {
            $.clusterSecurityGroupId = Objects.requireNonNull($.clusterSecurityGroupId, "expected parameter 'clusterSecurityGroupId' to be non-null");
            $.endpointPrivateAccess = Objects.requireNonNull($.endpointPrivateAccess, "expected parameter 'endpointPrivateAccess' to be non-null");
            $.endpointPublicAccess = Objects.requireNonNull($.endpointPublicAccess, "expected parameter 'endpointPublicAccess' to be non-null");
            $.publicAccessCidrs = Objects.requireNonNull($.publicAccessCidrs, "expected parameter 'publicAccessCidrs' to be non-null");
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
