// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.confidentialledger.inputs.GetLedgerArgs;
import io.pulumi.azurenative.confidentialledger.outputs.GetLedgerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLedger {
    private GetLedger() {}
    public interface BuilderApplicator {
        public void apply(GetLedgerArgs.Builder a);
    }
    private static GetLedgerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLedgerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
 * API Version: 2020-12-01-preview.
 * 
     *
     * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
 * 
     */
    public static CompletableFuture<GetLedgerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
     * API Version: 2020-12-01-preview.
     * 
     *
         * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
     * 
     */
    public static CompletableFuture<GetLedgerResult> invokeAsync(GetLedgerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:confidentialledger:getLedger", TypeShape.of(GetLedgerResult.class), args == null ? GetLedgerArgs.Empty : args, Utilities.withVersion(options));
    }
}