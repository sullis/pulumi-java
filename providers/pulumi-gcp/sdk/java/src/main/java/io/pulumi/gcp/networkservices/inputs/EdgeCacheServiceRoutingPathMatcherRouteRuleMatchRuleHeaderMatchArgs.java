// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    @InputImport(name="exactMatch")
      private final @Nullable Input<String> exactMatch;

    public Input<String> getExactMatch() {
        return this.exactMatch == null ? Input.empty() : this.exactMatch;
    }

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * If set to false (default), the headerMatch is considered a match if the match criteria above are met.
     * If set to true, the headerMatch is considered a match if the match criteria above are NOT met.
     * 
     */
    @InputImport(name="invertMatch")
      private final @Nullable Input<Boolean> invertMatch;

    public Input<Boolean> getInvertMatch() {
        return this.invertMatch == null ? Input.empty() : this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Input<String> prefixMatch;

    public Input<String> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    @InputImport(name="presentMatch")
      private final @Nullable Input<Boolean> presentMatch;

    public Input<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Input.empty() : this.presentMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch.
     * 
     */
    @InputImport(name="suffixMatch")
      private final @Nullable Input<String> suffixMatch;

    public Input<String> getSuffixMatch() {
        return this.suffixMatch == null ? Input.empty() : this.suffixMatch;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs(
        @Nullable Input<String> exactMatch,
        Input<String> headerName,
        @Nullable Input<Boolean> invertMatch,
        @Nullable Input<String> prefixMatch,
        @Nullable Input<Boolean> presentMatch,
        @Nullable Input<String> suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.suffixMatch = suffixMatch;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs() {
        this.exactMatch = Input.empty();
        this.headerName = Input.empty();
        this.invertMatch = Input.empty();
        this.prefixMatch = Input.empty();
        this.presentMatch = Input.empty();
        this.suffixMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exactMatch;
        private Input<String> headerName;
        private @Nullable Input<Boolean> invertMatch;
        private @Nullable Input<String> prefixMatch;
        private @Nullable Input<Boolean> presentMatch;
        private @Nullable Input<String> suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder setExactMatch(@Nullable Input<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = Input.ofNullable(exactMatch);
            return this;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setInvertMatch(@Nullable Input<Boolean> invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder setInvertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = Input.ofNullable(invertMatch);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public Builder setPresentMatch(@Nullable Input<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Input.ofNullable(presentMatch);
            return this;
        }

        public Builder setSuffixMatch(@Nullable Input<String> suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }

        public Builder setSuffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = Input.ofNullable(suffixMatch);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, suffixMatch);
        }
    }
}