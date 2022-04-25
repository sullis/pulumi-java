// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.CustomRuleListArgs;
import com.pulumi.azurenative.network.inputs.FrontDoorPolicySettingsArgs;
import com.pulumi.azurenative.network.inputs.ManagedRuleSetListArgs;
import com.pulumi.azurenative.network.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Describes custom rules inside the policy.
     * 
     */
    @Import(name="customRules")
    private @Nullable Output<CustomRuleListArgs> customRules;

    /**
     * @return Describes custom rules inside the policy.
     * 
     */
    public Optional<Output<CustomRuleListArgs>> customRules() {
        return Optional.ofNullable(this.customRules);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Describes managed rules inside the policy.
     * 
     */
    @Import(name="managedRules")
    private @Nullable Output<ManagedRuleSetListArgs> managedRules;

    /**
     * @return Describes managed rules inside the policy.
     * 
     */
    public Optional<Output<ManagedRuleSetListArgs>> managedRules() {
        return Optional.ofNullable(this.managedRules);
    }

    /**
     * The name of the Web Application Firewall Policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return The name of the Web Application Firewall Policy.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Describes settings for the policy.
     * 
     */
    @Import(name="policySettings")
    private @Nullable Output<FrontDoorPolicySettingsArgs> policySettings;

    /**
     * @return Describes settings for the policy.
     * 
     */
    public Optional<Output<FrontDoorPolicySettingsArgs>> policySettings() {
        return Optional.ofNullable(this.policySettings);
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    /**
     * @return The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.customRules = $.customRules;
        this.location = $.location;
        this.managedRules = $.managedRules;
        this.policyName = $.policyName;
        this.policySettings = $.policySettings;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRules Describes custom rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder customRules(@Nullable Output<CustomRuleListArgs> customRules) {
            $.customRules = customRules;
            return this;
        }

        /**
         * @param customRules Describes custom rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder customRules(CustomRuleListArgs customRules) {
            return customRules(Output.of(customRules));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedRules Describes managed rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(@Nullable Output<ManagedRuleSetListArgs> managedRules) {
            $.managedRules = managedRules;
            return this;
        }

        /**
         * @param managedRules Describes managed rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(ManagedRuleSetListArgs managedRules) {
            return managedRules(Output.of(managedRules));
        }

        /**
         * @param policyName The name of the Web Application Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the Web Application Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policySettings Describes settings for the policy.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(@Nullable Output<FrontDoorPolicySettingsArgs> policySettings) {
            $.policySettings = policySettings;
            return this;
        }

        /**
         * @param policySettings Describes settings for the policy.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(FrontDoorPolicySettingsArgs policySettings) {
            return policySettings(Output.of(policySettings));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PolicyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
