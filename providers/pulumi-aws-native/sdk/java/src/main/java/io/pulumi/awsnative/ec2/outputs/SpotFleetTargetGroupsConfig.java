// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.SpotFleetTargetGroup;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SpotFleetTargetGroupsConfig {
    private final List<SpotFleetTargetGroup> targetGroups;

    @OutputCustomType.Constructor({"targetGroups"})
    private SpotFleetTargetGroupsConfig(List<SpotFleetTargetGroup> targetGroups) {
        this.targetGroups = Objects.requireNonNull(targetGroups);
    }

    public List<SpotFleetTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTargetGroupsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SpotFleetTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTargetGroupsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setTargetGroups(List<SpotFleetTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public SpotFleetTargetGroupsConfig build() {
            return new SpotFleetTargetGroupsConfig(targetGroups);
        }
    }
}
