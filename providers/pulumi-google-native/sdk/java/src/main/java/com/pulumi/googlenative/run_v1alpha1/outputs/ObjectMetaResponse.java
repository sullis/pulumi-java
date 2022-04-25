// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.OwnerReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ObjectMetaResponse {
    /**
     * @return (Optional) Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
     * 
     */
    private final String clusterName;
    /**
     * @return (Optional) CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    private final String creationTimestamp;
    /**
     * @return (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     * 
     */
    private final Integer deletionGracePeriodSeconds;
    /**
     * @return (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested. Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    private final String deletionTimestamp;
    /**
     * @return (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. +patchStrategy=merge
     * 
     */
    private final List<String> finalizers;
    /**
     * @return (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server. If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header). Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency string generateName = 2;
     * 
     */
    private final String generateName;
    /**
     * @return (Optional) A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
     * 
     */
    private final Integer generation;
    /**
     * @return (Optional) Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and routes. More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name must be unique within a namespace, within a Cloud Run region. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional
     * 
     */
    private final String name;
    /**
     * @return Namespace defines the space within each name must be unique, within a Cloud Run region. In Cloud Run the namespace must be equal to either the project ID or project number.
     * 
     */
    private final String namespace;
    /**
     * @return (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in the list have been deleted, this object will be garbage collected.
     * 
     */
    private final List<OwnerReferenceResponse> ownerReferences;
    /**
     * @return Optional. An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server or omit the value to disable conflict-detection. They may only be valid for a particular resource or set of resources. Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private final String resourceVersion;
    /**
     * @return (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only. string selfLink = 4;
     * 
     */
    private final String selfLink;
    /**
     * @return (Optional) UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private ObjectMetaResponse(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("deletionGracePeriodSeconds") Integer deletionGracePeriodSeconds,
        @CustomType.Parameter("deletionTimestamp") String deletionTimestamp,
        @CustomType.Parameter("finalizers") List<String> finalizers,
        @CustomType.Parameter("generateName") String generateName,
        @CustomType.Parameter("generation") Integer generation,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("ownerReferences") List<OwnerReferenceResponse> ownerReferences,
        @CustomType.Parameter("resourceVersion") String resourceVersion,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("uid") String uid) {
        this.annotations = annotations;
        this.clusterName = clusterName;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    /**
     * @return (Optional) Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return (Optional) Not supported by Cloud Run The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return (Optional) CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC. Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return (Optional) Not supported by Cloud Run Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     * 
     */
    public Integer deletionGracePeriodSeconds() {
        return this.deletionGracePeriodSeconds;
    }
    /**
     * @return (Optional) Not supported by Cloud Run DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested. Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    public String deletionTimestamp() {
        return this.deletionTimestamp;
    }
    /**
     * @return (Optional) Not supported by Cloud Run Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. +patchStrategy=merge
     * 
     */
    public List<String> finalizers() {
        return this.finalizers;
    }
    /**
     * @return (Optional) Not supported by Cloud Run GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server. If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header). Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency string generateName = 2;
     * 
     */
    public String generateName() {
        return this.generateName;
    }
    /**
     * @return (Optional) A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
     * 
     */
    public Integer generation() {
        return this.generation;
    }
    /**
     * @return (Optional) Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and routes. More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name must be unique within a namespace, within a Cloud Run region. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace defines the space within each name must be unique, within a Cloud Run region. In Cloud Run the namespace must be equal to either the project ID or project number.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return (Optional) Not supported by Cloud Run List of objects that own this object. If ALL objects in the list have been deleted, this object will be garbage collected.
     * 
     */
    public List<OwnerReferenceResponse> ownerReferences() {
        return this.ownerReferences;
    }
    /**
     * @return Optional. An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server or omit the value to disable conflict-detection. They may only be valid for a particular resource or set of resources. Populated by the system. Read-only. Value must be treated as opaque by clients or omitted. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public String resourceVersion() {
        return this.resourceVersion;
    }
    /**
     * @return (Optional) SelfLink is a URL representing this object. Populated by the system. Read-only. string selfLink = 4;
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return (Optional) UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations. Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private String clusterName;
        private String creationTimestamp;
        private Integer deletionGracePeriodSeconds;
        private String deletionTimestamp;
        private List<String> finalizers;
        private String generateName;
        private Integer generation;
        private Map<String,String> labels;
        private String name;
        private String namespace;
        private List<OwnerReferenceResponse> ownerReferences;
        private String resourceVersion;
        private String selfLink;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterName = defaults.clusterName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deletionGracePeriodSeconds = defaults.deletionGracePeriodSeconds;
    	      this.deletionTimestamp = defaults.deletionTimestamp;
    	      this.finalizers = defaults.finalizers;
    	      this.generateName = defaults.generateName;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.ownerReferences = defaults.ownerReferences;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder deletionGracePeriodSeconds(Integer deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = Objects.requireNonNull(deletionGracePeriodSeconds);
            return this;
        }
        public Builder deletionTimestamp(String deletionTimestamp) {
            this.deletionTimestamp = Objects.requireNonNull(deletionTimestamp);
            return this;
        }
        public Builder finalizers(List<String> finalizers) {
            this.finalizers = Objects.requireNonNull(finalizers);
            return this;
        }
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }
        public Builder generateName(String generateName) {
            this.generateName = Objects.requireNonNull(generateName);
            return this;
        }
        public Builder generation(Integer generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder ownerReferences(List<OwnerReferenceResponse> ownerReferences) {
            this.ownerReferences = Objects.requireNonNull(ownerReferences);
            return this;
        }
        public Builder ownerReferences(OwnerReferenceResponse... ownerReferences) {
            return ownerReferences(List.of(ownerReferences));
        }
        public Builder resourceVersion(String resourceVersion) {
            this.resourceVersion = Objects.requireNonNull(resourceVersion);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public ObjectMetaResponse build() {
            return new ObjectMetaResponse(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
        }
    }
}
