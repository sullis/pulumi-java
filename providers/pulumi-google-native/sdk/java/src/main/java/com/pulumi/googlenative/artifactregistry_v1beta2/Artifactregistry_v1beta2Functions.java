// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetRepositoryArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetRepositoryIamPolicyArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetRepositoryIamPolicyPlainArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetRepositoryPlainArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetTagArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.GetTagPlainArgs;
import com.pulumi.googlenative.artifactregistry_v1beta2.outputs.GetRepositoryIamPolicyResult;
import com.pulumi.googlenative.artifactregistry_v1beta2.outputs.GetRepositoryResult;
import com.pulumi.googlenative.artifactregistry_v1beta2.outputs.GetTagResult;
import java.util.concurrent.CompletableFuture;

public final class Artifactregistry_v1beta2Functions {
    /**
     * Gets a repository.
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    /**
     * Gets a repository.
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args) {
        return getRepositoryPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a repository.
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:artifactregistry/v1beta2:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a repository.
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1beta2:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy for a given resource.
     * 
     */
    public static Output<GetRepositoryIamPolicyResult> getRepositoryIamPolicy(GetRepositoryIamPolicyArgs args) {
        return getRepositoryIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy for a given resource.
     * 
     */
    public static CompletableFuture<GetRepositoryIamPolicyResult> getRepositoryIamPolicyPlain(GetRepositoryIamPolicyPlainArgs args) {
        return getRepositoryIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy for a given resource.
     * 
     */
    public static Output<GetRepositoryIamPolicyResult> getRepositoryIamPolicy(GetRepositoryIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:artifactregistry/v1beta2:getRepositoryIamPolicy", TypeShape.of(GetRepositoryIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy for a given resource.
     * 
     */
    public static CompletableFuture<GetRepositoryIamPolicyResult> getRepositoryIamPolicyPlain(GetRepositoryIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1beta2:getRepositoryIamPolicy", TypeShape.of(GetRepositoryIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a tag.
     * 
     */
    public static Output<GetTagResult> getTag(GetTagArgs args) {
        return getTag(args, InvokeOptions.Empty);
    }
    /**
     * Gets a tag.
     * 
     */
    public static CompletableFuture<GetTagResult> getTagPlain(GetTagPlainArgs args) {
        return getTagPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a tag.
     * 
     */
    public static Output<GetTagResult> getTag(GetTagArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:artifactregistry/v1beta2:getTag", TypeShape.of(GetTagResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a tag.
     * 
     */
    public static CompletableFuture<GetTagResult> getTagPlain(GetTagPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:artifactregistry/v1beta2:getTag", TypeShape.of(GetTagResult.class), args, Utilities.withVersion(options));
    }
}
