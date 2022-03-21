// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkerPoolWorkerConfig {
    /**
     * Size of the disk attached to the worker, in GB. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    private final @Nullable Integer diskSizeGb;
    /**
     * Machine type of a worker, such as `n1-standard-1`. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    private final @Nullable String machineType;
    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    private final @Nullable Boolean noExternalIp;

    @CustomType.Constructor
    private WorkerPoolWorkerConfig(
        @CustomType.Parameter("diskSizeGb") @Nullable Integer diskSizeGb,
        @CustomType.Parameter("machineType") @Nullable String machineType,
        @CustomType.Parameter("noExternalIp") @Nullable Boolean noExternalIp) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
        this.noExternalIp = noExternalIp;
    }

    /**
     * Size of the disk attached to the worker, in GB. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
    */
    public Optional<Integer> getDiskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    /**
     * Machine type of a worker, such as `n1-standard-1`. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
    */
    public Optional<String> getMachineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
    */
    public Optional<Boolean> getNoExternalIp() {
        return Optional.ofNullable(this.noExternalIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolWorkerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeGb;
        private @Nullable String machineType;
        private @Nullable Boolean noExternalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolWorkerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.noExternalIp = defaults.noExternalIp;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder noExternalIp(@Nullable Boolean noExternalIp) {
            this.noExternalIp = noExternalIp;
            return this;
        }        public WorkerPoolWorkerConfig build() {
            return new WorkerPoolWorkerConfig(diskSizeGb, machineType, noExternalIp);
        }
    }
}
