// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowFailoverConfigState;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowFailoverConfig {
    /**
     * Search window time to look for dash-7 packets
     * 
     */
    private final @Nullable Integer recoveryWindow;
    private final @Nullable FlowFailoverConfigState state;

    @OutputCustomType.Constructor({"recoveryWindow","state"})
    private FlowFailoverConfig(
        @Nullable Integer recoveryWindow,
        @Nullable FlowFailoverConfigState state) {
        this.recoveryWindow = recoveryWindow;
        this.state = state;
    }

    /**
     * Search window time to look for dash-7 packets
     * 
     */
    public Optional<Integer> getRecoveryWindow() {
        return Optional.ofNullable(this.recoveryWindow);
    }
    public Optional<FlowFailoverConfigState> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowFailoverConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer recoveryWindow;
        private @Nullable FlowFailoverConfigState state;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowFailoverConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryWindow = defaults.recoveryWindow;
    	      this.state = defaults.state;
        }

        public Builder setRecoveryWindow(@Nullable Integer recoveryWindow) {
            this.recoveryWindow = recoveryWindow;
            return this;
        }

        public Builder setState(@Nullable FlowFailoverConfigState state) {
            this.state = state;
            return this;
        }

        public FlowFailoverConfig build() {
            return new FlowFailoverConfig(recoveryWindow, state);
        }
    }
}
