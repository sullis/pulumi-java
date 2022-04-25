// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource {
    /**
     * @return An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    private final @Nullable String accessLevel;
    /**
     * @return A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    private final @Nullable String resource;

    @CustomType.Constructor
    private ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource(
        @CustomType.Parameter("accessLevel") @Nullable String accessLevel,
        @CustomType.Parameter("resource") @Nullable String resource) {
        this.accessLevel = accessLevel;
        this.resource = resource;
    }

    /**
     * @return An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }
    /**
     * @return A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessLevel;
        private @Nullable String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.resource = defaults.resource;
        }

        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }        public ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource build() {
            return new ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromSource(accessLevel, resource);
        }
    }
}
