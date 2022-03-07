// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1.outputs.LoggingComponentConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class LoggingConfigResponse {
    /**
     * Logging components configuration
     * 
     */
    private final LoggingComponentConfigResponse componentConfig;

    @OutputCustomType.Constructor({"componentConfig"})
    private LoggingConfigResponse(LoggingComponentConfigResponse componentConfig) {
        this.componentConfig = Objects.requireNonNull(componentConfig);
    }

    /**
     * Logging components configuration
     * 
    */
    public LoggingComponentConfigResponse getComponentConfig() {
        return this.componentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingComponentConfigResponse componentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
        }

        public Builder setComponentConfig(LoggingComponentConfigResponse componentConfig) {
            this.componentConfig = Objects.requireNonNull(componentConfig);
            return this;
        }
        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(componentConfig);
        }
    }
}