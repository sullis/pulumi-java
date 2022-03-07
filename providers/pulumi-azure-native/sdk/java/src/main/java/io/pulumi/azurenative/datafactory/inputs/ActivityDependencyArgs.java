// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.DependencyCondition;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Activity dependency information.
 * 
 */
public final class ActivityDependencyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityDependencyArgs Empty = new ActivityDependencyArgs();

    /**
     * Activity name.
     * 
     */
    @InputImport(name="activity", required=true)
      private final Input<String> activity;

    public Input<String> getActivity() {
        return this.activity;
    }

    /**
     * Match-Condition for the dependency.
     * 
     */
    @InputImport(name="dependencyConditions", required=true)
      private final Input<List<Either<String,DependencyCondition>>> dependencyConditions;

    public Input<List<Either<String,DependencyCondition>>> getDependencyConditions() {
        return this.dependencyConditions;
    }

    public ActivityDependencyArgs(
        Input<String> activity,
        Input<List<Either<String,DependencyCondition>>> dependencyConditions) {
        this.activity = Objects.requireNonNull(activity, "expected parameter 'activity' to be non-null");
        this.dependencyConditions = Objects.requireNonNull(dependencyConditions, "expected parameter 'dependencyConditions' to be non-null");
    }

    private ActivityDependencyArgs() {
        this.activity = Input.empty();
        this.dependencyConditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> activity;
        private Input<List<Either<String,DependencyCondition>>> dependencyConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityDependencyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activity = defaults.activity;
    	      this.dependencyConditions = defaults.dependencyConditions;
        }

        public Builder setActivity(Input<String> activity) {
            this.activity = Objects.requireNonNull(activity);
            return this;
        }

        public Builder setActivity(String activity) {
            this.activity = Input.of(Objects.requireNonNull(activity));
            return this;
        }

        public Builder setDependencyConditions(Input<List<Either<String,DependencyCondition>>> dependencyConditions) {
            this.dependencyConditions = Objects.requireNonNull(dependencyConditions);
            return this;
        }

        public Builder setDependencyConditions(List<Either<String,DependencyCondition>> dependencyConditions) {
            this.dependencyConditions = Input.of(Objects.requireNonNull(dependencyConditions));
            return this;
        }
        public ActivityDependencyArgs build() {
            return new ActivityDependencyArgs(activity, dependencyConditions);
        }
    }
}