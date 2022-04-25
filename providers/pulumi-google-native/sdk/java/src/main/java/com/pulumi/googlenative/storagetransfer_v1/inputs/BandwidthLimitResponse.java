// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a bandwidth limit for an agent pool.
 * 
 */
public final class BandwidthLimitResponse extends com.pulumi.resources.InvokeArgs {

    public static final BandwidthLimitResponse Empty = new BandwidthLimitResponse();

    /**
     * Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    @Import(name="limitMbps", required=true)
    private String limitMbps;

    /**
     * @return Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    public String limitMbps() {
        return this.limitMbps;
    }

    private BandwidthLimitResponse() {}

    private BandwidthLimitResponse(BandwidthLimitResponse $) {
        this.limitMbps = $.limitMbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthLimitResponse $;

        public Builder() {
            $ = new BandwidthLimitResponse();
        }

        public Builder(BandwidthLimitResponse defaults) {
            $ = new BandwidthLimitResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitMbps Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
         * 
         * @return builder
         * 
         */
        public Builder limitMbps(String limitMbps) {
            $.limitMbps = limitMbps;
            return this;
        }

        public BandwidthLimitResponse build() {
            $.limitMbps = Objects.requireNonNull($.limitMbps, "expected parameter 'limitMbps' to be non-null");
            return $;
        }
    }

}
