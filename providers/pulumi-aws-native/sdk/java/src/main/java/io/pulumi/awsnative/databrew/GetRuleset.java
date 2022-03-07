// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.inputs.GetRulesetArgs;
import io.pulumi.awsnative.databrew.outputs.GetRulesetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRuleset {
    private GetRuleset() {}
    public interface BuilderApplicator {
        public void apply(GetRulesetArgs.Builder a);
    }
    private static GetRulesetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRulesetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::DataBrew::Ruleset.
 * 
     */
    public static CompletableFuture<GetRulesetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::DataBrew::Ruleset.
     * 
     */
    public static CompletableFuture<GetRulesetResult> invokeAsync(GetRulesetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:databrew:getRuleset", TypeShape.of(GetRulesetResult.class), args == null ? GetRulesetArgs.Empty : args, Utilities.withVersion(options));
    }
}