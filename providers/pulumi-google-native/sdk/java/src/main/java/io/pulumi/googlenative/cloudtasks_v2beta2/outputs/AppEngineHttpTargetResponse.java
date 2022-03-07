// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.AppEngineRoutingResponse;
import java.util.Objects;

@OutputCustomType
public final class AppEngineHttpTargetResponse {
    /**
     * Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    private final AppEngineRoutingResponse appEngineRoutingOverride;

    @OutputCustomType.Constructor({"appEngineRoutingOverride"})
    private AppEngineHttpTargetResponse(AppEngineRoutingResponse appEngineRoutingOverride) {
        this.appEngineRoutingOverride = Objects.requireNonNull(appEngineRoutingOverride);
    }

    /**
     * Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
    */
    public AppEngineRoutingResponse getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRoutingOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRoutingOverride = defaults.appEngineRoutingOverride;
        }

        public Builder setAppEngineRoutingOverride(AppEngineRoutingResponse appEngineRoutingOverride) {
            this.appEngineRoutingOverride = Objects.requireNonNull(appEngineRoutingOverride);
            return this;
        }
        public AppEngineHttpTargetResponse build() {
            return new AppEngineHttpTargetResponse(appEngineRoutingOverride);
        }
    }
}