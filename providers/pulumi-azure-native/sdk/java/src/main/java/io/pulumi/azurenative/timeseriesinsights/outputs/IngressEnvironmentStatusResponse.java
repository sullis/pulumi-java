// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.EnvironmentStateDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressEnvironmentStatusResponse {
    /**
     * This string represents the state of ingress operations on an environment. It can be "Disabled", "Ready", "Running", "Paused" or "Unknown"
     * 
     */
    private final @Nullable String state;
    /**
     * An object that contains the details about an environment's state.
     * 
     */
    private final EnvironmentStateDetailsResponse stateDetails;

    @OutputCustomType.Constructor({"state","stateDetails"})
    private IngressEnvironmentStatusResponse(
        @Nullable String state,
        EnvironmentStateDetailsResponse stateDetails) {
        this.state = state;
        this.stateDetails = Objects.requireNonNull(stateDetails);
    }

    /**
     * This string represents the state of ingress operations on an environment. It can be "Disabled", "Ready", "Running", "Paused" or "Unknown"
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * An object that contains the details about an environment's state.
     * 
     */
    public EnvironmentStateDetailsResponse getStateDetails() {
        return this.stateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressEnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;
        private EnvironmentStateDetailsResponse stateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressEnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStateDetails(EnvironmentStateDetailsResponse stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }

        public IngressEnvironmentStatusResponse build() {
            return new IngressEnvironmentStatusResponse(state, stateDetails);
        }
    }
}
