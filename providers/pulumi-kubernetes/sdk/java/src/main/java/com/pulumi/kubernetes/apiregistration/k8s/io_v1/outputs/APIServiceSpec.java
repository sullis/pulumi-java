// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiregistration.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiregistration.k8s.io_v1.outputs.ServiceReference;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class APIServiceSpec {
    /**
     * @return CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    private final @Nullable String caBundle;
    /**
     * @return Group is the API group name this server hosts
     * 
     */
    private final @Nullable String group;
    /**
     * @return GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     * 
     */
    private final Integer groupPriorityMinimum;
    /**
     * @return InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
     * 
     */
    private final @Nullable Boolean insecureSkipTLSVerify;
    /**
     * @return Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     * 
     */
    private final @Nullable ServiceReference service;
    /**
     * @return Version is the API version this server hosts.  For example, &#34;v1&#34;
     * 
     */
    private final @Nullable String version;
    /**
     * @return VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    private final Integer versionPriority;

    @CustomType.Constructor
    private APIServiceSpec(
        @CustomType.Parameter("caBundle") @Nullable String caBundle,
        @CustomType.Parameter("group") @Nullable String group,
        @CustomType.Parameter("groupPriorityMinimum") Integer groupPriorityMinimum,
        @CustomType.Parameter("insecureSkipTLSVerify") @Nullable Boolean insecureSkipTLSVerify,
        @CustomType.Parameter("service") @Nullable ServiceReference service,
        @CustomType.Parameter("version") @Nullable String version,
        @CustomType.Parameter("versionPriority") Integer versionPriority) {
        this.caBundle = caBundle;
        this.group = group;
        this.groupPriorityMinimum = groupPriorityMinimum;
        this.insecureSkipTLSVerify = insecureSkipTLSVerify;
        this.service = service;
        this.version = version;
        this.versionPriority = versionPriority;
    }

    /**
     * @return CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    public Optional<String> caBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    /**
     * @return Group is the API group name this server hosts
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     * 
     */
    public Integer groupPriorityMinimum() {
        return this.groupPriorityMinimum;
    }
    /**
     * @return InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
     * 
     */
    public Optional<Boolean> insecureSkipTLSVerify() {
        return Optional.ofNullable(this.insecureSkipTLSVerify);
    }
    /**
     * @return Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     * 
     */
    public Optional<ServiceReference> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return Version is the API version this server hosts.  For example, &#34;v1&#34;
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    /**
     * @return VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    public Integer versionPriority() {
        return this.versionPriority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caBundle;
        private @Nullable String group;
        private Integer groupPriorityMinimum;
        private @Nullable Boolean insecureSkipTLSVerify;
        private @Nullable ServiceReference service;
        private @Nullable String version;
        private Integer versionPriority;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.group = defaults.group;
    	      this.groupPriorityMinimum = defaults.groupPriorityMinimum;
    	      this.insecureSkipTLSVerify = defaults.insecureSkipTLSVerify;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
    	      this.versionPriority = defaults.versionPriority;
        }

        public Builder caBundle(@Nullable String caBundle) {
            this.caBundle = caBundle;
            return this;
        }
        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        public Builder groupPriorityMinimum(Integer groupPriorityMinimum) {
            this.groupPriorityMinimum = Objects.requireNonNull(groupPriorityMinimum);
            return this;
        }
        public Builder insecureSkipTLSVerify(@Nullable Boolean insecureSkipTLSVerify) {
            this.insecureSkipTLSVerify = insecureSkipTLSVerify;
            return this;
        }
        public Builder service(@Nullable ServiceReference service) {
            this.service = service;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public Builder versionPriority(Integer versionPriority) {
            this.versionPriority = Objects.requireNonNull(versionPriority);
            return this;
        }        public APIServiceSpec build() {
            return new APIServiceSpec(caBundle, group, groupPriorityMinimum, insecureSkipTLSVerify, service, version, versionPriority);
        }
    }
}
