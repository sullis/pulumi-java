// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for returning group information from authenticators.
 * 
 */
public final class AuthenticatorGroupsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticatorGroupsConfigArgs Empty = new AuthenticatorGroupsConfigArgs();

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    @InputImport(name="securityGroup")
      private final @Nullable Input<String> securityGroup;

    public Input<String> getSecurityGroup() {
        return this.securityGroup == null ? Input.empty() : this.securityGroup;
    }

    public AuthenticatorGroupsConfigArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> securityGroup) {
        this.enabled = enabled;
        this.securityGroup = securityGroup;
    }

    private AuthenticatorGroupsConfigArgs() {
        this.enabled = Input.empty();
        this.securityGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticatorGroupsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticatorGroupsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setSecurityGroup(@Nullable Input<String> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }

        public Builder setSecurityGroup(@Nullable String securityGroup) {
            this.securityGroup = Input.ofNullable(securityGroup);
            return this;
        }
        public AuthenticatorGroupsConfigArgs build() {
            return new AuthenticatorGroupsConfigArgs(enabled, securityGroup);
        }
    }
}