// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.inputs.SecurityPolicyWebApplicationFirewallParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyArgs Empty = new SecurityPolicyArgs();

    /**
     * object which contains security policy parameters
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<SecurityPolicyWebApplicationFirewallParametersArgs> parameters;

    public Output<SecurityPolicyWebApplicationFirewallParametersArgs> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the security policy under the profile.
     * 
     */
    @Import(name="securityPolicyName")
      private final @Nullable Output<String> securityPolicyName;

    public Output<String> getSecurityPolicyName() {
        return this.securityPolicyName == null ? Output.empty() : this.securityPolicyName;
    }

    public SecurityPolicyArgs(
        @Nullable Output<SecurityPolicyWebApplicationFirewallParametersArgs> parameters,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<String> securityPolicyName) {
        this.parameters = parameters;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityPolicyName = securityPolicyName;
    }

    private SecurityPolicyArgs() {
        this.parameters = Output.empty();
        this.profileName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.securityPolicyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyWebApplicationFirewallParametersArgs> parameters;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> securityPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityPolicyName = defaults.securityPolicyName;
        }

        public Builder parameters(@Nullable Output<SecurityPolicyWebApplicationFirewallParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable SecurityPolicyWebApplicationFirewallParametersArgs parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder securityPolicyName(@Nullable Output<String> securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
            return this;
        }
        public Builder securityPolicyName(@Nullable String securityPolicyName) {
            this.securityPolicyName = Output.ofNullable(securityPolicyName);
            return this;
        }        public SecurityPolicyArgs build() {
            return new SecurityPolicyArgs(parameters, profileName, resourceGroupName, securityPolicyName);
        }
    }
}
