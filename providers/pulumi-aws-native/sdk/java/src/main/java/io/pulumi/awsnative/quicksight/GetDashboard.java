// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.inputs.GetDashboardArgs;
import io.pulumi.awsnative.quicksight.outputs.GetDashboardResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDashboard {
    private GetDashboard() {}
    public interface BuilderApplicator {
        public void apply(GetDashboardArgs.Builder a);
    }
    private static GetDashboardArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDashboardArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Definition of the AWS::QuickSight::Dashboard Resource Type.
 * 
     */
    public static CompletableFuture<GetDashboardResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Definition of the AWS::QuickSight::Dashboard Resource Type.
     * 
     */
    public static CompletableFuture<GetDashboardResult> invokeAsync(GetDashboardArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:quicksight:getDashboard", TypeShape.of(GetDashboardResult.class), args == null ? GetDashboardArgs.Empty : args, Utilities.withVersion(options));
    }
}