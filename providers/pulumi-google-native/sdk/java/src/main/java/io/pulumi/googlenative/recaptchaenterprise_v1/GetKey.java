// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.recaptchaenterprise_v1.inputs.GetKeyArgs;
import io.pulumi.googlenative.recaptchaenterprise_v1.outputs.GetKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKey {
    private GetKey() {}
    public interface BuilderApplicator {
        public void apply(GetKeyArgs.Builder a);
    }
    private static GetKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified key.
 * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified key.
     * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(GetKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:recaptchaenterprise/v1:getKey", TypeShape.of(GetKeyResult.class), args == null ? GetKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}