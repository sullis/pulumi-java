// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableArgs Empty = new GetTableArgs();

    /**
     * The ID of a table&#39;s compartment. When a table is identified by name, the compartmentId is often needed to provide context for interpreting the name.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The ID of a table&#39;s compartment. When a table is identified by name, the compartmentId is often needed to provide context for interpreting the name.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A table name within the compartment, or a table OCID.
     * 
     */
    @Import(name="tableNameOrId", required=true)
    private Output<String> tableNameOrId;

    /**
     * @return A table name within the compartment, or a table OCID.
     * 
     */
    public Output<String> tableNameOrId() {
        return this.tableNameOrId;
    }

    private GetTableArgs() {}

    private GetTableArgs(GetTableArgs $) {
        this.compartmentId = $.compartmentId;
        this.tableNameOrId = $.tableNameOrId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableArgs $;

        public Builder() {
            $ = new GetTableArgs();
        }

        public Builder(GetTableArgs defaults) {
            $ = new GetTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of a table&#39;s compartment. When a table is identified by name, the compartmentId is often needed to provide context for interpreting the name.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The ID of a table&#39;s compartment. When a table is identified by name, the compartmentId is often needed to provide context for interpreting the name.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param tableNameOrId A table name within the compartment, or a table OCID.
         * 
         * @return builder
         * 
         */
        public Builder tableNameOrId(Output<String> tableNameOrId) {
            $.tableNameOrId = tableNameOrId;
            return this;
        }

        /**
         * @param tableNameOrId A table name within the compartment, or a table OCID.
         * 
         * @return builder
         * 
         */
        public Builder tableNameOrId(String tableNameOrId) {
            return tableNameOrId(Output.of(tableNameOrId));
        }

        public GetTableArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.tableNameOrId = Objects.requireNonNull($.tableNameOrId, "expected parameter 'tableNameOrId' to be non-null");
            return $;
        }
    }

}
