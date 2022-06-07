// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkInterfacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacePlainArgs Empty = new GetNetworkInterfacePlainArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the network interface.
     * 
     */
    @Import(name="networkInterfaceName", required=true)
    private String networkInterfaceName;

    /**
     * @return The name of the network interface.
     * 
     */
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkInterfacePlainArgs() {}

    private GetNetworkInterfacePlainArgs(GetNetworkInterfacePlainArgs $) {
        this.expand = $.expand;
        this.networkInterfaceName = $.networkInterfaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfacePlainArgs $;

        public Builder() {
            $ = new GetNetworkInterfacePlainArgs();
        }

        public Builder(GetNetworkInterfacePlainArgs defaults) {
            $ = new GetNetworkInterfacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param networkInterfaceName The name of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            $.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNetworkInterfacePlainArgs build() {
            $.networkInterfaceName = Objects.requireNonNull($.networkInterfaceName, "expected parameter 'networkInterfaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
