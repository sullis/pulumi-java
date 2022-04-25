// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Bypass the cache when the specified request headers are present, e.g. Pragma or Authorization headers. Values are case insensitive. The presence of such a header overrides the cache_mode setting.
 * 
 */
public final class BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse Empty = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse();

    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    @Import(name="headerName", required=true)
    private String headerName;

    /**
     * @return The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    public String headerName() {
        return this.headerName;
    }

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse() {}

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse(BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse $) {
        this.headerName = $.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse $;

        public Builder() {
            $ = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse();
        }

        public Builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
            $ = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName The header field name to match on when bypassing cache. Values are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            $.headerName = headerName;
            return this;
        }

        public BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            return $;
        }
    }

}
