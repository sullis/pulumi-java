// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.RoleRef;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.Subject;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoleBinding {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata.
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    private final RoleRef roleRef;
    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    private final @Nullable List<Subject> subjects;

    @OutputCustomType.Constructor
    private RoleBinding(
        @OutputCustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @OutputCustomType.Parameter("roleRef") RoleRef roleRef,
        @OutputCustomType.Parameter("subjects") @Nullable List<Subject> subjects) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.roleRef = roleRef;
        this.subjects = subjects;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata.
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
    */
    public RoleRef getRoleRef() {
        return this.roleRef;
    }
    /**
     * Subjects holds references to the objects the role applies to.
     * 
    */
    public List<Subject> getSubjects() {
        return this.subjects == null ? List.of() : this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleBinding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private RoleRef roleRef;
        private @Nullable List<Subject> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.roleRef = defaults.roleRef;
    	      this.subjects = defaults.subjects;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setRoleRef(RoleRef roleRef) {
            this.roleRef = Objects.requireNonNull(roleRef);
            return this;
        }

        public Builder setSubjects(@Nullable List<Subject> subjects) {
            this.subjects = subjects;
            return this;
        }
        public RoleBinding build() {
            return new RoleBinding(apiVersion, kind, metadata, roleRef, subjects);
        }
    }
}
