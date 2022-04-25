// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.SqlIpConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class CloudSqlSettingsResponse {
    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    private final String activationPolicy;
    /**
     * @return [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    private final Boolean autoStorageIncrease;
    /**
     * @return The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    private final String dataDiskSizeGb;
    /**
     * @return The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    private final String dataDiskType;
    /**
     * @return The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    private final Map<String,String> databaseFlags;
    /**
     * @return The database engine type and version.
     * 
     */
    private final String databaseVersion;
    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    private final SqlIpConfigResponse ipConfig;
    /**
     * @return Input only. Initial root password.
     * 
     */
    private final String rootPassword;
    /**
     * @return Indicates If this connection profile root password is stored.
     * 
     */
    private final Boolean rootPasswordSet;
    /**
     * @return The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    private final String sourceId;
    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    private final String storageAutoResizeLimit;
    /**
     * @return The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    private final String tier;
    /**
     * @return The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    private final Map<String,String> userLabels;
    /**
     * @return The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private CloudSqlSettingsResponse(
        @CustomType.Parameter("activationPolicy") String activationPolicy,
        @CustomType.Parameter("autoStorageIncrease") Boolean autoStorageIncrease,
        @CustomType.Parameter("dataDiskSizeGb") String dataDiskSizeGb,
        @CustomType.Parameter("dataDiskType") String dataDiskType,
        @CustomType.Parameter("databaseFlags") Map<String,String> databaseFlags,
        @CustomType.Parameter("databaseVersion") String databaseVersion,
        @CustomType.Parameter("ipConfig") SqlIpConfigResponse ipConfig,
        @CustomType.Parameter("rootPassword") String rootPassword,
        @CustomType.Parameter("rootPasswordSet") Boolean rootPasswordSet,
        @CustomType.Parameter("sourceId") String sourceId,
        @CustomType.Parameter("storageAutoResizeLimit") String storageAutoResizeLimit,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("userLabels") Map<String,String> userLabels,
        @CustomType.Parameter("zone") String zone) {
        this.activationPolicy = activationPolicy;
        this.autoStorageIncrease = autoStorageIncrease;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.databaseFlags = databaseFlags;
        this.databaseVersion = databaseVersion;
        this.ipConfig = ipConfig;
        this.rootPassword = rootPassword;
        this.rootPasswordSet = rootPasswordSet;
        this.sourceId = sourceId;
        this.storageAutoResizeLimit = storageAutoResizeLimit;
        this.tier = tier;
        this.userLabels = userLabels;
        this.zone = zone;
    }

    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    public String activationPolicy() {
        return this.activationPolicy;
    }
    /**
     * @return [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    public Boolean autoStorageIncrease() {
        return this.autoStorageIncrease;
    }
    /**
     * @return The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    public String dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * @return The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    public String dataDiskType() {
        return this.dataDiskType;
    }
    /**
     * @return The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Map<String,String> databaseFlags() {
        return this.databaseFlags;
    }
    /**
     * @return The database engine type and version.
     * 
     */
    public String databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    public SqlIpConfigResponse ipConfig() {
        return this.ipConfig;
    }
    /**
     * @return Input only. Initial root password.
     * 
     */
    public String rootPassword() {
        return this.rootPassword;
    }
    /**
     * @return Indicates If this connection profile root password is stored.
     * 
     */
    public Boolean rootPasswordSet() {
        return this.rootPasswordSet;
    }
    /**
     * @return The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    public String sourceId() {
        return this.sourceId;
    }
    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    public String storageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }
    /**
     * @return The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    public String tier() {
        return this.tier;
    }
    /**
     * @return The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Map<String,String> userLabels() {
        return this.userLabels;
    }
    /**
     * @return The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    public String zone() {
        return this.zone;
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

        public Builder activationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }
        public Builder autoStorageIncrease(Boolean autoStorageIncrease) {
            this.autoStorageIncrease = Objects.requireNonNull(autoStorageIncrease);
            return this;
        }
        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }
        public Builder dataDiskType(String dataDiskType) {
            this.dataDiskType = Objects.requireNonNull(dataDiskType);
            return this;
        }
        public Builder databaseFlags(Map<String,String> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }
        public Builder ipConfig(SqlIpConfigResponse ipConfig) {
            this.ipConfig = Objects.requireNonNull(ipConfig);
            return this;
        }
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }
        public Builder rootPasswordSet(Boolean rootPasswordSet) {
            this.rootPasswordSet = Objects.requireNonNull(rootPasswordSet);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public CloudSqlSettingsResponse build() {
            return new CloudSqlSettingsResponse(activationPolicy, autoStorageIncrease, dataDiskSizeGb, dataDiskType, databaseFlags, databaseVersion, ipConfig, rootPassword, rootPasswordSet, sourceId, storageAutoResizeLimit, tier, userLabels, zone);
        }
    }
}
