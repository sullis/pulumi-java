// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.outputs.TopologySelectorTerm;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.StorageClassArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * 
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 * 
 */
@ResourceType(type="kubernetes:storage.k8s.io/v1beta1:StorageClass")
public class StorageClass extends io.pulumi.resources.CustomResource {
    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    @OutputExport(name="allowVolumeExpansion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVolumeExpansion;

    /**
     * @return AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowVolumeExpansion() {
        return this.allowVolumeExpansion;
    }
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @OutputExport(name="allowedTopologies", type=List.class, parameters={TopologySelectorTerm.class})
    private Output</* @Nullable */ List<TopologySelectorTerm>> allowedTopologies;

    /**
     * @return Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    public Output</* @Nullable */ List<TopologySelectorTerm>> getAllowedTopologies() {
        return this.allowedTopologies;
    }
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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    @OutputExport(name="mountOptions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mountOptions;

    /**
     * @return Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    public Output</* @Nullable */ List<String>> getMountOptions() {
        return this.mountOptions;
    }
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * Provisioner indicates the type of the provisioner.
     * 
     */
    @OutputExport(name="provisioner", type=String.class, parameters={})
    private Output<String> provisioner;

    /**
     * @return Provisioner indicates the type of the provisioner.
     * 
     */
    public Output<String> getProvisioner() {
        return this.provisioner;
    }
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    @OutputExport(name="reclaimPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> reclaimPolicy;

    /**
     * @return Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    public Output</* @Nullable */ String> getReclaimPolicy() {
        return this.reclaimPolicy;
    }
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @OutputExport(name="volumeBindingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeBindingMode;

    /**
     * @return VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    public Output</* @Nullable */ String> getVolumeBindingMode() {
        return this.volumeBindingMode;
    }

    public interface BuilderApplicator {
        public void apply(StorageClassArgs.Builder a);
    }
    private static io.pulumi.kubernetes.storage.k8s.io_v1beta1.StorageClassArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.storage.k8s.io_v1beta1.StorageClassArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StorageClass(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StorageClass(String name) {
        this(name, StorageClassArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StorageClass(String name, StorageClassArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StorageClass(String name, StorageClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:StorageClass", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private StorageClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:StorageClass", name, null, makeResourceOptions(options, id));
    }

    private static StorageClassArgs makeArgs(StorageClassArgs args) {
        var builder = args == null ? StorageClassArgs.builder() : StorageClassArgs.builder(args);
        return builder
            .setApiVersion("storage.k8s.io/v1beta1")
            .setKind("StorageClass")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1:StorageClass").build())
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
    public static StorageClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StorageClass(name, id, options);
    }
}