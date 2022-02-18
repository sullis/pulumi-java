// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The hardware profile.
 * 
 */
public final class HardwareProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final HardwareProfileArgs Empty = new HardwareProfileArgs();

    /**
     * The size of the VM
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public HardwareProfileArgs(@Nullable Input<String> vmSize) {
        this.vmSize = vmSize;
    }

    private HardwareProfileArgs() {
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }

        public HardwareProfileArgs build() {
            return new HardwareProfileArgs(vmSize);
        }
    }
}
