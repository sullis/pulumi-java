// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolWorkerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolWorkerConfigGetArgs Empty = new WorkerPoolWorkerConfigGetArgs();

    /**
     * Size of the disk attached to the worker, in GB. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @InputImport(name="diskSizeGb")
    private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Machine type of a worker, such as `n1-standard-1`. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    @InputImport(name="noExternalIp")
    private final @Nullable Input<Boolean> noExternalIp;

    public Input<Boolean> getNoExternalIp() {
        return this.noExternalIp == null ? Input.empty() : this.noExternalIp;
    }

    public WorkerPoolWorkerConfigGetArgs(
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<String> machineType,
        @Nullable Input<Boolean> noExternalIp) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
        this.noExternalIp = noExternalIp;
    }

    private WorkerPoolWorkerConfigGetArgs() {
        this.diskSizeGb = Input.empty();
        this.machineType = Input.empty();
        this.noExternalIp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Boolean> noExternalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolWorkerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.noExternalIp = defaults.noExternalIp;
        }

        public Builder setDiskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setNoExternalIp(@Nullable Input<Boolean> noExternalIp) {
            this.noExternalIp = noExternalIp;
            return this;
        }

        public Builder setNoExternalIp(@Nullable Boolean noExternalIp) {
            this.noExternalIp = Input.ofNullable(noExternalIp);
            return this;
        }

        public WorkerPoolWorkerConfigGetArgs build() {
            return new WorkerPoolWorkerConfigGetArgs(diskSizeGb, machineType, noExternalIp);
        }
    }
}
