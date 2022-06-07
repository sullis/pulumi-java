// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDpsSharedAccessPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDpsSharedAccessPolicyArgs Empty = new GetDpsSharedAccessPolicyArgs();

    /**
     * Specifies the name of the IoT Hub Device Provisioning service to which the Shared Access Policy belongs.
     * 
     */
    @Import(name="iothubDpsName", required=true)
    private Output<String> iothubDpsName;

    /**
     * @return Specifies the name of the IoT Hub Device Provisioning service to which the Shared Access Policy belongs.
     * 
     */
    public Output<String> iothubDpsName() {
        return this.iothubDpsName;
    }

    /**
     * Specifies the name of the IotHub Shared Access Policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the IotHub Shared Access Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group under which the IotHub Shared Access Policy resource exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group under which the IotHub Shared Access Policy resource exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDpsSharedAccessPolicyArgs() {}

    private GetDpsSharedAccessPolicyArgs(GetDpsSharedAccessPolicyArgs $) {
        this.iothubDpsName = $.iothubDpsName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDpsSharedAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDpsSharedAccessPolicyArgs $;

        public Builder() {
            $ = new GetDpsSharedAccessPolicyArgs();
        }

        public Builder(GetDpsSharedAccessPolicyArgs defaults) {
            $ = new GetDpsSharedAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iothubDpsName Specifies the name of the IoT Hub Device Provisioning service to which the Shared Access Policy belongs.
         * 
         * @return builder
         * 
         */
        public Builder iothubDpsName(Output<String> iothubDpsName) {
            $.iothubDpsName = iothubDpsName;
            return this;
        }

        /**
         * @param iothubDpsName Specifies the name of the IoT Hub Device Provisioning service to which the Shared Access Policy belongs.
         * 
         * @return builder
         * 
         */
        public Builder iothubDpsName(String iothubDpsName) {
            return iothubDpsName(Output.of(iothubDpsName));
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group under which the IotHub Shared Access Policy resource exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group under which the IotHub Shared Access Policy resource exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetDpsSharedAccessPolicyArgs build() {
            $.iothubDpsName = Objects.requireNonNull($.iothubDpsName, "expected parameter 'iothubDpsName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
