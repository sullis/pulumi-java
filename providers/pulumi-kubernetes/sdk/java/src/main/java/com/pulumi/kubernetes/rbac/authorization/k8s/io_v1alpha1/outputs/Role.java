// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Role {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * @return Rules holds all the PolicyRules for this Role
     * 
     */
    private final @Nullable List<PolicyRule> rules;

    @CustomType.Constructor
    private Role(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("rules") @Nullable List<PolicyRule> rules) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
    }

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Rules holds all the PolicyRules for this Role
     * 
     */
    public List<PolicyRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Role defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<PolicyRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(Role defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder rules(@Nullable List<PolicyRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(PolicyRule... rules) {
            return rules(List.of(rules));
        }        public Role build() {
            return new Role(apiVersion, kind, metadata, rules);
        }
    }
}
