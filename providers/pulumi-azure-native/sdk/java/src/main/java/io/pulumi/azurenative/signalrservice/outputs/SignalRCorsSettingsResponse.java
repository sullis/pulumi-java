// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SignalRCorsSettingsResponse {
    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin calls (for example: http://example.com:12345). Use "*" to allow all. If omitted, allow all by default.
     * 
     */
    private final @Nullable List<String> allowedOrigins;

    @OutputCustomType.Constructor({"allowedOrigins"})
    private SignalRCorsSettingsResponse(@Nullable List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin calls (for example: http://example.com:12345). Use "*" to allow all. If omitted, allow all by default.
     * 
     */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRCorsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRCorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
        }

        public Builder setAllowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        public SignalRCorsSettingsResponse build() {
            return new SignalRCorsSettingsResponse(allowedOrigins);
        }
    }
}
