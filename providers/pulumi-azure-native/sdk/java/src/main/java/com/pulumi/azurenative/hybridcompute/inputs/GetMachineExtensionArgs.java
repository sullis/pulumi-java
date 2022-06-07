// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMachineExtensionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineExtensionArgs Empty = new GetMachineExtensionArgs();

    /**
     * The name of the machine extension.
     * 
     */
    @Import(name="extensionName", required=true)
    private Output<String> extensionName;

    /**
     * @return The name of the machine extension.
     * 
     */
    public Output<String> extensionName() {
        return this.extensionName;
    }

    /**
     * The name of the machine containing the extension.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the machine containing the extension.
     * 
     */
    public Output<String> name() {
        return this.name;
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

    private GetMachineExtensionArgs() {}

    private GetMachineExtensionArgs(GetMachineExtensionArgs $) {
        this.extensionName = $.extensionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineExtensionArgs $;

        public Builder() {
            $ = new GetMachineExtensionArgs();
        }

        public Builder(GetMachineExtensionArgs defaults) {
            $ = new GetMachineExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensionName The name of the machine extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionName(Output<String> extensionName) {
            $.extensionName = extensionName;
            return this;
        }

        /**
         * @param extensionName The name of the machine extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionName(String extensionName) {
            return extensionName(Output.of(extensionName));
        }

        /**
         * @param name The name of the machine containing the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the machine containing the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public GetMachineExtensionArgs build() {
            $.extensionName = Objects.requireNonNull($.extensionName, "expected parameter 'extensionName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
