// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetAwsCloudTrailDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetAwsCloudTrailDataConnectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAwsCloudTrailDataConnector {
    private GetAwsCloudTrailDataConnector() {}
    public interface BuilderApplicator {
        public void apply(GetAwsCloudTrailDataConnectorArgs.Builder a);
    }
    private static GetAwsCloudTrailDataConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAwsCloudTrailDataConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents Amazon Web Services CloudTrail data connector.
 * API Version: 2020-01-01.
 * 
     *
     * Represents Amazon Web Services CloudTrail data connector.
 * 
     */
    public static CompletableFuture<GetAwsCloudTrailDataConnectorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents Amazon Web Services CloudTrail data connector.
     * API Version: 2020-01-01.
     * 
     *
         * Represents Amazon Web Services CloudTrail data connector.
     * 
     */
    public static CompletableFuture<GetAwsCloudTrailDataConnectorResult> invokeAsync(GetAwsCloudTrailDataConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getAwsCloudTrailDataConnector", TypeShape.of(GetAwsCloudTrailDataConnectorResult.class), args == null ? GetAwsCloudTrailDataConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}