// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowFailoverConfigState;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for source failover
 * 
 */
public final class FlowFailoverConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowFailoverConfig Empty = new FlowFailoverConfig();

    /**
     * Search window time to look for dash-7 packets
     * 
     */
    @Import(name="recoveryWindow")
      private final @Nullable Integer recoveryWindow;

    public Optional<Integer> getRecoveryWindow() {
        return this.recoveryWindow == null ? Optional.empty() : Optional.ofNullable(this.recoveryWindow);
    }

    @Import(name="state")
      private final @Nullable FlowFailoverConfigState state;

    public Optional<FlowFailoverConfigState> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public FlowFailoverConfig(
        @Nullable Integer recoveryWindow,
        @Nullable FlowFailoverConfigState state) {
        this.recoveryWindow = recoveryWindow;
        this.state = state;
    }

    private FlowFailoverConfig() {
        this.recoveryWindow = null;
        this.state = null;
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

        public Builder recoveryWindow(@Nullable Integer recoveryWindow) {
            this.recoveryWindow = recoveryWindow;
            return this;
        }
        public Builder state(@Nullable FlowFailoverConfigState state) {
            this.state = state;
            return this;
        }        public FlowFailoverConfig build() {
            return new FlowFailoverConfig(recoveryWindow, state);
        }
    }
}
