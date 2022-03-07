// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GatewayGreengrass {
    /**
     * The ARN of the Greengrass group.
     * 
     */
    private final String groupArn;

    @OutputCustomType.Constructor({"groupArn"})
    private GatewayGreengrass(String groupArn) {
        this.groupArn = Objects.requireNonNull(groupArn);
    }

    /**
     * The ARN of the Greengrass group.
     * 
    */
    public String getGroupArn() {
        return this.groupArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGreengrass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayGreengrass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupArn = defaults.groupArn;
        }

        public Builder setGroupArn(String groupArn) {
            this.groupArn = Objects.requireNonNull(groupArn);
            return this;
        }
        public GatewayGreengrass build() {
            return new GatewayGreengrass(groupArn);
        }
    }
}