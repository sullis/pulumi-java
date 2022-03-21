// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPortRange;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisAnalysisSecurityGroupRule {
    private final @Nullable String cidr;
    private final @Nullable String direction;
    private final @Nullable NetworkInsightsAnalysisPortRange portRange;
    private final @Nullable String prefixListId;
    private final @Nullable String protocol;
    private final @Nullable String securityGroupId;

    @CustomType.Constructor
    private NetworkInsightsAnalysisAnalysisSecurityGroupRule(
        @CustomType.Parameter("cidr") @Nullable String cidr,
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("portRange") @Nullable NetworkInsightsAnalysisPortRange portRange,
        @CustomType.Parameter("prefixListId") @Nullable String prefixListId,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("securityGroupId") @Nullable String securityGroupId) {
        this.cidr = cidr;
        this.direction = direction;
        this.portRange = portRange;
        this.prefixListId = prefixListId;
        this.protocol = protocol;
        this.securityGroupId = securityGroupId;
    }

    public Optional<String> getCidr() {
        return Optional.ofNullable(this.cidr);
    }
    public Optional<String> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    public Optional<NetworkInsightsAnalysisPortRange> getPortRange() {
        return Optional.ofNullable(this.portRange);
    }
    public Optional<String> getPrefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getSecurityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisSecurityGroupRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable String direction;
        private @Nullable NetworkInsightsAnalysisPortRange portRange;
        private @Nullable String prefixListId;
        private @Nullable String protocol;
        private @Nullable String securityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisSecurityGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.direction = defaults.direction;
    	      this.portRange = defaults.portRange;
    	      this.prefixListId = defaults.prefixListId;
    	      this.protocol = defaults.protocol;
    	      this.securityGroupId = defaults.securityGroupId;
        }

        public Builder cidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder portRange(@Nullable NetworkInsightsAnalysisPortRange portRange) {
            this.portRange = portRange;
            return this;
        }
        public Builder prefixListId(@Nullable String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }        public NetworkInsightsAnalysisAnalysisSecurityGroupRule build() {
            return new NetworkInsightsAnalysisAnalysisSecurityGroupRule(cidr, direction, portRange, prefixListId, protocol, securityGroupId);
        }
    }
}
