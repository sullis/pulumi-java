// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GetNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.GetNoteResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNote {
    private GetNote() {}
    public interface BuilderApplicator {
        public void apply(GetNoteArgs.Builder a);
    }
    private static GetNoteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNoteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the specified note.
 * 
     */
    public static CompletableFuture<GetNoteResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the specified note.
     * 
     */
    public static CompletableFuture<GetNoteResult> invokeAsync(GetNoteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1beta1:getNote", TypeShape.of(GetNoteResult.class), args == null ? GetNoteArgs.Empty : args, Utilities.withVersion(options));
    }
}