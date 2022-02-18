// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetResourceCreationLimitPolicy {
    /**
     * The maximum number of game sessions that an individual can create during the policy period.
     * 
     */
    private final @Nullable Integer newGameSessionsPerCreator;
    /**
     * The time span used in evaluating the resource creation limit policy.
     * 
     */
    private final @Nullable Integer policyPeriodInMinutes;

    @OutputCustomType.Constructor({"newGameSessionsPerCreator","policyPeriodInMinutes"})
    private FleetResourceCreationLimitPolicy(
        @Nullable Integer newGameSessionsPerCreator,
        @Nullable Integer policyPeriodInMinutes) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    /**
     * The maximum number of game sessions that an individual can create during the policy period.
     * 
     */
    public Optional<Integer> getNewGameSessionsPerCreator() {
        return Optional.ofNullable(this.newGameSessionsPerCreator);
    }
    /**
     * The time span used in evaluating the resource creation limit policy.
     * 
     */
    public Optional<Integer> getPolicyPeriodInMinutes() {
        return Optional.ofNullable(this.policyPeriodInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetResourceCreationLimitPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer newGameSessionsPerCreator;
        private @Nullable Integer policyPeriodInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetResourceCreationLimitPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newGameSessionsPerCreator = defaults.newGameSessionsPerCreator;
    	      this.policyPeriodInMinutes = defaults.policyPeriodInMinutes;
        }

        public Builder setNewGameSessionsPerCreator(@Nullable Integer newGameSessionsPerCreator) {
            this.newGameSessionsPerCreator = newGameSessionsPerCreator;
            return this;
        }

        public Builder setPolicyPeriodInMinutes(@Nullable Integer policyPeriodInMinutes) {
            this.policyPeriodInMinutes = policyPeriodInMinutes;
            return this;
        }

        public FleetResourceCreationLimitPolicy build() {
            return new FleetResourceCreationLimitPolicy(newGameSessionsPerCreator, policyPeriodInMinutes);
        }
    }
}
