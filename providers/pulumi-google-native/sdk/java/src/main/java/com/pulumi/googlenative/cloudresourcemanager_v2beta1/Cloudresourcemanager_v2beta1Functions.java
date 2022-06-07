// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.GetFolderArgs;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.GetFolderIamPolicyArgs;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.GetFolderIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.GetFolderPlainArgs;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.outputs.GetFolderIamPolicyResult;
import com.pulumi.googlenative.cloudresourcemanager_v2beta1.outputs.GetFolderResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudresourcemanager_v2beta1Functions {
    /**
     * Retrieves a Folder identified by the supplied resource name. Valid Folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static Output<GetFolderResult> getFolder(GetFolderArgs args) {
        return getFolder(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a Folder identified by the supplied resource name. Valid Folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderResult> getFolderPlain(GetFolderPlainArgs args) {
        return getFolderPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a Folder identified by the supplied resource name. Valid Folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static Output<GetFolderResult> getFolder(GetFolderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudresourcemanager/v2beta1:getFolder", TypeShape.of(GetFolderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a Folder identified by the supplied resource name. Valid Folder resource names have the format `folders/{folder_id}` (for example, `folders/1234`). The caller must have `resourcemanager.folders.get` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderResult> getFolderPlain(GetFolderPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v2beta1:getFolder", TypeShape.of(GetFolderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the Folder&#39;s resource name, e.g. &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static Output<GetFolderIamPolicyResult> getFolderIamPolicy(GetFolderIamPolicyArgs args) {
        return getFolderIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the Folder&#39;s resource name, e.g. &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderIamPolicyResult> getFolderIamPolicyPlain(GetFolderIamPolicyPlainArgs args) {
        return getFolderIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the Folder&#39;s resource name, e.g. &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static Output<GetFolderIamPolicyResult> getFolderIamPolicy(GetFolderIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudresourcemanager/v2beta1:getFolderIamPolicy", TypeShape.of(GetFolderIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Folder. The returned policy may be empty if no such policy or resource exists. The `resource` field should be the Folder&#39;s resource name, e.g. &#34;folders/1234&#34;. The caller must have `resourcemanager.folders.getIamPolicy` permission on the identified folder.
     * 
     */
    public static CompletableFuture<GetFolderIamPolicyResult> getFolderIamPolicyPlain(GetFolderIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v2beta1:getFolderIamPolicy", TypeShape.of(GetFolderIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
