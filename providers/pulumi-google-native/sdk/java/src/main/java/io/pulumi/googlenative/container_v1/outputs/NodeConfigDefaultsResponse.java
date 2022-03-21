// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1.outputs.GcfsConfigResponse;
import java.util.Objects;

@CustomType
public final class NodeConfigDefaultsResponse {
    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
     */
    private final GcfsConfigResponse gcfsConfig;

    @CustomType.Constructor
    private NodeConfigDefaultsResponse(@CustomType.Parameter("gcfsConfig") GcfsConfigResponse gcfsConfig) {
        this.gcfsConfig = gcfsConfig;
    }

    /**
     * GCFS (Google Container File System, a.k.a Riptide) options.
     * 
    */
    public GcfsConfigResponse getGcfsConfig() {
        return this.gcfsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcfsConfigResponse gcfsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcfsConfig = defaults.gcfsConfig;
        }

        public Builder gcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }        public NodeConfigDefaultsResponse build() {
            return new NodeConfigDefaultsResponse(gcfsConfig);
        }
    }
}
