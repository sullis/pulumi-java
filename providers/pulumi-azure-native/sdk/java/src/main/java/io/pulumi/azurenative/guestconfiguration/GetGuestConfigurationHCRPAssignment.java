// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.guestconfiguration.inputs.GetGuestConfigurationHCRPAssignmentArgs;
import io.pulumi.azurenative.guestconfiguration.outputs.GetGuestConfigurationHCRPAssignmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGuestConfigurationHCRPAssignment {
    private GetGuestConfigurationHCRPAssignment() {}
    public interface BuilderApplicator {
        public void apply(GetGuestConfigurationHCRPAssignmentArgs.Builder a);
    }
    private static GetGuestConfigurationHCRPAssignmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGuestConfigurationHCRPAssignmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Guest configuration assignment is an association between a machine and guest configuration.
 * API Version: 2020-06-25.
 * 
     *
     * Guest configuration assignment is an association between a machine and guest configuration.
 * 
     */
    public static CompletableFuture<GetGuestConfigurationHCRPAssignmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Guest configuration assignment is an association between a machine and guest configuration.
     * API Version: 2020-06-25.
     * 
     *
         * Guest configuration assignment is an association between a machine and guest configuration.
     * 
     */
    public static CompletableFuture<GetGuestConfigurationHCRPAssignmentResult> invokeAsync(GetGuestConfigurationHCRPAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:guestconfiguration:getGuestConfigurationHCRPAssignment", TypeShape.of(GetGuestConfigurationHCRPAssignmentResult.class), args == null ? GetGuestConfigurationHCRPAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}