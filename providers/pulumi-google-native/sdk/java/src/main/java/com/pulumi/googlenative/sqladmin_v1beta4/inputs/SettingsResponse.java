// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.BackupConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DatabaseFlagsResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DenyMaintenancePeriodResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.InsightsConfigResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.IpConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.LocationPreferenceResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.MaintenanceWindowResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.PasswordValidationPolicyResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlActiveDirectoryConfigResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlServerAuditConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Database instance settings.
 * 
 */
public final class SettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SettingsResponse Empty = new SettingsResponse();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @Import(name="activationPolicy", required=true)
    private String activationPolicy;

    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    public String activationPolicy() {
        return this.activationPolicy;
    }

    /**
     * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    @Import(name="activeDirectoryConfig", required=true)
    private SqlActiveDirectoryConfigResponse activeDirectoryConfig;

    /**
     * @return Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    public SqlActiveDirectoryConfigResponse activeDirectoryConfig() {
        return this.activeDirectoryConfig;
    }

    /**
     * Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    @Import(name="availabilityType", required=true)
    private String availabilityType;

    /**
     * @return Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    public String availabilityType() {
        return this.availabilityType;
    }

    /**
     * The daily backup configuration for the instance.
     * 
     */
    @Import(name="backupConfiguration", required=true)
    private BackupConfigurationResponse backupConfiguration;

    /**
     * @return The daily backup configuration for the instance.
     * 
     */
    public BackupConfigurationResponse backupConfiguration() {
        return this.backupConfiguration;
    }

    /**
     * The name of server Instance collation.
     * 
     */
    @Import(name="collation", required=true)
    private String collation;

    /**
     * @return The name of server Instance collation.
     * 
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    @Import(name="crashSafeReplicationEnabled", required=true)
    private Boolean crashSafeReplicationEnabled;

    /**
     * @return Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    public Boolean crashSafeReplicationEnabled() {
        return this.crashSafeReplicationEnabled;
    }

    /**
     * The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    @Import(name="dataDiskSizeGb", required=true)
    private String dataDiskSizeGb;

    /**
     * @return The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    public String dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }

    /**
     * The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    @Import(name="dataDiskType", required=true)
    private String dataDiskType;

    /**
     * @return The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    public String dataDiskType() {
        return this.dataDiskType;
    }

    /**
     * The database flags passed to the instance at startup.
     * 
     */
    @Import(name="databaseFlags", required=true)
    private List<DatabaseFlagsResponse> databaseFlags;

    /**
     * @return The database flags passed to the instance at startup.
     * 
     */
    public List<DatabaseFlagsResponse> databaseFlags() {
        return this.databaseFlags;
    }

    /**
     * Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    @Import(name="databaseReplicationEnabled", required=true)
    private Boolean databaseReplicationEnabled;

    /**
     * @return Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    public Boolean databaseReplicationEnabled() {
        return this.databaseReplicationEnabled;
    }

    /**
     * Deny maintenance periods
     * 
     */
    @Import(name="denyMaintenancePeriods", required=true)
    private List<DenyMaintenancePeriodResponse> denyMaintenancePeriods;

    /**
     * @return Deny maintenance periods
     * 
     */
    public List<DenyMaintenancePeriodResponse> denyMaintenancePeriods() {
        return this.denyMaintenancePeriods;
    }

    /**
     * Insights configuration, for now relevant only for Postgres.
     * 
     */
    @Import(name="insightsConfig", required=true)
    private InsightsConfigResponse insightsConfig;

    /**
     * @return Insights configuration, for now relevant only for Postgres.
     * 
     */
    public InsightsConfigResponse insightsConfig() {
        return this.insightsConfig;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    @Import(name="ipConfiguration", required=true)
    private IpConfigurationResponse ipConfiguration;

    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    public IpConfigurationResponse ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * This is always `sql#settings`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return This is always `sql#settings`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    @Import(name="locationPreference", required=true)
    private LocationPreferenceResponse locationPreference;

    /**
     * @return The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    public LocationPreferenceResponse locationPreference() {
        return this.locationPreference;
    }

    /**
     * The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    @Import(name="maintenanceWindow", required=true)
    private MaintenanceWindowResponse maintenanceWindow;

    /**
     * @return The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    public MaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * The local user password validation policy of the instance.
     * 
     */
    @Import(name="passwordValidationPolicy", required=true)
    private PasswordValidationPolicyResponse passwordValidationPolicy;

    /**
     * @return The local user password validation policy of the instance.
     * 
     */
    public PasswordValidationPolicyResponse passwordValidationPolicy() {
        return this.passwordValidationPolicy;
    }

    /**
     * The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    @Import(name="pricingPlan", required=true)
    private String pricingPlan;

    /**
     * @return The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    public String pricingPlan() {
        return this.pricingPlan;
    }

    /**
     * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    @Import(name="settingsVersion", required=true)
    private String settingsVersion;

    /**
     * @return The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    public String settingsVersion() {
        return this.settingsVersion;
    }

    /**
     * SQL Server specific audit configuration.
     * 
     */
    @Import(name="sqlServerAuditConfig", required=true)
    private SqlServerAuditConfigResponse sqlServerAuditConfig;

    /**
     * @return SQL Server specific audit configuration.
     * 
     */
    public SqlServerAuditConfigResponse sqlServerAuditConfig() {
        return this.sqlServerAuditConfig;
    }

    /**
     * Configuration to increase storage size automatically. The default value is true.
     * 
     */
    @Import(name="storageAutoResize", required=true)
    private Boolean storageAutoResize;

    /**
     * @return Configuration to increase storage size automatically. The default value is true.
     * 
     */
    public Boolean storageAutoResize() {
        return this.storageAutoResize;
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @Import(name="storageAutoResizeLimit", required=true)
    private String storageAutoResizeLimit;

    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    public String storageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }

    /**
     * The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    @Import(name="tier", required=true)
    private String tier;

    /**
     * @return The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    public String tier() {
        return this.tier;
    }

    /**
     * User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    @Import(name="userLabels", required=true)
    private Map<String,String> userLabels;

    /**
     * @return User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    public Map<String,String> userLabels() {
        return this.userLabels;
    }

    private SettingsResponse() {}

    private SettingsResponse(SettingsResponse $) {
        this.activationPolicy = $.activationPolicy;
        this.activeDirectoryConfig = $.activeDirectoryConfig;
        this.availabilityType = $.availabilityType;
        this.backupConfiguration = $.backupConfiguration;
        this.collation = $.collation;
        this.crashSafeReplicationEnabled = $.crashSafeReplicationEnabled;
        this.dataDiskSizeGb = $.dataDiskSizeGb;
        this.dataDiskType = $.dataDiskType;
        this.databaseFlags = $.databaseFlags;
        this.databaseReplicationEnabled = $.databaseReplicationEnabled;
        this.denyMaintenancePeriods = $.denyMaintenancePeriods;
        this.insightsConfig = $.insightsConfig;
        this.ipConfiguration = $.ipConfiguration;
        this.kind = $.kind;
        this.locationPreference = $.locationPreference;
        this.maintenanceWindow = $.maintenanceWindow;
        this.passwordValidationPolicy = $.passwordValidationPolicy;
        this.pricingPlan = $.pricingPlan;
        this.settingsVersion = $.settingsVersion;
        this.sqlServerAuditConfig = $.sqlServerAuditConfig;
        this.storageAutoResize = $.storageAutoResize;
        this.storageAutoResizeLimit = $.storageAutoResizeLimit;
        this.tier = $.tier;
        this.userLabels = $.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsResponse $;

        public Builder() {
            $ = new SettingsResponse();
        }

        public Builder(SettingsResponse defaults) {
            $ = new SettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationPolicy The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
         * 
         * @return builder
         * 
         */
        public Builder activationPolicy(String activationPolicy) {
            $.activationPolicy = activationPolicy;
            return this;
        }

        /**
         * @param activeDirectoryConfig Active Directory configuration, relevant only for Cloud SQL for SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryConfig(SqlActiveDirectoryConfigResponse activeDirectoryConfig) {
            $.activeDirectoryConfig = activeDirectoryConfig;
            return this;
        }

        /**
         * @param availabilityType Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
         * 
         * @return builder
         * 
         */
        public Builder availabilityType(String availabilityType) {
            $.availabilityType = availabilityType;
            return this;
        }

        /**
         * @param backupConfiguration The daily backup configuration for the instance.
         * 
         * @return builder
         * 
         */
        public Builder backupConfiguration(BackupConfigurationResponse backupConfiguration) {
            $.backupConfiguration = backupConfiguration;
            return this;
        }

        /**
         * @param collation The name of server Instance collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param crashSafeReplicationEnabled Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
         * 
         * @return builder
         * 
         */
        public Builder crashSafeReplicationEnabled(Boolean crashSafeReplicationEnabled) {
            $.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
            return this;
        }

        /**
         * @param dataDiskSizeGb The size of data disk, in GB. The data disk size minimum is 10GB.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            $.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        /**
         * @param dataDiskType The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskType(String dataDiskType) {
            $.dataDiskType = dataDiskType;
            return this;
        }

        /**
         * @param databaseFlags The database flags passed to the instance at startup.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(List<DatabaseFlagsResponse> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        /**
         * @param databaseFlags The database flags passed to the instance at startup.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(DatabaseFlagsResponse... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }

        /**
         * @param databaseReplicationEnabled Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
         * 
         * @return builder
         * 
         */
        public Builder databaseReplicationEnabled(Boolean databaseReplicationEnabled) {
            $.databaseReplicationEnabled = databaseReplicationEnabled;
            return this;
        }

        /**
         * @param denyMaintenancePeriods Deny maintenance periods
         * 
         * @return builder
         * 
         */
        public Builder denyMaintenancePeriods(List<DenyMaintenancePeriodResponse> denyMaintenancePeriods) {
            $.denyMaintenancePeriods = denyMaintenancePeriods;
            return this;
        }

        /**
         * @param denyMaintenancePeriods Deny maintenance periods
         * 
         * @return builder
         * 
         */
        public Builder denyMaintenancePeriods(DenyMaintenancePeriodResponse... denyMaintenancePeriods) {
            return denyMaintenancePeriods(List.of(denyMaintenancePeriods));
        }

        /**
         * @param insightsConfig Insights configuration, for now relevant only for Postgres.
         * 
         * @return builder
         * 
         */
        public Builder insightsConfig(InsightsConfigResponse insightsConfig) {
            $.insightsConfig = insightsConfig;
            return this;
        }

        /**
         * @param ipConfiguration The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(IpConfigurationResponse ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param kind This is always `sql#settings`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param locationPreference The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
         * 
         * @return builder
         * 
         */
        public Builder locationPreference(LocationPreferenceResponse locationPreference) {
            $.locationPreference = locationPreference;
            return this;
        }

        /**
         * @param maintenanceWindow The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param passwordValidationPolicy The local user password validation policy of the instance.
         * 
         * @return builder
         * 
         */
        public Builder passwordValidationPolicy(PasswordValidationPolicyResponse passwordValidationPolicy) {
            $.passwordValidationPolicy = passwordValidationPolicy;
            return this;
        }

        /**
         * @param pricingPlan The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
         * 
         * @return builder
         * 
         */
        public Builder pricingPlan(String pricingPlan) {
            $.pricingPlan = pricingPlan;
            return this;
        }

        /**
         * @param settingsVersion The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
         * 
         * @return builder
         * 
         */
        public Builder settingsVersion(String settingsVersion) {
            $.settingsVersion = settingsVersion;
            return this;
        }

        /**
         * @param sqlServerAuditConfig SQL Server specific audit configuration.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerAuditConfig(SqlServerAuditConfigResponse sqlServerAuditConfig) {
            $.sqlServerAuditConfig = sqlServerAuditConfig;
            return this;
        }

        /**
         * @param storageAutoResize Configuration to increase storage size automatically. The default value is true.
         * 
         * @return builder
         * 
         */
        public Builder storageAutoResize(Boolean storageAutoResize) {
            $.storageAutoResize = storageAutoResize;
            return this;
        }

        /**
         * @param storageAutoResizeLimit The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
         * 
         * @return builder
         * 
         */
        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            $.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        /**
         * @param tier The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param userLabels User-provided labels, represented as a dictionary where each label is a single key value pair.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        public SettingsResponse build() {
            $.activationPolicy = Objects.requireNonNull($.activationPolicy, "expected parameter 'activationPolicy' to be non-null");
            $.activeDirectoryConfig = Objects.requireNonNull($.activeDirectoryConfig, "expected parameter 'activeDirectoryConfig' to be non-null");
            $.availabilityType = Objects.requireNonNull($.availabilityType, "expected parameter 'availabilityType' to be non-null");
            $.backupConfiguration = Objects.requireNonNull($.backupConfiguration, "expected parameter 'backupConfiguration' to be non-null");
            $.collation = Objects.requireNonNull($.collation, "expected parameter 'collation' to be non-null");
            $.crashSafeReplicationEnabled = Objects.requireNonNull($.crashSafeReplicationEnabled, "expected parameter 'crashSafeReplicationEnabled' to be non-null");
            $.dataDiskSizeGb = Objects.requireNonNull($.dataDiskSizeGb, "expected parameter 'dataDiskSizeGb' to be non-null");
            $.dataDiskType = Objects.requireNonNull($.dataDiskType, "expected parameter 'dataDiskType' to be non-null");
            $.databaseFlags = Objects.requireNonNull($.databaseFlags, "expected parameter 'databaseFlags' to be non-null");
            $.databaseReplicationEnabled = Objects.requireNonNull($.databaseReplicationEnabled, "expected parameter 'databaseReplicationEnabled' to be non-null");
            $.denyMaintenancePeriods = Objects.requireNonNull($.denyMaintenancePeriods, "expected parameter 'denyMaintenancePeriods' to be non-null");
            $.insightsConfig = Objects.requireNonNull($.insightsConfig, "expected parameter 'insightsConfig' to be non-null");
            $.ipConfiguration = Objects.requireNonNull($.ipConfiguration, "expected parameter 'ipConfiguration' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.locationPreference = Objects.requireNonNull($.locationPreference, "expected parameter 'locationPreference' to be non-null");
            $.maintenanceWindow = Objects.requireNonNull($.maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
            $.passwordValidationPolicy = Objects.requireNonNull($.passwordValidationPolicy, "expected parameter 'passwordValidationPolicy' to be non-null");
            $.pricingPlan = Objects.requireNonNull($.pricingPlan, "expected parameter 'pricingPlan' to be non-null");
            $.settingsVersion = Objects.requireNonNull($.settingsVersion, "expected parameter 'settingsVersion' to be non-null");
            $.sqlServerAuditConfig = Objects.requireNonNull($.sqlServerAuditConfig, "expected parameter 'sqlServerAuditConfig' to be non-null");
            $.storageAutoResize = Objects.requireNonNull($.storageAutoResize, "expected parameter 'storageAutoResize' to be non-null");
            $.storageAutoResizeLimit = Objects.requireNonNull($.storageAutoResizeLimit, "expected parameter 'storageAutoResizeLimit' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            $.userLabels = Objects.requireNonNull($.userLabels, "expected parameter 'userLabels' to be non-null");
            return $;
        }
    }

}
