// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePolicyRule {
    /**
     * @return `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> apiGroups;
    /**
     * @return `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    private final @Nullable Boolean clusterScope;
    /**
     * @return `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    private final @Nullable List<String> namespaces;
    /**
     * @return `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> resources;
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> verbs;

    @CustomType.Constructor
    private ResourcePolicyRule(
        @CustomType.Parameter("apiGroups") List<String> apiGroups,
        @CustomType.Parameter("clusterScope") @Nullable Boolean clusterScope,
        @CustomType.Parameter("namespaces") @Nullable List<String> namespaces,
        @CustomType.Parameter("resources") List<String> resources,
        @CustomType.Parameter("verbs") List<String> verbs) {
        this.apiGroups = apiGroups;
        this.clusterScope = clusterScope;
        this.namespaces = namespaces;
        this.resources = resources;
        this.verbs = verbs;
    }

    /**
     * @return `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    public List<String> apiGroups() {
        return this.apiGroups;
    }
    /**
     * @return `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    public Optional<Boolean> clusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }
    /**
     * @return `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    public List<String> namespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    /**
     * @return `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    public List<String> resources() {
        return this.resources;
    }
    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    public List<String> verbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> apiGroups;
        private @Nullable Boolean clusterScope;
        private @Nullable List<String> namespaces;
        private List<String> resources;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder apiGroups(List<String> apiGroups) {
            this.apiGroups = Objects.requireNonNull(apiGroups);
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        public Builder clusterScope(@Nullable Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }
        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder verbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }        public ResourcePolicyRule build() {
            return new ResourcePolicyRule(apiGroups, clusterScope, namespaces, resources, verbs);
        }
    }
}
