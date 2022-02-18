// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.servicecatalogappregistry.inputs.GetResourceAssociationArgs;
import io.pulumi.awsnative.servicecatalogappregistry.outputs.GetResourceAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceAssociation {
/**
 * Resource Schema for AWS::ServiceCatalogAppRegistry::ResourceAssociation
 * 
 */
    public static CompletableFuture<GetResourceAssociationResult> invokeAsync(GetResourceAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getResourceAssociation", TypeShape.of(GetResourceAssociationResult.class), args == null ? GetResourceAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
