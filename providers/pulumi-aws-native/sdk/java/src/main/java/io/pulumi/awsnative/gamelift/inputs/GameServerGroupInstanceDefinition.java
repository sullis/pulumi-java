// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An allowed instance type for your game server group.
 * 
 */
public final class GameServerGroupInstanceDefinition extends io.pulumi.resources.InvokeArgs {

    public static final GameServerGroupInstanceDefinition Empty = new GameServerGroupInstanceDefinition();

    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    @Import(name="weightedCapacity")
      private final @Nullable String weightedCapacity;

    public Optional<String> weightedCapacity() {
        return this.weightedCapacity == null ? Optional.empty() : Optional.ofNullable(this.weightedCapacity);
    }

    public GameServerGroupInstanceDefinition(
        String instanceType,
        @Nullable String weightedCapacity) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.weightedCapacity = weightedCapacity;
    }

    private GameServerGroupInstanceDefinition() {
        this.instanceType = null;
        this.weightedCapacity = null;
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

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public GameServerGroupInstanceDefinition build() {
            return new GameServerGroupInstanceDefinition(instanceType, weightedCapacity);
        }
    }
}
