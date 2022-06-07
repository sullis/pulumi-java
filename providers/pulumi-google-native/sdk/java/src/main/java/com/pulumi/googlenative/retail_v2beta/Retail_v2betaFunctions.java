// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.retail_v2beta.inputs.GetControlArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GetControlPlainArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GetProductArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GetProductPlainArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GetServingConfigArgs;
import com.pulumi.googlenative.retail_v2beta.inputs.GetServingConfigPlainArgs;
import com.pulumi.googlenative.retail_v2beta.outputs.GetControlResult;
import com.pulumi.googlenative.retail_v2beta.outputs.GetProductResult;
import com.pulumi.googlenative.retail_v2beta.outputs.GetServingConfigResult;
import java.util.concurrent.CompletableFuture;

public final class Retail_v2betaFunctions {
    /**
     * Gets a Control.
     * 
     */
    public static Output<GetControlResult> getControl(GetControlArgs args) {
        return getControl(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Control.
     * 
     */
    public static CompletableFuture<GetControlResult> getControlPlain(GetControlPlainArgs args) {
        return getControlPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Control.
     * 
     */
    public static Output<GetControlResult> getControl(GetControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:retail/v2beta:getControl", TypeShape.of(GetControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Control.
     * 
     */
    public static CompletableFuture<GetControlResult> getControlPlain(GetControlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2beta:getControl", TypeShape.of(GetControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Product.
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args) {
        return getProductPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Product.
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:retail/v2beta:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2beta:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static Output<GetServingConfigResult> getServingConfig(GetServingConfigArgs args) {
        return getServingConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static CompletableFuture<GetServingConfigResult> getServingConfigPlain(GetServingConfigPlainArgs args) {
        return getServingConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static Output<GetServingConfigResult> getServingConfig(GetServingConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:retail/v2beta:getServingConfig", TypeShape.of(GetServingConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
     * 
     */
    public static CompletableFuture<GetServingConfigResult> getServingConfigPlain(GetServingConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2beta:getServingConfig", TypeShape.of(GetServingConfigResult.class), args, Utilities.withVersion(options));
    }
}
