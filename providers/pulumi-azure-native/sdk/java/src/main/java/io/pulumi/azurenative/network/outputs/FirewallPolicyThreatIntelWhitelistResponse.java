// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyThreatIntelWhitelistResponse {
    /**
     * List of FQDNs for the ThreatIntel Whitelist.
     * 
     */
    private final @Nullable List<String> fqdns;
    /**
     * List of IP addresses for the ThreatIntel Whitelist.
     * 
     */
    private final @Nullable List<String> ipAddresses;

    @OutputCustomType.Constructor({"fqdns","ipAddresses"})
    private FirewallPolicyThreatIntelWhitelistResponse(
        @Nullable List<String> fqdns,
        @Nullable List<String> ipAddresses) {
        this.fqdns = fqdns;
        this.ipAddresses = ipAddresses;
    }

    /**
     * List of FQDNs for the ThreatIntel Whitelist.
     * 
    */
    public List<String> getFqdns() {
        return this.fqdns == null ? List.of() : this.fqdns;
    }
    /**
     * List of IP addresses for the ThreatIntel Whitelist.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyThreatIntelWhitelistResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> fqdns;
        private @Nullable List<String> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyThreatIntelWhitelistResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdns = defaults.fqdns;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setFqdns(@Nullable List<String> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public FirewallPolicyThreatIntelWhitelistResponse build() {
            return new FirewallPolicyThreatIntelWhitelistResponse(fqdns, ipAddresses);
        }
    }
}