// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetGroupIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetGroupIdentifierArgs Empty = new SpotFleetGroupIdentifierArgs();

    @Import(name="groupId", required=true)
      private final Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }

    public SpotFleetGroupIdentifierArgs(Output<String> groupId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
    }

    private SpotFleetGroupIdentifierArgs() {
        this.groupId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetGroupIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupId;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetGroupIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
        }

        public Builder groupId(Output<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Output.of(Objects.requireNonNull(groupId));
            return this;
        }        public SpotFleetGroupIdentifierArgs build() {
            return new SpotFleetGroupIdentifierArgs(groupId);
        }
    }
}
