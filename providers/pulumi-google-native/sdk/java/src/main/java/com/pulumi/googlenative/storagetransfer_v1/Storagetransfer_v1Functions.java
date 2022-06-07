// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storagetransfer_v1.inputs.GetAgentPoolArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.GetAgentPoolPlainArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.GetTransferJobArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.GetTransferJobPlainArgs;
import com.pulumi.googlenative.storagetransfer_v1.outputs.GetAgentPoolResult;
import com.pulumi.googlenative.storagetransfer_v1.outputs.GetTransferJobResult;
import java.util.concurrent.CompletableFuture;

public final class Storagetransfer_v1Functions {
    /**
     * Gets an agent pool.
     * 
     */
    public static Output<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args) {
        return getAgentPool(args, InvokeOptions.Empty);
    }
    /**
     * Gets an agent pool.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> getAgentPoolPlain(GetAgentPoolPlainArgs args) {
        return getAgentPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets an agent pool.
     * 
     */
    public static Output<GetAgentPoolResult> getAgentPool(GetAgentPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:storagetransfer/v1:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an agent pool.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> getAgentPoolPlain(GetAgentPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a transfer job.
     * 
     */
    public static Output<GetTransferJobResult> getTransferJob(GetTransferJobArgs args) {
        return getTransferJob(args, InvokeOptions.Empty);
    }
    /**
     * Gets a transfer job.
     * 
     */
    public static CompletableFuture<GetTransferJobResult> getTransferJobPlain(GetTransferJobPlainArgs args) {
        return getTransferJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a transfer job.
     * 
     */
    public static Output<GetTransferJobResult> getTransferJob(GetTransferJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:storagetransfer/v1:getTransferJob", TypeShape.of(GetTransferJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a transfer job.
     * 
     */
    public static CompletableFuture<GetTransferJobResult> getTransferJobPlain(GetTransferJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getTransferJob", TypeShape.of(GetTransferJobResult.class), args, Utilities.withVersion(options));
    }
}
