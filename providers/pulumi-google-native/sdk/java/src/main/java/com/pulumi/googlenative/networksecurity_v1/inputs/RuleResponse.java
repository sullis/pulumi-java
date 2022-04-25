// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity_v1.inputs.DestinationResponse;
import com.pulumi.googlenative.networksecurity_v1.inputs.SourceResponse;
import java.util.List;
import java.util.Objects;


/**
 * Specification of rules.
 * 
 */
public final class RuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuleResponse Empty = new RuleResponse();

    /**
     * Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     * 
     */
    @Import(name="destinations", required=true)
    private List<DestinationResponse> destinations;

    /**
     * @return Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
     * 
     */
    public List<DestinationResponse> destinations() {
        return this.destinations;
    }

    /**
     * Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     * 
     */
    @Import(name="sources", required=true)
    private List<SourceResponse> sources;

    /**
     * @return Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
     * 
     */
    public List<SourceResponse> sources() {
        return this.sources;
    }

    private RuleResponse() {}

    private RuleResponse(RuleResponse $) {
        this.destinations = $.destinations;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleResponse $;

        public Builder() {
            $ = new RuleResponse();
        }

        public Builder(RuleResponse defaults) {
            $ = new RuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinations Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<DestinationResponse> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinations(DestinationResponse... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param sources Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<SourceResponse> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the &#39;action&#39; field will be applied without any rule checks for the source.
         * 
         * @return builder
         * 
         */
        public Builder sources(SourceResponse... sources) {
            return sources(List.of(sources));
        }

        public RuleResponse build() {
            $.destinations = Objects.requireNonNull($.destinations, "expected parameter 'destinations' to be non-null");
            $.sources = Objects.requireNonNull($.sources, "expected parameter 'sources' to be non-null");
            return $;
        }
    }

}
