// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDatabaseFlagGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsInsightsConfigGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsLocationPreferenceGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsMaintenanceWindowGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsGetArgs Empty = new DatabaseInstanceSettingsGetArgs();

    /**
     * This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    @Import(name="activationPolicy")
      private final @Nullable Output<String> activationPolicy;

    public Output<String> getActivationPolicy() {
        return this.activationPolicy == null ? Output.empty() : this.activationPolicy;
    }

    /**
     * The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).' For MySQL
     * instances, ensure that `settings.backup_configuration.enabled` and
     * `settings.backup_configuration.binary_log_enabled` are both set to `true`.
     * 
     */
    @Import(name="availabilityType")
      private final @Nullable Output<String> availabilityType;

    public Output<String> getAvailabilityType() {
        return this.availabilityType == null ? Output.empty() : this.availabilityType;
    }

    @Import(name="backupConfiguration")
      private final @Nullable Output<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration;

    public Output<DatabaseInstanceSettingsBackupConfigurationGetArgs> getBackupConfiguration() {
        return this.backupConfiguration == null ? Output.empty() : this.backupConfiguration;
    }

    /**
     * The name of server instance collation.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> getCollation() {
        return this.collation == null ? Output.empty() : this.collation;
    }

    @Import(name="databaseFlags")
      private final @Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags;

    public Output<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> getDatabaseFlags() {
        return this.databaseFlags == null ? Output.empty() : this.databaseFlags;
    }

    /**
     * Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    @Import(name="diskAutoresize")
      private final @Nullable Output<Boolean> diskAutoresize;

    public Output<Boolean> getDiskAutoresize() {
        return this.diskAutoresize == null ? Output.empty() : this.diskAutoresize;
    }

    @Import(name="diskAutoresizeLimit")
      private final @Nullable Output<Integer> diskAutoresizeLimit;

    public Output<Integer> getDiskAutoresizeLimit() {
        return this.diskAutoresizeLimit == null ? Output.empty() : this.diskAutoresizeLimit;
    }

    /**
     * The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    @Import(name="diskSize")
      private final @Nullable Output<Integer> diskSize;

    public Output<Integer> getDiskSize() {
        return this.diskSize == null ? Output.empty() : this.diskSize;
    }

    /**
     * The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> getDiskType() {
        return this.diskType == null ? Output.empty() : this.diskType;
    }

    @Import(name="insightsConfig")
      private final @Nullable Output<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig;

    public Output<DatabaseInstanceSettingsInsightsConfigGetArgs> getInsightsConfig() {
        return this.insightsConfig == null ? Output.empty() : this.insightsConfig;
    }

    @Import(name="ipConfiguration")
      private final @Nullable Output<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration;

    public Output<DatabaseInstanceSettingsIpConfigurationGetArgs> getIpConfiguration() {
        return this.ipConfiguration == null ? Output.empty() : this.ipConfiguration;
    }

    @Import(name="locationPreference")
      private final @Nullable Output<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference;

    public Output<DatabaseInstanceSettingsLocationPreferenceGetArgs> getLocationPreference() {
        return this.locationPreference == null ? Output.empty() : this.locationPreference;
    }

    @Import(name="maintenanceWindow")
      private final @Nullable Output<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow;

    public Output<DatabaseInstanceSettingsMaintenanceWindowGetArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    @Import(name="pricingPlan")
      private final @Nullable Output<String> pricingPlan;

    public Output<String> getPricingPlan() {
        return this.pricingPlan == null ? Output.empty() : this.pricingPlan;
    }

    /**
     * The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<String> tier;

    public Output<String> getTier() {
        return this.tier;
    }

    /**
     * A set of key/value user label pairs to assign to the instance.
     * 
     */
    @Import(name="userLabels")
      private final @Nullable Output<Map<String,String>> userLabels;

    public Output<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Output.empty() : this.userLabels;
    }

    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public DatabaseInstanceSettingsGetArgs(
        @Nullable Output<String> activationPolicy,
        @Nullable Output<String> availabilityType,
        @Nullable Output<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration,
        @Nullable Output<String> collation,
        @Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags,
        @Nullable Output<Boolean> diskAutoresize,
        @Nullable Output<Integer> diskAutoresizeLimit,
        @Nullable Output<Integer> diskSize,
        @Nullable Output<String> diskType,
        @Nullable Output<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig,
        @Nullable Output<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration,
        @Nullable Output<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference,
        @Nullable Output<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Output<String> pricingPlan,
        Output<String> tier,
        @Nullable Output<Map<String,String>> userLabels,
        @Nullable Output<Integer> version) {
        this.activationPolicy = activationPolicy;
        this.availabilityType = availabilityType;
        this.backupConfiguration = backupConfiguration;
        this.collation = collation;
        this.databaseFlags = databaseFlags;
        this.diskAutoresize = diskAutoresize;
        this.diskAutoresizeLimit = diskAutoresizeLimit;
        this.diskSize = diskSize;
        this.diskType = diskType;
        this.insightsConfig = insightsConfig;
        this.ipConfiguration = ipConfiguration;
        this.locationPreference = locationPreference;
        this.maintenanceWindow = maintenanceWindow;
        this.pricingPlan = pricingPlan;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.userLabels = userLabels;
        this.version = version;
    }

    private DatabaseInstanceSettingsGetArgs() {
        this.activationPolicy = Output.empty();
        this.availabilityType = Output.empty();
        this.backupConfiguration = Output.empty();
        this.collation = Output.empty();
        this.databaseFlags = Output.empty();
        this.diskAutoresize = Output.empty();
        this.diskAutoresizeLimit = Output.empty();
        this.diskSize = Output.empty();
        this.diskType = Output.empty();
        this.insightsConfig = Output.empty();
        this.ipConfiguration = Output.empty();
        this.locationPreference = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.pricingPlan = Output.empty();
        this.tier = Output.empty();
        this.userLabels = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activationPolicy;
        private @Nullable Output<String> availabilityType;
        private @Nullable Output<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration;
        private @Nullable Output<String> collation;
        private @Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags;
        private @Nullable Output<Boolean> diskAutoresize;
        private @Nullable Output<Integer> diskAutoresizeLimit;
        private @Nullable Output<Integer> diskSize;
        private @Nullable Output<String> diskType;
        private @Nullable Output<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig;
        private @Nullable Output<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration;
        private @Nullable Output<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference;
        private @Nullable Output<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Output<String> pricingPlan;
        private Output<String> tier;
        private @Nullable Output<Map<String,String>> userLabels;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfiguration = defaults.backupConfiguration;
    	      this.collation = defaults.collation;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.diskAutoresize = defaults.diskAutoresize;
    	      this.diskAutoresizeLimit = defaults.diskAutoresizeLimit;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.insightsConfig = defaults.insightsConfig;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.locationPreference = defaults.locationPreference;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.version = defaults.version;
        }

        public Builder activationPolicy(@Nullable Output<String> activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }
        public Builder activationPolicy(@Nullable String activationPolicy) {
            this.activationPolicy = Output.ofNullable(activationPolicy);
            return this;
        }
        public Builder availabilityType(@Nullable Output<String> availabilityType) {
            this.availabilityType = availabilityType;
            return this;
        }
        public Builder availabilityType(@Nullable String availabilityType) {
            this.availabilityType = Output.ofNullable(availabilityType);
            return this;
        }
        public Builder backupConfiguration(@Nullable Output<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration) {
            this.backupConfiguration = backupConfiguration;
            return this;
        }
        public Builder backupConfiguration(@Nullable DatabaseInstanceSettingsBackupConfigurationGetArgs backupConfiguration) {
            this.backupConfiguration = Output.ofNullable(backupConfiguration);
            return this;
        }
        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = Output.ofNullable(collation);
            return this;
        }
        public Builder databaseFlags(@Nullable Output<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }
        public Builder databaseFlags(@Nullable List<DatabaseInstanceSettingsDatabaseFlagGetArgs> databaseFlags) {
            this.databaseFlags = Output.ofNullable(databaseFlags);
            return this;
        }
        public Builder databaseFlags(DatabaseInstanceSettingsDatabaseFlagGetArgs... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }
        public Builder diskAutoresize(@Nullable Output<Boolean> diskAutoresize) {
            this.diskAutoresize = diskAutoresize;
            return this;
        }
        public Builder diskAutoresize(@Nullable Boolean diskAutoresize) {
            this.diskAutoresize = Output.ofNullable(diskAutoresize);
            return this;
        }
        public Builder diskAutoresizeLimit(@Nullable Output<Integer> diskAutoresizeLimit) {
            this.diskAutoresizeLimit = diskAutoresizeLimit;
            return this;
        }
        public Builder diskAutoresizeLimit(@Nullable Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = Output.ofNullable(diskAutoresizeLimit);
            return this;
        }
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = Output.ofNullable(diskSize);
            return this;
        }
        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = Output.ofNullable(diskType);
            return this;
        }
        public Builder insightsConfig(@Nullable Output<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig) {
            this.insightsConfig = insightsConfig;
            return this;
        }
        public Builder insightsConfig(@Nullable DatabaseInstanceSettingsInsightsConfigGetArgs insightsConfig) {
            this.insightsConfig = Output.ofNullable(insightsConfig);
            return this;
        }
        public Builder ipConfiguration(@Nullable Output<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }
        public Builder ipConfiguration(@Nullable DatabaseInstanceSettingsIpConfigurationGetArgs ipConfiguration) {
            this.ipConfiguration = Output.ofNullable(ipConfiguration);
            return this;
        }
        public Builder locationPreference(@Nullable Output<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference) {
            this.locationPreference = locationPreference;
            return this;
        }
        public Builder locationPreference(@Nullable DatabaseInstanceSettingsLocationPreferenceGetArgs locationPreference) {
            this.locationPreference = Output.ofNullable(locationPreference);
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable DatabaseInstanceSettingsMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Output.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder pricingPlan(@Nullable Output<String> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }
        public Builder pricingPlan(@Nullable String pricingPlan) {
            this.pricingPlan = Output.ofNullable(pricingPlan);
            return this;
        }
        public Builder tier(Output<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }
        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Output.ofNullable(userLabels);
            return this;
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public DatabaseInstanceSettingsGetArgs build() {
            return new DatabaseInstanceSettingsGetArgs(activationPolicy, availabilityType, backupConfiguration, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfig, ipConfiguration, locationPreference, maintenanceWindow, pricingPlan, tier, userLabels, version);
        }
    }
}
