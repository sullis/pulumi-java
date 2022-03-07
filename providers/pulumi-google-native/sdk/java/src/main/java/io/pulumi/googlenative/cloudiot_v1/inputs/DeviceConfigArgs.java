// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The device configuration. Eventually delivered to devices.
 * 
 */
public final class DeviceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceConfigArgs Empty = new DeviceConfigArgs();

    /**
     * The device configuration data.
     * 
     */
    @InputImport(name="binaryData")
      private final @Nullable Input<String> binaryData;

    public Input<String> getBinaryData() {
        return this.binaryData == null ? Input.empty() : this.binaryData;
    }

    public DeviceConfigArgs(@Nullable Input<String> binaryData) {
        this.binaryData = binaryData;
    }

    private DeviceConfigArgs() {
        this.binaryData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> binaryData;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
        }

        public Builder setBinaryData(@Nullable Input<String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        public Builder setBinaryData(@Nullable String binaryData) {
            this.binaryData = Input.ofNullable(binaryData);
            return this;
        }
        public DeviceConfigArgs build() {
            return new DeviceConfigArgs(binaryData);
        }
    }
}