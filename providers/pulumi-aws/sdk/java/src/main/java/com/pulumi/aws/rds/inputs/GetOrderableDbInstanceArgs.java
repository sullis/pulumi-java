// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderableDbInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrderableDbInstanceArgs Empty = new GetOrderableDbInstanceArgs();

    /**
     * Availability zone group.
     * 
     */
    @Import(name="availabilityZoneGroup")
    private @Nullable String availabilityZoneGroup;

    /**
     * @return Availability zone group.
     * 
     */
    public Optional<String> availabilityZoneGroup() {
        return Optional.ofNullable(this.availabilityZoneGroup);
    }

    /**
     * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
     * 
     */
    @Import(name="engine", required=true)
    private String engine;

    /**
     * @return DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
     * 
     */
    public String engine() {
        return this.engine;
    }

    /**
     * Version of the DB engine. If none is provided, the AWS-defined default version will be used.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable String engineVersion;

    /**
     * @return Version of the DB engine. If none is provided, the AWS-defined default version will be used.
     * 
     */
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * DB instance class. Examples of classes are `db.m3.2xlarge`, `db.t2.small`, and `db.m3.medium`.
     * 
     */
    @Import(name="instanceClass")
    private @Nullable String instanceClass;

    /**
     * @return DB instance class. Examples of classes are `db.m3.2xlarge`, `db.t2.small`, and `db.m3.medium`.
     * 
     */
    public Optional<String> instanceClass() {
        return Optional.ofNullable(this.instanceClass);
    }

    /**
     * License model. Examples of license models are `general-public-license`, `bring-your-own-license`, and `amazon-license`.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable String licenseModel;

    /**
     * @return License model. Examples of license models are `general-public-license`, `bring-your-own-license`, and `amazon-license`.
     * 
     */
    public Optional<String> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    /**
     * Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    @Import(name="preferredEngineVersions")
    private @Nullable List<String> preferredEngineVersions;

    /**
     * @return Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    public Optional<List<String>> preferredEngineVersions() {
        return Optional.ofNullable(this.preferredEngineVersions);
    }

    /**
     * Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    @Import(name="preferredInstanceClasses")
    private @Nullable List<String> preferredInstanceClasses;

    /**
     * @return Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    public Optional<List<String>> preferredInstanceClasses() {
        return Optional.ofNullable(this.preferredInstanceClasses);
    }

    /**
     * Storage types. Examples of storage types are `standard`, `io1`, `gp2`, and `aurora`.
     * 
     */
    @Import(name="storageType")
    private @Nullable String storageType;

    /**
     * @return Storage types. Examples of storage types are `standard`, `io1`, `gp2`, and `aurora`.
     * 
     */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * Enable this to ensure a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * 
     */
    @Import(name="supportsEnhancedMonitoring")
    private @Nullable Boolean supportsEnhancedMonitoring;

    /**
     * @return Enable this to ensure a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * 
     */
    public Optional<Boolean> supportsEnhancedMonitoring() {
        return Optional.ofNullable(this.supportsEnhancedMonitoring);
    }

    /**
     * Enable this to ensure a DB instance supports Aurora global databases with a specific combination of other DB engine attributes.
     * 
     */
    @Import(name="supportsGlobalDatabases")
    private @Nullable Boolean supportsGlobalDatabases;

    /**
     * @return Enable this to ensure a DB instance supports Aurora global databases with a specific combination of other DB engine attributes.
     * 
     */
    public Optional<Boolean> supportsGlobalDatabases() {
        return Optional.ofNullable(this.supportsGlobalDatabases);
    }

    /**
     * Enable this to ensure a DB instance supports IAM database authentication.
     * 
     */
    @Import(name="supportsIamDatabaseAuthentication")
    private @Nullable Boolean supportsIamDatabaseAuthentication;

    /**
     * @return Enable this to ensure a DB instance supports IAM database authentication.
     * 
     */
    public Optional<Boolean> supportsIamDatabaseAuthentication() {
        return Optional.ofNullable(this.supportsIamDatabaseAuthentication);
    }

    /**
     * Enable this to ensure a DB instance supports provisioned IOPS.
     * 
     */
    @Import(name="supportsIops")
    private @Nullable Boolean supportsIops;

    /**
     * @return Enable this to ensure a DB instance supports provisioned IOPS.
     * 
     */
    public Optional<Boolean> supportsIops() {
        return Optional.ofNullable(this.supportsIops);
    }

    /**
     * Enable this to ensure a DB instance supports Kerberos Authentication.
     * 
     */
    @Import(name="supportsKerberosAuthentication")
    private @Nullable Boolean supportsKerberosAuthentication;

    /**
     * @return Enable this to ensure a DB instance supports Kerberos Authentication.
     * 
     */
    public Optional<Boolean> supportsKerberosAuthentication() {
        return Optional.ofNullable(this.supportsKerberosAuthentication);
    }

    /**
     * Enable this to ensure a DB instance supports Performance Insights.
     * 
     */
    @Import(name="supportsPerformanceInsights")
    private @Nullable Boolean supportsPerformanceInsights;

    /**
     * @return Enable this to ensure a DB instance supports Performance Insights.
     * 
     */
    public Optional<Boolean> supportsPerformanceInsights() {
        return Optional.ofNullable(this.supportsPerformanceInsights);
    }

    /**
     * Enable this to ensure Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * 
     */
    @Import(name="supportsStorageAutoscaling")
    private @Nullable Boolean supportsStorageAutoscaling;

    /**
     * @return Enable this to ensure Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
     * 
     */
    public Optional<Boolean> supportsStorageAutoscaling() {
        return Optional.ofNullable(this.supportsStorageAutoscaling);
    }

    /**
     * Enable this to ensure a DB instance supports encrypted storage.
     * 
     */
    @Import(name="supportsStorageEncryption")
    private @Nullable Boolean supportsStorageEncryption;

    /**
     * @return Enable this to ensure a DB instance supports encrypted storage.
     * 
     */
    public Optional<Boolean> supportsStorageEncryption() {
        return Optional.ofNullable(this.supportsStorageEncryption);
    }

    /**
     * Boolean that indicates whether to show only VPC or non-VPC offerings.
     * 
     */
    @Import(name="vpc")
    private @Nullable Boolean vpc;

    /**
     * @return Boolean that indicates whether to show only VPC or non-VPC offerings.
     * 
     */
    public Optional<Boolean> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    private GetOrderableDbInstanceArgs() {}

    private GetOrderableDbInstanceArgs(GetOrderableDbInstanceArgs $) {
        this.availabilityZoneGroup = $.availabilityZoneGroup;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceClass = $.instanceClass;
        this.licenseModel = $.licenseModel;
        this.preferredEngineVersions = $.preferredEngineVersions;
        this.preferredInstanceClasses = $.preferredInstanceClasses;
        this.storageType = $.storageType;
        this.supportsEnhancedMonitoring = $.supportsEnhancedMonitoring;
        this.supportsGlobalDatabases = $.supportsGlobalDatabases;
        this.supportsIamDatabaseAuthentication = $.supportsIamDatabaseAuthentication;
        this.supportsIops = $.supportsIops;
        this.supportsKerberosAuthentication = $.supportsKerberosAuthentication;
        this.supportsPerformanceInsights = $.supportsPerformanceInsights;
        this.supportsStorageAutoscaling = $.supportsStorageAutoscaling;
        this.supportsStorageEncryption = $.supportsStorageEncryption;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrderableDbInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrderableDbInstanceArgs $;

        public Builder() {
            $ = new GetOrderableDbInstanceArgs();
        }

        public Builder(GetOrderableDbInstanceArgs defaults) {
            $ = new GetOrderableDbInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZoneGroup Availability zone group.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneGroup(@Nullable String availabilityZoneGroup) {
            $.availabilityZoneGroup = availabilityZoneGroup;
            return this;
        }

        /**
         * @param engine DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engineVersion Version of the DB engine. If none is provided, the AWS-defined default version will be used.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable String engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param instanceClass DB instance class. Examples of classes are `db.m3.2xlarge`, `db.t2.small`, and `db.m3.medium`.
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(@Nullable String instanceClass) {
            $.instanceClass = instanceClass;
            return this;
        }

        /**
         * @param licenseModel License model. Examples of license models are `general-public-license`, `bring-your-own-license`, and `amazon-license`.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable String licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param preferredEngineVersions Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredEngineVersions(@Nullable List<String> preferredEngineVersions) {
            $.preferredEngineVersions = preferredEngineVersions;
            return this;
        }

        /**
         * @param preferredEngineVersions Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredEngineVersions(String... preferredEngineVersions) {
            return preferredEngineVersions(List.of(preferredEngineVersions));
        }

        /**
         * @param preferredInstanceClasses Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceClasses(@Nullable List<String> preferredInstanceClasses) {
            $.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }

        /**
         * @param preferredInstanceClasses Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceClasses(String... preferredInstanceClasses) {
            return preferredInstanceClasses(List.of(preferredInstanceClasses));
        }

        /**
         * @param storageType Storage types. Examples of storage types are `standard`, `io1`, `gp2`, and `aurora`.
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable String storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param supportsEnhancedMonitoring Enable this to ensure a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder supportsEnhancedMonitoring(@Nullable Boolean supportsEnhancedMonitoring) {
            $.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
            return this;
        }

        /**
         * @param supportsGlobalDatabases Enable this to ensure a DB instance supports Aurora global databases with a specific combination of other DB engine attributes.
         * 
         * @return builder
         * 
         */
        public Builder supportsGlobalDatabases(@Nullable Boolean supportsGlobalDatabases) {
            $.supportsGlobalDatabases = supportsGlobalDatabases;
            return this;
        }

        /**
         * @param supportsIamDatabaseAuthentication Enable this to ensure a DB instance supports IAM database authentication.
         * 
         * @return builder
         * 
         */
        public Builder supportsIamDatabaseAuthentication(@Nullable Boolean supportsIamDatabaseAuthentication) {
            $.supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication;
            return this;
        }

        /**
         * @param supportsIops Enable this to ensure a DB instance supports provisioned IOPS.
         * 
         * @return builder
         * 
         */
        public Builder supportsIops(@Nullable Boolean supportsIops) {
            $.supportsIops = supportsIops;
            return this;
        }

        /**
         * @param supportsKerberosAuthentication Enable this to ensure a DB instance supports Kerberos Authentication.
         * 
         * @return builder
         * 
         */
        public Builder supportsKerberosAuthentication(@Nullable Boolean supportsKerberosAuthentication) {
            $.supportsKerberosAuthentication = supportsKerberosAuthentication;
            return this;
        }

        /**
         * @param supportsPerformanceInsights Enable this to ensure a DB instance supports Performance Insights.
         * 
         * @return builder
         * 
         */
        public Builder supportsPerformanceInsights(@Nullable Boolean supportsPerformanceInsights) {
            $.supportsPerformanceInsights = supportsPerformanceInsights;
            return this;
        }

        /**
         * @param supportsStorageAutoscaling Enable this to ensure Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
         * 
         * @return builder
         * 
         */
        public Builder supportsStorageAutoscaling(@Nullable Boolean supportsStorageAutoscaling) {
            $.supportsStorageAutoscaling = supportsStorageAutoscaling;
            return this;
        }

        /**
         * @param supportsStorageEncryption Enable this to ensure a DB instance supports encrypted storage.
         * 
         * @return builder
         * 
         */
        public Builder supportsStorageEncryption(@Nullable Boolean supportsStorageEncryption) {
            $.supportsStorageEncryption = supportsStorageEncryption;
            return this;
        }

        /**
         * @param vpc Boolean that indicates whether to show only VPC or non-VPC offerings.
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Boolean vpc) {
            $.vpc = vpc;
            return this;
        }

        public GetOrderableDbInstanceArgs build() {
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            return $;
        }
    }

}
