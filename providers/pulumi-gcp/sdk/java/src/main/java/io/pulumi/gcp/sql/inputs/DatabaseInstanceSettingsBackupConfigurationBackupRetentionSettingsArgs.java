// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs Empty = new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
     * is 'COUNT', we will retain this many backups.
     * 
     */
    @InputImport(name="retainedBackups", required=true)
    private final Input<Integer> retainedBackups;

    public Input<Integer> getRetainedBackups() {
        return this.retainedBackups;
    }

    /**
     * The unit that 'retained_backups' represents. Defaults to `COUNT`.
     * 
     */
    @InputImport(name="retentionUnit")
    private final @Nullable Input<String> retentionUnit;

    public Input<String> getRetentionUnit() {
        return this.retentionUnit == null ? Input.empty() : this.retentionUnit;
    }

    public DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs(
        Input<Integer> retainedBackups,
        @Nullable Input<String> retentionUnit) {
        this.retainedBackups = Objects.requireNonNull(retainedBackups, "expected parameter 'retainedBackups' to be non-null");
        this.retentionUnit = retentionUnit;
    }

    private DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs() {
        this.retainedBackups = Input.empty();
        this.retentionUnit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> retainedBackups;
        private @Nullable Input<String> retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder setRetainedBackups(Input<Integer> retainedBackups) {
            this.retainedBackups = Objects.requireNonNull(retainedBackups);
            return this;
        }

        public Builder setRetainedBackups(Integer retainedBackups) {
            this.retainedBackups = Input.of(Objects.requireNonNull(retainedBackups));
            return this;
        }

        public Builder setRetentionUnit(@Nullable Input<String> retentionUnit) {
            this.retentionUnit = retentionUnit;
            return this;
        }

        public Builder setRetentionUnit(@Nullable String retentionUnit) {
            this.retentionUnit = Input.ofNullable(retentionUnit);
            return this;
        }

        public DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs build() {
            return new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs(retainedBackups, retentionUnit);
        }
    }
}
