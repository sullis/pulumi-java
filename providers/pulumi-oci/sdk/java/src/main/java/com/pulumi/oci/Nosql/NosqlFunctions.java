// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Nosql.inputs.GetIndexArgs;
import com.pulumi.oci.Nosql.inputs.GetIndexPlainArgs;
import com.pulumi.oci.Nosql.inputs.GetIndexesArgs;
import com.pulumi.oci.Nosql.inputs.GetIndexesPlainArgs;
import com.pulumi.oci.Nosql.inputs.GetTableArgs;
import com.pulumi.oci.Nosql.inputs.GetTablePlainArgs;
import com.pulumi.oci.Nosql.inputs.GetTablesArgs;
import com.pulumi.oci.Nosql.inputs.GetTablesPlainArgs;
import com.pulumi.oci.Nosql.outputs.GetIndexResult;
import com.pulumi.oci.Nosql.outputs.GetIndexesResult;
import com.pulumi.oci.Nosql.outputs.GetTableResult;
import com.pulumi.oci.Nosql.outputs.GetTablesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class NosqlFunctions {
    /**
     * This data source provides details about a specific Index resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get information about a single index.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Index resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get information about a single index.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args) {
        return getIndexPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Index resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get information about a single index.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Nosql/getIndex:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Index resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get information about a single index.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndexPlain(GetIndexPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Nosql/getIndex:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Indexes in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of indexes on a table.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetIndexesResult> getIndexes(GetIndexesArgs args) {
        return getIndexes(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Indexes in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of indexes on a table.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIndexesResult> getIndexesPlain(GetIndexesPlainArgs args) {
        return getIndexesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Indexes in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of indexes on a table.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetIndexesResult> getIndexes(GetIndexesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Nosql/getIndexes:getIndexes", TypeShape.of(GetIndexesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Indexes in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of indexes on a table.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIndexesResult> getIndexesPlain(GetIndexesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Nosql/getIndexes:getIndexes", TypeShape.of(GetIndexesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Table resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get table info by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetTableResult> getTable(GetTableArgs args) {
        return getTable(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Table resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get table info by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTableResult> getTablePlain(GetTablePlainArgs args) {
        return getTablePlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Table resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get table info by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetTableResult> getTable(GetTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Nosql/getTable:getTable", TypeShape.of(GetTableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Table resource in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get table info by identifier.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTableResult> getTablePlain(GetTablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Nosql/getTable:getTable", TypeShape.of(GetTableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Tables in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of tables in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetTablesResult> getTables(GetTablesArgs args) {
        return getTables(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Tables in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of tables in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTablesResult> getTablesPlain(GetTablesPlainArgs args) {
        return getTablesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Tables in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of tables in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetTablesResult> getTables(GetTablesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Nosql/getTables:getTables", TypeShape.of(GetTablesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Tables in Oracle Cloud Infrastructure NoSQL Database service.
     * 
     * Get a list of tables in a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetTablesResult> getTablesPlain(GetTablesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Nosql/getTables:getTables", TypeShape.of(GetTablesResult.class), args, Utilities.withVersion(options));
    }
}
