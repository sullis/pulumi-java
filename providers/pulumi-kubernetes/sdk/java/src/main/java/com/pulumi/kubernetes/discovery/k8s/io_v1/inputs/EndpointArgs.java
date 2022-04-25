// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import com.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointConditionsArgs;
import com.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointHintsArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Endpoint represents a single logical &#34;backend&#34; implementing a service.
 * 
 */
public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    @Import(name="addresses", required=true)
    private Output<List<String>> addresses;

    /**
     * @return addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }

    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<EndpointConditionsArgs> conditions;

    /**
     * @return conditions contains information about the current status of the endpoint.
     * 
     */
    public Optional<Output<EndpointConditionsArgs>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    @Import(name="deprecatedTopology")
    private @Nullable Output<Map<String,String>> deprecatedTopology;

    /**
     * @return deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    public Optional<Output<Map<String,String>>> deprecatedTopology() {
        return Optional.ofNullable(this.deprecatedTopology);
    }

    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    @Import(name="hints")
    private @Nullable Output<EndpointHintsArgs> hints;

    /**
     * @return hints contains information associated with how an endpoint should be consumed.
     * 
     */
    public Optional<Output<EndpointHintsArgs>> hints() {
        return Optional.ofNullable(this.hints);
    }

    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    @Import(name="targetRef")
    private @Nullable Output<ObjectReferenceArgs> targetRef;

    /**
     * @return targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    public Optional<Output<ObjectReferenceArgs>> targetRef() {
        return Optional.ofNullable(this.targetRef);
    }

    /**
     * zone is the name of the Zone this endpoint exists in.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return zone is the name of the Zone this endpoint exists in.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.addresses = $.addresses;
        this.conditions = $.conditions;
        this.deprecatedTopology = $.deprecatedTopology;
        this.hints = $.hints;
        this.hostname = $.hostname;
        this.nodeName = $.nodeName;
        this.targetRef = $.targetRef;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
         * 
         * @return builder
         * 
         */
        public Builder addresses(Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param conditions conditions contains information about the current status of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<EndpointConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions conditions contains information about the current status of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder conditions(EndpointConditionsArgs conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param deprecatedTopology deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
         * 
         * @return builder
         * 
         */
        public Builder deprecatedTopology(@Nullable Output<Map<String,String>> deprecatedTopology) {
            $.deprecatedTopology = deprecatedTopology;
            return this;
        }

        /**
         * @param deprecatedTopology deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
         * 
         * @return builder
         * 
         */
        public Builder deprecatedTopology(Map<String,String> deprecatedTopology) {
            return deprecatedTopology(Output.of(deprecatedTopology));
        }

        /**
         * @param hints hints contains information associated with how an endpoint should be consumed.
         * 
         * @return builder
         * 
         */
        public Builder hints(@Nullable Output<EndpointHintsArgs> hints) {
            $.hints = hints;
            return this;
        }

        /**
         * @param hints hints contains information associated with how an endpoint should be consumed.
         * 
         * @return builder
         * 
         */
        public Builder hints(EndpointHintsArgs hints) {
            return hints(Output.of(hints));
        }

        /**
         * @param hostname hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param nodeName nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param targetRef targetRef is a reference to a Kubernetes object that represents this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetRef(@Nullable Output<ObjectReferenceArgs> targetRef) {
            $.targetRef = targetRef;
            return this;
        }

        /**
         * @param targetRef targetRef is a reference to a Kubernetes object that represents this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetRef(ObjectReferenceArgs targetRef) {
            return targetRef(Output.of(targetRef));
        }

        /**
         * @param zone zone is the name of the Zone this endpoint exists in.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone zone is the name of the Zone this endpoint exists in.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public EndpointArgs build() {
            $.addresses = Objects.requireNonNull($.addresses, "expected parameter 'addresses' to be non-null");
            return $;
        }
    }

}
