// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.enterpriseknowledgegraph;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.enterpriseknowledgegraph.inputs.GetEnterpriseKnowledgeGraphArgs;
import com.pulumi.azurenative.enterpriseknowledgegraph.inputs.GetEnterpriseKnowledgeGraphPlainArgs;
import com.pulumi.azurenative.enterpriseknowledgegraph.outputs.GetEnterpriseKnowledgeGraphResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EnterpriseknowledgegraphFunctions {
    /**
     * EnterpriseKnowledgeGraph resource definition
     * API Version: 2018-12-03.
     * 
     */
    public static Output<GetEnterpriseKnowledgeGraphResult> getEnterpriseKnowledgeGraph(GetEnterpriseKnowledgeGraphArgs args) {
        return getEnterpriseKnowledgeGraph(args, InvokeOptions.Empty);
    }
    /**
     * EnterpriseKnowledgeGraph resource definition
     * API Version: 2018-12-03.
     * 
     */
    public static CompletableFuture<GetEnterpriseKnowledgeGraphResult> getEnterpriseKnowledgeGraphPlain(GetEnterpriseKnowledgeGraphPlainArgs args) {
        return getEnterpriseKnowledgeGraphPlain(args, InvokeOptions.Empty);
    }
    /**
     * EnterpriseKnowledgeGraph resource definition
     * API Version: 2018-12-03.
     * 
     */
    public static Output<GetEnterpriseKnowledgeGraphResult> getEnterpriseKnowledgeGraph(GetEnterpriseKnowledgeGraphArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:enterpriseknowledgegraph:getEnterpriseKnowledgeGraph", TypeShape.of(GetEnterpriseKnowledgeGraphResult.class), args, Utilities.withVersion(options));
    }
    /**
     * EnterpriseKnowledgeGraph resource definition
     * API Version: 2018-12-03.
     * 
     */
    public static CompletableFuture<GetEnterpriseKnowledgeGraphResult> getEnterpriseKnowledgeGraphPlain(GetEnterpriseKnowledgeGraphPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:enterpriseknowledgegraph:getEnterpriseKnowledgeGraph", TypeShape.of(GetEnterpriseKnowledgeGraphResult.class), args, Utilities.withVersion(options));
    }
}
