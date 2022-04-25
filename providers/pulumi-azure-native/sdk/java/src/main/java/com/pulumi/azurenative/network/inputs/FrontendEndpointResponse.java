// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.CustomHttpsConfigurationResponse;
import com.pulumi.azurenative.network.inputs.FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A frontend endpoint used for routing.
 * 
 */
public final class FrontendEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final FrontendEndpointResponse Empty = new FrontendEndpointResponse();

    /**
     * The configuration specifying how to enable HTTPS
     * 
     */
    @Import(name="customHttpsConfiguration", required=true)
    private CustomHttpsConfigurationResponse customHttpsConfiguration;

    /**
     * @return The configuration specifying how to enable HTTPS
     * 
     */
    public CustomHttpsConfigurationResponse customHttpsConfiguration() {
        return this.customHttpsConfiguration;
    }

    /**
     * Provisioning status of Custom Https of the frontendEndpoint.
     * 
     */
    @Import(name="customHttpsProvisioningState", required=true)
    private String customHttpsProvisioningState;

    /**
     * @return Provisioning status of Custom Https of the frontendEndpoint.
     * 
     */
    public String customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }

    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    @Import(name="customHttpsProvisioningSubstate", required=true)
    private String customHttpsProvisioningSubstate;

    /**
     * @return Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    public String customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }

    /**
     * The host name of the frontendEndpoint. Must be a domain name.
     * 
     */
    @Import(name="hostName")
    private @Nullable String hostName;

    /**
     * @return The host name of the frontendEndpoint. Must be a domain name.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Resource name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Resource status.
     * 
     */
    @Import(name="resourceState", required=true)
    private String resourceState;

    /**
     * @return Resource status.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }

    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="sessionAffinityEnabledState")
    private @Nullable String sessionAffinityEnabledState;

    /**
     * @return Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<String> sessionAffinityEnabledState() {
        return Optional.ofNullable(this.sessionAffinityEnabledState);
    }

    /**
     * UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
     * 
     */
    @Import(name="sessionAffinityTtlSeconds")
    private @Nullable Integer sessionAffinityTtlSeconds;

    /**
     * @return UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
     * 
     */
    public Optional<Integer> sessionAffinityTtlSeconds() {
        return Optional.ofNullable(this.sessionAffinityTtlSeconds);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Defines the Web Application Firewall policy for each host (if applicable)
     * 
     */
    @Import(name="webApplicationFirewallPolicyLink")
    private @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    /**
     * @return Defines the Web Application Firewall policy for each host (if applicable)
     * 
     */
    public Optional<FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink> webApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    private FrontendEndpointResponse() {}

    private FrontendEndpointResponse(FrontendEndpointResponse $) {
        this.customHttpsConfiguration = $.customHttpsConfiguration;
        this.customHttpsProvisioningState = $.customHttpsProvisioningState;
        this.customHttpsProvisioningSubstate = $.customHttpsProvisioningSubstate;
        this.hostName = $.hostName;
        this.id = $.id;
        this.name = $.name;
        this.resourceState = $.resourceState;
        this.sessionAffinityEnabledState = $.sessionAffinityEnabledState;
        this.sessionAffinityTtlSeconds = $.sessionAffinityTtlSeconds;
        this.type = $.type;
        this.webApplicationFirewallPolicyLink = $.webApplicationFirewallPolicyLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontendEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontendEndpointResponse $;

        public Builder() {
            $ = new FrontendEndpointResponse();
        }

        public Builder(FrontendEndpointResponse defaults) {
            $ = new FrontendEndpointResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHttpsConfiguration The configuration specifying how to enable HTTPS
         * 
         * @return builder
         * 
         */
        public Builder customHttpsConfiguration(CustomHttpsConfigurationResponse customHttpsConfiguration) {
            $.customHttpsConfiguration = customHttpsConfiguration;
            return this;
        }

        /**
         * @param customHttpsProvisioningState Provisioning status of Custom Https of the frontendEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder customHttpsProvisioningState(String customHttpsProvisioningState) {
            $.customHttpsProvisioningState = customHttpsProvisioningState;
            return this;
        }

        /**
         * @param customHttpsProvisioningSubstate Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
         * 
         * @return builder
         * 
         */
        public Builder customHttpsProvisioningSubstate(String customHttpsProvisioningSubstate) {
            $.customHttpsProvisioningSubstate = customHttpsProvisioningSubstate;
            return this;
        }

        /**
         * @param hostName The host name of the frontendEndpoint. Must be a domain name.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceState Resource status.
         * 
         * @return builder
         * 
         */
        public Builder resourceState(String resourceState) {
            $.resourceState = resourceState;
            return this;
        }

        /**
         * @param sessionAffinityEnabledState Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityEnabledState(@Nullable String sessionAffinityEnabledState) {
            $.sessionAffinityEnabledState = sessionAffinityEnabledState;
            return this;
        }

        /**
         * @param sessionAffinityTtlSeconds UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtlSeconds(@Nullable Integer sessionAffinityTtlSeconds) {
            $.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
            return this;
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param webApplicationFirewallPolicyLink Defines the Web Application Firewall policy for each host (if applicable)
         * 
         * @return builder
         * 
         */
        public Builder webApplicationFirewallPolicyLink(@Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
            $.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }

        public FrontendEndpointResponse build() {
            $.customHttpsConfiguration = Objects.requireNonNull($.customHttpsConfiguration, "expected parameter 'customHttpsConfiguration' to be non-null");
            $.customHttpsProvisioningState = Objects.requireNonNull($.customHttpsProvisioningState, "expected parameter 'customHttpsProvisioningState' to be non-null");
            $.customHttpsProvisioningSubstate = Objects.requireNonNull($.customHttpsProvisioningSubstate, "expected parameter 'customHttpsProvisioningSubstate' to be non-null");
            $.resourceState = Objects.requireNonNull($.resourceState, "expected parameter 'resourceState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
