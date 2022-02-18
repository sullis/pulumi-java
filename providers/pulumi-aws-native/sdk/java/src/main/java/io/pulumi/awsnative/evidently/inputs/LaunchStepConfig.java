// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.LaunchGroupToWeight;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LaunchStepConfig extends io.pulumi.resources.InvokeArgs {

    public static final LaunchStepConfig Empty = new LaunchStepConfig();

    @InputImport(name="groupWeights", required=true)
    private final List<LaunchGroupToWeight> groupWeights;

    public List<LaunchGroupToWeight> getGroupWeights() {
        return this.groupWeights;
    }

    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public LaunchStepConfig(
        List<LaunchGroupToWeight> groupWeights,
        String startTime) {
        this.groupWeights = Objects.requireNonNull(groupWeights, "expected parameter 'groupWeights' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private LaunchStepConfig() {
        this.groupWeights = List.of();
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchStepConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LaunchGroupToWeight> groupWeights;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchStepConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupWeights = defaults.groupWeights;
    	      this.startTime = defaults.startTime;
        }

        public Builder setGroupWeights(List<LaunchGroupToWeight> groupWeights) {
            this.groupWeights = Objects.requireNonNull(groupWeights);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public LaunchStepConfig build() {
            return new LaunchStepConfig(groupWeights, startTime);
        }
    }
}
