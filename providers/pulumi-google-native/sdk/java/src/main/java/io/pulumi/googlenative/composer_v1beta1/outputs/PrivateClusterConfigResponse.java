// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateClusterConfigResponse {
    /**
     * Optional. If `true`, access to the public endpoint of the GKE cluster is denied.
     * 
     */
    private final Boolean enablePrivateEndpoint;
    /**
     * Optional. The CIDR block from which IPv4 range for GKE master will be reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * 
     */
    private final String masterIpv4CidrBlock;
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range is used for assigning internal IP addresses to the cluster master or set of masters and to the internal load balancer virtual IP. This range must not overlap with any other ranges in use within the cluster's network.
     * 
     */
    private final String masterIpv4ReservedRange;

    @OutputCustomType.Constructor({"enablePrivateEndpoint","masterIpv4CidrBlock","masterIpv4ReservedRange"})
    private PrivateClusterConfigResponse(
        Boolean enablePrivateEndpoint,
        String masterIpv4CidrBlock,
        String masterIpv4ReservedRange) {
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
        this.masterIpv4ReservedRange = Objects.requireNonNull(masterIpv4ReservedRange);
    }

    /**
     * Optional. If `true`, access to the public endpoint of the GKE cluster is denied.
     * 
    */
    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    /**
     * Optional. The CIDR block from which IPv4 range for GKE master will be reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * 
    */
    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range is used for assigning internal IP addresses to the cluster master or set of masters and to the internal load balancer virtual IP. This range must not overlap with any other ranges in use within the cluster's network.
     * 
    */
    public String getMasterIpv4ReservedRange() {
        return this.masterIpv4ReservedRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private String masterIpv4CidrBlock;
        private String masterIpv4ReservedRange;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.masterIpv4ReservedRange = defaults.masterIpv4ReservedRange;
        }

        public Builder setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }

        public Builder setMasterIpv4ReservedRange(String masterIpv4ReservedRange) {
            this.masterIpv4ReservedRange = Objects.requireNonNull(masterIpv4ReservedRange);
            return this;
        }
        public PrivateClusterConfigResponse build() {
            return new PrivateClusterConfigResponse(enablePrivateEndpoint, masterIpv4CidrBlock, masterIpv4ReservedRange);
        }
    }
}