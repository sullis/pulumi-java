// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPortRange;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAnalysisAnalysisAclRule {
    private final @Nullable String cidr;
    private final @Nullable Boolean egress;
    private final @Nullable NetworkInsightsAnalysisPortRange portRange;
    private final @Nullable String protocol;
    private final @Nullable String ruleAction;
    private final @Nullable Integer ruleNumber;

    @OutputCustomType.Constructor({"cidr","egress","portRange","protocol","ruleAction","ruleNumber"})
    private NetworkInsightsAnalysisAnalysisAclRule(
        @Nullable String cidr,
        @Nullable Boolean egress,
        @Nullable NetworkInsightsAnalysisPortRange portRange,
        @Nullable String protocol,
        @Nullable String ruleAction,
        @Nullable Integer ruleNumber) {
        this.cidr = cidr;
        this.egress = egress;
        this.portRange = portRange;
        this.protocol = protocol;
        this.ruleAction = ruleAction;
        this.ruleNumber = ruleNumber;
    }

    public Optional<String> getCidr() {
        return Optional.ofNullable(this.cidr);
    }
    public Optional<Boolean> getEgress() {
        return Optional.ofNullable(this.egress);
    }
    public Optional<NetworkInsightsAnalysisPortRange> getPortRange() {
        return Optional.ofNullable(this.portRange);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getRuleAction() {
        return Optional.ofNullable(this.ruleAction);
    }
    public Optional<Integer> getRuleNumber() {
        return Optional.ofNullable(this.ruleNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisAclRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable Boolean egress;
        private @Nullable NetworkInsightsAnalysisPortRange portRange;
        private @Nullable String protocol;
        private @Nullable String ruleAction;
        private @Nullable Integer ruleNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisAclRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.egress = defaults.egress;
    	      this.portRange = defaults.portRange;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        public Builder setCidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder setEgress(@Nullable Boolean egress) {
            this.egress = egress;
            return this;
        }

        public Builder setPortRange(@Nullable NetworkInsightsAnalysisPortRange portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setRuleAction(@Nullable String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }

        public Builder setRuleNumber(@Nullable Integer ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }
        public NetworkInsightsAnalysisAnalysisAclRule build() {
            return new NetworkInsightsAnalysisAnalysisAclRule(cidr, egress, portRange, protocol, ruleAction, ruleNumber);
        }
    }
}