// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.SqlIpConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Settings for creating a Cloud SQL database instance.
 * 
 */
public final class CloudSqlSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudSqlSettingsResponse Empty = new CloudSqlSettingsResponse();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @InputImport(name="activationPolicy", required=true)
      private final String activationPolicy;

    public String getActivationPolicy() {
        return this.activationPolicy;
    }

    /**
     * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    @InputImport(name="autoStorageIncrease", required=true)
      private final Boolean autoStorageIncrease;

    public Boolean getAutoStorageIncrease() {
        return this.autoStorageIncrease;
    }

    /**
     * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    @InputImport(name="dataDiskSizeGb", required=true)
      private final String dataDiskSizeGb;

    public String getDataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }

    /**
     * The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    @InputImport(name="dataDiskType", required=true)
      private final String dataDiskType;

    public String getDataDiskType() {
        return this.dataDiskType;
    }

    /**
     * The database flags passed to the Cloud SQL instance at startup. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="databaseFlags", required=true)
      private final Map<String,String> databaseFlags;

    public Map<String,String> getDatabaseFlags() {
        return this.databaseFlags;
    }

    /**
     * The database engine type and version.
     * 
     */
    @InputImport(name="databaseVersion", required=true)
      private final String databaseVersion;

    public String getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    @InputImport(name="ipConfig", required=true)
      private final SqlIpConfigResponse ipConfig;

    public SqlIpConfigResponse getIpConfig() {
        return this.ipConfig;
    }

    /**
     * Input only. Initial root password.
     * 
     */
    @InputImport(name="rootPassword", required=true)
      private final String rootPassword;

    public String getRootPassword() {
        return this.rootPassword;
    }

    /**
     * Indicates If this connection profile root password is stored.
     * 
     */
    @InputImport(name="rootPasswordSet", required=true)
      private final Boolean rootPasswordSet;

    public Boolean getRootPasswordSet() {
        return this.rootPasswordSet;
    }

    /**
     * The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    @InputImport(name="sourceId", required=true)
      private final String sourceId;

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @InputImport(name="storageAutoResizeLimit", required=true)
      private final String storageAutoResizeLimit;

    public String getStorageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }

    /**
     * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    @InputImport(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    /**
     * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
     * 
     */
    @InputImport(name="userLabels", required=true)
      private final Map<String,String> userLabels;

    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }

    /**
     * The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public CloudSqlSettingsResponse(
        String activationPolicy,
        Boolean autoStorageIncrease,
        String dataDiskSizeGb,
        String dataDiskType,
        Map<String,String> databaseFlags,
        String databaseVersion,
        SqlIpConfigResponse ipConfig,
        String rootPassword,
        Boolean rootPasswordSet,
        String sourceId,
        String storageAutoResizeLimit,
        String tier,
        Map<String,String> userLabels,
        String zone) {
        this.activationPolicy = Objects.requireNonNull(activationPolicy, "expected parameter 'activationPolicy' to be non-null");
        this.autoStorageIncrease = Objects.requireNonNull(autoStorageIncrease, "expected parameter 'autoStorageIncrease' to be non-null");
        this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb, "expected parameter 'dataDiskSizeGb' to be non-null");
        this.dataDiskType = Objects.requireNonNull(dataDiskType, "expected parameter 'dataDiskType' to be non-null");
        this.databaseFlags = Objects.requireNonNull(databaseFlags, "expected parameter 'databaseFlags' to be non-null");
        this.databaseVersion = Objects.requireNonNull(databaseVersion, "expected parameter 'databaseVersion' to be non-null");
        this.ipConfig = Objects.requireNonNull(ipConfig, "expected parameter 'ipConfig' to be non-null");
        this.rootPassword = Objects.requireNonNull(rootPassword, "expected parameter 'rootPassword' to be non-null");
        this.rootPasswordSet = Objects.requireNonNull(rootPasswordSet, "expected parameter 'rootPasswordSet' to be non-null");
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit, "expected parameter 'storageAutoResizeLimit' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.userLabels = Objects.requireNonNull(userLabels, "expected parameter 'userLabels' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private CloudSqlSettingsResponse() {
        this.activationPolicy = null;
        this.autoStorageIncrease = null;
        this.dataDiskSizeGb = null;
        this.dataDiskType = null;
        this.databaseFlags = Map.of();
        this.databaseVersion = null;
        this.ipConfig = null;
        this.rootPassword = null;
        this.rootPasswordSet = null;
        this.sourceId = null;
        this.storageAutoResizeLimit = null;
        this.tier = null;
        this.userLabels = Map.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationPolicy;
        private Boolean autoStorageIncrease;
        private String dataDiskSizeGb;
        private String dataDiskType;
        private Map<String,String> databaseFlags;
        private String databaseVersion;
        private SqlIpConfigResponse ipConfig;
        private String rootPassword;
        private Boolean rootPasswordSet;
        private String sourceId;
        private String storageAutoResizeLimit;
        private String tier;
        private Map<String,String> userLabels;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.autoStorageIncrease = defaults.autoStorageIncrease;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.ipConfig = defaults.ipConfig;
    	      this.rootPassword = defaults.rootPassword;
    	      this.rootPasswordSet = defaults.rootPasswordSet;
    	      this.sourceId = defaults.sourceId;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.zone = defaults.zone;
        }

        public Builder setActivationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }

        public Builder setAutoStorageIncrease(Boolean autoStorageIncrease) {
            this.autoStorageIncrease = Objects.requireNonNull(autoStorageIncrease);
            return this;
        }

        public Builder setDataDiskSizeGb(String dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }

        public Builder setDataDiskType(String dataDiskType) {
            this.dataDiskType = Objects.requireNonNull(dataDiskType);
            return this;
        }

        public Builder setDatabaseFlags(Map<String,String> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }

        public Builder setDatabaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }

        public Builder setIpConfig(SqlIpConfigResponse ipConfig) {
            this.ipConfig = Objects.requireNonNull(ipConfig);
            return this;
        }

        public Builder setRootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }

        public Builder setRootPasswordSet(Boolean rootPasswordSet) {
            this.rootPasswordSet = Objects.requireNonNull(rootPasswordSet);
            return this;
        }

        public Builder setSourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }

        public Builder setStorageAutoResizeLimit(String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setUserLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public CloudSqlSettingsResponse build() {
            return new CloudSqlSettingsResponse(activationPolicy, autoStorageIncrease, dataDiskSizeGb, dataDiskType, databaseFlags, databaseVersion, ipConfig, rootPassword, rootPasswordSet, sourceId, storageAutoResizeLimit, tier, userLabels, zone);
        }
    }
}