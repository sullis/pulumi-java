// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.IPRuleResponse;
import io.pulumi.azurenative.keyvault.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetResponse {
    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    private final @Nullable String bypass;
    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    private final @Nullable String defaultAction;
    /**
     * The list of IP address rules.
     * 
     */
    private final @Nullable List<IPRuleResponse> ipRules;
    /**
     * The list of virtual network rules.
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @OutputCustomType.Constructor({"bypass","defaultAction","ipRules","virtualNetworkRules"})
    private NetworkRuleSetResponse(
        @Nullable String bypass,
        @Nullable String defaultAction,
        @Nullable List<IPRuleResponse> ipRules,
        @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    public Optional<String> getBypass() {
        return Optional.ofNullable(this.bypass);
    }
    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    public Optional<String> getDefaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * The list of IP address rules.
     * 
     */
    public List<IPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * The list of virtual network rules.
     * 
     */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bypass;
        private @Nullable String defaultAction;
        private @Nullable List<IPRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
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

        public Builder setIpRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(bypass, defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
