// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.configuration.inputs.GetOrganizationConformancePackArgs;
import io.pulumi.awsnative.configuration.outputs.GetOrganizationConformancePackResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationConformancePack {
    public static CompletableFuture<GetOrganizationConformancePackResult> invokeAsync(GetOrganizationConformancePackArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:configuration:getOrganizationConformancePack", TypeShape.of(GetOrganizationConformancePackResult.class), args == null ? GetOrganizationConformancePackArgs.Empty : args, Utilities.withVersion(options));
    }
}
