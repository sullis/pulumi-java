// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AndroidDeviceResponse;
import com.pulumi.googlenative.testing_v1.inputs.IosDeviceResponse;
import java.util.Objects;


/**
 * The environment in which the test is run.
 * 
 */
public final class EnvironmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentResponse Empty = new EnvironmentResponse();

    /**
     * An Android device which must be used with an Android test.
     * 
     */
    @Import(name="androidDevice", required=true)
    private AndroidDeviceResponse androidDevice;

    /**
     * @return An Android device which must be used with an Android test.
     * 
     */
    public AndroidDeviceResponse androidDevice() {
        return this.androidDevice;
    }

    /**
     * An iOS device which must be used with an iOS test.
     * 
     */
    @Import(name="iosDevice", required=true)
    private IosDeviceResponse iosDevice;

    /**
     * @return An iOS device which must be used with an iOS test.
     * 
     */
    public IosDeviceResponse iosDevice() {
        return this.iosDevice;
    }

    private EnvironmentResponse() {}

    private EnvironmentResponse(EnvironmentResponse $) {
        this.androidDevice = $.androidDevice;
        this.iosDevice = $.iosDevice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentResponse $;

        public Builder() {
            $ = new EnvironmentResponse();
        }

        public Builder(EnvironmentResponse defaults) {
            $ = new EnvironmentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidDevice An Android device which must be used with an Android test.
         * 
         * @return builder
         * 
         */
        public Builder androidDevice(AndroidDeviceResponse androidDevice) {
            $.androidDevice = androidDevice;
            return this;
        }

        /**
         * @param iosDevice An iOS device which must be used with an iOS test.
         * 
         * @return builder
         * 
         */
        public Builder iosDevice(IosDeviceResponse iosDevice) {
            $.iosDevice = iosDevice;
            return this;
        }

        public EnvironmentResponse build() {
            $.androidDevice = Objects.requireNonNull($.androidDevice, "expected parameter 'androidDevice' to be non-null");
            $.iosDevice = Objects.requireNonNull($.iosDevice, "expected parameter 'iosDevice' to be non-null");
            return $;
        }
    }

}
