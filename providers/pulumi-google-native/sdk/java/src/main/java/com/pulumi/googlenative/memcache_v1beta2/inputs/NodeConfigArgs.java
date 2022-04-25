// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for a Memcached Node.
 * 
 */
public final class NodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeConfigArgs Empty = new NodeConfigArgs();

    /**
     * Number of cpus per Memcached node.
     * 
     */
    @Import(name="cpuCount", required=true)
    private Output<Integer> cpuCount;

    /**
     * @return Number of cpus per Memcached node.
     * 
     */
    public Output<Integer> cpuCount() {
        return this.cpuCount;
    }

    /**
     * Memory size in MiB for each Memcached node.
     * 
     */
    @Import(name="memorySizeMb", required=true)
    private Output<Integer> memorySizeMb;

    /**
     * @return Memory size in MiB for each Memcached node.
     * 
     */
    public Output<Integer> memorySizeMb() {
        return this.memorySizeMb;
    }

    private NodeConfigArgs() {}

    private NodeConfigArgs(NodeConfigArgs $) {
        this.cpuCount = $.cpuCount;
        this.memorySizeMb = $.memorySizeMb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeConfigArgs $;

        public Builder() {
            $ = new NodeConfigArgs();
        }

        public Builder(NodeConfigArgs defaults) {
            $ = new NodeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuCount Number of cpus per Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(Output<Integer> cpuCount) {
            $.cpuCount = cpuCount;
            return this;
        }

        /**
         * @param cpuCount Number of cpus per Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(Integer cpuCount) {
            return cpuCount(Output.of(cpuCount));
        }

        /**
         * @param memorySizeMb Memory size in MiB for each Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeMb(Output<Integer> memorySizeMb) {
            $.memorySizeMb = memorySizeMb;
            return this;
        }

        /**
         * @param memorySizeMb Memory size in MiB for each Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeMb(Integer memorySizeMb) {
            return memorySizeMb(Output.of(memorySizeMb));
        }

        public NodeConfigArgs build() {
            $.cpuCount = Objects.requireNonNull($.cpuCount, "expected parameter 'cpuCount' to be non-null");
            $.memorySizeMb = Objects.requireNonNull($.memorySizeMb, "expected parameter 'memorySizeMb' to be non-null");
            return $;
        }
    }

}
