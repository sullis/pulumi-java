// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ActivityDependencyResponse {
    /**
     * @return Activity name.
     * 
     */
    private final String activity;
    /**
     * @return Match-Condition for the dependency.
     * 
     */
    private final List<String> dependencyConditions;

    @CustomType.Constructor
    private ActivityDependencyResponse(
        @CustomType.Parameter("activity") String activity,
        @CustomType.Parameter("dependencyConditions") List<String> dependencyConditions) {
        this.activity = activity;
        this.dependencyConditions = dependencyConditions;
    }

    /**
     * @return Activity name.
     * 
     */
    public String activity() {
        return this.activity;
    }
    /**
     * @return Match-Condition for the dependency.
     * 
     */
    public List<String> dependencyConditions() {
        return this.dependencyConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activity;
        private List<String> dependencyConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activity = defaults.activity;
    	      this.dependencyConditions = defaults.dependencyConditions;
        }

        public Builder activity(String activity) {
            this.activity = Objects.requireNonNull(activity);
            return this;
        }
        public Builder dependencyConditions(List<String> dependencyConditions) {
            this.dependencyConditions = Objects.requireNonNull(dependencyConditions);
            return this;
        }
        public Builder dependencyConditions(String... dependencyConditions) {
            return dependencyConditions(List.of(dependencyConditions));
        }        public ActivityDependencyResponse build() {
            return new ActivityDependencyResponse(activity, dependencyConditions);
        }
    }
}
