// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceConsistentHashGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConsistentHashGetArgs Empty = new RegionBackendServiceConsistentHashGetArgs();

    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpCookie")
      private final @Nullable Input<RegionBackendServiceConsistentHashHttpCookieGetArgs> httpCookie;

    public Input<RegionBackendServiceConsistentHashHttpCookieGetArgs> getHttpCookie() {
        return this.httpCookie == null ? Input.empty() : this.httpCookie;
    }

    /**
     * The hash based on the value of the specified header field.
     * This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    @InputImport(name="httpHeaderName")
      private final @Nullable Input<String> httpHeaderName;

    public Input<String> getHttpHeaderName() {
        return this.httpHeaderName == null ? Input.empty() : this.httpHeaderName;
    }

    /**
     * The minimum number of virtual nodes to use for the hash ring.
     * Larger ring sizes result in more granular load
     * distributions. If the number of hosts in the load balancing pool
     * is larger than the ring size, each host will be assigned a single
     * virtual node.
     * Defaults to 1024.
     * 
     */
    @InputImport(name="minimumRingSize")
      private final @Nullable Input<Integer> minimumRingSize;

    public Input<Integer> getMinimumRingSize() {
        return this.minimumRingSize == null ? Input.empty() : this.minimumRingSize;
    }

    public RegionBackendServiceConsistentHashGetArgs(
        @Nullable Input<RegionBackendServiceConsistentHashHttpCookieGetArgs> httpCookie,
        @Nullable Input<String> httpHeaderName,
        @Nullable Input<Integer> minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    private RegionBackendServiceConsistentHashGetArgs() {
        this.httpCookie = Input.empty();
        this.httpHeaderName = Input.empty();
        this.minimumRingSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConsistentHashGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionBackendServiceConsistentHashHttpCookieGetArgs> httpCookie;
        private @Nullable Input<String> httpHeaderName;
        private @Nullable Input<Integer> minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConsistentHashGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder setHttpCookie(@Nullable Input<RegionBackendServiceConsistentHashHttpCookieGetArgs> httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }

        public Builder setHttpCookie(@Nullable RegionBackendServiceConsistentHashHttpCookieGetArgs httpCookie) {
            this.httpCookie = Input.ofNullable(httpCookie);
            return this;
        }

        public Builder setHttpHeaderName(@Nullable Input<String> httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder setHttpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = Input.ofNullable(httpHeaderName);
            return this;
        }

        public Builder setMinimumRingSize(@Nullable Input<Integer> minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }

        public Builder setMinimumRingSize(@Nullable Integer minimumRingSize) {
            this.minimumRingSize = Input.ofNullable(minimumRingSize);
            return this;
        }
        public RegionBackendServiceConsistentHashGetArgs build() {
            return new RegionBackendServiceConsistentHashGetArgs(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}