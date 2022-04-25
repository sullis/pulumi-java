// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specify CDN TTLs for response error codes.
 * 
 */
public final class BackendServiceCdnPolicyNegativeCachingPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendServiceCdnPolicyNegativeCachingPolicyResponse Empty = new BackendServiceCdnPolicyNegativeCachingPolicyResponse();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code", required=true)
    private Integer code;

    /**
     * @return The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    public Integer code() {
        return this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl", required=true)
    private Integer ttl;

    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    private BackendServiceCdnPolicyNegativeCachingPolicyResponse() {}

    private BackendServiceCdnPolicyNegativeCachingPolicyResponse(BackendServiceCdnPolicyNegativeCachingPolicyResponse $) {
        this.code = $.code;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceCdnPolicyNegativeCachingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceCdnPolicyNegativeCachingPolicyResponse $;

        public Builder() {
            $ = new BackendServiceCdnPolicyNegativeCachingPolicyResponse();
        }

        public Builder(BackendServiceCdnPolicyNegativeCachingPolicyResponse defaults) {
            $ = new BackendServiceCdnPolicyNegativeCachingPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            $.code = code;
            return this;
        }

        /**
         * @param ttl The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            $.ttl = ttl;
            return this;
        }

        public BackendServiceCdnPolicyNegativeCachingPolicyResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            return $;
        }
    }

}
