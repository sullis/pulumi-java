// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.example.Utilities;
import com.pulumi.example.inputs.OverlayArgs;
import com.pulumi.example.inputs.OverlayPlainArgs;
import com.pulumi.example.outputs.OverlayResult;
import java.util.concurrent.CompletableFuture;

public final class ExampleFunctions {
    public static Output<OverlayResult> overlay() {
        return overlay(OverlayArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<OverlayResult> overlayPlain() {
        return overlayPlain(OverlayPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<OverlayResult> overlay(OverlayArgs args) {
        return overlay(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<OverlayResult> overlayPlain(OverlayPlainArgs args) {
        return overlayPlain(args, InvokeOptions.Empty);
    }
    public static Output<OverlayResult> overlay(OverlayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("example::overlay", TypeShape.of(OverlayResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<OverlayResult> overlayPlain(OverlayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("example::overlay", TypeShape.of(OverlayResult.class), args, Utilities.withVersion(options));
    }
}
