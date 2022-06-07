// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebase_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetAndroidAppArgs;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetAndroidAppPlainArgs;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetIosAppArgs;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetIosAppPlainArgs;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetWebAppArgs;
import com.pulumi.googlenative.firebase_v1beta1.inputs.GetWebAppPlainArgs;
import com.pulumi.googlenative.firebase_v1beta1.outputs.GetAndroidAppResult;
import com.pulumi.googlenative.firebase_v1beta1.outputs.GetIosAppResult;
import com.pulumi.googlenative.firebase_v1beta1.outputs.GetWebAppResult;
import java.util.concurrent.CompletableFuture;

public final class Firebase_v1beta1Functions {
    /**
     * Gets the specified AndroidApp.
     * 
     */
    public static Output<GetAndroidAppResult> getAndroidApp(GetAndroidAppArgs args) {
        return getAndroidApp(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified AndroidApp.
     * 
     */
    public static CompletableFuture<GetAndroidAppResult> getAndroidAppPlain(GetAndroidAppPlainArgs args) {
        return getAndroidAppPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified AndroidApp.
     * 
     */
    public static Output<GetAndroidAppResult> getAndroidApp(GetAndroidAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firebase/v1beta1:getAndroidApp", TypeShape.of(GetAndroidAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified AndroidApp.
     * 
     */
    public static CompletableFuture<GetAndroidAppResult> getAndroidAppPlain(GetAndroidAppPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebase/v1beta1:getAndroidApp", TypeShape.of(GetAndroidAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified IosApp.
     * 
     */
    public static Output<GetIosAppResult> getIosApp(GetIosAppArgs args) {
        return getIosApp(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified IosApp.
     * 
     */
    public static CompletableFuture<GetIosAppResult> getIosAppPlain(GetIosAppPlainArgs args) {
        return getIosAppPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified IosApp.
     * 
     */
    public static Output<GetIosAppResult> getIosApp(GetIosAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firebase/v1beta1:getIosApp", TypeShape.of(GetIosAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified IosApp.
     * 
     */
    public static CompletableFuture<GetIosAppResult> getIosAppPlain(GetIosAppPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebase/v1beta1:getIosApp", TypeShape.of(GetIosAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified WebApp.
     * 
     */
    public static Output<GetWebAppResult> getWebApp(GetWebAppArgs args) {
        return getWebApp(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified WebApp.
     * 
     */
    public static CompletableFuture<GetWebAppResult> getWebAppPlain(GetWebAppPlainArgs args) {
        return getWebAppPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified WebApp.
     * 
     */
    public static Output<GetWebAppResult> getWebApp(GetWebAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firebase/v1beta1:getWebApp", TypeShape.of(GetWebAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified WebApp.
     * 
     */
    public static CompletableFuture<GetWebAppResult> getWebAppPlain(GetWebAppPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebase/v1beta1:getWebApp", TypeShape.of(GetWebAppResult.class), args, Utilities.withVersion(options));
    }
}
