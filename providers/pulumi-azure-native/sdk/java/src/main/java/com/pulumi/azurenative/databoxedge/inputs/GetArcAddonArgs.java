// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetArcAddonArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetArcAddonArgs Empty = new GetArcAddonArgs();

    /**
     * The addon name.
     * 
     */
    @Import(name="addonName", required=true)
    private Output<String> addonName;

    /**
     * @return The addon name.
     * 
     */
    public Output<String> addonName() {
        return this.addonName;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return The role name.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private GetArcAddonArgs() {}

    private GetArcAddonArgs(GetArcAddonArgs $) {
        this.addonName = $.addonName;
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetArcAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetArcAddonArgs $;

        public Builder() {
            $ = new GetArcAddonArgs();
        }

        public Builder(GetArcAddonArgs defaults) {
            $ = new GetArcAddonArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addonName The addon name.
         * 
         * @return builder
         * 
         */
        public Builder addonName(Output<String> addonName) {
            $.addonName = addonName;
            return this;
        }

        /**
         * @param addonName The addon name.
         * 
         * @return builder
         * 
         */
        public Builder addonName(String addonName) {
            return addonName(Output.of(addonName));
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roleName The role name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The role name.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public GetArcAddonArgs build() {
            $.addonName = Objects.requireNonNull($.addonName, "expected parameter 'addonName' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.roleName = Objects.requireNonNull($.roleName, "expected parameter 'roleName' to be non-null");
            return $;
        }
    }

}
