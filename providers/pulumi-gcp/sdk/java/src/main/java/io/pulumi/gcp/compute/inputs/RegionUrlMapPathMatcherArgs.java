// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultUrlRedirectArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherArgs Empty = new RegionUrlMapPathMatcherArgs();

    /**
     * A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL's path portion.
     * 
     */
    @InputImport(name="defaultService")
    private final @Nullable Input<String> defaultService;

    public Input<String> getDefaultService() {
        return this.defaultService == null ? Input.empty() : this.defaultService;
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultUrlRedirect")
    private final @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;

    public Input<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Input.empty() : this.defaultUrlRedirect;
    }

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that's required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pathRules")
    private final @Nullable Input<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules;

    public Input<List<RegionUrlMapPathMatcherPathRuleArgs>> getPathRules() {
        return this.pathRules == null ? Input.empty() : this.pathRules;
    }

    /**
     * The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeRules")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules;

    public Input<List<RegionUrlMapPathMatcherRouteRuleArgs>> getRouteRules() {
        return this.routeRules == null ? Input.empty() : this.routeRules;
    }

    public RegionUrlMapPathMatcherArgs(
        @Nullable Input<String> defaultService,
        @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect,
        @Nullable Input<String> description,
        Input<String> name,
        @Nullable Input<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules) {
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    private RegionUrlMapPathMatcherArgs() {
        this.defaultService = Input.empty();
        this.defaultUrlRedirect = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.pathRules = Input.empty();
        this.routeRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultService;
        private @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;
        private @Nullable Input<String> description;
        private Input<String> name;
        private @Nullable Input<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDefaultService(@Nullable Input<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder setDefaultService(@Nullable String defaultService) {
            this.defaultService = Input.ofNullable(defaultService);
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable RegionUrlMapPathMatcherDefaultUrlRedirectArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Input.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPathRules(@Nullable Input<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setPathRules(@Nullable List<RegionUrlMapPathMatcherPathRuleArgs> pathRules) {
            this.pathRules = Input.ofNullable(pathRules);
            return this;
        }

        public Builder setRouteRules(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        public Builder setRouteRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleArgs> routeRules) {
            this.routeRules = Input.ofNullable(routeRules);
            return this;
        }

        public RegionUrlMapPathMatcherArgs build() {
            return new RegionUrlMapPathMatcherArgs(defaultService, defaultUrlRedirect, description, name, pathRules, routeRules);
        }
    }
}
