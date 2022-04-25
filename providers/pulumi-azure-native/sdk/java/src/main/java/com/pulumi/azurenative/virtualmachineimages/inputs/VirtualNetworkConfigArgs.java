// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Network configuration.
 * 
 */
public final class VirtualNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkConfigArgs Empty = new VirtualNetworkConfigArgs();

    /**
     * Resource id of a pre-existing subnet.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return Resource id of a pre-existing subnet.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private VirtualNetworkConfigArgs() {}

    private VirtualNetworkConfigArgs(VirtualNetworkConfigArgs $) {
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkConfigArgs $;

        public Builder() {
            $ = new VirtualNetworkConfigArgs();
        }

        public Builder(VirtualNetworkConfigArgs defaults) {
            $ = new VirtualNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetId Resource id of a pre-existing subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId Resource id of a pre-existing subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public VirtualNetworkConfigArgs build() {
            return $;
        }
    }

}
