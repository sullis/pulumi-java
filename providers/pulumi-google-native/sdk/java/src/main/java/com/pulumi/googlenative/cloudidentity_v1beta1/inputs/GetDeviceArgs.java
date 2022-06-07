// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceArgs Empty = new GetDeviceArgs();

    @Import(name="deviceId", required=true)
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }

    private GetDeviceArgs() {}

    private GetDeviceArgs(GetDeviceArgs $) {
        this.deviceId = $.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceArgs $;

        public Builder() {
            $ = new GetDeviceArgs();
        }

        public Builder(GetDeviceArgs defaults) {
            $ = new GetDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceId(Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        public GetDeviceArgs build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            return $;
        }
    }

}
