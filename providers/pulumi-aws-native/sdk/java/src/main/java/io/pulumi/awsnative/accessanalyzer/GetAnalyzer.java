// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.accessanalyzer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.accessanalyzer.inputs.GetAnalyzerArgs;
import io.pulumi.awsnative.accessanalyzer.outputs.GetAnalyzerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAnalyzer {
/**
 * The AWS::AccessAnalyzer::Analyzer type specifies an analyzer of the user's account
 * 
 */
    public static CompletableFuture<GetAnalyzerResult> invokeAsync(GetAnalyzerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:accessanalyzer:getAnalyzer", TypeShape.of(GetAnalyzerResult.class), args == null ? GetAnalyzerArgs.Empty : args, Utilities.withVersion(options));
    }
}
