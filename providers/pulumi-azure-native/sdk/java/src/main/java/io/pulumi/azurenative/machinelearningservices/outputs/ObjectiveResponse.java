// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObjectiveResponse {
    /**
     * Defines supported metric goals for hyperparameter tuning
     * 
     */
    private final String goal;
    /**
     * Name of the metric to optimize.
     * 
     */
    private final String primaryMetric;

    @CustomType.Constructor
    private ObjectiveResponse(
        @CustomType.Parameter("goal") String goal,
        @CustomType.Parameter("primaryMetric") String primaryMetric) {
        this.goal = goal;
        this.primaryMetric = primaryMetric;
    }

    /**
     * Defines supported metric goals for hyperparameter tuning
     * 
    */
    public String getGoal() {
        return this.goal;
    }
    /**
     * Name of the metric to optimize.
     * 
    */
    public String getPrimaryMetric() {
        return this.primaryMetric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectiveResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String goal;
        private String primaryMetric;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectiveResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goal = defaults.goal;
    	      this.primaryMetric = defaults.primaryMetric;
        }

        public Builder goal(String goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }
        public Builder primaryMetric(String primaryMetric) {
            this.primaryMetric = Objects.requireNonNull(primaryMetric);
            return this;
        }        public ObjectiveResponse build() {
            return new ObjectiveResponse(goal, primaryMetric);
        }
    }
}
