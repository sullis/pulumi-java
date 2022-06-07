// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostGroupArgs Empty = new GetDedicatedHostGroupArgs();

    /**
     * The expand expression to apply on the operation. The response shows the list of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return The expand expression to apply on the operation. The response shows the list of instance view of the dedicated hosts under the dedicated host group.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the dedicated host group.
     * 
     */
    @Import(name="hostGroupName", required=true)
    private Output<String> hostGroupName;

    /**
     * @return The name of the dedicated host group.
     * 
     */
    public Output<String> hostGroupName() {
        return this.hostGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDedicatedHostGroupArgs() {}

    private GetDedicatedHostGroupArgs(GetDedicatedHostGroupArgs $) {
        this.expand = $.expand;
        this.hostGroupName = $.hostGroupName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostGroupArgs $;

        public Builder() {
            $ = new GetDedicatedHostGroupArgs();
        }

        public Builder(GetDedicatedHostGroupArgs defaults) {
            $ = new GetDedicatedHostGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The expand expression to apply on the operation. The response shows the list of instance view of the dedicated hosts under the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand The expand expression to apply on the operation. The response shows the list of instance view of the dedicated hosts under the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param hostGroupName The name of the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupName(Output<String> hostGroupName) {
            $.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * @param hostGroupName The name of the dedicated host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupName(String hostGroupName) {
            return hostGroupName(Output.of(hostGroupName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetDedicatedHostGroupArgs build() {
            $.hostGroupName = Objects.requireNonNull($.hostGroupName, "expected parameter 'hostGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
