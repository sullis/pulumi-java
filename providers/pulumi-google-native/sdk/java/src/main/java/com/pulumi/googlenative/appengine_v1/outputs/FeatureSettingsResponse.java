// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class FeatureSettingsResponse {
    /**
     * @return Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39; behavior is deprecated, and this value is always true, this setting can be removed.
     * 
     */
    private final Boolean splitHealthChecks;
    /**
     * @return If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image.
     * 
     */
    private final Boolean useContainerOptimizedOs;

    @CustomType.Constructor
    private FeatureSettingsResponse(
        @CustomType.Parameter("splitHealthChecks") Boolean splitHealthChecks,
        @CustomType.Parameter("useContainerOptimizedOs") Boolean useContainerOptimizedOs) {
        this.splitHealthChecks = splitHealthChecks;
        this.useContainerOptimizedOs = useContainerOptimizedOs;
    }

    /**
     * @return Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39; behavior is deprecated, and this value is always true, this setting can be removed.
     * 
     */
    public Boolean splitHealthChecks() {
        return this.splitHealthChecks;
    }
    /**
     * @return If true, use Container-Optimized OS (https://cloud.google.com/container-optimized-os/) base image for VMs, rather than a base Debian image.
     * 
     */
    public Boolean useContainerOptimizedOs() {
        return this.useContainerOptimizedOs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean splitHealthChecks;
        private Boolean useContainerOptimizedOs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitHealthChecks = defaults.splitHealthChecks;
    	      this.useContainerOptimizedOs = defaults.useContainerOptimizedOs;
        }

        public Builder splitHealthChecks(Boolean splitHealthChecks) {
            this.splitHealthChecks = Objects.requireNonNull(splitHealthChecks);
            return this;
        }
        public Builder useContainerOptimizedOs(Boolean useContainerOptimizedOs) {
            this.useContainerOptimizedOs = Objects.requireNonNull(useContainerOptimizedOs);
            return this;
        }        public FeatureSettingsResponse build() {
            return new FeatureSettingsResponse(splitHealthChecks, useContainerOptimizedOs);
        }
    }
}
