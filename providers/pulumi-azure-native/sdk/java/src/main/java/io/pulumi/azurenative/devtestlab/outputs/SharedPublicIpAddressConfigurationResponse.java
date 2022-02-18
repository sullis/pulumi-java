// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.InboundNatRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharedPublicIpAddressConfigurationResponse {
    /**
     * The incoming NAT rules
     * 
     */
    private final @Nullable List<InboundNatRuleResponse> inboundNatRules;

    @OutputCustomType.Constructor({"inboundNatRules"})
    private SharedPublicIpAddressConfigurationResponse(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
    }

    /**
     * The incoming NAT rules
     * 
     */
    public List<InboundNatRuleResponse> getInboundNatRules() {
        return this.inboundNatRules == null ? List.of() : this.inboundNatRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPublicIpAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InboundNatRuleResponse> inboundNatRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPublicIpAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatRules = defaults.inboundNatRules;
        }

        public Builder setInboundNatRules(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }

        public SharedPublicIpAddressConfigurationResponse build() {
            return new SharedPublicIpAddressConfigurationResponse(inboundNatRules);
        }
    }
}
