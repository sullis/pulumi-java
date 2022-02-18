// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendBucketCdnPolicyNegativeCachingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyNegativeCachingPolicyGetArgs Empty = new BackendBucketCdnPolicyNegativeCachingPolicyGetArgs();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<Integer> code;

    public Input<Integer> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="ttl")
    private final @Nullable Input<Integer> ttl;

    public Input<Integer> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public BackendBucketCdnPolicyNegativeCachingPolicyGetArgs(
        @Nullable Input<Integer> code,
        @Nullable Input<Integer> ttl) {
        this.code = code;
        this.ttl = ttl;
    }

    private BackendBucketCdnPolicyNegativeCachingPolicyGetArgs() {
        this.code = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyNegativeCachingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> code;
        private @Nullable Input<Integer> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyNegativeCachingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder setCode(@Nullable Input<Integer> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setTtl(@Nullable Input<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable Integer ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public BackendBucketCdnPolicyNegativeCachingPolicyGetArgs build() {
            return new BackendBucketCdnPolicyNegativeCachingPolicyGetArgs(code, ttl);
        }
    }
}
