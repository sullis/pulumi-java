// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.ManagedIdentitySettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Upstream auth settings. If not set, no auth is used for upstream messages.
 * 
 */
public final class UpstreamAuthSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpstreamAuthSettingsResponse Empty = new UpstreamAuthSettingsResponse();

    /**
     * Managed identity settings for upstream.
     * 
     */
    @InputImport(name="managedIdentity")
    private final @Nullable ManagedIdentitySettingsResponse managedIdentity;

    public Optional<ManagedIdentitySettingsResponse> getManagedIdentity() {
        return this.managedIdentity == null ? Optional.empty() : Optional.ofNullable(this.managedIdentity);
    }

    /**
     * Upstream auth type enum.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public UpstreamAuthSettingsResponse(
        @Nullable ManagedIdentitySettingsResponse managedIdentity,
        @Nullable String type) {
        this.managedIdentity = managedIdentity;
        this.type = type;
    }

    private UpstreamAuthSettingsResponse() {
        this.managedIdentity = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamAuthSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagedIdentitySettingsResponse managedIdentity;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamAuthSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedIdentity = defaults.managedIdentity;
    	      this.type = defaults.type;
        }

        public Builder setManagedIdentity(@Nullable ManagedIdentitySettingsResponse managedIdentity) {
            this.managedIdentity = managedIdentity;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public UpstreamAuthSettingsResponse build() {
            return new UpstreamAuthSettingsResponse(managedIdentity, type);
        }
    }
}
