// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWirelessDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWirelessDeviceArgs Empty = new GetWirelessDeviceArgs();

    /**
     * Wireless device Id. Returned after successful create.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Wireless device Id. Returned after successful create.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetWirelessDeviceArgs() {}

    private GetWirelessDeviceArgs(GetWirelessDeviceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWirelessDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWirelessDeviceArgs $;

        public Builder() {
            $ = new GetWirelessDeviceArgs();
        }

        public Builder(GetWirelessDeviceArgs defaults) {
            $ = new GetWirelessDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Wireless device Id. Returned after successful create.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Wireless device Id. Returned after successful create.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetWirelessDeviceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
