// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A unit of data that is returned by the DNS servers.
 * 
 */
public final class ResourceRecordSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceRecordSetArgs Empty = new ResourceRecordSetArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * For example, www.example.com.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return For example, www.example.com.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @Import(name="routingPolicy")
    private @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy;

    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    public Optional<Output<RRSetRoutingPolicyArgs>> routingPolicy() {
        return Optional.ofNullable(this.routingPolicy);
    }

    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @Import(name="rrdatas")
    private @Nullable Output<List<String>> rrdatas;

    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    public Optional<Output<List<String>>> rrdatas() {
        return Optional.ofNullable(this.rrdatas);
    }

    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @Import(name="signatureRrdatas")
    private @Nullable Output<List<String>> signatureRrdatas;

    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    public Optional<Output<List<String>>> signatureRrdatas() {
        return Optional.ofNullable(this.signatureRrdatas);
    }

    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResourceRecordSetArgs() {}

    private ResourceRecordSetArgs(ResourceRecordSetArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.routingPolicy = $.routingPolicy;
        this.rrdatas = $.rrdatas;
        this.signatureRrdatas = $.signatureRrdatas;
        this.ttl = $.ttl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceRecordSetArgs $;

        public Builder() {
            $ = new ResourceRecordSetArgs();
        }

        public Builder(ResourceRecordSetArgs defaults) {
            $ = new ResourceRecordSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name For example, www.example.com.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name For example, www.example.com.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingPolicy Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicy(@Nullable Output<RRSetRoutingPolicyArgs> routingPolicy) {
            $.routingPolicy = routingPolicy;
            return this;
        }

        /**
         * @param routingPolicy Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicy(RRSetRoutingPolicyArgs routingPolicy) {
            return routingPolicy(Output.of(routingPolicy));
        }

        /**
         * @param rrdatas As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            $.rrdatas = rrdatas;
            return this;
        }

        /**
         * @param rrdatas As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(List<String> rrdatas) {
            return rrdatas(Output.of(rrdatas));
        }

        /**
         * @param rrdatas As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }

        /**
         * @param signatureRrdatas As defined in RFC 4034 (section 3.2).
         * 
         * @return builder
         * 
         */
        public Builder signatureRrdatas(@Nullable Output<List<String>> signatureRrdatas) {
            $.signatureRrdatas = signatureRrdatas;
            return this;
        }

        /**
         * @param signatureRrdatas As defined in RFC 4034 (section 3.2).
         * 
         * @return builder
         * 
         */
        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            return signatureRrdatas(Output.of(signatureRrdatas));
        }

        /**
         * @param signatureRrdatas As defined in RFC 4034 (section 3.2).
         * 
         * @return builder
         * 
         */
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }

        /**
         * @param ttl Number of seconds that this ResourceRecordSet can be cached by resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Number of seconds that this ResourceRecordSet can be cached by resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The identifier of a supported record type. See the list of Supported DNS record types.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identifier of a supported record type. See the list of Supported DNS record types.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ResourceRecordSetArgs build() {
            return $;
        }
    }

}
