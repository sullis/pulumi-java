// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ApiOAuthSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection provider parameters
 * 
 */
public final class ConnectionParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionParameterResponse Empty = new ConnectionParameterResponse();

    /**
     * OAuth settings for the connection provider
     * 
     */
    @InputImport(name="oAuthSettings")
      private final @Nullable ApiOAuthSettingsResponse oAuthSettings;

    public Optional<ApiOAuthSettingsResponse> getOAuthSettings() {
        return this.oAuthSettings == null ? Optional.empty() : Optional.ofNullable(this.oAuthSettings);
    }

    /**
     * Type of the parameter
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ConnectionParameterResponse(
        @Nullable ApiOAuthSettingsResponse oAuthSettings,
        @Nullable String type) {
        this.oAuthSettings = oAuthSettings;
        this.type = type;
    }

    private ConnectionParameterResponse() {
        this.oAuthSettings = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiOAuthSettingsResponse oAuthSettings;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oAuthSettings = defaults.oAuthSettings;
    	      this.type = defaults.type;
        }

        public Builder setOAuthSettings(@Nullable ApiOAuthSettingsResponse oAuthSettings) {
            this.oAuthSettings = oAuthSettings;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ConnectionParameterResponse build() {
            return new ConnectionParameterResponse(oAuthSettings, type);
        }
    }
}