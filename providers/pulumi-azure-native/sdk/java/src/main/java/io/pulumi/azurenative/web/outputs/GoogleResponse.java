// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AllowedAudiencesValidationResponse;
import io.pulumi.azurenative.web.outputs.ClientRegistrationResponse;
import io.pulumi.azurenative.web.outputs.LoginScopesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GoogleResponse {
    /**
     * <code>false</code> if the Google provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the login flow.
     * 
     */
    private final @Nullable LoginScopesResponse login;
    /**
     * The configuration settings of the app registration for the Google provider.
     * 
     */
    private final @Nullable ClientRegistrationResponse registration;
    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    private final @Nullable AllowedAudiencesValidationResponse validation;

    @OutputCustomType.Constructor({"enabled","login","registration","validation"})
    private GoogleResponse(
        @Nullable Boolean enabled,
        @Nullable LoginScopesResponse login,
        @Nullable ClientRegistrationResponse registration,
        @Nullable AllowedAudiencesValidationResponse validation) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    /**
     * <code>false</code> if the Google provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the login flow.
     * 
    */
    public Optional<LoginScopesResponse> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The configuration settings of the app registration for the Google provider.
     * 
    */
    public Optional<ClientRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }
    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
    */
    public Optional<AllowedAudiencesValidationResponse> getValidation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable LoginScopesResponse login;
        private @Nullable ClientRegistrationResponse registration;
        private @Nullable AllowedAudiencesValidationResponse validation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogin(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }

        public Builder setRegistration(@Nullable ClientRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }

        public Builder setValidation(@Nullable AllowedAudiencesValidationResponse validation) {
            this.validation = validation;
            return this;
        }
        public GoogleResponse build() {
            return new GoogleResponse(enabled, login, registration, validation);
        }
    }
}