// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.PeriodicModePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The object representing periodic mode backup policy.
 * 
 */
public final class PeriodicModeBackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeriodicModeBackupPolicyArgs Empty = new PeriodicModeBackupPolicyArgs();

    /**
     * Configuration values for periodic mode backup
     * 
     */
    @InputImport(name="periodicModeProperties")
    private final @Nullable Input<PeriodicModePropertiesArgs> periodicModeProperties;

    public Input<PeriodicModePropertiesArgs> getPeriodicModeProperties() {
        return this.periodicModeProperties == null ? Input.empty() : this.periodicModeProperties;
    }

    /**
     * Describes the mode of backups.
     * Expected value is 'Periodic'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public PeriodicModeBackupPolicyArgs(
        @Nullable Input<PeriodicModePropertiesArgs> periodicModeProperties,
        Input<String> type) {
        this.periodicModeProperties = periodicModeProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PeriodicModeBackupPolicyArgs() {
        this.periodicModeProperties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicModeBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PeriodicModePropertiesArgs> periodicModeProperties;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicModeBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodicModeProperties = defaults.periodicModeProperties;
    	      this.type = defaults.type;
        }

        public Builder setPeriodicModeProperties(@Nullable Input<PeriodicModePropertiesArgs> periodicModeProperties) {
            this.periodicModeProperties = periodicModeProperties;
            return this;
        }

        public Builder setPeriodicModeProperties(@Nullable PeriodicModePropertiesArgs periodicModeProperties) {
            this.periodicModeProperties = Input.ofNullable(periodicModeProperties);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public PeriodicModeBackupPolicyArgs build() {
            return new PeriodicModeBackupPolicyArgs(periodicModeProperties, type);
        }
    }
}
