// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
     * 
     */
    @Import(name="fullPathMatch")
    private @Nullable Output<String> fullPathMatch;

    /**
     * @return For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
     * 
     */
    public Optional<Output<String>> fullPathMatch() {
        return Optional.ofNullable(this.fullPathMatch);
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="headerMatches")
    private @Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches;

    /**
     * @return Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>>> headerMatches() {
        return Optional.ofNullable(this.headerMatches);
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * 
     */
    @Import(name="ignoreCase")
    private @Nullable Output<Boolean> ignoreCase;

    /**
     * @return Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * 
     */
    public Optional<Output<Boolean>> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }

    /**
     * For satisfying the matchRule condition, the path of the request
     * must match the wildcard pattern specified in pathTemplateMatch
     * after removing any query parameters and anchor that may be part
     * of the original URL.
     * pathTemplateMatch must be between 1 and 255 characters
     * (inclusive).  The pattern specified by pathTemplateMatch may
     * have at most 5 wildcard operators and at most 5 variable
     * captures in total.
     * 
     */
    @Import(name="pathTemplateMatch")
    private @Nullable Output<String> pathTemplateMatch;

    /**
     * @return For satisfying the matchRule condition, the path of the request
     * must match the wildcard pattern specified in pathTemplateMatch
     * after removing any query parameters and anchor that may be part
     * of the original URL.
     * pathTemplateMatch must be between 1 and 255 characters
     * (inclusive).  The pattern specified by pathTemplateMatch may
     * have at most 5 wildcard operators and at most 5 variable
     * captures in total.
     * 
     */
    public Optional<Output<String>> pathTemplateMatch() {
        return Optional.ofNullable(this.pathTemplateMatch);
    }

    /**
     * The value of the header must start with the contents of prefixMatch.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    /**
     * @return The value of the header must start with the contents of prefixMatch.
     * 
     */
    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="queryParameterMatches")
    private @Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches;

    /**
     * @return Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>>> queryParameterMatches() {
        return Optional.ofNullable(this.queryParameterMatches);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs $) {
        this.fullPathMatch = $.fullPathMatch;
        this.headerMatches = $.headerMatches;
        this.ignoreCase = $.ignoreCase;
        this.pathTemplateMatch = $.pathTemplateMatch;
        this.prefixMatch = $.prefixMatch;
        this.queryParameterMatches = $.queryParameterMatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullPathMatch For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
         * 
         * @return builder
         * 
         */
        public Builder fullPathMatch(@Nullable Output<String> fullPathMatch) {
            $.fullPathMatch = fullPathMatch;
            return this;
        }

        /**
         * @param fullPathMatch For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
         * 
         * @return builder
         * 
         */
        public Builder fullPathMatch(String fullPathMatch) {
            return fullPathMatch(Output.of(fullPathMatch));
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(@Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs>> headerMatches) {
            $.headerMatches = headerMatches;
            return this;
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs> headerMatches) {
            return headerMatches(Output.of(headerMatches));
        }

        /**
         * @param headerMatches Specifies a list of header match criteria, all of which must match corresponding headers in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerMatches(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs... headerMatches) {
            return headerMatches(List.of(headerMatches));
        }

        /**
         * @param ignoreCase Specifies that prefixMatch and fullPathMatch matches are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            $.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * @param ignoreCase Specifies that prefixMatch and fullPathMatch matches are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            return ignoreCase(Output.of(ignoreCase));
        }

        /**
         * @param pathTemplateMatch For satisfying the matchRule condition, the path of the request
         * must match the wildcard pattern specified in pathTemplateMatch
         * after removing any query parameters and anchor that may be part
         * of the original URL.
         * pathTemplateMatch must be between 1 and 255 characters
         * (inclusive).  The pattern specified by pathTemplateMatch may
         * have at most 5 wildcard operators and at most 5 variable
         * captures in total.
         * 
         * @return builder
         * 
         */
        public Builder pathTemplateMatch(@Nullable Output<String> pathTemplateMatch) {
            $.pathTemplateMatch = pathTemplateMatch;
            return this;
        }

        /**
         * @param pathTemplateMatch For satisfying the matchRule condition, the path of the request
         * must match the wildcard pattern specified in pathTemplateMatch
         * after removing any query parameters and anchor that may be part
         * of the original URL.
         * pathTemplateMatch must be between 1 and 255 characters
         * (inclusive).  The pattern specified by pathTemplateMatch may
         * have at most 5 wildcard operators and at most 5 variable
         * captures in total.
         * 
         * @return builder
         * 
         */
        public Builder pathTemplateMatch(String pathTemplateMatch) {
            return pathTemplateMatch(Output.of(pathTemplateMatch));
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(@Nullable Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs>> queryParameterMatches) {
            $.queryParameterMatches = queryParameterMatches;
            return this;
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs> queryParameterMatches) {
            return queryParameterMatches(Output.of(queryParameterMatches));
        }

        /**
         * @param queryParameterMatches Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterMatches(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs... queryParameterMatches) {
            return queryParameterMatches(List.of(queryParameterMatches));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs build() {
            return $;
        }
    }

}
