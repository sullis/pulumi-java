// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetManagementGroupDiagnosticSettingArgs;
import io.pulumi.azurenative.insights.outputs.GetManagementGroupDiagnosticSettingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagementGroupDiagnosticSetting {
    private GetManagementGroupDiagnosticSetting() {}
    public interface BuilderApplicator {
        public void apply(GetManagementGroupDiagnosticSettingArgs.Builder a);
    }
    private static GetManagementGroupDiagnosticSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetManagementGroupDiagnosticSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The management group diagnostic setting resource.
 * API Version: 2020-01-01-preview.
 * 
     *
     * The management group diagnostic setting resource.
 * 
     */
    public static CompletableFuture<GetManagementGroupDiagnosticSettingResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The management group diagnostic setting resource.
     * API Version: 2020-01-01-preview.
     * 
     *
         * The management group diagnostic setting resource.
     * 
     */
    public static CompletableFuture<GetManagementGroupDiagnosticSettingResult> invokeAsync(GetManagementGroupDiagnosticSettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getManagementGroupDiagnosticSetting", TypeShape.of(GetManagementGroupDiagnosticSettingResult.class), args == null ? GetManagementGroupDiagnosticSettingArgs.Empty : args, Utilities.withVersion(options));
    }
}