// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains the ARN of AWS IoT Greengrass Group V1 that the gateway runs on.
 * 
 */
public final class GatewayGreengrassArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayGreengrassArgs Empty = new GatewayGreengrassArgs();

    /**
     * The ARN of the Greengrass group.
     * 
     */
    @Import(name="groupArn", required=true)
      private final Output<String> groupArn;

    public Output<String> getGroupArn() {
        return this.groupArn;
    }

    public GatewayGreengrassArgs(Output<String> groupArn) {
        this.groupArn = Objects.requireNonNull(groupArn, "expected parameter 'groupArn' to be non-null");
    }

    private GatewayGreengrassArgs() {
        this.groupArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGreengrassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayGreengrassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupArn = defaults.groupArn;
        }

        public Builder groupArn(Output<String> groupArn) {
            this.groupArn = Objects.requireNonNull(groupArn);
            return this;
        }
        public Builder groupArn(String groupArn) {
            this.groupArn = Output.of(Objects.requireNonNull(groupArn));
            return this;
        }        public GatewayGreengrassArgs build() {
            return new GatewayGreengrassArgs(groupArn);
        }
    }
}
