// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.outputs.GameServerGroupTargetTrackingConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerGroupAutoScalingPolicy {
    private final @Nullable Double estimatedInstanceWarmup;
    private final GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration;

    @OutputCustomType.Constructor({"estimatedInstanceWarmup","targetTrackingConfiguration"})
    private GameServerGroupAutoScalingPolicy(
        @Nullable Double estimatedInstanceWarmup,
        GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration);
    }

    public Optional<Double> getEstimatedInstanceWarmup() {
        return Optional.ofNullable(this.estimatedInstanceWarmup);
    }
    public GameServerGroupTargetTrackingConfiguration getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupAutoScalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double estimatedInstanceWarmup;
        private GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupAutoScalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.targetTrackingConfiguration = defaults.targetTrackingConfiguration;
        }

        public Builder setEstimatedInstanceWarmup(@Nullable Double estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        public Builder setTargetTrackingConfiguration(GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration);
            return this;
        }

        public GameServerGroupAutoScalingPolicy build() {
            return new GameServerGroupAutoScalingPolicy(estimatedInstanceWarmup, targetTrackingConfiguration);
        }
    }
}
