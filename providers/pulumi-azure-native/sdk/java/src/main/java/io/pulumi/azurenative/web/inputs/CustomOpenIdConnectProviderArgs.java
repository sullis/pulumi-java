// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.OpenIdConnectLoginArgs;
import io.pulumi.azurenative.web.inputs.OpenIdConnectRegistrationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the custom Open ID Connect provider.
 * 
 */
public final class CustomOpenIdConnectProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomOpenIdConnectProviderArgs Empty = new CustomOpenIdConnectProviderArgs();

    /**
     * <code>false</code> if the custom Open ID provider provider should not be enabled; otherwise, <code>true</code>.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow of the custom Open ID Connect provider.
     * 
     */
    @InputImport(name="login")
    private final @Nullable Input<OpenIdConnectLoginArgs> login;

    public Input<OpenIdConnectLoginArgs> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * The configuration settings of the app registration for the custom Open ID Connect provider.
     * 
     */
    @InputImport(name="registration")
    private final @Nullable Input<OpenIdConnectRegistrationArgs> registration;

    public Input<OpenIdConnectRegistrationArgs> getRegistration() {
        return this.registration == null ? Input.empty() : this.registration;
    }

    public CustomOpenIdConnectProviderArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<OpenIdConnectLoginArgs> login,
        @Nullable Input<OpenIdConnectRegistrationArgs> registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    private CustomOpenIdConnectProviderArgs() {
        this.enabled = Input.empty();
        this.login = Input.empty();
        this.registration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomOpenIdConnectProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<OpenIdConnectLoginArgs> login;
        private @Nullable Input<OpenIdConnectRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomOpenIdConnectProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogin(@Nullable Input<OpenIdConnectLoginArgs> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable OpenIdConnectLoginArgs login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setRegistration(@Nullable Input<OpenIdConnectRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder setRegistration(@Nullable OpenIdConnectRegistrationArgs registration) {
            this.registration = Input.ofNullable(registration);
            return this;
        }

        public CustomOpenIdConnectProviderArgs build() {
            return new CustomOpenIdConnectProviderArgs(enabled, login, registration);
        }
    }
}
