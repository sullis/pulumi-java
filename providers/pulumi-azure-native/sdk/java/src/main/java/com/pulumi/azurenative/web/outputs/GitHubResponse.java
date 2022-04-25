// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ClientRegistrationResponse;
import com.pulumi.azurenative.web.outputs.LoginScopesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitHubResponse {
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The configuration settings of the login flow.
     * 
     */
    private final @Nullable LoginScopesResponse login;
    /**
     * @return The configuration settings of the app registration for the GitHub provider.
     * 
     */
    private final @Nullable ClientRegistrationResponse registration;

    @CustomType.Constructor
    private GitHubResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("login") @Nullable LoginScopesResponse login,
        @CustomType.Parameter("registration") @Nullable ClientRegistrationResponse registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The configuration settings of the login flow.
     * 
     */
    public Optional<LoginScopesResponse> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * @return The configuration settings of the app registration for the GitHub provider.
     * 
     */
    public Optional<ClientRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable LoginScopesResponse login;
        private @Nullable ClientRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder login(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }
        public Builder registration(@Nullable ClientRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }        public GitHubResponse build() {
            return new GitHubResponse(enabled, login, registration);
        }
    }
}
