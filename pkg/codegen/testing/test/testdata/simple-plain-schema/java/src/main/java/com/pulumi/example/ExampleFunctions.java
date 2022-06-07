// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.example.Utilities;
import com.pulumi.example.inputs.DoFooArgs;
import com.pulumi.example.inputs.DoFooPlainArgs;
import java.lang.Void;
import java.util.concurrent.CompletableFuture;

public final class ExampleFunctions {
    public static Output<Void> doFoo(DoFooArgs args) {
        return doFoo(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<Void> doFooPlain(DoFooPlainArgs args) {
        return doFooPlain(args, InvokeOptions.Empty);
    }
    public static Output<Void> doFoo(DoFooArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("example::doFoo", TypeShape.of(Void.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<Void> doFooPlain(DoFooPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("example::doFoo", TypeShape.of(Void.class), args, Utilities.withVersion(options));
    }
}
