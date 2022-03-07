// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53.inputs.GetDNSSECArgs;
import io.pulumi.awsnative.route53.outputs.GetDNSSECResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDNSSEC {
    private GetDNSSEC() {}
    public interface BuilderApplicator {
        public void apply(GetDNSSECArgs.Builder a);
    }
    private static GetDNSSECArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDNSSECArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
 * 
     */
    public static CompletableFuture<GetDNSSECResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
     * 
     */
    public static CompletableFuture<GetDNSSECResult> invokeAsync(GetDNSSECArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53:getDNSSEC", TypeShape.of(GetDNSSECResult.class), args == null ? GetDNSSECArgs.Empty : args, Utilities.withVersion(options));
    }
}