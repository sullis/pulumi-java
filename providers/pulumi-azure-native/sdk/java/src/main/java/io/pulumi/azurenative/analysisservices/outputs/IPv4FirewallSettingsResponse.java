// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.azurenative.analysisservices.outputs.IPv4FirewallRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPv4FirewallSettingsResponse {
    /**
     * The indicator of enabling PBI service.
     * 
     */
    private final @Nullable Boolean enablePowerBIService;
    /**
     * An array of firewall rules.
     * 
     */
    private final @Nullable List<IPv4FirewallRuleResponse> firewallRules;

    @OutputCustomType.Constructor({"enablePowerBIService","firewallRules"})
    private IPv4FirewallSettingsResponse(
        @Nullable Boolean enablePowerBIService,
        @Nullable List<IPv4FirewallRuleResponse> firewallRules) {
        this.enablePowerBIService = enablePowerBIService;
        this.firewallRules = firewallRules;
    }

    /**
     * The indicator of enabling PBI service.
     * 
     */
    public Optional<Boolean> getEnablePowerBIService() {
        return Optional.ofNullable(this.enablePowerBIService);
    }
    /**
     * An array of firewall rules.
     * 
     */
    public List<IPv4FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPv4FirewallSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enablePowerBIService;
        private @Nullable List<IPv4FirewallRuleResponse> firewallRules;

        public Builder() {
    	      // Empty
        }

        public Builder(IPv4FirewallSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePowerBIService = defaults.enablePowerBIService;
    	      this.firewallRules = defaults.firewallRules;
        }

        public Builder setEnablePowerBIService(@Nullable Boolean enablePowerBIService) {
            this.enablePowerBIService = enablePowerBIService;
            return this;
        }

        public Builder setFirewallRules(@Nullable List<IPv4FirewallRuleResponse> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public IPv4FirewallSettingsResponse build() {
            return new IPv4FirewallSettingsResponse(enablePowerBIService, firewallRules);
        }
    }
}
