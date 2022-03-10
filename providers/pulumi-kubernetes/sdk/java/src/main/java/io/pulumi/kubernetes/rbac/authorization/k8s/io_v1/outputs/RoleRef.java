// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RoleRef {
    /**
     * APIGroup is the group for the resource being referenced
     * 
     */
    private final String apiGroup;
    /**
     * Kind is the type of resource being referenced
     * 
     */
    private final String kind;
    /**
     * Name is the name of resource being referenced
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private RoleRef(
        @OutputCustomType.Parameter("apiGroup") String apiGroup,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
    }

    /**
     * APIGroup is the group for the resource being referenced
     * 
    */
    public String getApiGroup() {
        return this.apiGroup;
    }
    /**
     * Kind is the type of resource being referenced
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name is the name of resource being referenced
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiGroup;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setApiGroup(String apiGroup) {
            this.apiGroup = Objects.requireNonNull(apiGroup);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public RoleRef build() {
            return new RoleRef(apiGroup, kind, name);
        }
    }
}
