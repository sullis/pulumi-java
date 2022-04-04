// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceScratchDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceScratchDiskArgs Empty = new InstanceScratchDiskArgs();

    /**
     * The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
     */
    @Import(name="interface", required=true)
      private final Output<String> interface_;

    public Output<String> getInterface_() {
        return this.interface_;
    }

    public InstanceScratchDiskArgs(Output<String> interface_) {
        this.interface_ = Objects.requireNonNull(interface_, "expected parameter 'interface_' to be non-null");
    }

    private InstanceScratchDiskArgs() {
        this.interface_ = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScratchDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceScratchDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
        }

        public Builder interface_(Output<String> interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Output.of(Objects.requireNonNull(interface_));
            return this;
        }        public InstanceScratchDiskArgs build() {
            return new InstanceScratchDiskArgs(interface_);
        }
    }
}
