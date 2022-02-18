// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Activity dependency information.
 * 
 */
public final class ActivityDependencyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActivityDependencyResponse Empty = new ActivityDependencyResponse();

    /**
     * Activity name.
     * 
     */
    @InputImport(name="activity", required=true)
    private final String activity;

    public String getActivity() {
        return this.activity;
    }

    /**
     * Match-Condition for the dependency.
     * 
     */
    @InputImport(name="dependencyConditions", required=true)
    private final List<String> dependencyConditions;

    public List<String> getDependencyConditions() {
        return this.dependencyConditions;
    }

    public ActivityDependencyResponse(
        String activity,
        List<String> dependencyConditions) {
        this.activity = Objects.requireNonNull(activity, "expected parameter 'activity' to be non-null");
        this.dependencyConditions = Objects.requireNonNull(dependencyConditions, "expected parameter 'dependencyConditions' to be non-null");
    }

    private ActivityDependencyResponse() {
        this.activity = null;
        this.dependencyConditions = List.of();
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

        public Builder setActivity(String activity) {
            this.activity = Objects.requireNonNull(activity);
            return this;
        }

        public Builder setDependencyConditions(List<String> dependencyConditions) {
            this.dependencyConditions = Objects.requireNonNull(dependencyConditions);
            return this;
        }

        public ActivityDependencyResponse build() {
            return new ActivityDependencyResponse(activity, dependencyConditions);
        }
    }
}
