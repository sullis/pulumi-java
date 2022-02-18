// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DnsConfigResponse {
    /**
     * The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     * 
     */
    private final String fqdn;
    /**
     * The relative DNS name provided by this Traffic Manager profile. This value is combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of the profile.
     * 
     */
    private final @Nullable String relativeName;
    /**
     * The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     */
    private final @Nullable Double ttl;

    @OutputCustomType.Constructor({"fqdn","relativeName","ttl"})
    private DnsConfigResponse(
        String fqdn,
        @Nullable String relativeName,
        @Nullable Double ttl) {
        this.fqdn = Objects.requireNonNull(fqdn);
        this.relativeName = relativeName;
        this.ttl = ttl;
    }

    /**
     * The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     * 
     */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * The relative DNS name provided by this Traffic Manager profile. This value is combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of the profile.
     * 
     */
    public Optional<String> getRelativeName() {
        return Optional.ofNullable(this.relativeName);
    }
    /**
     * The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS clients how long to cache DNS responses provided by this Traffic Manager profile.
     * 
     */
    public Optional<Double> getTtl() {
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

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setRelativeName(@Nullable String relativeName) {
            this.relativeName = relativeName;
            return this;
        }

        public Builder setTtl(@Nullable Double ttl) {
            this.ttl = ttl;
            return this;
        }

        public DnsConfigResponse build() {
            return new DnsConfigResponse(fqdn, relativeName, ttl);
        }
    }
}
