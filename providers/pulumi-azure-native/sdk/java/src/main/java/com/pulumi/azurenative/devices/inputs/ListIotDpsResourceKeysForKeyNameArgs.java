// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListIotDpsResourceKeysForKeyNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIotDpsResourceKeysForKeyNameArgs Empty = new ListIotDpsResourceKeysForKeyNameArgs();

    /**
     * Logical key name to get key-values for.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return Logical key name to get key-values for.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * Name of the provisioning service.
     * 
     */
    @Import(name="provisioningServiceName", required=true)
    private Output<String> provisioningServiceName;

    /**
     * @return Name of the provisioning service.
     * 
     */
    public Output<String> provisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * The name of the resource group that contains the provisioning service.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the provisioning service.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListIotDpsResourceKeysForKeyNameArgs() {}

    private ListIotDpsResourceKeysForKeyNameArgs(ListIotDpsResourceKeysForKeyNameArgs $) {
        this.keyName = $.keyName;
        this.provisioningServiceName = $.provisioningServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIotDpsResourceKeysForKeyNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIotDpsResourceKeysForKeyNameArgs $;

        public Builder() {
            $ = new ListIotDpsResourceKeysForKeyNameArgs();
        }

        public Builder(ListIotDpsResourceKeysForKeyNameArgs defaults) {
            $ = new ListIotDpsResourceKeysForKeyNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName Logical key name to get key-values for.
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName Logical key name to get key-values for.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param provisioningServiceName Name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningServiceName(Output<String> provisioningServiceName) {
            $.provisioningServiceName = provisioningServiceName;
            return this;
        }

        /**
         * @param provisioningServiceName Name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningServiceName(String provisioningServiceName) {
            return provisioningServiceName(Output.of(provisioningServiceName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListIotDpsResourceKeysForKeyNameArgs build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.provisioningServiceName = Objects.requireNonNull($.provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
