// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.outputs;

import com.pulumi.aws.gamelift.outputs.FleetRuntimeConfigurationServerProcess;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetRuntimeConfiguration {
    /**
     * @return Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
     * 
     */
    private final @Nullable Integer gameSessionActivationTimeoutSeconds;
    /**
     * @return Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
     * 
     */
    private final @Nullable Integer maxConcurrentGameSessionActivations;
    /**
     * @return Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * 
     */
    private final @Nullable List<FleetRuntimeConfigurationServerProcess> serverProcesses;

    @CustomType.Constructor
    private FleetRuntimeConfiguration(
        @CustomType.Parameter("gameSessionActivationTimeoutSeconds") @Nullable Integer gameSessionActivationTimeoutSeconds,
        @CustomType.Parameter("maxConcurrentGameSessionActivations") @Nullable Integer maxConcurrentGameSessionActivations,
        @CustomType.Parameter("serverProcesses") @Nullable List<FleetRuntimeConfigurationServerProcess> serverProcesses) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        this.serverProcesses = serverProcesses;
    }

    /**
     * @return Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
     * 
     */
    public Optional<Integer> gameSessionActivationTimeoutSeconds() {
        return Optional.ofNullable(this.gameSessionActivationTimeoutSeconds);
    }
    /**
     * @return Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
     * 
     */
    public Optional<Integer> maxConcurrentGameSessionActivations() {
        return Optional.ofNullable(this.maxConcurrentGameSessionActivations);
    }
    /**
     * @return Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * 
     */
    public List<FleetRuntimeConfigurationServerProcess> serverProcesses() {
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
        private @Nullable List<FleetRuntimeConfigurationServerProcess> serverProcesses;

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
        public Builder serverProcesses(@Nullable List<FleetRuntimeConfigurationServerProcess> serverProcesses) {
            this.serverProcesses = serverProcesses;
            return this;
        }
        public Builder serverProcesses(FleetRuntimeConfigurationServerProcess... serverProcesses) {
            return serverProcesses(List.of(serverProcesses));
        }        public FleetRuntimeConfiguration build() {
            return new FleetRuntimeConfiguration(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcesses);
        }
    }
}
