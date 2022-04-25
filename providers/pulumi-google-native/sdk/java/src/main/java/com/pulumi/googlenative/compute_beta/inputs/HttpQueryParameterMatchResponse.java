// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * HttpRouteRuleMatch criteria for a request&#39;s query parameter.
 * 
 */
public final class HttpQueryParameterMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpQueryParameterMatchResponse Empty = new HttpQueryParameterMatchResponse();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @Import(name="exactMatch", required=true)
    private String exactMatch;

    /**
     * @return The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    public String exactMatch() {
        return this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @Import(name="presentMatch", required=true)
    private Boolean presentMatch;

    /**
     * @return Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    public Boolean presentMatch() {
        return this.presentMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch", required=true)
    private String regexMatch;

    /**
     * @return The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }

    private HttpQueryParameterMatchResponse() {}

    private HttpQueryParameterMatchResponse(HttpQueryParameterMatchResponse $) {
        this.exactMatch = $.exactMatch;
        this.name = $.name;
        this.presentMatch = $.presentMatch;
        this.regexMatch = $.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpQueryParameterMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpQueryParameterMatchResponse $;

        public Builder() {
            $ = new HttpQueryParameterMatchResponse();
        }

        public Builder(HttpQueryParameterMatchResponse defaults) {
            $ = new HttpQueryParameterMatchResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactMatch The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(String exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        /**
         * @param name The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param presentMatch Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(Boolean presentMatch) {
            $.presentMatch = presentMatch;
            return this;
        }

        /**
         * @param regexMatch The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(String regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        public HttpQueryParameterMatchResponse build() {
            $.exactMatch = Objects.requireNonNull($.exactMatch, "expected parameter 'exactMatch' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.presentMatch = Objects.requireNonNull($.presentMatch, "expected parameter 'presentMatch' to be non-null");
            $.regexMatch = Objects.requireNonNull($.regexMatch, "expected parameter 'regexMatch' to be non-null");
            return $;
        }
    }

}
