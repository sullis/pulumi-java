// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerGroupInstanceDefinition {
    private final String instanceType;
    private final @Nullable String weightedCapacity;

    @OutputCustomType.Constructor({"instanceType","weightedCapacity"})
    private GameServerGroupInstanceDefinition(
        String instanceType,
        @Nullable String weightedCapacity) {
        this.instanceType = Objects.requireNonNull(instanceType);
        this.weightedCapacity = weightedCapacity;
    }

    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getWeightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupInstanceDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupInstanceDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setWeightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public GameServerGroupInstanceDefinition build() {
            return new GameServerGroupInstanceDefinition(instanceType, weightedCapacity);
        }
    }
}
