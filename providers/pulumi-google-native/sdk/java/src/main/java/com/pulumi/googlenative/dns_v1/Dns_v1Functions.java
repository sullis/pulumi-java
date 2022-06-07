// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns_v1.inputs.GetChangeArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetChangePlainArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetManagedZoneArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetManagedZonePlainArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetPolicyArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetPolicyPlainArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResourceRecordSetArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResourceRecordSetPlainArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResponsePolicyArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResponsePolicyPlainArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResponsePolicyRuleArgs;
import com.pulumi.googlenative.dns_v1.inputs.GetResponsePolicyRulePlainArgs;
import com.pulumi.googlenative.dns_v1.outputs.GetChangeResult;
import com.pulumi.googlenative.dns_v1.outputs.GetManagedZoneResult;
import com.pulumi.googlenative.dns_v1.outputs.GetPolicyResult;
import com.pulumi.googlenative.dns_v1.outputs.GetResourceRecordSetResult;
import com.pulumi.googlenative.dns_v1.outputs.GetResponsePolicyResult;
import com.pulumi.googlenative.dns_v1.outputs.GetResponsePolicyRuleResult;
import java.util.concurrent.CompletableFuture;

public final class Dns_v1Functions {
    /**
     * Fetches the representation of an existing Change.
     * 
     */
    public static Output<GetChangeResult> getChange(GetChangeArgs args) {
        return getChange(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Change.
     * 
     */
    public static CompletableFuture<GetChangeResult> getChangePlain(GetChangePlainArgs args) {
        return getChangePlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Change.
     * 
     */
    public static Output<GetChangeResult> getChange(GetChangeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getChange", TypeShape.of(GetChangeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Change.
     * 
     */
    public static CompletableFuture<GetChangeResult> getChangePlain(GetChangePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getChange", TypeShape.of(GetChangeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing ManagedZone.
     * 
     */
    public static Output<GetManagedZoneResult> getManagedZone(GetManagedZoneArgs args) {
        return getManagedZone(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing ManagedZone.
     * 
     */
    public static CompletableFuture<GetManagedZoneResult> getManagedZonePlain(GetManagedZonePlainArgs args) {
        return getManagedZonePlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing ManagedZone.
     * 
     */
    public static Output<GetManagedZoneResult> getManagedZone(GetManagedZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getManagedZone", TypeShape.of(GetManagedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing ManagedZone.
     * 
     */
    public static CompletableFuture<GetManagedZoneResult> getManagedZonePlain(GetManagedZonePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getManagedZone", TypeShape.of(GetManagedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Policy.
     * 
     */
    public static Output<GetPolicyResult> getPolicy(GetPolicyArgs args) {
        return getPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Policy.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicyPlain(GetPolicyPlainArgs args) {
        return getPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Policy.
     * 
     */
    public static Output<GetPolicyResult> getPolicy(GetPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Policy.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicyPlain(GetPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing ResourceRecordSet.
     * 
     */
    public static Output<GetResourceRecordSetResult> getResourceRecordSet(GetResourceRecordSetArgs args) {
        return getResourceRecordSet(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing ResourceRecordSet.
     * 
     */
    public static CompletableFuture<GetResourceRecordSetResult> getResourceRecordSetPlain(GetResourceRecordSetPlainArgs args) {
        return getResourceRecordSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing ResourceRecordSet.
     * 
     */
    public static Output<GetResourceRecordSetResult> getResourceRecordSet(GetResourceRecordSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getResourceRecordSet", TypeShape.of(GetResourceRecordSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing ResourceRecordSet.
     * 
     */
    public static CompletableFuture<GetResourceRecordSetResult> getResourceRecordSetPlain(GetResourceRecordSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getResourceRecordSet", TypeShape.of(GetResourceRecordSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Response Policy.
     * 
     */
    public static Output<GetResponsePolicyResult> getResponsePolicy(GetResponsePolicyArgs args) {
        return getResponsePolicy(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Response Policy.
     * 
     */
    public static CompletableFuture<GetResponsePolicyResult> getResponsePolicyPlain(GetResponsePolicyPlainArgs args) {
        return getResponsePolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Response Policy.
     * 
     */
    public static Output<GetResponsePolicyResult> getResponsePolicy(GetResponsePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getResponsePolicy", TypeShape.of(GetResponsePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Response Policy.
     * 
     */
    public static CompletableFuture<GetResponsePolicyResult> getResponsePolicyPlain(GetResponsePolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getResponsePolicy", TypeShape.of(GetResponsePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Response Policy Rule.
     * 
     */
    public static Output<GetResponsePolicyRuleResult> getResponsePolicyRule(GetResponsePolicyRuleArgs args) {
        return getResponsePolicyRule(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Response Policy Rule.
     * 
     */
    public static CompletableFuture<GetResponsePolicyRuleResult> getResponsePolicyRulePlain(GetResponsePolicyRulePlainArgs args) {
        return getResponsePolicyRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches the representation of an existing Response Policy Rule.
     * 
     */
    public static Output<GetResponsePolicyRuleResult> getResponsePolicyRule(GetResponsePolicyRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dns/v1:getResponsePolicyRule", TypeShape.of(GetResponsePolicyRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches the representation of an existing Response Policy Rule.
     * 
     */
    public static CompletableFuture<GetResponsePolicyRuleResult> getResponsePolicyRulePlain(GetResponsePolicyRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getResponsePolicyRule", TypeShape.of(GetResponsePolicyRuleResult.class), args, Utilities.withVersion(options));
    }
}
