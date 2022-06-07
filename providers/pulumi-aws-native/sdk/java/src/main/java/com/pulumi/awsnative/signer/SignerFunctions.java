// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.signer;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.signer.inputs.GetProfilePermissionArgs;
import com.pulumi.awsnative.signer.inputs.GetProfilePermissionPlainArgs;
import com.pulumi.awsnative.signer.inputs.GetSigningProfileArgs;
import com.pulumi.awsnative.signer.inputs.GetSigningProfilePlainArgs;
import com.pulumi.awsnative.signer.outputs.GetProfilePermissionResult;
import com.pulumi.awsnative.signer.outputs.GetSigningProfileResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SignerFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetProfilePermissionResult> getProfilePermission(GetProfilePermissionArgs args) {
        return getProfilePermission(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetProfilePermissionResult> getProfilePermissionPlain(GetProfilePermissionPlainArgs args) {
        return getProfilePermissionPlain(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetProfilePermissionResult> getProfilePermission(GetProfilePermissionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:signer:getProfilePermission", TypeShape.of(GetProfilePermissionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetProfilePermissionResult> getProfilePermissionPlain(GetProfilePermissionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:signer:getProfilePermission", TypeShape.of(GetProfilePermissionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A signing profile is a signing template that can be used to carry out a pre-defined signing job.
     * 
     */
    public static Output<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args) {
        return getSigningProfile(args, InvokeOptions.Empty);
    }
    /**
     * A signing profile is a signing template that can be used to carry out a pre-defined signing job.
     * 
     */
    public static CompletableFuture<GetSigningProfileResult> getSigningProfilePlain(GetSigningProfilePlainArgs args) {
        return getSigningProfilePlain(args, InvokeOptions.Empty);
    }
    /**
     * A signing profile is a signing template that can be used to carry out a pre-defined signing job.
     * 
     */
    public static Output<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:signer:getSigningProfile", TypeShape.of(GetSigningProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A signing profile is a signing template that can be used to carry out a pre-defined signing job.
     * 
     */
    public static CompletableFuture<GetSigningProfileResult> getSigningProfilePlain(GetSigningProfilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:signer:getSigningProfile", TypeShape.of(GetSigningProfileResult.class), args, Utilities.withVersion(options));
    }
}
