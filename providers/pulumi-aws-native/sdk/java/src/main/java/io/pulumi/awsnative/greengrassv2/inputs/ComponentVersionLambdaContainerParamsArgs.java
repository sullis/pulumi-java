// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.awsnative.greengrassv2.inputs.ComponentVersionLambdaDeviceMountArgs;
import io.pulumi.awsnative.greengrassv2.inputs.ComponentVersionLambdaVolumeMountArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaContainerParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaContainerParamsArgs Empty = new ComponentVersionLambdaContainerParamsArgs();

    @InputImport(name="devices")
    private final @Nullable Input<List<ComponentVersionLambdaDeviceMountArgs>> devices;

    public Input<List<ComponentVersionLambdaDeviceMountArgs>> getDevices() {
        return this.devices == null ? Input.empty() : this.devices;
    }

    @InputImport(name="memorySizeInKB")
    private final @Nullable Input<Integer> memorySizeInKB;

    public Input<Integer> getMemorySizeInKB() {
        return this.memorySizeInKB == null ? Input.empty() : this.memorySizeInKB;
    }

    @InputImport(name="mountROSysfs")
    private final @Nullable Input<Boolean> mountROSysfs;

    public Input<Boolean> getMountROSysfs() {
        return this.mountROSysfs == null ? Input.empty() : this.mountROSysfs;
    }

    @InputImport(name="volumes")
    private final @Nullable Input<List<ComponentVersionLambdaVolumeMountArgs>> volumes;

    public Input<List<ComponentVersionLambdaVolumeMountArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    public ComponentVersionLambdaContainerParamsArgs(
        @Nullable Input<List<ComponentVersionLambdaDeviceMountArgs>> devices,
        @Nullable Input<Integer> memorySizeInKB,
        @Nullable Input<Boolean> mountROSysfs,
        @Nullable Input<List<ComponentVersionLambdaVolumeMountArgs>> volumes) {
        this.devices = devices;
        this.memorySizeInKB = memorySizeInKB;
        this.mountROSysfs = mountROSysfs;
        this.volumes = volumes;
    }

    private ComponentVersionLambdaContainerParamsArgs() {
        this.devices = Input.empty();
        this.memorySizeInKB = Input.empty();
        this.mountROSysfs = Input.empty();
        this.volumes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaContainerParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ComponentVersionLambdaDeviceMountArgs>> devices;
        private @Nullable Input<Integer> memorySizeInKB;
        private @Nullable Input<Boolean> mountROSysfs;
        private @Nullable Input<List<ComponentVersionLambdaVolumeMountArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaContainerParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devices = defaults.devices;
    	      this.memorySizeInKB = defaults.memorySizeInKB;
    	      this.mountROSysfs = defaults.mountROSysfs;
    	      this.volumes = defaults.volumes;
        }

        public Builder setDevices(@Nullable Input<List<ComponentVersionLambdaDeviceMountArgs>> devices) {
            this.devices = devices;
            return this;
        }

        public Builder setDevices(@Nullable List<ComponentVersionLambdaDeviceMountArgs> devices) {
            this.devices = Input.ofNullable(devices);
            return this;
        }

        public Builder setMemorySizeInKB(@Nullable Input<Integer> memorySizeInKB) {
            this.memorySizeInKB = memorySizeInKB;
            return this;
        }

        public Builder setMemorySizeInKB(@Nullable Integer memorySizeInKB) {
            this.memorySizeInKB = Input.ofNullable(memorySizeInKB);
            return this;
        }

        public Builder setMountROSysfs(@Nullable Input<Boolean> mountROSysfs) {
            this.mountROSysfs = mountROSysfs;
            return this;
        }

        public Builder setMountROSysfs(@Nullable Boolean mountROSysfs) {
            this.mountROSysfs = Input.ofNullable(mountROSysfs);
            return this;
        }

        public Builder setVolumes(@Nullable Input<List<ComponentVersionLambdaVolumeMountArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<ComponentVersionLambdaVolumeMountArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }

        public ComponentVersionLambdaContainerParamsArgs build() {
            return new ComponentVersionLambdaContainerParamsArgs(devices, memorySizeInKB, mountROSysfs, volumes);
        }
    }
}
