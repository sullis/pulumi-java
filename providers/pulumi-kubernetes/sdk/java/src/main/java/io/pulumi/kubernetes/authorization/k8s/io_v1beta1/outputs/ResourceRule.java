// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceRule {
    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
     * 
     */
    private final @Nullable List<String> apiGroups;
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * 
     */
    private final @Nullable List<String> resourceNames;
    /**
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*{@literal /}foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * 
     */
    private final @Nullable List<String> resources;
    /**
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
     */
    private final List<String> verbs;

    @OutputCustomType.Constructor({"apiGroups","resourceNames","resources","verbs"})
    private ResourceRule(
        @Nullable List<String> apiGroups,
        @Nullable List<String> resourceNames,
        @Nullable List<String> resources,
        List<String> verbs) {
        this.apiGroups = apiGroups;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = Objects.requireNonNull(verbs);
    }

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
     * 
     */
    public List<String> getApiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
     * 
     */
    public List<String> getResourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    /**
     * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
     *  "*{@literal /}foo" represents the subresource 'foo' for all resources in the specified apiGroups.
     * 
     */
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
     */
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> resourceNames;
        private @Nullable List<String> resources;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder setApiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        public Builder setResourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public ResourceRule build() {
            return new ResourceRule(apiGroups, resourceNames, resources, verbs);
        }
    }
}
