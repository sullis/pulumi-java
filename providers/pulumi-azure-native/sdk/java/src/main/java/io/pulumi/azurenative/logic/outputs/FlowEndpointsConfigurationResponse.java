// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.FlowEndpointsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowEndpointsConfigurationResponse {
    /**
     * The connector endpoints.
     * 
     */
    private final @Nullable FlowEndpointsResponse connector;
    /**
     * The workflow endpoints.
     * 
     */
    private final @Nullable FlowEndpointsResponse workflow;

    @OutputCustomType.Constructor({"connector","workflow"})
    private FlowEndpointsConfigurationResponse(
        @Nullable FlowEndpointsResponse connector,
        @Nullable FlowEndpointsResponse workflow) {
        this.connector = connector;
        this.workflow = workflow;
    }

    /**
     * The connector endpoints.
     * 
     */
    public Optional<FlowEndpointsResponse> getConnector() {
        return Optional.ofNullable(this.connector);
    }
    /**
     * The workflow endpoints.
     * 
     */
    public Optional<FlowEndpointsResponse> getWorkflow() {
        return Optional.ofNullable(this.workflow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEndpointsResponse connector;
        private @Nullable FlowEndpointsResponse workflow;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.workflow = defaults.workflow;
        }

        public Builder setConnector(@Nullable FlowEndpointsResponse connector) {
            this.connector = connector;
            return this;
        }

        public Builder setWorkflow(@Nullable FlowEndpointsResponse workflow) {
            this.workflow = workflow;
            return this;
        }

        public FlowEndpointsConfigurationResponse build() {
            return new FlowEndpointsConfigurationResponse(connector, workflow);
        }
    }
}
