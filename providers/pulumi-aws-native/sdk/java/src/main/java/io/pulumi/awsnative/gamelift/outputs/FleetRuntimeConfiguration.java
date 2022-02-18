// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.outputs.FleetServerProcess;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetRuntimeConfiguration {
    /**
     * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * 
     */
    private final @Nullable Integer gameSessionActivationTimeoutSeconds;
    /**
     * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
     * 
     */
    private final @Nullable Integer maxConcurrentGameSessionActivations;
    /**
     * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
     * 
     */
    private final @Nullable List<FleetServerProcess> serverProcesses;

    @OutputCustomType.Constructor({"gameSessionActivationTimeoutSeconds","maxConcurrentGameSessionActivations","serverProcesses"})
    private FleetRuntimeConfiguration(
        @Nullable Integer gameSessionActivationTimeoutSeconds,
        @Nullable Integer maxConcurrentGameSessionActivations,
        @Nullable List<FleetServerProcess> serverProcesses) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        this.serverProcesses = serverProcesses;
    }

    /**
     * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * 
     */
    public Optional<Integer> getGameSessionActivationTimeoutSeconds() {
        return Optional.ofNullable(this.gameSessionActivationTimeoutSeconds);
    }
    /**
     * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
     * 
     */
    public Optional<Integer> getMaxConcurrentGameSessionActivations() {
        return Optional.ofNullable(this.maxConcurrentGameSessionActivations);
    }
    /**
     * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
     * 
     */
    public List<FleetServerProcess> getServerProcesses() {
        return this.serverProcesses == null ? List.of() : this.serverProcesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetRuntimeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer gameSessionActivationTimeoutSeconds;
        private @Nullable Integer maxConcurrentGameSessionActivations;
        private @Nullable List<FleetServerProcess> serverProcesses;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetRuntimeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gameSessionActivationTimeoutSeconds = defaults.gameSessionActivationTimeoutSeconds;
    	      this.maxConcurrentGameSessionActivations = defaults.maxConcurrentGameSessionActivations;
    	      this.serverProcesses = defaults.serverProcesses;
        }

        public Builder setGameSessionActivationTimeoutSeconds(@Nullable Integer gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }

        public Builder setMaxConcurrentGameSessionActivations(@Nullable Integer maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }

        public Builder setServerProcesses(@Nullable List<FleetServerProcess> serverProcesses) {
            this.serverProcesses = serverProcesses;
            return this;
        }

        public FleetRuntimeConfiguration build() {
            return new FleetRuntimeConfiguration(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcesses);
        }
    }
}
