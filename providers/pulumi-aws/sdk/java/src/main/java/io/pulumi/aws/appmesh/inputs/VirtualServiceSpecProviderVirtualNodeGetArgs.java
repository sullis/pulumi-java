// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VirtualServiceSpecProviderVirtualNodeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualServiceSpecProviderVirtualNodeGetArgs Empty = new VirtualServiceSpecProviderVirtualNodeGetArgs();

    /**
     * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualNodeName", required=true)
      private final Output<String> virtualNodeName;

    public Output<String> virtualNodeName() {
        return this.virtualNodeName;
    }

    public VirtualServiceSpecProviderVirtualNodeGetArgs(Output<String> virtualNodeName) {
        this.virtualNodeName = Objects.requireNonNull(virtualNodeName, "expected parameter 'virtualNodeName' to be non-null");
    }

    private VirtualServiceSpecProviderVirtualNodeGetArgs() {
        this.virtualNodeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecProviderVirtualNodeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecProviderVirtualNodeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder virtualNodeName(Output<String> virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }
        public Builder virtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Output.of(Objects.requireNonNull(virtualNodeName));
            return this;
        }        public VirtualServiceSpecProviderVirtualNodeGetArgs build() {
            return new VirtualServiceSpecProviderVirtualNodeGetArgs(virtualNodeName);
        }
    }
}
