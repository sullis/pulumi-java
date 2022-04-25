// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for NodeLocal DNSCache
 * 
 */
public final class DnsCacheConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DnsCacheConfigResponse Empty = new DnsCacheConfigResponse();

    /**
     * Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private DnsCacheConfigResponse() {}

    private DnsCacheConfigResponse(DnsCacheConfigResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsCacheConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsCacheConfigResponse $;

        public Builder() {
            $ = new DnsCacheConfigResponse();
        }

        public Builder(DnsCacheConfigResponse defaults) {
            $ = new DnsCacheConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether NodeLocal DNSCache is enabled for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public DnsCacheConfigResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
