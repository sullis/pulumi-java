// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetContentKeyPolicyPropertiesWithSecretsArgs;
import io.pulumi.azurenative.media.outputs.GetContentKeyPolicyPropertiesWithSecretsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContentKeyPolicyPropertiesWithSecrets {
    private GetContentKeyPolicyPropertiesWithSecrets() {}
    public interface BuilderApplicator {
        public void apply(GetContentKeyPolicyPropertiesWithSecretsArgs.Builder a);
    }
    private static GetContentKeyPolicyPropertiesWithSecretsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContentKeyPolicyPropertiesWithSecretsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The properties of the Content Key Policy.
 * API Version: 2020-05-01.
 * 
     *
     * The properties of the Content Key Policy.
 * 
     */
    public static CompletableFuture<GetContentKeyPolicyPropertiesWithSecretsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The properties of the Content Key Policy.
     * API Version: 2020-05-01.
     * 
     *
         * The properties of the Content Key Policy.
     * 
     */
    public static CompletableFuture<GetContentKeyPolicyPropertiesWithSecretsResult> invokeAsync(GetContentKeyPolicyPropertiesWithSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getContentKeyPolicyPropertiesWithSecrets", TypeShape.of(GetContentKeyPolicyPropertiesWithSecretsResult.class), args == null ? GetContentKeyPolicyPropertiesWithSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}