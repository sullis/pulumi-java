// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetConnectionProfileArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetConnectionProfileIamPolicyArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetConnectionProfileIamPolicyPlainArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetConnectionProfilePlainArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetMigrationJobArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetMigrationJobIamPolicyArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetMigrationJobIamPolicyPlainArgs;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.GetMigrationJobPlainArgs;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.GetConnectionProfileIamPolicyResult;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.GetConnectionProfileResult;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.GetMigrationJobIamPolicyResult;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.GetMigrationJobResult;
import java.util.concurrent.CompletableFuture;

public final class Datamigration_v1beta1Functions {
    /**
     * Gets details of a single connection profile.
     * 
     */
    public static Output<GetConnectionProfileResult> getConnectionProfile(GetConnectionProfileArgs args) {
        return getConnectionProfile(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single connection profile.
     * 
     */
    public static CompletableFuture<GetConnectionProfileResult> getConnectionProfilePlain(GetConnectionProfilePlainArgs args) {
        return getConnectionProfilePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single connection profile.
     * 
     */
    public static Output<GetConnectionProfileResult> getConnectionProfile(GetConnectionProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:datamigration/v1beta1:getConnectionProfile", TypeShape.of(GetConnectionProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single connection profile.
     * 
     */
    public static CompletableFuture<GetConnectionProfileResult> getConnectionProfilePlain(GetConnectionProfilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getConnectionProfile", TypeShape.of(GetConnectionProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionProfileIamPolicyResult> getConnectionProfileIamPolicy(GetConnectionProfileIamPolicyArgs args) {
        return getConnectionProfileIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionProfileIamPolicyResult> getConnectionProfileIamPolicyPlain(GetConnectionProfileIamPolicyPlainArgs args) {
        return getConnectionProfileIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionProfileIamPolicyResult> getConnectionProfileIamPolicy(GetConnectionProfileIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:datamigration/v1beta1:getConnectionProfileIamPolicy", TypeShape.of(GetConnectionProfileIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionProfileIamPolicyResult> getConnectionProfileIamPolicyPlain(GetConnectionProfileIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getConnectionProfileIamPolicy", TypeShape.of(GetConnectionProfileIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single migration job.
     * 
     */
    public static Output<GetMigrationJobResult> getMigrationJob(GetMigrationJobArgs args) {
        return getMigrationJob(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single migration job.
     * 
     */
    public static CompletableFuture<GetMigrationJobResult> getMigrationJobPlain(GetMigrationJobPlainArgs args) {
        return getMigrationJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single migration job.
     * 
     */
    public static Output<GetMigrationJobResult> getMigrationJob(GetMigrationJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:datamigration/v1beta1:getMigrationJob", TypeShape.of(GetMigrationJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single migration job.
     * 
     */
    public static CompletableFuture<GetMigrationJobResult> getMigrationJobPlain(GetMigrationJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getMigrationJob", TypeShape.of(GetMigrationJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMigrationJobIamPolicyResult> getMigrationJobIamPolicy(GetMigrationJobIamPolicyArgs args) {
        return getMigrationJobIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMigrationJobIamPolicyResult> getMigrationJobIamPolicyPlain(GetMigrationJobIamPolicyPlainArgs args) {
        return getMigrationJobIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMigrationJobIamPolicyResult> getMigrationJobIamPolicy(GetMigrationJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:datamigration/v1beta1:getMigrationJobIamPolicy", TypeShape.of(GetMigrationJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMigrationJobIamPolicyResult> getMigrationJobIamPolicyPlain(GetMigrationJobIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datamigration/v1beta1:getMigrationJobIamPolicy", TypeShape.of(GetMigrationJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
