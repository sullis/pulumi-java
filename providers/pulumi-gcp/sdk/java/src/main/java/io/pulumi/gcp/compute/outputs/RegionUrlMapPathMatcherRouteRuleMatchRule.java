// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleMatchRule {
    /**
     * For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    private final @Nullable String fullPathMatch;
    /**
     * Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch> headerMatches;
    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    private final @Nullable Boolean ignoreCase;
    /**
     * Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter> metadataFilters;
    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    private final @Nullable String prefixMatch;
    /**
     * Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch> queryParameterMatches;
    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    private final @Nullable String regexMatch;

    @OutputCustomType.Constructor({"fullPathMatch","headerMatches","ignoreCase","metadataFilters","prefixMatch","queryParameterMatches","regexMatch"})
    private RegionUrlMapPathMatcherRouteRuleMatchRule(
        @Nullable String fullPathMatch,
        @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch> headerMatches,
        @Nullable Boolean ignoreCase,
        @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter> metadataFilters,
        @Nullable String prefixMatch,
        @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch> queryParameterMatches,
        @Nullable String regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    /**
     * For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    public Optional<String> getFullPathMatch() {
        return Optional.ofNullable(this.fullPathMatch);
    }
    /**
     * Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch> getHeaderMatches() {
        return this.headerMatches == null ? List.of() : this.headerMatches;
    }
    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    public Optional<Boolean> getIgnoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    /**
     * Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter> getMetadataFilters() {
        return this.metadataFilters == null ? List.of() : this.metadataFilters;
    }
    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<String> getPrefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }
    /**
     * Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch> getQueryParameterMatches() {
        return this.queryParameterMatches == null ? List.of() : this.queryParameterMatches;
    }
    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    public Optional<String> getRegexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fullPathMatch;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch> headerMatches;
        private @Nullable Boolean ignoreCase;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter> metadataFilters;
        private @Nullable String prefixMatch;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch> queryParameterMatches;
        private @Nullable String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setFullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder setHeaderMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatch> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }

        public Builder setIgnoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder setMetadataFilters(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setQueryParameterMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatch> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRule build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRule(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
