// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.serviceAccount.inputs.GetAccountKeyArgs;
import io.pulumi.gcp.serviceAccount.outputs.GetAccountKeyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccountKey {
    private GetAccountKey() {}
    public interface BuilderApplicator {
        public void apply(GetAccountKeyArgs.Builder a);
    }
    private static GetAccountKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccountKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getAccountKey.
 * 
     *
     * A collection of values returned by getAccountKey.
 * 
     */
    public static CompletableFuture<GetAccountKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getAccountKey.
     * 
     *
         * A collection of values returned by getAccountKey.
     * 
     */
    public static CompletableFuture<GetAccountKeyResult> invokeAsync(GetAccountKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:serviceAccount/getAccountKey:getAccountKey", TypeShape.of(GetAccountKeyResult.class), args == null ? GetAccountKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}