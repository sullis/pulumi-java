// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.UpstreamAuthType;
import io.pulumi.azurenative.webpubsub.inputs.ManagedIdentitySettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Upstream auth settings. If not set, no auth is used for upstream messages.
 * 
 */
public final class UpstreamAuthSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpstreamAuthSettingsArgs Empty = new UpstreamAuthSettingsArgs();

    /**
     * Managed identity settings for upstream.
     * 
     */
    @InputImport(name="managedIdentity")
      private final @Nullable Input<ManagedIdentitySettingsArgs> managedIdentity;

    public Input<ManagedIdentitySettingsArgs> getManagedIdentity() {
        return this.managedIdentity == null ? Input.empty() : this.managedIdentity;
    }

    /**
     * Upstream auth type enum.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,UpstreamAuthType>> type;

    public Input<Either<String,UpstreamAuthType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public UpstreamAuthSettingsArgs(
        @Nullable Input<ManagedIdentitySettingsArgs> managedIdentity,
        @Nullable Input<Either<String,UpstreamAuthType>> type) {
        this.managedIdentity = managedIdentity;
        this.type = type;
    }

    private UpstreamAuthSettingsArgs() {
        this.managedIdentity = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedIdentitySettingsArgs> managedIdentity;
        private @Nullable Input<Either<String,UpstreamAuthType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamAuthSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedIdentity = defaults.managedIdentity;
    	      this.type = defaults.type;
        }

        public Builder setManagedIdentity(@Nullable Input<ManagedIdentitySettingsArgs> managedIdentity) {
            this.managedIdentity = managedIdentity;
            return this;
        }

        public Builder setManagedIdentity(@Nullable ManagedIdentitySettingsArgs managedIdentity) {
            this.managedIdentity = Input.ofNullable(managedIdentity);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,UpstreamAuthType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,UpstreamAuthType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public UpstreamAuthSettingsArgs build() {
            return new UpstreamAuthSettingsArgs(managedIdentity, type);
        }
    }
}