// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrderableDbInstanceResult {
    /**
     * @return Availability zones where the instance is available.
     * 
     */
    private final List<String> availabilityZones;
    private final @Nullable String engine;
    private final String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceClass;
    private final @Nullable String licenseModel;
    /**
     * @return Maximum total provisioned IOPS for a DB instance.
     * 
     */
    private final Integer maxIopsPerDbInstance;
    /**
     * @return Maximum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private final Double maxIopsPerGib;
    /**
     * @return Maximum storage size for a DB instance.
     * 
     */
    private final Integer maxStorageSize;
    /**
     * @return Minimum total provisioned IOPS for a DB instance.
     * 
     */
    private final Integer minIopsPerDbInstance;
    /**
     * @return Minimum provisioned IOPS per GiB for a DB instance.
     * 
     */
    private final Double minIopsPerGib;
    /**
     * @return Minimum storage size for a DB instance.
     * 
     */
    private final Integer minStorageSize;
    /**
     * @return Whether a DB instance is Multi-AZ capable.
     * 
     */
    private final Boolean multiAzCapable;
    private final @Nullable List<String> preferredInstanceClasses;
    /**
     * @return Whether a DB instance can have a read replica.
     * 
     */
    private final Boolean readReplicaCapable;
    /**
     * @return The storage type for a DB instance.
     * 
     */
    private final String storageType;
    /**
     * @return Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * 
     */
    private final Boolean supportsEnhancedMonitoring;
    /**
     * @return Whether a DB instance supports IAM database authentication.
     * 
     */
    private final Boolean supportsIamDatabaseAuthentication;
    /**
     * @return Whether a DB instance supports provisioned IOPS.
     * 
     */
    private final Boolean supportsIops;
    /**
     * @return Whether a DB instance supports Performance Insights.
     * 
     */
    private final Boolean supportsPerformanceInsights;
    /**
     * @return Whether a DB instance supports encrypted storage.
     * 
     */
    private final Boolean supportsStorageEncryption;
    private final Boolean vpc;

    @CustomType.Constructor
    private GetOrderableDbInstanceResult(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("engine") @Nullable String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceClass") String instanceClass,
        @CustomType.Parameter("licenseModel") @Nullable String licenseModel,
        @CustomType.Parameter("maxIopsPerDbInstance") Integer maxIopsPerDbInstance,
        @CustomType.Parameter("maxIopsPerGib") Double maxIopsPerGib,
        @CustomType.Parameter("maxStorageSize") Integer maxStorageSize,
        @CustomType.Parameter("minIopsPerDbInstance") Integer minIopsPerDbInstance,
        @CustomType.Parameter("minIopsPerGib") Double minIopsPerGib,
        @CustomType.Parameter("minStorageSize") Integer minStorageSize,
        @CustomType.Parameter("multiAzCapable") Boolean multiAzCapable,
        @CustomType.Parameter("preferredInstanceClasses") @Nullable List<String> preferredInstanceClasses,
        @CustomType.Parameter("readReplicaCapable") Boolean readReplicaCapable,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("supportsEnhancedMonitoring") Boolean supportsEnhancedMonitoring,
        @CustomType.Parameter("supportsIamDatabaseAuthentication") Boolean supportsIamDatabaseAuthentication,
        @CustomType.Parameter("supportsIops") Boolean supportsIops,
        @CustomType.Parameter("supportsPerformanceInsights") Boolean supportsPerformanceInsights,
        @CustomType.Parameter("supportsStorageEncryption") Boolean supportsStorageEncryption,
        @CustomType.Parameter("vpc") Boolean vpc) {
        this.availabilityZones = availabilityZones;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.id = id;
        this.instanceClass = instanceClass;
        this.licenseModel = licenseModel;
        this.maxIopsPerDbInstance = maxIopsPerDbInstance;
        this.maxIopsPerGib = maxIopsPerGib;
        this.maxStorageSize = maxStorageSize;
        this.minIopsPerDbInstance = minIopsPerDbInstance;
        this.minIopsPerGib = minIopsPerGib;
        this.minStorageSize = minStorageSize;
        this.multiAzCapable = multiAzCapable;
        this.preferredInstanceClasses = preferredInstanceClasses;
        this.readReplicaCapable = readReplicaCapable;
        this.storageType = storageType;
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
        this.supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication;
        this.supportsIops = supportsIops;
        this.supportsPerformanceInsights = supportsPerformanceInsights;
        this.supportsStorageEncryption = supportsStorageEncryption;
        this.vpc = vpc;
    }

    /**
     * @return Availability zones where the instance is available.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceClass() {
        return this.instanceClass;
    }
    public Optional<String> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }
    /**
     * @return Maximum total provisioned IOPS for a DB instance.
     * 
     */
    public Integer maxIopsPerDbInstance() {
        return this.maxIopsPerDbInstance;
    }
    /**
     * @return Maximum provisioned IOPS per GiB for a DB instance.
     * 
     */
    public Double maxIopsPerGib() {
        return this.maxIopsPerGib;
    }
    /**
     * @return Maximum storage size for a DB instance.
     * 
     */
    public Integer maxStorageSize() {
        return this.maxStorageSize;
    }
    /**
     * @return Minimum total provisioned IOPS for a DB instance.
     * 
     */
    public Integer minIopsPerDbInstance() {
        return this.minIopsPerDbInstance;
    }
    /**
     * @return Minimum provisioned IOPS per GiB for a DB instance.
     * 
     */
    public Double minIopsPerGib() {
        return this.minIopsPerGib;
    }
    /**
     * @return Minimum storage size for a DB instance.
     * 
     */
    public Integer minStorageSize() {
        return this.minStorageSize;
    }
    /**
     * @return Whether a DB instance is Multi-AZ capable.
     * 
     */
    public Boolean multiAzCapable() {
        return this.multiAzCapable;
    }
    public List<String> preferredInstanceClasses() {
        return this.preferredInstanceClasses == null ? List.of() : this.preferredInstanceClasses;
    }
    /**
     * @return Whether a DB instance can have a read replica.
     * 
     */
    public Boolean readReplicaCapable() {
        return this.readReplicaCapable;
    }
    /**
     * @return The storage type for a DB instance.
     * 
     */
    public String storageType() {
        return this.storageType;
    }
    /**
     * @return Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
     * 
     */
    public Boolean supportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }
    /**
     * @return Whether a DB instance supports IAM database authentication.
     * 
     */
    public Boolean supportsIamDatabaseAuthentication() {
        return this.supportsIamDatabaseAuthentication;
    }
    /**
     * @return Whether a DB instance supports provisioned IOPS.
     * 
     */
    public Boolean supportsIops() {
        return this.supportsIops;
    }
    /**
     * @return Whether a DB instance supports Performance Insights.
     * 
     */
    public Boolean supportsPerformanceInsights() {
        return this.supportsPerformanceInsights;
    }
    /**
     * @return Whether a DB instance supports encrypted storage.
     * 
     */
    public Boolean supportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }
    public Boolean vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableDbInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private @Nullable String engine;
        private String engineVersion;
        private String id;
        private String instanceClass;
        private @Nullable String licenseModel;
        private Integer maxIopsPerDbInstance;
        private Double maxIopsPerGib;
        private Integer maxStorageSize;
        private Integer minIopsPerDbInstance;
        private Double minIopsPerGib;
        private Integer minStorageSize;
        private Boolean multiAzCapable;
        private @Nullable List<String> preferredInstanceClasses;
        private Boolean readReplicaCapable;
        private String storageType;
        private Boolean supportsEnhancedMonitoring;
        private Boolean supportsIamDatabaseAuthentication;
        private Boolean supportsIops;
        private Boolean supportsPerformanceInsights;
        private Boolean supportsStorageEncryption;
        private Boolean vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableDbInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.licenseModel = defaults.licenseModel;
    	      this.maxIopsPerDbInstance = defaults.maxIopsPerDbInstance;
    	      this.maxIopsPerGib = defaults.maxIopsPerGib;
    	      this.maxStorageSize = defaults.maxStorageSize;
    	      this.minIopsPerDbInstance = defaults.minIopsPerDbInstance;
    	      this.minIopsPerGib = defaults.minIopsPerGib;
    	      this.minStorageSize = defaults.minStorageSize;
    	      this.multiAzCapable = defaults.multiAzCapable;
    	      this.preferredInstanceClasses = defaults.preferredInstanceClasses;
    	      this.readReplicaCapable = defaults.readReplicaCapable;
    	      this.storageType = defaults.storageType;
    	      this.supportsEnhancedMonitoring = defaults.supportsEnhancedMonitoring;
    	      this.supportsIamDatabaseAuthentication = defaults.supportsIamDatabaseAuthentication;
    	      this.supportsIops = defaults.supportsIops;
    	      this.supportsPerformanceInsights = defaults.supportsPerformanceInsights;
    	      this.supportsStorageEncryption = defaults.supportsStorageEncryption;
    	      this.vpc = defaults.vpc;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder engine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        public Builder licenseModel(@Nullable String licenseModel) {
            this.licenseModel = licenseModel;
            return this;
        }
        public Builder maxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
            this.maxIopsPerDbInstance = Objects.requireNonNull(maxIopsPerDbInstance);
            return this;
        }
        public Builder maxIopsPerGib(Double maxIopsPerGib) {
            this.maxIopsPerGib = Objects.requireNonNull(maxIopsPerGib);
            return this;
        }
        public Builder maxStorageSize(Integer maxStorageSize) {
            this.maxStorageSize = Objects.requireNonNull(maxStorageSize);
            return this;
        }
        public Builder minIopsPerDbInstance(Integer minIopsPerDbInstance) {
            this.minIopsPerDbInstance = Objects.requireNonNull(minIopsPerDbInstance);
            return this;
        }
        public Builder minIopsPerGib(Double minIopsPerGib) {
            this.minIopsPerGib = Objects.requireNonNull(minIopsPerGib);
            return this;
        }
        public Builder minStorageSize(Integer minStorageSize) {
            this.minStorageSize = Objects.requireNonNull(minStorageSize);
            return this;
        }
        public Builder multiAzCapable(Boolean multiAzCapable) {
            this.multiAzCapable = Objects.requireNonNull(multiAzCapable);
            return this;
        }
        public Builder preferredInstanceClasses(@Nullable List<String> preferredInstanceClasses) {
            this.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }
        public Builder preferredInstanceClasses(String... preferredInstanceClasses) {
            return preferredInstanceClasses(List.of(preferredInstanceClasses));
        }
        public Builder readReplicaCapable(Boolean readReplicaCapable) {
            this.readReplicaCapable = Objects.requireNonNull(readReplicaCapable);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder supportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
            this.supportsEnhancedMonitoring = Objects.requireNonNull(supportsEnhancedMonitoring);
            return this;
        }
        public Builder supportsIamDatabaseAuthentication(Boolean supportsIamDatabaseAuthentication) {
            this.supportsIamDatabaseAuthentication = Objects.requireNonNull(supportsIamDatabaseAuthentication);
            return this;
        }
        public Builder supportsIops(Boolean supportsIops) {
            this.supportsIops = Objects.requireNonNull(supportsIops);
            return this;
        }
        public Builder supportsPerformanceInsights(Boolean supportsPerformanceInsights) {
            this.supportsPerformanceInsights = Objects.requireNonNull(supportsPerformanceInsights);
            return this;
        }
        public Builder supportsStorageEncryption(Boolean supportsStorageEncryption) {
            this.supportsStorageEncryption = Objects.requireNonNull(supportsStorageEncryption);
            return this;
        }
        public Builder vpc(Boolean vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }        public GetOrderableDbInstanceResult build() {
            return new GetOrderableDbInstanceResult(availabilityZones, engine, engineVersion, id, instanceClass, licenseModel, maxIopsPerDbInstance, maxIopsPerGib, maxStorageSize, minIopsPerDbInstance, minIopsPerGib, minStorageSize, multiAzCapable, preferredInstanceClasses, readReplicaCapable, storageType, supportsEnhancedMonitoring, supportsIamDatabaseAuthentication, supportsIops, supportsPerformanceInsights, supportsStorageEncryption, vpc);
        }
    }
}
