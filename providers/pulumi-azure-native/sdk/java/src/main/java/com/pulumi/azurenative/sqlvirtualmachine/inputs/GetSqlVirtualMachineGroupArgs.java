// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlVirtualMachineGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlVirtualMachineGroupArgs Empty = new GetSqlVirtualMachineGroupArgs();

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL virtual machine group.
     * 
     */
    @Import(name="sqlVirtualMachineGroupName", required=true)
    private String sqlVirtualMachineGroupName;

    /**
     * @return Name of the SQL virtual machine group.
     * 
     */
    public String sqlVirtualMachineGroupName() {
        return this.sqlVirtualMachineGroupName;
    }

    private GetSqlVirtualMachineGroupArgs() {}

    private GetSqlVirtualMachineGroupArgs(GetSqlVirtualMachineGroupArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sqlVirtualMachineGroupName = $.sqlVirtualMachineGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlVirtualMachineGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlVirtualMachineGroupArgs $;

        public Builder() {
            $ = new GetSqlVirtualMachineGroupArgs();
        }

        public Builder(GetSqlVirtualMachineGroupArgs defaults) {
            $ = new GetSqlVirtualMachineGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
         * 
         * @return builder
         * 
         */
        public Builder sqlVirtualMachineGroupName(String sqlVirtualMachineGroupName) {
            $.sqlVirtualMachineGroupName = sqlVirtualMachineGroupName;
            return this;
        }

        public GetSqlVirtualMachineGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlVirtualMachineGroupName = Objects.requireNonNull($.sqlVirtualMachineGroupName, "expected parameter 'sqlVirtualMachineGroupName' to be non-null");
            return $;
        }
    }

}
