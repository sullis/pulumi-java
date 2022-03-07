// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kafkaconnect.inputs.GetConnectorArgs;
import io.pulumi.awsnative.kafkaconnect.outputs.GetConnectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnector {
    private GetConnector() {}
    public interface BuilderApplicator {
        public void apply(GetConnectorArgs.Builder a);
    }
    private static GetConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::KafkaConnect::Connector
 * 
     */
    public static CompletableFuture<GetConnectorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::KafkaConnect::Connector
     * 
     */
    public static CompletableFuture<GetConnectorResult> invokeAsync(GetConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kafkaconnect:getConnector", TypeShape.of(GetConnectorResult.class), args == null ? GetConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}