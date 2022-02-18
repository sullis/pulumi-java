// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesVolumeArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionResourcesArgs Empty = new FlexibleAppVersionResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Input<Integer> cpu;

    public Input<Integer> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @InputImport(name="diskGb")
    private final @Nullable Input<Integer> diskGb;

    public Input<Integer> getDiskGb() {
        return this.diskGb == null ? Input.empty() : this.diskGb;
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @InputImport(name="memoryGb")
    private final @Nullable Input<Double> memoryGb;

    public Input<Double> getMemoryGb() {
        return this.memoryGb == null ? Input.empty() : this.memoryGb;
    }

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
     */
    @InputImport(name="volumes")
    private final @Nullable Input<List<FlexibleAppVersionResourcesVolumeArgs>> volumes;

    public Input<List<FlexibleAppVersionResourcesVolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    public FlexibleAppVersionResourcesArgs(
        @Nullable Input<Integer> cpu,
        @Nullable Input<Integer> diskGb,
        @Nullable Input<Double> memoryGb,
        @Nullable Input<List<FlexibleAppVersionResourcesVolumeArgs>> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    private FlexibleAppVersionResourcesArgs() {
        this.cpu = Input.empty();
        this.diskGb = Input.empty();
        this.memoryGb = Input.empty();
        this.volumes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cpu;
        private @Nullable Input<Integer> diskGb;
        private @Nullable Input<Double> memoryGb;
        private @Nullable Input<List<FlexibleAppVersionResourcesVolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder setCpu(@Nullable Input<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder setDiskGb(@Nullable Input<Integer> diskGb) {
            this.diskGb = diskGb;
            return this;
        }

        public Builder setDiskGb(@Nullable Integer diskGb) {
            this.diskGb = Input.ofNullable(diskGb);
            return this;
        }

        public Builder setMemoryGb(@Nullable Input<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder setMemoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Input.ofNullable(memoryGb);
            return this;
        }

        public Builder setVolumes(@Nullable Input<List<FlexibleAppVersionResourcesVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<FlexibleAppVersionResourcesVolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }

        public FlexibleAppVersionResourcesArgs build() {
            return new FlexibleAppVersionResourcesArgs(cpu, diskGb, memoryGb, volumes);
        }
    }
}
