// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.azurenative.powerplatform.inputs.SubnetPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning the virtual network.
 * 
 */
public final class VirtualNetworkPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPropertiesResponse Empty = new VirtualNetworkPropertiesResponse();

    /**
     * Uri of the virtual network.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Uri of the virtual network.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Properties of a subnet.
     * 
     */
    @Import(name="subnet")
    private @Nullable SubnetPropertiesResponse subnet;

    /**
     * @return Properties of a subnet.
     * 
     */
    public Optional<SubnetPropertiesResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private VirtualNetworkPropertiesResponse() {}

    private VirtualNetworkPropertiesResponse(VirtualNetworkPropertiesResponse $) {
        this.id = $.id;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkPropertiesResponse $;

        public Builder() {
            $ = new VirtualNetworkPropertiesResponse();
        }

        public Builder(VirtualNetworkPropertiesResponse defaults) {
            $ = new VirtualNetworkPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Uri of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param subnet Properties of a subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable SubnetPropertiesResponse subnet) {
            $.subnet = subnet;
            return this;
        }

        public VirtualNetworkPropertiesResponse build() {
            return $;
        }
    }

}
