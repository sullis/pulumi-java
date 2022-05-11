// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedServiceAzureDatabricksInstancePool {
    /**
     * @return Spark version of a the cluster.
     * 
     */
    private final String clusterVersion;
    /**
     * @return Identifier of the instance pool within the linked ADB instance.
     * 
     */
    private final String instancePoolId;
    /**
     * @return The max number of worker nodes. Set this value if you want to enable autoscaling between the `min_number_of_workers` and this value. Omit this value to use a fixed number of workers defined in the `min_number_of_workers` property.
     * 
     */
    private final @Nullable Integer maxNumberOfWorkers;
    /**
     * @return The minimum number of worker nodes. Defaults to 1.
     * 
     */
    private final @Nullable Integer minNumberOfWorkers;

    @CustomType.Constructor
    private LinkedServiceAzureDatabricksInstancePool(
        @CustomType.Parameter("clusterVersion") String clusterVersion,
        @CustomType.Parameter("instancePoolId") String instancePoolId,
        @CustomType.Parameter("maxNumberOfWorkers") @Nullable Integer maxNumberOfWorkers,
        @CustomType.Parameter("minNumberOfWorkers") @Nullable Integer minNumberOfWorkers) {
        this.clusterVersion = clusterVersion;
        this.instancePoolId = instancePoolId;
        this.maxNumberOfWorkers = maxNumberOfWorkers;
        this.minNumberOfWorkers = minNumberOfWorkers;
    }

    /**
     * @return Spark version of a the cluster.
     * 
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return Identifier of the instance pool within the linked ADB instance.
     * 
     */
    public String instancePoolId() {
        return this.instancePoolId;
    }
    /**
     * @return The max number of worker nodes. Set this value if you want to enable autoscaling between the `min_number_of_workers` and this value. Omit this value to use a fixed number of workers defined in the `min_number_of_workers` property.
     * 
     */
    public Optional<Integer> maxNumberOfWorkers() {
        return Optional.ofNullable(this.maxNumberOfWorkers);
    }
    /**
     * @return The minimum number of worker nodes. Defaults to 1.
     * 
     */
    public Optional<Integer> minNumberOfWorkers() {
        return Optional.ofNullable(this.minNumberOfWorkers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceAzureDatabricksInstancePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterVersion;
        private String instancePoolId;
        private @Nullable Integer maxNumberOfWorkers;
        private @Nullable Integer minNumberOfWorkers;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceAzureDatabricksInstancePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.maxNumberOfWorkers = defaults.maxNumberOfWorkers;
    	      this.minNumberOfWorkers = defaults.minNumberOfWorkers;
        }

        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = Objects.requireNonNull(instancePoolId);
            return this;
        }
        public Builder maxNumberOfWorkers(@Nullable Integer maxNumberOfWorkers) {
            this.maxNumberOfWorkers = maxNumberOfWorkers;
            return this;
        }
        public Builder minNumberOfWorkers(@Nullable Integer minNumberOfWorkers) {
            this.minNumberOfWorkers = minNumberOfWorkers;
            return this;
        }        public LinkedServiceAzureDatabricksInstancePool build() {
            return new LinkedServiceAzureDatabricksInstancePool(clusterVersion, instancePoolId, maxNumberOfWorkers, minNumberOfWorkers);
        }
    }
}
