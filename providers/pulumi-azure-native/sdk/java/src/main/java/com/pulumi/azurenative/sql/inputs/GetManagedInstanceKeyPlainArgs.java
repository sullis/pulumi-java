// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedInstanceKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedInstanceKeyPlainArgs Empty = new GetManagedInstanceKeyPlainArgs();

    /**
     * The name of the managed instance key to be retrieved.
     * 
     */
    @Import(name="keyName", required=true)
    private String keyName;

    /**
     * @return The name of the managed instance key to be retrieved.
     * 
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private String managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedInstanceKeyPlainArgs() {}

    private GetManagedInstanceKeyPlainArgs(GetManagedInstanceKeyPlainArgs $) {
        this.keyName = $.keyName;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedInstanceKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedInstanceKeyPlainArgs $;

        public Builder() {
            $ = new GetManagedInstanceKeyPlainArgs();
        }

        public Builder(GetManagedInstanceKeyPlainArgs defaults) {
            $ = new GetManagedInstanceKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of the managed instance key to be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedInstanceKeyPlainArgs build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
