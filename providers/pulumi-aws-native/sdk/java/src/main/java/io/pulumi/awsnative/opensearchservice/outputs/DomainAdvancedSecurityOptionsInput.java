// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.awsnative.opensearchservice.outputs.DomainMasterUserOptions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainAdvancedSecurityOptionsInput {
    private final @Nullable Boolean enabled;
    private final @Nullable Boolean internalUserDatabaseEnabled;
    private final @Nullable DomainMasterUserOptions masterUserOptions;

    @OutputCustomType.Constructor({"enabled","internalUserDatabaseEnabled","masterUserOptions"})
    private DomainAdvancedSecurityOptionsInput(
        @Nullable Boolean enabled,
        @Nullable Boolean internalUserDatabaseEnabled,
        @Nullable DomainMasterUserOptions masterUserOptions) {
        this.enabled = enabled;
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
        this.masterUserOptions = masterUserOptions;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> getInternalUserDatabaseEnabled() {
        return Optional.ofNullable(this.internalUserDatabaseEnabled);
    }
    public Optional<DomainMasterUserOptions> getMasterUserOptions() {
        return Optional.ofNullable(this.masterUserOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAdvancedSecurityOptionsInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean internalUserDatabaseEnabled;
        private @Nullable DomainMasterUserOptions masterUserOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAdvancedSecurityOptionsInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.internalUserDatabaseEnabled = defaults.internalUserDatabaseEnabled;
    	      this.masterUserOptions = defaults.masterUserOptions;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setInternalUserDatabaseEnabled(@Nullable Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
            return this;
        }

        public Builder setMasterUserOptions(@Nullable DomainMasterUserOptions masterUserOptions) {
            this.masterUserOptions = masterUserOptions;
            return this;
        }

        public DomainAdvancedSecurityOptionsInput build() {
            return new DomainAdvancedSecurityOptionsInput(enabled, internalUserDatabaseEnabled, masterUserOptions);
        }
    }
}
