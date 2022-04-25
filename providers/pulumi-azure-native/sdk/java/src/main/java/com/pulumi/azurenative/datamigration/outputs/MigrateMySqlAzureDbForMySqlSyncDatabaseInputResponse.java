// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse {
    /**
     * @return Migration settings which tune the migration behavior
     * 
     */
    private final @Nullable Map<String,String> migrationSetting;
    /**
     * @return Name of the database
     * 
     */
    private final @Nullable String name;
    /**
     * @return Source settings to tune source endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> sourceSetting;
    /**
     * @return Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    private final @Nullable String targetDatabaseName;
    /**
     * @return Target settings to tune target endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> targetSetting;

    @CustomType.Constructor
    private MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse(
        @CustomType.Parameter("migrationSetting") @Nullable Map<String,String> migrationSetting,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("sourceSetting") @Nullable Map<String,String> sourceSetting,
        @CustomType.Parameter("targetDatabaseName") @Nullable String targetDatabaseName,
        @CustomType.Parameter("targetSetting") @Nullable Map<String,String> targetSetting) {
        this.migrationSetting = migrationSetting;
        this.name = name;
        this.sourceSetting = sourceSetting;
        this.targetDatabaseName = targetDatabaseName;
        this.targetSetting = targetSetting;
    }

    /**
     * @return Migration settings which tune the migration behavior
     * 
     */
    public Map<String,String> migrationSetting() {
        return this.migrationSetting == null ? Map.of() : this.migrationSetting;
    }
    /**
     * @return Name of the database
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Source settings to tune source endpoint migration behavior
     * 
     */
    public Map<String,String> sourceSetting() {
        return this.sourceSetting == null ? Map.of() : this.sourceSetting;
    }
    /**
     * @return Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    public Optional<String> targetDatabaseName() {
        return Optional.ofNullable(this.targetDatabaseName);
    }
    /**
     * @return Target settings to tune target endpoint migration behavior
     * 
     */
    public Map<String,String> targetSetting() {
        return this.targetSetting == null ? Map.of() : this.targetSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> migrationSetting;
        private @Nullable String name;
        private @Nullable Map<String,String> sourceSetting;
        private @Nullable String targetDatabaseName;
        private @Nullable Map<String,String> targetSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationSetting = defaults.migrationSetting;
    	      this.name = defaults.name;
    	      this.sourceSetting = defaults.sourceSetting;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
    	      this.targetSetting = defaults.targetSetting;
        }

        public Builder migrationSetting(@Nullable Map<String,String> migrationSetting) {
            this.migrationSetting = migrationSetting;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder sourceSetting(@Nullable Map<String,String> sourceSetting) {
            this.sourceSetting = sourceSetting;
            return this;
        }
        public Builder targetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public Builder targetSetting(@Nullable Map<String,String> targetSetting) {
            this.targetSetting = targetSetting;
            return this;
        }        public MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncDatabaseInputResponse(migrationSetting, name, sourceSetting, targetDatabaseName, targetSetting);
        }
    }
}
