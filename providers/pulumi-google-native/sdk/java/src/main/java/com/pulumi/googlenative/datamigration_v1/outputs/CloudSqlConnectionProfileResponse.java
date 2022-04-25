// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datamigration_v1.outputs.CloudSqlSettingsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudSqlConnectionProfileResponse {
    /**
     * @return The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    private final String cloudSqlId;
    /**
     * @return The Cloud SQL database instance&#39;s private IP.
     * 
     */
    private final String privateIp;
    /**
     * @return The Cloud SQL database instance&#39;s public IP.
     * 
     */
    private final String publicIp;
    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    private final CloudSqlSettingsResponse settings;

    @CustomType.Constructor
    private CloudSqlConnectionProfileResponse(
        @CustomType.Parameter("cloudSqlId") String cloudSqlId,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("publicIp") String publicIp,
        @CustomType.Parameter("settings") CloudSqlSettingsResponse settings) {
        this.cloudSqlId = cloudSqlId;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.settings = settings;
    }

    /**
     * @return The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    public String cloudSqlId() {
        return this.cloudSqlId;
    }
    /**
     * @return The Cloud SQL database instance&#39;s private IP.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The Cloud SQL database instance&#39;s public IP.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    public CloudSqlSettingsResponse settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlId;
        private String privateIp;
        private String publicIp;
        private CloudSqlSettingsResponse settings;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.settings = defaults.settings;
        }

        public Builder cloudSqlId(String cloudSqlId) {
            this.cloudSqlId = Objects.requireNonNull(cloudSqlId);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        public Builder settings(CloudSqlSettingsResponse settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }        public CloudSqlConnectionProfileResponse build() {
            return new CloudSqlConnectionProfileResponse(cloudSqlId, privateIp, publicIp, settings);
        }
    }
}
