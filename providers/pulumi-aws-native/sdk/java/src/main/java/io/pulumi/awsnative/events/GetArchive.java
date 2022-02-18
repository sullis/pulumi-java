// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.events.inputs.GetArchiveArgs;
import io.pulumi.awsnative.events.outputs.GetArchiveResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetArchive {
/**
 * Resource Type definition for AWS::Events::Archive
 * 
 */
    public static CompletableFuture<GetArchiveResult> invokeAsync(GetArchiveArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:events:getArchive", TypeShape.of(GetArchiveResult.class), args == null ? GetArchiveArgs.Empty : args, Utilities.withVersion(options));
    }
}
