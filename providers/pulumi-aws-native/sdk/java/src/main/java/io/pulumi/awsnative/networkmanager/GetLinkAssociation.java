// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.inputs.GetLinkAssociationArgs;
import io.pulumi.awsnative.networkmanager.outputs.GetLinkAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLinkAssociation {
/**
 * The AWS::NetworkManager::LinkAssociation type associates a link to a device. The device and link must be in the same global network and the same site.
 * 
 */
    public static CompletableFuture<GetLinkAssociationResult> invokeAsync(GetLinkAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkmanager:getLinkAssociation", TypeShape.of(GetLinkAssociationResult.class), args == null ? GetLinkAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
