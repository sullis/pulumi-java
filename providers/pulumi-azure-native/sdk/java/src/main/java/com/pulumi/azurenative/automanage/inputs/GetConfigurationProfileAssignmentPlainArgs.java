// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationProfileAssignmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationProfileAssignmentPlainArgs Empty = new GetConfigurationProfileAssignmentPlainArgs();

    /**
     * The configuration profile assignment name.
     * 
     */
    @Import(name="configurationProfileAssignmentName", required=true)
    private String configurationProfileAssignmentName;

    /**
     * @return The configuration profile assignment name.
     * 
     */
    public String configurationProfileAssignmentName() {
        return this.configurationProfileAssignmentName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @Import(name="vmName", required=true)
    private String vmName;

    /**
     * @return The name of the virtual machine.
     * 
     */
    public String vmName() {
        return this.vmName;
    }

    private GetConfigurationProfileAssignmentPlainArgs() {}

    private GetConfigurationProfileAssignmentPlainArgs(GetConfigurationProfileAssignmentPlainArgs $) {
        this.configurationProfileAssignmentName = $.configurationProfileAssignmentName;
        this.resourceGroupName = $.resourceGroupName;
        this.vmName = $.vmName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationProfileAssignmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationProfileAssignmentPlainArgs $;

        public Builder() {
            $ = new GetConfigurationProfileAssignmentPlainArgs();
        }

        public Builder(GetConfigurationProfileAssignmentPlainArgs defaults) {
            $ = new GetConfigurationProfileAssignmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationProfileAssignmentName The configuration profile assignment name.
         * 
         * @return builder
         * 
         */
        public Builder configurationProfileAssignmentName(String configurationProfileAssignmentName) {
            $.configurationProfileAssignmentName = configurationProfileAssignmentName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vmName The name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder vmName(String vmName) {
            $.vmName = vmName;
            return this;
        }

        public GetConfigurationProfileAssignmentPlainArgs build() {
            $.configurationProfileAssignmentName = Objects.requireNonNull($.configurationProfileAssignmentName, "expected parameter 'configurationProfileAssignmentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmName = Objects.requireNonNull($.vmName, "expected parameter 'vmName' to be non-null");
            return $;
        }
    }

}
