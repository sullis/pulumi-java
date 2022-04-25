// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    @Import(name="exactMatch")
    private @Nullable Output<String> exactMatch;

    /**
     * @return The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    public Optional<Output<String>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    @Import(name="presentMatch")
    private @Nullable Output<Boolean> presentMatch;

    /**
     * @return Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    public Optional<Output<Boolean>> presentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs $) {
        this.exactMatch = $.exactMatch;
        this.name = $.name;
        this.presentMatch = $.presentMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactMatch The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        /**
         * @param exactMatch The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(String exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        /**
         * @param name The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param presentMatch Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            $.presentMatch = presentMatch;
            return this;
        }

        /**
         * @param presentMatch Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(Boolean presentMatch) {
            return presentMatch(Output.of(presentMatch));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
