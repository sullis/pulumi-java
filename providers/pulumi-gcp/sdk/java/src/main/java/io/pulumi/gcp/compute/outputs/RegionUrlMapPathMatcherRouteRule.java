// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleHeaderAction;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRule;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteAction;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleUrlRedirect;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRule {
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction;
    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules;
    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    private final Integer priority;
    /**
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction;
    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    private final @Nullable String service;
    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect;

    @OutputCustomType.Constructor({"headerAction","matchRules","priority","routeAction","service","urlRedirect"})
    private RegionUrlMapPathMatcherRouteRule(
        @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction,
        @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules,
        Integer priority,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction,
        @Nullable String service,
        @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect) {
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = Objects.requireNonNull(priority);
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
    */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRule> getMatchRules() {
        return this.matchRules == null ? List.of() : this.matchRules;
    }
    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteAction> getRouteAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
    */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleUrlRedirect> getUrlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules;
        private Integer priority;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction;
        private @Nullable String service;
        private @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setHeaderAction(@Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setMatchRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules) {
            this.matchRules = matchRules;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setUrlRedirect(@Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public RegionUrlMapPathMatcherRouteRule build() {
            return new RegionUrlMapPathMatcherRouteRule(headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}