// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TpuConfigResponse {
    /**
     * Whether Cloud TPU integration is enabled or not.
     * 
     */
    private final Boolean enabled;
    /**
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
     */
    private final String ipv4CidrBlock;
    /**
     * Whether to use service networking for Cloud TPU or not.
     * 
     */
    private final Boolean useServiceNetworking;

    @OutputCustomType.Constructor({"enabled","ipv4CidrBlock","useServiceNetworking"})
    private TpuConfigResponse(
        Boolean enabled,
        String ipv4CidrBlock,
        Boolean useServiceNetworking) {
        this.enabled = Objects.requireNonNull(enabled);
        this.ipv4CidrBlock = Objects.requireNonNull(ipv4CidrBlock);
        this.useServiceNetworking = Objects.requireNonNull(useServiceNetworking);
    }

    /**
     * Whether Cloud TPU integration is enabled or not.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * 
    */
    public String getIpv4CidrBlock() {
        return this.ipv4CidrBlock;
    }
    /**
     * Whether to use service networking for Cloud TPU or not.
     * 
    */
    public Boolean getUseServiceNetworking() {
        return this.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TpuConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String ipv4CidrBlock;
        private Boolean useServiceNetworking;

        public Builder() {
    	      // Empty
        }

        public Builder(TpuConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ipv4CidrBlock = defaults.ipv4CidrBlock;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setIpv4CidrBlock(String ipv4CidrBlock) {
            this.ipv4CidrBlock = Objects.requireNonNull(ipv4CidrBlock);
            return this;
        }

        public Builder setUseServiceNetworking(Boolean useServiceNetworking) {
            this.useServiceNetworking = Objects.requireNonNull(useServiceNetworking);
            return this;
        }
        public TpuConfigResponse build() {
            return new TpuConfigResponse(enabled, ipv4CidrBlock, useServiceNetworking);
        }
    }
}