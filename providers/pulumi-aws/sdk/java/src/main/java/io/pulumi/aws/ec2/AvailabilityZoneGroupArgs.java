// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AvailabilityZoneGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilityZoneGroupArgs Empty = new AvailabilityZoneGroupArgs();

    /**
     * Name of the Availability Zone Group.
     * 
     */
    @Import(name="groupName", required=true)
      private final Output<String> groupName;

    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
     * 
     */
    @Import(name="optInStatus", required=true)
      private final Output<String> optInStatus;

    public Output<String> optInStatus() {
        return this.optInStatus;
    }

    public AvailabilityZoneGroupArgs(
        Output<String> groupName,
        Output<String> optInStatus) {
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.optInStatus = Objects.requireNonNull(optInStatus, "expected parameter 'optInStatus' to be non-null");
    }

    private AvailabilityZoneGroupArgs() {
        this.groupName = Codegen.empty();
        this.optInStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityZoneGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupName;
        private Output<String> optInStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityZoneGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
    	      this.optInStatus = defaults.optInStatus;
        }

        public Builder groupName(Output<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Output.of(Objects.requireNonNull(groupName));
            return this;
        }
        public Builder optInStatus(Output<String> optInStatus) {
            this.optInStatus = Objects.requireNonNull(optInStatus);
            return this;
        }
        public Builder optInStatus(String optInStatus) {
            this.optInStatus = Output.of(Objects.requireNonNull(optInStatus));
            return this;
        }        public AvailabilityZoneGroupArgs build() {
            return new AvailabilityZoneGroupArgs(groupName, optInStatus);
        }
    }
}
