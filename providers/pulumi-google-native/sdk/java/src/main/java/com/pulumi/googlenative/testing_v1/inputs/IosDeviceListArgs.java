// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.IosDeviceArgs;
import java.util.List;
import java.util.Objects;


/**
 * A list of iOS device configurations in which the test is to be executed.
 * 
 */
public final class IosDeviceListArgs extends com.pulumi.resources.ResourceArgs {

    public static final IosDeviceListArgs Empty = new IosDeviceListArgs();

    /**
     * A list of iOS devices.
     * 
     */
    @Import(name="iosDevices", required=true)
    private Output<List<IosDeviceArgs>> iosDevices;

    /**
     * @return A list of iOS devices.
     * 
     */
    public Output<List<IosDeviceArgs>> iosDevices() {
        return this.iosDevices;
    }

    private IosDeviceListArgs() {}

    private IosDeviceListArgs(IosDeviceListArgs $) {
        this.iosDevices = $.iosDevices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosDeviceListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosDeviceListArgs $;

        public Builder() {
            $ = new IosDeviceListArgs();
        }

        public Builder(IosDeviceListArgs defaults) {
            $ = new IosDeviceListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iosDevices A list of iOS devices.
         * 
         * @return builder
         * 
         */
        public Builder iosDevices(Output<List<IosDeviceArgs>> iosDevices) {
            $.iosDevices = iosDevices;
            return this;
        }

        /**
         * @param iosDevices A list of iOS devices.
         * 
         * @return builder
         * 
         */
        public Builder iosDevices(List<IosDeviceArgs> iosDevices) {
            return iosDevices(Output.of(iosDevices));
        }

        /**
         * @param iosDevices A list of iOS devices.
         * 
         * @return builder
         * 
         */
        public Builder iosDevices(IosDeviceArgs... iosDevices) {
            return iosDevices(List.of(iosDevices));
        }

        public IosDeviceListArgs build() {
            $.iosDevices = Objects.requireNonNull($.iosDevices, "expected parameter 'iosDevices' to be non-null");
            return $;
        }
    }

}
