// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class FhirServiceAuthenticationConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FhirServiceAuthenticationConfigurationResponse Empty = new FhirServiceAuthenticationConfigurationResponse();

    /**
     * The audience url for the service
     * 
     */
    @InputImport(name="audience")
      private final @Nullable String audience;

    public Optional<String> getAudience() {
        return this.audience == null ? Optional.empty() : Optional.ofNullable(this.audience);
    }

    /**
     * The authority url for the service
     * 
     */
    @InputImport(name="authority")
      private final @Nullable String authority;

    public Optional<String> getAuthority() {
        return this.authority == null ? Optional.empty() : Optional.ofNullable(this.authority);
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @InputImport(name="smartProxyEnabled")
      private final @Nullable Boolean smartProxyEnabled;

    public Optional<Boolean> getSmartProxyEnabled() {
        return this.smartProxyEnabled == null ? Optional.empty() : Optional.ofNullable(this.smartProxyEnabled);
    }

    public FhirServiceAuthenticationConfigurationResponse(
        @Nullable String audience,
        @Nullable String authority,
        @Nullable Boolean smartProxyEnabled) {
        this.audience = audience;
        this.authority = authority;
        this.smartProxyEnabled = smartProxyEnabled;
    }

    private FhirServiceAuthenticationConfigurationResponse() {
        this.audience = null;
        this.authority = null;
        this.smartProxyEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAuthenticationConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable String authority;
        private @Nullable Boolean smartProxyEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAuthenticationConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAuthority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }

        public Builder setSmartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }
        public FhirServiceAuthenticationConfigurationResponse build() {
            return new FhirServiceAuthenticationConfigurationResponse(audience, authority, smartProxyEnabled);
        }
    }
}