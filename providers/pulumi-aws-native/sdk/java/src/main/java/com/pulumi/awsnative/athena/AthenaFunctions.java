// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.athena.inputs.GetDataCatalogArgs;
import com.pulumi.awsnative.athena.inputs.GetDataCatalogPlainArgs;
import com.pulumi.awsnative.athena.inputs.GetNamedQueryArgs;
import com.pulumi.awsnative.athena.inputs.GetNamedQueryPlainArgs;
import com.pulumi.awsnative.athena.inputs.GetPreparedStatementArgs;
import com.pulumi.awsnative.athena.inputs.GetPreparedStatementPlainArgs;
import com.pulumi.awsnative.athena.inputs.GetWorkGroupArgs;
import com.pulumi.awsnative.athena.inputs.GetWorkGroupPlainArgs;
import com.pulumi.awsnative.athena.outputs.GetDataCatalogResult;
import com.pulumi.awsnative.athena.outputs.GetNamedQueryResult;
import com.pulumi.awsnative.athena.outputs.GetPreparedStatementResult;
import com.pulumi.awsnative.athena.outputs.GetWorkGroupResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AthenaFunctions {
    /**
     * Resource schema for AWS::Athena::DataCatalog
     * 
     */
    public static Output<GetDataCatalogResult> getDataCatalog(GetDataCatalogArgs args) {
        return getDataCatalog(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::DataCatalog
     * 
     */
    public static CompletableFuture<GetDataCatalogResult> getDataCatalogPlain(GetDataCatalogPlainArgs args) {
        return getDataCatalogPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::DataCatalog
     * 
     */
    public static Output<GetDataCatalogResult> getDataCatalog(GetDataCatalogArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:athena:getDataCatalog", TypeShape.of(GetDataCatalogResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::DataCatalog
     * 
     */
    public static CompletableFuture<GetDataCatalogResult> getDataCatalogPlain(GetDataCatalogPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getDataCatalog", TypeShape.of(GetDataCatalogResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::NamedQuery
     * 
     */
    public static Output<GetNamedQueryResult> getNamedQuery(GetNamedQueryArgs args) {
        return getNamedQuery(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::NamedQuery
     * 
     */
    public static CompletableFuture<GetNamedQueryResult> getNamedQueryPlain(GetNamedQueryPlainArgs args) {
        return getNamedQueryPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::NamedQuery
     * 
     */
    public static Output<GetNamedQueryResult> getNamedQuery(GetNamedQueryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:athena:getNamedQuery", TypeShape.of(GetNamedQueryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::NamedQuery
     * 
     */
    public static CompletableFuture<GetNamedQueryResult> getNamedQueryPlain(GetNamedQueryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getNamedQuery", TypeShape.of(GetNamedQueryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::PreparedStatement
     * 
     */
    public static Output<GetPreparedStatementResult> getPreparedStatement(GetPreparedStatementArgs args) {
        return getPreparedStatement(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::PreparedStatement
     * 
     */
    public static CompletableFuture<GetPreparedStatementResult> getPreparedStatementPlain(GetPreparedStatementPlainArgs args) {
        return getPreparedStatementPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::PreparedStatement
     * 
     */
    public static Output<GetPreparedStatementResult> getPreparedStatement(GetPreparedStatementArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:athena:getPreparedStatement", TypeShape.of(GetPreparedStatementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::PreparedStatement
     * 
     */
    public static CompletableFuture<GetPreparedStatementResult> getPreparedStatementPlain(GetPreparedStatementPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getPreparedStatement", TypeShape.of(GetPreparedStatementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::WorkGroup
     * 
     */
    public static Output<GetWorkGroupResult> getWorkGroup(GetWorkGroupArgs args) {
        return getWorkGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::WorkGroup
     * 
     */
    public static CompletableFuture<GetWorkGroupResult> getWorkGroupPlain(GetWorkGroupPlainArgs args) {
        return getWorkGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Athena::WorkGroup
     * 
     */
    public static Output<GetWorkGroupResult> getWorkGroup(GetWorkGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:athena:getWorkGroup", TypeShape.of(GetWorkGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Athena::WorkGroup
     * 
     */
    public static CompletableFuture<GetWorkGroupResult> getWorkGroupPlain(GetWorkGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getWorkGroup", TypeShape.of(GetWorkGroupResult.class), args, Utilities.withVersion(options));
    }
}
