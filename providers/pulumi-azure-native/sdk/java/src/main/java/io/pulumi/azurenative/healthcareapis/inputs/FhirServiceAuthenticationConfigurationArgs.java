// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class FhirServiceAuthenticationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirServiceAuthenticationConfigurationArgs Empty = new FhirServiceAuthenticationConfigurationArgs();

    /**
     * The audience url for the service
     * 
     */
    @InputImport(name="audience")
    private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * The authority url for the service
     * 
     */
    @InputImport(name="authority")
    private final @Nullable Input<String> authority;

    public Input<String> getAuthority() {
        return this.authority == null ? Input.empty() : this.authority;
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @InputImport(name="smartProxyEnabled")
    private final @Nullable Input<Boolean> smartProxyEnabled;

    public Input<Boolean> getSmartProxyEnabled() {
        return this.smartProxyEnabled == null ? Input.empty() : this.smartProxyEnabled;
    }

    public FhirServiceAuthenticationConfigurationArgs(
        @Nullable Input<String> audience,
        @Nullable Input<String> authority,
        @Nullable Input<Boolean> smartProxyEnabled) {
        this.audience = audience;
        this.authority = authority;
        this.smartProxyEnabled = smartProxyEnabled;
    }

    private FhirServiceAuthenticationConfigurationArgs() {
        this.audience = Input.empty();
        this.authority = Input.empty();
        this.smartProxyEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAuthenticationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audience;
        private @Nullable Input<String> authority;
        private @Nullable Input<Boolean> smartProxyEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAuthenticationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        public Builder setAudience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder setAuthority(@Nullable Input<String> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable String authority) {
            this.authority = Input.ofNullable(authority);
            return this;
        }

        public Builder setSmartProxyEnabled(@Nullable Input<Boolean> smartProxyEnabled) {
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }

        public Builder setSmartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            this.smartProxyEnabled = Input.ofNullable(smartProxyEnabled);
            return this;
        }

        public FhirServiceAuthenticationConfigurationArgs build() {
            return new FhirServiceAuthenticationConfigurationArgs(audience, authority, smartProxyEnabled);
        }
    }
}
