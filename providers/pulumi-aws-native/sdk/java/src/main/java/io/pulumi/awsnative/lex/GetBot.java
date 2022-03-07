// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lex.inputs.GetBotArgs;
import io.pulumi.awsnative.lex.outputs.GetBotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBot {
    private GetBot() {}
    public interface BuilderApplicator {
        public void apply(GetBotArgs.Builder a);
    }
    private static GetBotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Amazon Lex conversational bot performing automated tasks such as ordering a pizza, booking a hotel, and so on.
 * 
     */
    public static CompletableFuture<GetBotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Amazon Lex conversational bot performing automated tasks such as ordering a pizza, booking a hotel, and so on.
     * 
     */
    public static CompletableFuture<GetBotResult> invokeAsync(GetBotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lex:getBot", TypeShape.of(GetBotResult.class), args == null ? GetBotArgs.Empty : args, Utilities.withVersion(options));
    }
}