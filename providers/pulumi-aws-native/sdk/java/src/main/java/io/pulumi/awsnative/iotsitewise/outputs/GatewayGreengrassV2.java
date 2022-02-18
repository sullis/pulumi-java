// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GatewayGreengrassV2 {
    /**
     * The name of the CoreDevice in GreenGrass V2.
     * 
     */
    private final String coreDeviceThingName;

    @OutputCustomType.Constructor({"coreDeviceThingName"})
    private GatewayGreengrassV2(String coreDeviceThingName) {
        this.coreDeviceThingName = Objects.requireNonNull(coreDeviceThingName);
    }

    /**
     * The name of the CoreDevice in GreenGrass V2.
     * 
     */
    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGreengrassV2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coreDeviceThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayGreengrassV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreDeviceThingName = defaults.coreDeviceThingName;
        }

        public Builder setCoreDeviceThingName(String coreDeviceThingName) {
            this.coreDeviceThingName = Objects.requireNonNull(coreDeviceThingName);
            return this;
        }

        public GatewayGreengrassV2 build() {
            return new GatewayGreengrassV2(coreDeviceThingName);
        }
    }
}
