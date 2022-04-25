// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DnsConfigResponse {
    /**
     * @return The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     * 
     */
    private final String fqdn;
    /**
     * @return The relative DNS name provided by this Traffic Manager profile. This value is combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of the profile.
     * 
     */
    private final @Nullable String relativeName;
    /**
     * @return The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     */
    private final @Nullable Double ttl;

    @CustomType.Constructor
    private DnsConfigResponse(
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("relativeName") @Nullable String relativeName,
        @CustomType.Parameter("ttl") @Nullable Double ttl) {
        this.fqdn = fqdn;
        this.relativeName = relativeName;
        this.ttl = ttl;
    }

    /**
     * @return The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The relative DNS name provided by this Traffic Manager profile. This value is combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of the profile.
     * 
     */
    public Optional<String> relativeName() {
        return Optional.ofNullable(this.relativeName);
    }
    /**
     * @return The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     */
    public Optional<Double> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fqdn;
        private @Nullable String relativeName;
        private @Nullable Double ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.relativeName = defaults.relativeName;
    	      this.ttl = defaults.ttl;
        }

        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder relativeName(@Nullable String relativeName) {
            this.relativeName = relativeName;
            return this;
        }
        public Builder ttl(@Nullable Double ttl) {
            this.ttl = ttl;
            return this;
        }        public DnsConfigResponse build() {
            return new DnsConfigResponse(fqdn, relativeName, ttl);
        }
    }
}
