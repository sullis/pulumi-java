// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * volumeDevice describes a mapping of a raw block device within a container.
 * 
 */
public final class VolumeDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeDeviceArgs Empty = new VolumeDeviceArgs();

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * 
     */
    @InputImport(name="devicePath", required=true)
      private final Input<String> devicePath;

    public Input<String> getDevicePath() {
        return this.devicePath;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public VolumeDeviceArgs(
        Input<String> devicePath,
        Input<String> name) {
        this.devicePath = Objects.requireNonNull(devicePath, "expected parameter 'devicePath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private VolumeDeviceArgs() {
        this.devicePath = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> devicePath;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePath = defaults.devicePath;
    	      this.name = defaults.name;
        }

        public Builder setDevicePath(Input<String> devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }

        public Builder setDevicePath(String devicePath) {
            this.devicePath = Input.of(Objects.requireNonNull(devicePath));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public VolumeDeviceArgs build() {
            return new VolumeDeviceArgs(devicePath, name);
        }
    }
}