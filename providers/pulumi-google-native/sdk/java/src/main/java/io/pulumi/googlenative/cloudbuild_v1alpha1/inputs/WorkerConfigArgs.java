// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudbuild_v1alpha1.inputs.NetworkArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WorkerConfig defines the configuration to be used for a creating workers in the pool.
 * 
 */
public final class WorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerConfigArgs Empty = new WorkerConfigArgs();

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<NetworkArgs> network;

    public Output<NetworkArgs> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    public WorkerConfigArgs(
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<String> machineType,
        @Nullable Output<NetworkArgs> network,
        @Nullable Output<String> tag) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
        this.network = network;
        this.tag = tag;
    }

    private WorkerConfigArgs() {
        this.diskSizeGb = Output.empty();
        this.machineType = Output.empty();
        this.network = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<String> machineType;
        private @Nullable Output<NetworkArgs> network;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.network = defaults.network;
    	      this.tag = defaults.tag;
        }

        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public Builder network(@Nullable Output<NetworkArgs> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable NetworkArgs network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }        public WorkerConfigArgs build() {
            return new WorkerConfigArgs(diskSizeGb, machineType, network, tag);
        }
    }
}
