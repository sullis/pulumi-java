// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.BastionShareableLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBastionShareableLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBastionShareableLinkArgs Empty = new GetBastionShareableLinkArgs();

    /**
     * The name of the Bastion Host.
     * 
     */
    @Import(name="bastionHostName", required=true)
    private Output<String> bastionHostName;

    /**
     * @return The name of the Bastion Host.
     * 
     */
    public Output<String> bastionHostName() {
        return this.bastionHostName;
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

    /**
     * List of VM references.
     * 
     */
    @Import(name="vms")
    private @Nullable Output<List<BastionShareableLinkArgs>> vms;

    /**
     * @return List of VM references.
     * 
     */
    public Optional<Output<List<BastionShareableLinkArgs>>> vms() {
        return Optional.ofNullable(this.vms);
    }

    private GetBastionShareableLinkArgs() {}

    private GetBastionShareableLinkArgs(GetBastionShareableLinkArgs $) {
        this.bastionHostName = $.bastionHostName;
        this.resourceGroupName = $.resourceGroupName;
        this.vms = $.vms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBastionShareableLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBastionShareableLinkArgs $;

        public Builder() {
            $ = new GetBastionShareableLinkArgs();
        }

        public Builder(GetBastionShareableLinkArgs defaults) {
            $ = new GetBastionShareableLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bastionHostName The name of the Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder bastionHostName(Output<String> bastionHostName) {
            $.bastionHostName = bastionHostName;
            return this;
        }

        /**
         * @param bastionHostName The name of the Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder bastionHostName(String bastionHostName) {
            return bastionHostName(Output.of(bastionHostName));
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

        /**
         * @param vms List of VM references.
         * 
         * @return builder
         * 
         */
        public Builder vms(@Nullable Output<List<BastionShareableLinkArgs>> vms) {
            $.vms = vms;
            return this;
        }

        /**
         * @param vms List of VM references.
         * 
         * @return builder
         * 
         */
        public Builder vms(List<BastionShareableLinkArgs> vms) {
            return vms(Output.of(vms));
        }

        /**
         * @param vms List of VM references.
         * 
         * @return builder
         * 
         */
        public Builder vms(BastionShareableLinkArgs... vms) {
            return vms(List.of(vms));
        }

        public GetBastionShareableLinkArgs build() {
            $.bastionHostName = Objects.requireNonNull($.bastionHostName, "expected parameter 'bastionHostName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
