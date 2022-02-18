// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.inputs.GetDataCatalogArgs;
import io.pulumi.awsnative.athena.outputs.GetDataCatalogResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataCatalog {
/**
 * Resource schema for AWS::Athena::DataCatalog
 * 
 */
    public static CompletableFuture<GetDataCatalogResult> invokeAsync(GetDataCatalogArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:athena:getDataCatalog", TypeShape.of(GetDataCatalogResult.class), args == null ? GetDataCatalogArgs.Empty : args, Utilities.withVersion(options));
    }
}
