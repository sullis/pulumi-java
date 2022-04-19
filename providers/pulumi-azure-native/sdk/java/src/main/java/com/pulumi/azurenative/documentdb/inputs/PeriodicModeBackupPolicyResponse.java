// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.PeriodicModePropertiesResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The object representing periodic mode backup policy.
 * 
 */
public final class PeriodicModeBackupPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final PeriodicModeBackupPolicyResponse Empty = new PeriodicModeBackupPolicyResponse();

    /**
     * Configuration values for periodic mode backup
     * 
     */
    @Import(name="periodicModeProperties")
      private final @Nullable PeriodicModePropertiesResponse periodicModeProperties;

    public Optional<PeriodicModePropertiesResponse> periodicModeProperties() {
        return this.periodicModeProperties == null ? Optional.empty() : Optional.ofNullable(this.periodicModeProperties);
    }

    /**
     * Describes the mode of backups.
     * Expected value is 'Periodic'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public PeriodicModeBackupPolicyResponse(
        @Nullable PeriodicModePropertiesResponse periodicModeProperties,
        String type) {
        this.periodicModeProperties = periodicModeProperties;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private PeriodicModeBackupPolicyResponse() {
        this.periodicModeProperties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicModeBackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PeriodicModePropertiesResponse periodicModeProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicModeBackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodicModeProperties = defaults.periodicModeProperties;
    	      this.type = defaults.type;
        }

        public Builder periodicModeProperties(@Nullable PeriodicModePropertiesResponse periodicModeProperties) {
            this.periodicModeProperties = periodicModeProperties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PeriodicModeBackupPolicyResponse build() {
            return new PeriodicModeBackupPolicyResponse(periodicModeProperties, type);
        }
    }
}
