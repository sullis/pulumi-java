// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetApiIssueAttachmentArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetApiIssueAttachmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApiIssueAttachment {
/**
 * Issue Attachment Contract details.
 * API Version: 2020-12-01.
 * 
 *
 * Issue Attachment Contract details.
 * 
 */
    public static CompletableFuture<GetApiIssueAttachmentResult> invokeAsync(GetApiIssueAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getApiIssueAttachment", TypeShape.of(GetApiIssueAttachmentResult.class), args == null ? GetApiIssueAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
