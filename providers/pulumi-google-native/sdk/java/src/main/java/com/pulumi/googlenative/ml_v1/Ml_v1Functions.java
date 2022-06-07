// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.ml_v1.inputs.GetJobArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetJobIamPolicyArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetJobIamPolicyPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetJobPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetModelArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetModelIamPolicyArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetModelIamPolicyPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetModelPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetStudyArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetStudyPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetTrialArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetTrialPlainArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetVersionArgs;
import com.pulumi.googlenative.ml_v1.inputs.GetVersionPlainArgs;
import com.pulumi.googlenative.ml_v1.outputs.GetJobIamPolicyResult;
import com.pulumi.googlenative.ml_v1.outputs.GetJobResult;
import com.pulumi.googlenative.ml_v1.outputs.GetModelIamPolicyResult;
import com.pulumi.googlenative.ml_v1.outputs.GetModelResult;
import com.pulumi.googlenative.ml_v1.outputs.GetStudyResult;
import com.pulumi.googlenative.ml_v1.outputs.GetTrialResult;
import com.pulumi.googlenative.ml_v1.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;

public final class Ml_v1Functions {
    /**
     * Describes a job.
     * 
     */
    public static Output<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    /**
     * Describes a job.
     * 
     */
    public static CompletableFuture<GetJobResult> getJobPlain(GetJobPlainArgs args) {
        return getJobPlain(args, InvokeOptions.Empty);
    }
    /**
     * Describes a job.
     * 
     */
    public static Output<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a job.
     * 
     */
    public static CompletableFuture<GetJobResult> getJobPlain(GetJobPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args) {
        return getJobIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicyPlain(GetJobIamPolicyPlainArgs args) {
        return getJobIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetJobIamPolicyResult> getJobIamPolicy(GetJobIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getJobIamPolicy", TypeShape.of(GetJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetJobIamPolicyResult> getJobIamPolicyPlain(GetJobIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getJobIamPolicy", TypeShape.of(GetJobIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
     * 
     */
    public static Output<GetModelResult> getModel(GetModelArgs args) {
        return getModel(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
     * 
     */
    public static CompletableFuture<GetModelResult> getModelPlain(GetModelPlainArgs args) {
        return getModelPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
     * 
     */
    public static Output<GetModelResult> getModel(GetModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getModel", TypeShape.of(GetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed).
     * 
     */
    public static CompletableFuture<GetModelResult> getModelPlain(GetModelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModel", TypeShape.of(GetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetModelIamPolicyResult> getModelIamPolicy(GetModelIamPolicyArgs args) {
        return getModelIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetModelIamPolicyResult> getModelIamPolicyPlain(GetModelIamPolicyPlainArgs args) {
        return getModelIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetModelIamPolicyResult> getModelIamPolicy(GetModelIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getModelIamPolicy", TypeShape.of(GetModelIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetModelIamPolicyResult> getModelIamPolicyPlain(GetModelIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getModelIamPolicy", TypeShape.of(GetModelIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a study.
     * 
     */
    public static Output<GetStudyResult> getStudy(GetStudyArgs args) {
        return getStudy(args, InvokeOptions.Empty);
    }
    /**
     * Gets a study.
     * 
     */
    public static CompletableFuture<GetStudyResult> getStudyPlain(GetStudyPlainArgs args) {
        return getStudyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a study.
     * 
     */
    public static Output<GetStudyResult> getStudy(GetStudyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getStudy", TypeShape.of(GetStudyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a study.
     * 
     */
    public static CompletableFuture<GetStudyResult> getStudyPlain(GetStudyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getStudy", TypeShape.of(GetStudyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a trial.
     * 
     */
    public static Output<GetTrialResult> getTrial(GetTrialArgs args) {
        return getTrial(args, InvokeOptions.Empty);
    }
    /**
     * Gets a trial.
     * 
     */
    public static CompletableFuture<GetTrialResult> getTrialPlain(GetTrialPlainArgs args) {
        return getTrialPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a trial.
     * 
     */
    public static Output<GetTrialResult> getTrial(GetTrialArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getTrial", TypeShape.of(GetTrialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a trial.
     * 
     */
    public static CompletableFuture<GetTrialResult> getTrialPlain(GetTrialPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getTrial", TypeShape.of(GetTrialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args) {
        return getVersion(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args) {
        return getVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ml/v1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of the versions of a model.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ml/v1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
}
