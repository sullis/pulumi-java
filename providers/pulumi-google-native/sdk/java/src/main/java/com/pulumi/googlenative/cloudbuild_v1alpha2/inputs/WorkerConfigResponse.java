// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * WorkerConfig defines the configuration to be used for a creating workers in the pool.
 * 
 */
public final class WorkerConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkerConfigResponse Empty = new WorkerConfigResponse();

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private String diskSizeGb;

    /**
     * @return Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    /**
     * @return Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool.
     * 
     */
    public String machineType() {
        return this.machineType;
    }

    private WorkerConfigResponse() {}

    private WorkerConfigResponse(WorkerConfigResponse $) {
        this.diskSizeGb = $.diskSizeGb;
        this.machineType = $.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerConfigResponse $;

        public Builder() {
            $ = new WorkerConfigResponse();
        }

        public Builder(WorkerConfigResponse defaults) {
            $ = new WorkerConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param machineType Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        public WorkerConfigResponse build() {
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
