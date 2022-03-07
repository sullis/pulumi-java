// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.MHSMIPRuleResponse;
import io.pulumi.azurenative.keyvault.inputs.MHSMVirtualNetworkRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility of a managed hsm pool.
 * 
 */
public final class MHSMNetworkRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final MHSMNetworkRuleSetResponse Empty = new MHSMNetworkRuleSetResponse();

    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    @InputImport(name="bypass")
      private final @Nullable String bypass;

    public Optional<String> getBypass() {
        return this.bypass == null ? Optional.empty() : Optional.ofNullable(this.bypass);
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @InputImport(name="defaultAction")
      private final @Nullable String defaultAction;

    public Optional<String> getDefaultAction() {
        return this.defaultAction == null ? Optional.empty() : Optional.ofNullable(this.defaultAction);
    }

    /**
     * The list of IP address rules.
     * 
     */
    @InputImport(name="ipRules")
      private final @Nullable List<MHSMIPRuleResponse> ipRules;

    public List<MHSMIPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @InputImport(name="virtualNetworkRules")
      private final @Nullable List<MHSMVirtualNetworkRuleResponse> virtualNetworkRules;

    public List<MHSMVirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public MHSMNetworkRuleSetResponse(
        @Nullable String bypass,
        @Nullable String defaultAction,
        @Nullable List<MHSMIPRuleResponse> ipRules,
        @Nullable List<MHSMVirtualNetworkRuleResponse> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private MHSMNetworkRuleSetResponse() {
        this.bypass = null;
        this.defaultAction = null;
        this.ipRules = List.of();
        this.virtualNetworkRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMNetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bypass;
        private @Nullable String defaultAction;
        private @Nullable List<MHSMIPRuleResponse> ipRules;
        private @Nullable List<MHSMVirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMNetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setBypass(@Nullable String bypass) {
            this.bypass = bypass;
            return this;
        }

        public Builder setDefaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setIpRules(@Nullable List<MHSMIPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<MHSMVirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public MHSMNetworkRuleSetResponse build() {
            return new MHSMNetworkRuleSetResponse(bypass, defaultAction, ipRules, virtualNetworkRules);
        }
    }
}