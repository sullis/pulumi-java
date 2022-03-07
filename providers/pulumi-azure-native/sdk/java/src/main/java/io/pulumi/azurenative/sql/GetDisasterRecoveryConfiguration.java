// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDisasterRecoveryConfigurationArgs;
import io.pulumi.azurenative.sql.outputs.GetDisasterRecoveryConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDisasterRecoveryConfiguration {
    private GetDisasterRecoveryConfiguration() {}
    public interface BuilderApplicator {
        public void apply(GetDisasterRecoveryConfigurationArgs.Builder a);
    }
    private static GetDisasterRecoveryConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDisasterRecoveryConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents a disaster recovery configuration.
 * API Version: 2014-04-01.
 * 
     *
     * Represents a disaster recovery configuration.
 * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigurationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents a disaster recovery configuration.
     * API Version: 2014-04-01.
     * 
     *
         * Represents a disaster recovery configuration.
     * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigurationResult> invokeAsync(GetDisasterRecoveryConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDisasterRecoveryConfiguration", TypeShape.of(GetDisasterRecoveryConfigurationResult.class), args == null ? GetDisasterRecoveryConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}