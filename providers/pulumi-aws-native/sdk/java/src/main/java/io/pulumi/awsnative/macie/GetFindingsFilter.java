// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.macie.inputs.GetFindingsFilterArgs;
import io.pulumi.awsnative.macie.outputs.GetFindingsFilterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFindingsFilter {
    private GetFindingsFilter() {}
    public interface BuilderApplicator {
        public void apply(GetFindingsFilterArgs.Builder a);
    }
    private static GetFindingsFilterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFindingsFilterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Macie FindingsFilter resource schema.
 * 
     */
    public static CompletableFuture<GetFindingsFilterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Macie FindingsFilter resource schema.
     * 
     */
    public static CompletableFuture<GetFindingsFilterResult> invokeAsync(GetFindingsFilterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:macie:getFindingsFilter", TypeShape.of(GetFindingsFilterResult.class), args == null ? GetFindingsFilterArgs.Empty : args, Utilities.withVersion(options));
    }
}