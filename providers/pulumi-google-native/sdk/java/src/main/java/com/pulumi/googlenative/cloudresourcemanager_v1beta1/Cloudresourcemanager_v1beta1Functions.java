// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetOrganizationIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetOrganizationIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetProjectArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetProjectIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetProjectIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs.GetProjectPlainArgs;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs.GetOrganizationIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs.GetProjectIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs.GetProjectResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudresourcemanager_v1beta1Functions {
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;.
     * 
     */
    public static Output<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args) {
        return getOrganizationIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;.
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicyPlain(GetOrganizationIamPolicyPlainArgs args) {
        return getOrganizationIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;.
     * 
     */
    public static Output<GetOrganizationIamPolicyResult> getOrganizationIamPolicy(GetOrganizationIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudresourcemanager/v1beta1:getOrganizationIamPolicy", TypeShape.of(GetOrganizationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for an Organization resource. May be empty if no such policy or resource exists. The `resource` field should be the organization&#39;s resource name, e.g. &#34;organizations/123&#34;.
     * 
     */
    public static CompletableFuture<GetOrganizationIamPolicyResult> getOrganizationIamPolicyPlain(GetOrganizationIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1beta1:getOrganizationIamPolicy", TypeShape.of(GetOrganizationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static Output<GetProjectResult> getProject() {
        return getProject(GetProjectArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain() {
        return getProjectPlain(GetProjectPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args) {
        return getProjectPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudresourcemanager/v1beta1:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the Project identified by the specified `project_id` (for example, `my-project-123`). The caller must have read permissions for this Project.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1beta1:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. For additional information about resource structure and identification, see [Resource Names](/apis/design/resource_names).
     * 
     */
    public static Output<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args) {
        return getProjectIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. For additional information about resource structure and identification, see [Resource Names](/apis/design/resource_names).
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicyPlain(GetProjectIamPolicyPlainArgs args) {
        return getProjectIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. For additional information about resource structure and identification, see [Resource Names](/apis/design/resource_names).
     * 
     */
    public static Output<GetProjectIamPolicyResult> getProjectIamPolicy(GetProjectIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudresourcemanager/v1beta1:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the IAM access control policy for the specified Project. Permission is denied if the policy or the resource does not exist. For additional information about resource structure and identification, see [Resource Names](/apis/design/resource_names).
     * 
     */
    public static CompletableFuture<GetProjectIamPolicyResult> getProjectIamPolicyPlain(GetProjectIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1beta1:getProjectIamPolicy", TypeShape.of(GetProjectIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
