// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BandwidthLimitResponse {
    /**
     * @return Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    private final String limitMbps;

    @CustomType.Constructor
    private BandwidthLimitResponse(@CustomType.Parameter("limitMbps") String limitMbps) {
        this.limitMbps = limitMbps;
    }

    /**
     * @return Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    public String limitMbps() {
        return this.limitMbps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String limitMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitMbps = defaults.limitMbps;
        }

        public Builder limitMbps(String limitMbps) {
            this.limitMbps = Objects.requireNonNull(limitMbps);
            return this;
        }        public BandwidthLimitResponse build() {
            return new BandwidthLimitResponse(limitMbps);
        }
    }
}
