// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for resources used by Airflow schedulers.
 * 
 */
public final class SchedulerResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchedulerResourceResponse Empty = new SchedulerResourceResponse();

    /**
     * Optional. The number of schedulers.
     * 
     */
    @InputImport(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="cpu", required=true)
      private final Double cpu;

    public Double getCpu() {
        return this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="memoryGb", required=true)
      private final Double memoryGb;

    public Double getMemoryGb() {
        return this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="storageGb", required=true)
      private final Double storageGb;

    public Double getStorageGb() {
        return this.storageGb;
    }

    public SchedulerResourceResponse(
        Integer count,
        Double cpu,
        Double memoryGb,
        Double storageGb) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.memoryGb = Objects.requireNonNull(memoryGb, "expected parameter 'memoryGb' to be non-null");
        this.storageGb = Objects.requireNonNull(storageGb, "expected parameter 'storageGb' to be non-null");
    }

    private SchedulerResourceResponse() {
        this.count = null;
        this.cpu = null;
        this.memoryGb = null;
        this.storageGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulerResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }
        public SchedulerResourceResponse build() {
            return new SchedulerResourceResponse(count, cpu, memoryGb, storageGb);
        }
    }
}