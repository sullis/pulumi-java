// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbilling_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountArgs;
import com.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountIamPolicyArgs;
import com.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountPlainArgs;
import com.pulumi.googlenative.cloudbilling_v1.outputs.GetBillingAccountIamPolicyResult;
import com.pulumi.googlenative.cloudbilling_v1.outputs.GetBillingAccountResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudbilling_v1Functions {
    /**
     * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static Output<GetBillingAccountResult> getBillingAccount(GetBillingAccountArgs args) {
        return getBillingAccount(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static CompletableFuture<GetBillingAccountResult> getBillingAccountPlain(GetBillingAccountPlainArgs args) {
        return getBillingAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static Output<GetBillingAccountResult> getBillingAccount(GetBillingAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudbilling/v1:getBillingAccount", TypeShape.of(GetBillingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static CompletableFuture<GetBillingAccountResult> getBillingAccountPlain(GetBillingAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbilling/v1:getBillingAccount", TypeShape.of(GetBillingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static Output<GetBillingAccountIamPolicyResult> getBillingAccountIamPolicy(GetBillingAccountIamPolicyArgs args) {
        return getBillingAccountIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static CompletableFuture<GetBillingAccountIamPolicyResult> getBillingAccountIamPolicyPlain(GetBillingAccountIamPolicyPlainArgs args) {
        return getBillingAccountIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static Output<GetBillingAccountIamPolicyResult> getBillingAccountIamPolicy(GetBillingAccountIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudbilling/v1:getBillingAccountIamPolicy", TypeShape.of(GetBillingAccountIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a billing account. The caller must have the `billing.accounts.getIamPolicy` permission on the account, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static CompletableFuture<GetBillingAccountIamPolicyResult> getBillingAccountIamPolicyPlain(GetBillingAccountIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbilling/v1:getBillingAccountIamPolicy", TypeShape.of(GetBillingAccountIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
