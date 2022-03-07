// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DurationResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
 * 
 */
public final class ConsistentHashLoadBalancerSettingsHttpCookieResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConsistentHashLoadBalancerSettingsHttpCookieResponse Empty = new ConsistentHashLoadBalancerSettingsHttpCookieResponse();

    /**
     * Name of the cookie.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Lifetime of the cookie.
     * 
     */
    @InputImport(name="ttl", required=true)
      private final DurationResponse ttl;

    public DurationResponse getTtl() {
        return this.ttl;
    }

    public ConsistentHashLoadBalancerSettingsHttpCookieResponse(
        String name,
        String path,
        DurationResponse ttl) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
    }

    private ConsistentHashLoadBalancerSettingsHttpCookieResponse() {
        this.name = null;
        this.path = null;
        this.ttl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private DurationResponse ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setTtl(DurationResponse ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public ConsistentHashLoadBalancerSettingsHttpCookieResponse build() {
            return new ConsistentHashLoadBalancerSettingsHttpCookieResponse(name, path, ttl);
        }
    }
}