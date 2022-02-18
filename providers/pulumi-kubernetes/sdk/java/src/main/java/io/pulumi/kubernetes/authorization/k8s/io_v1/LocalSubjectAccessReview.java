// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.k8s.io_v1.LocalSubjectAccessReviewArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1.outputs.SubjectAccessReviewSpec;
import io.pulumi.kubernetes.authorization.k8s.io_v1.outputs.SubjectAccessReviewStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace. Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
 * 
 */
@ResourceType(type="kubernetes:authorization.k8s.io/v1:LocalSubjectAccessReview")
public class LocalSubjectAccessReview extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
     * 
     */
    @OutputExport(name="spec", type=SubjectAccessReviewSpec.class, parameters={})
    private Output<SubjectAccessReviewSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
     * 
     */
    public Output<SubjectAccessReviewSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    @OutputExport(name="status", type=SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectAccessReviewStatus> status;

    /**
     * @return Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    public Output</* @Nullable */ SubjectAccessReviewStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalSubjectAccessReview(String name, LocalSubjectAccessReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:LocalSubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private LocalSubjectAccessReview(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:LocalSubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static LocalSubjectAccessReviewArgs makeArgs(LocalSubjectAccessReviewArgs args) {
        var builder = args == null ? LocalSubjectAccessReviewArgs.builder() : LocalSubjectAccessReviewArgs.builder(args);
        return builder
            .setApiVersion("authorization.k8s.io/v1")
            .setKind("LocalSubjectAccessReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:authorization.k8s.io/v1beta1:LocalSubjectAccessReview").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LocalSubjectAccessReview get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalSubjectAccessReview(name, id, options);
    }
}
