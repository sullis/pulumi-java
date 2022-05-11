// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedHardwareSecurityModuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedHardwareSecurityModuleArgs Empty = new GetManagedHardwareSecurityModuleArgs();

    /**
     * The name of the Key Vault Managed Hardware Security Module.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Key Vault Managed Hardware Security Module.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the Key Vault Managed Hardware Security Module exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Key Vault Managed Hardware Security Module exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedHardwareSecurityModuleArgs() {}

    private GetManagedHardwareSecurityModuleArgs(GetManagedHardwareSecurityModuleArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedHardwareSecurityModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedHardwareSecurityModuleArgs $;

        public Builder() {
            $ = new GetManagedHardwareSecurityModuleArgs();
        }

        public Builder(GetManagedHardwareSecurityModuleArgs defaults) {
            $ = new GetManagedHardwareSecurityModuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Key Vault Managed Hardware Security Module.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Key Vault Managed Hardware Security Module exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedHardwareSecurityModuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
