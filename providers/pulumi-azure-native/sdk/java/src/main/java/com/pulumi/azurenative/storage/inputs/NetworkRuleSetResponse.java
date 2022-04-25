// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.IPRuleResponse;
import com.pulumi.azurenative.storage.inputs.ResourceAccessRuleResponse;
import com.pulumi.azurenative.storage.inputs.VirtualNetworkRuleResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network rule set
 * 
 */
public final class NetworkRuleSetResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetResponse Empty = new NetworkRuleSetResponse();

    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, &#34;Logging, Metrics&#34;), or None to bypass none of those traffics.
     * 
     */
    @Import(name="bypass")
    private @Nullable String bypass;

    /**
     * @return Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, &#34;Logging, Metrics&#34;), or None to bypass none of those traffics.
     * 
     */
    public Optional<String> bypass() {
        return Optional.ofNullable(this.bypass);
    }

    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
    private String defaultAction;

    /**
     * @return Specifies the default action of allow or deny when no other rules match.
     * 
     */
    public String defaultAction() {
        return this.defaultAction;
    }

    /**
     * Sets the IP ACL rules
     * 
     */
    @Import(name="ipRules")
    private @Nullable List<IPRuleResponse> ipRules;

    /**
     * @return Sets the IP ACL rules
     * 
     */
    public Optional<List<IPRuleResponse>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * Sets the resource access rules
     * 
     */
    @Import(name="resourceAccessRules")
    private @Nullable List<ResourceAccessRuleResponse> resourceAccessRules;

    /**
     * @return Sets the resource access rules
     * 
     */
    public Optional<List<ResourceAccessRuleResponse>> resourceAccessRules() {
        return Optional.ofNullable(this.resourceAccessRules);
    }

    /**
     * Sets the virtual network rules
     * 
     */
    @Import(name="virtualNetworkRules")
    private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    /**
     * @return Sets the virtual network rules
     * 
     */
    public Optional<List<VirtualNetworkRuleResponse>> virtualNetworkRules() {
        return Optional.ofNullable(this.virtualNetworkRules);
    }

    private NetworkRuleSetResponse() {}

    private NetworkRuleSetResponse(NetworkRuleSetResponse $) {
        this.bypass = $.bypass;
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.resourceAccessRules = $.resourceAccessRules;
        this.virtualNetworkRules = $.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRuleSetResponse $;

        public Builder() {
            $ = new NetworkRuleSetResponse();
        }

        public Builder(NetworkRuleSetResponse defaults) {
            $ = new NetworkRuleSetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypass Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, &#34;Logging, Metrics&#34;), or None to bypass none of those traffics.
         * 
         * @return builder
         * 
         */
        public Builder bypass(@Nullable String bypass) {
            $.bypass = bypass;
            return this;
        }

        /**
         * @param defaultAction Specifies the default action of allow or deny when no other rules match.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param ipRules Sets the IP ACL rules
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable List<IPRuleResponse> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules Sets the IP ACL rules
         * 
         * @return builder
         * 
         */
        public Builder ipRules(IPRuleResponse... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @param resourceAccessRules Sets the resource access rules
         * 
         * @return builder
         * 
         */
        public Builder resourceAccessRules(@Nullable List<ResourceAccessRuleResponse> resourceAccessRules) {
            $.resourceAccessRules = resourceAccessRules;
            return this;
        }

        /**
         * @param resourceAccessRules Sets the resource access rules
         * 
         * @return builder
         * 
         */
        public Builder resourceAccessRules(ResourceAccessRuleResponse... resourceAccessRules) {
            return resourceAccessRules(List.of(resourceAccessRules));
        }

        /**
         * @param virtualNetworkRules Sets the virtual network rules
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            $.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        /**
         * @param virtualNetworkRules Sets the virtual network rules
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }

        public NetworkRuleSetResponse build() {
            $.bypass = Codegen.stringProp("bypass").arg($.bypass).def("AzureServices").getNullable();
            $.defaultAction = Codegen.stringProp("defaultAction").arg($.defaultAction).def("Allow").require();
            return $;
        }
    }

}
