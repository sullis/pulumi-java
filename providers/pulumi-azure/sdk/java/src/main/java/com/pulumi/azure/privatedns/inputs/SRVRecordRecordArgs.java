// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SRVRecordRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final SRVRecordRecordArgs Empty = new SRVRecordRecordArgs();

    /**
     * The Port the service is listening on.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The Port the service is listening on.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The priority of the SRV record.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return The priority of the SRV record.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The FQDN of the service.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The FQDN of the service.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * The Weight of the SRV record.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return The Weight of the SRV record.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private SRVRecordRecordArgs() {}

    private SRVRecordRecordArgs(SRVRecordRecordArgs $) {
        this.port = $.port;
        this.priority = $.priority;
        this.target = $.target;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SRVRecordRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SRVRecordRecordArgs $;

        public Builder() {
            $ = new SRVRecordRecordArgs();
        }

        public Builder(SRVRecordRecordArgs defaults) {
            $ = new SRVRecordRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The Port the service is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The Port the service is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param priority The priority of the SRV record.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the SRV record.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param target The FQDN of the service.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The FQDN of the service.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param weight The Weight of the SRV record.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The Weight of the SRV record.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public SRVRecordRecordArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
