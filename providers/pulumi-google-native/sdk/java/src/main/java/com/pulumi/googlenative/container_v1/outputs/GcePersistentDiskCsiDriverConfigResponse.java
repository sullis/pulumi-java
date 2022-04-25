// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GcePersistentDiskCsiDriverConfigResponse {
    /**
     * @return Whether the Compute Engine PD CSI driver is enabled for this cluster.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GcePersistentDiskCsiDriverConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return Whether the Compute Engine PD CSI driver is enabled for this cluster.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcePersistentDiskCsiDriverConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GcePersistentDiskCsiDriverConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GcePersistentDiskCsiDriverConfigResponse build() {
            return new GcePersistentDiskCsiDriverConfigResponse(enabled);
        }
    }
}
