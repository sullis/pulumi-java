// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ses.inputs.GetContactListArgs;
import io.pulumi.awsnative.ses.outputs.GetContactListResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContactList {
/**
 * Resource schema for AWS::SES::ContactList.
 * 
 */
    public static CompletableFuture<GetContactListResult> invokeAsync(GetContactListArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getContactList", TypeShape.of(GetContactListResult.class), args == null ? GetContactListArgs.Empty : args, Utilities.withVersion(options));
    }
}
