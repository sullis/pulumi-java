// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListKustoPoolLanguageExtensionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListKustoPoolLanguageExtensionsPlainArgs Empty = new ListKustoPoolLanguageExtensionsPlainArgs();

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private String kustoPoolName;

    /**
     * @return The name of the Kusto pool.
     * 
     */
    public String kustoPoolName() {
        return this.kustoPoolName;
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
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private ListKustoPoolLanguageExtensionsPlainArgs() {}

    private ListKustoPoolLanguageExtensionsPlainArgs(ListKustoPoolLanguageExtensionsPlainArgs $) {
        this.kustoPoolName = $.kustoPoolName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListKustoPoolLanguageExtensionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListKustoPoolLanguageExtensionsPlainArgs $;

        public Builder() {
            $ = new ListKustoPoolLanguageExtensionsPlainArgs();
        }

        public Builder(ListKustoPoolLanguageExtensionsPlainArgs defaults) {
            $ = new ListKustoPoolLanguageExtensionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(String kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
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
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public ListKustoPoolLanguageExtensionsPlainArgs build() {
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
