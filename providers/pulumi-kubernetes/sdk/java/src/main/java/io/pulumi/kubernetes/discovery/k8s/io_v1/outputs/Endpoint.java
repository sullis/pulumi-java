// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import io.pulumi.kubernetes.discovery.k8s.io_v1.outputs.EndpointConditions;
import io.pulumi.kubernetes.discovery.k8s.io_v1.outputs.EndpointHints;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Endpoint {
    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    private final List<String> addresses;
    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    private final @Nullable EndpointConditions conditions;
    /**
     * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    private final @Nullable Map<String,String> deprecatedTopology;
    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    private final @Nullable EndpointHints hints;
    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    private final @Nullable String hostname;
    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    private final @Nullable String nodeName;
    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    private final @Nullable ObjectReference targetRef;
    /**
     * zone is the name of the Zone this endpoint exists in.
     * 
     */
    private final @Nullable String zone;

    @OutputCustomType.Constructor({"addresses","conditions","deprecatedTopology","hints","hostname","nodeName","targetRef","zone"})
    private Endpoint(
        List<String> addresses,
        @Nullable EndpointConditions conditions,
        @Nullable Map<String,String> deprecatedTopology,
        @Nullable EndpointHints hints,
        @Nullable String hostname,
        @Nullable String nodeName,
        @Nullable ObjectReference targetRef,
        @Nullable String zone) {
        this.addresses = Objects.requireNonNull(addresses);
        this.conditions = conditions;
        this.deprecatedTopology = deprecatedTopology;
        this.hints = hints;
        this.hostname = hostname;
        this.nodeName = nodeName;
        this.targetRef = targetRef;
        this.zone = zone;
    }

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    public List<String> getAddresses() {
        return this.addresses;
    }
    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    public Optional<EndpointConditions> getConditions() {
        return Optional.ofNullable(this.conditions);
    }
    /**
     * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    public Map<String,String> getDeprecatedTopology() {
        return this.deprecatedTopology == null ? Map.of() : this.deprecatedTopology;
    }
    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    public Optional<EndpointHints> getHints() {
        return Optional.ofNullable(this.hints);
    }
    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    public Optional<String> getNodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    public Optional<ObjectReference> getTargetRef() {
        return Optional.ofNullable(this.targetRef);
    }
    /**
     * zone is the name of the Zone this endpoint exists in.
     * 
     */
    public Optional<String> getZone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Endpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addresses;
        private @Nullable EndpointConditions conditions;
        private @Nullable Map<String,String> deprecatedTopology;
        private @Nullable EndpointHints hints;
        private @Nullable String hostname;
        private @Nullable String nodeName;
        private @Nullable ObjectReference targetRef;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(Endpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.conditions = defaults.conditions;
    	      this.deprecatedTopology = defaults.deprecatedTopology;
    	      this.hints = defaults.hints;
    	      this.hostname = defaults.hostname;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
    	      this.zone = defaults.zone;
        }

        public Builder setAddresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }

        public Builder setConditions(@Nullable EndpointConditions conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setDeprecatedTopology(@Nullable Map<String,String> deprecatedTopology) {
            this.deprecatedTopology = deprecatedTopology;
            return this;
        }

        public Builder setHints(@Nullable EndpointHints hints) {
            this.hints = hints;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setTargetRef(@Nullable ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }

        public Endpoint build() {
            return new Endpoint(addresses, conditions, deprecatedTopology, hints, hostname, nodeName, targetRef, zone);
        }
    }
}
