// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class VirtualNodeSpecBackendGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendGetArgs Empty = new VirtualNodeSpecBackendGetArgs();

    /**
     * Specifies a virtual service to use as a backend for a virtual node.
     * 
     */
    @Import(name="virtualService", required=true)
      private final Output<VirtualNodeSpecBackendVirtualServiceGetArgs> virtualService;

    public Output<VirtualNodeSpecBackendVirtualServiceGetArgs> getVirtualService() {
        return this.virtualService;
    }

    public VirtualNodeSpecBackendGetArgs(Output<VirtualNodeSpecBackendVirtualServiceGetArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private VirtualNodeSpecBackendGetArgs() {
        this.virtualService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualNodeSpecBackendVirtualServiceGetArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Output<VirtualNodeSpecBackendVirtualServiceGetArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public Builder virtualService(VirtualNodeSpecBackendVirtualServiceGetArgs virtualService) {
            this.virtualService = Output.of(Objects.requireNonNull(virtualService));
            return this;
        }        public VirtualNodeSpecBackendGetArgs build() {
            return new VirtualNodeSpecBackendGetArgs(virtualService);
        }
    }
}
