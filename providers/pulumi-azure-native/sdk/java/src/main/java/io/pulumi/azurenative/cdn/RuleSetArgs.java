// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleSetArgs Empty = new RuleSetArgs();

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the rule set under the profile which is unique globally
     * 
     */
    @InputImport(name="ruleSetName")
    private final @Nullable Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName == null ? Input.empty() : this.ruleSetName;
    }

    public RuleSetArgs(
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleSetName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
    }

    private RuleSetArgs() {
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRuleSetName(@Nullable Input<String> ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        public Builder setRuleSetName(@Nullable String ruleSetName) {
            this.ruleSetName = Input.ofNullable(ruleSetName);
            return this;
        }

        public RuleSetArgs build() {
            return new RuleSetArgs(profileName, resourceGroupName, ruleSetName);
        }
    }
}
