// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API OAuth2 Authentication settings details.
 * 
 */
public final class OAuth2AuthenticationSettingsContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final OAuth2AuthenticationSettingsContractArgs Empty = new OAuth2AuthenticationSettingsContractArgs();

    /**
     * OAuth authorization server identifier.
     * 
     */
    @InputImport(name="authorizationServerId")
      private final @Nullable Input<String> authorizationServerId;

    public Input<String> getAuthorizationServerId() {
        return this.authorizationServerId == null ? Input.empty() : this.authorizationServerId;
    }

    /**
     * operations scope.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public OAuth2AuthenticationSettingsContractArgs(
        @Nullable Input<String> authorizationServerId,
        @Nullable Input<String> scope) {
        this.authorizationServerId = authorizationServerId;
        this.scope = scope;
    }

    private OAuth2AuthenticationSettingsContractArgs() {
        this.authorizationServerId = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuth2AuthenticationSettingsContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationServerId;
        private @Nullable Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuth2AuthenticationSettingsContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationServerId = defaults.authorizationServerId;
    	      this.scope = defaults.scope;
        }

        public Builder setAuthorizationServerId(@Nullable Input<String> authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        public Builder setAuthorizationServerId(@Nullable String authorizationServerId) {
            this.authorizationServerId = Input.ofNullable(authorizationServerId);
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public OAuth2AuthenticationSettingsContractArgs build() {
            return new OAuth2AuthenticationSettingsContractArgs(authorizationServerId, scope);
        }
    }
}