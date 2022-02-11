// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.auditmanager.inputs.GetAssessmentArgs;
import io.pulumi.awsnative.auditmanager.outputs.GetAssessmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAssessment {
    public static CompletableFuture<GetAssessmentResult> invokeAsync(GetAssessmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:auditmanager:getAssessment", TypeShape.of(GetAssessmentResult.class), args == null ? GetAssessmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
