// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.inputs.FleetServerProcess;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of server process configurations that describe the processes to run on each instance in a fleet. All fleets must have a runtime configuration. Each instance in the fleet maintains server processes as specified in the runtime configuration, launching new ones as existing processes end. Each instance regularly checks for an updated runtime configuration makes adjustments as called for.
 * 
 * The runtime configuration enables the instances in a fleet to run multiple processes simultaneously. Potential scenarios are as follows: (1) Run multiple processes of a single game server executable to maximize usage of your hosting resources. (2) Run one or more processes of different executables, such as your game server and a metrics tracking program. (3) Run multiple processes of a single game server but with different launch parameters, for example to run one process on each instance in debug mode.
 * 
 * An Amazon GameLift instance is limited to 50 processes running simultaneously. A runtime configuration must specify fewer than this limit. To calculate the total number of processes specified in a runtime configuration, add the values of the ConcurrentExecutions parameter for each ServerProcess object in the runtime configuration.
 * 
 */
public final class FleetRuntimeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final FleetRuntimeConfiguration Empty = new FleetRuntimeConfiguration();

    /**
     * The maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * 
     */
    @Import(name="gameSessionActivationTimeoutSeconds")
      private final @Nullable Integer gameSessionActivationTimeoutSeconds;

    public Optional<Integer> getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.gameSessionActivationTimeoutSeconds);
    }

    /**
     * The maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
     * 
     */
    @Import(name="maxConcurrentGameSessionActivations")
      private final @Nullable Integer maxConcurrentGameSessionActivations;

    public Optional<Integer> getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentGameSessionActivations);
    }

    /**
     * A collection of server process configurations that describe which server processes to run on each instance in a fleet.
     * 
     */
    @Import(name="serverProcesses")
      private final @Nullable List<FleetServerProcess> serverProcesses;

    public List<FleetServerProcess> getServerProcesses() {
        return this.serverProcesses == null ? List.of() : this.serverProcesses;
    }

    public FleetRuntimeConfiguration(
        @Nullable Integer gameSessionActivationTimeoutSeconds,
        @Nullable Integer maxConcurrentGameSessionActivations,
        @Nullable List<FleetServerProcess> serverProcesses) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        this.serverProcesses = serverProcesses;
    }

    private FleetRuntimeConfiguration() {
        this.gameSessionActivationTimeoutSeconds = null;
        this.maxConcurrentGameSessionActivations = null;
        this.serverProcesses = List.of();
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

        public Builder gameSessionActivationTimeoutSeconds(@Nullable Integer gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }
        public Builder maxConcurrentGameSessionActivations(@Nullable Integer maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }
        public Builder serverProcesses(@Nullable List<FleetServerProcess> serverProcesses) {
            this.serverProcesses = serverProcesses;
            return this;
        }
        public Builder serverProcesses(FleetServerProcess... serverProcesses) {
            return serverProcesses(List.of(serverProcesses));
        }        public FleetRuntimeConfiguration build() {
            return new FleetRuntimeConfiguration(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcesses);
        }
    }
}
