// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatefulDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatefulDiskGetArgs Empty = new InstanceGroupManagerStatefulDiskGetArgs();

    /**
     * , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    @InputImport(name="deleteRule")
    private final @Nullable Input<String> deleteRule;

    public Input<String> getDeleteRule() {
        return this.deleteRule == null ? Input.empty() : this.deleteRule;
    }

    /**
     * , The device name of the disk to be attached.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    public InstanceGroupManagerStatefulDiskGetArgs(
        @Nullable Input<String> deleteRule,
        Input<String> deviceName) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
    }

    private InstanceGroupManagerStatefulDiskGetArgs() {
        this.deleteRule = Input.empty();
        this.deviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatefulDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deleteRule;
        private Input<String> deviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatefulDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
        }

        public Builder setDeleteRule(@Nullable Input<String> deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }

        public Builder setDeleteRule(@Nullable String deleteRule) {
            this.deleteRule = Input.ofNullable(deleteRule);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public InstanceGroupManagerStatefulDiskGetArgs build() {
            return new InstanceGroupManagerStatefulDiskGetArgs(deleteRule, deviceName);
        }
    }
}
